package edu.fatec.managedBeans;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;

import edu.fatec.dao.ComparacaoDAO;
import edu.fatec.dao.DAO;
import edu.fatec.entidades.Comparacao;
import edu.fatec.serviceLocator.Blast;

@ManagedBean(name = "comparacaoMB")
@SessionScoped
public class ComparacaoMB implements Serializable {

	private static final long serialVersionUID = -4369119079251236496L;
	private Comparacao comparacao;
	private List<Comparacao> comparacoes;
	private FacesContext ctx;
	private FacesContext mensagem;
	private UsuarioMB uMB;
	private EspecieMB eMB;
	private static Blast blast = null;
    private Date dataInicio,dataFim;
	
    public ComparacaoMB() {

		comparacao = new Comparacao();
		comparacoes = new ArrayList<Comparacao>();
		

	}

	public String submeter() {

	if (!comparacao.getAmostra().isEmpty()){
		String amostra = comparacao.getAmostra();
		comparacao = new Comparacao();
		comparacao.setAmostra(amostra);
		
		comparacao.setData(new Date(System.currentTimeMillis()));
		 
		ctx= FacesContext.getCurrentInstance();
		 uMB = ctx.getApplication().evaluateExpressionGet(ctx, "#{usuarioMB}",
				UsuarioMB.class);
	     eMB = ctx.getApplication().evaluateExpressionGet(ctx, "#{especieMB}",
				EspecieMB.class);	
	     
	     comparacao.setUsuario(uMB.getUsuario());
		 comparacao.setEspecie(eMB.getEspecie());
		
		return ("load.xhtml");
		}
	FacesContext context = FacesContext.getCurrentInstance();
	context.addMessage(null, new FacesMessage(
			FacesMessage.SEVERITY_ERROR,
			"Campo vazio",
			"Adicione uma sequ�ncia para compara��o."));
	this.setMensagem(context);
	
	return("");
	}


	
	public String comparar() throws RemoteException {

		try {
               
			FacesContext context = FacesContext.getCurrentInstance();
			LocateRegistry.getRegistry("localhost");
			blast = (Blast) Naming.lookup("//localhost:1990/cataga");
			comparacao.setRid(blast.submitSearchRequestLite(comparacao
					.getAmostra()));

			if (comparacao.getRid() != null) {

				Thread.sleep(3000);

				comparacao.setPorcentagem(blast.getSearchResultsRequest
						(comparacao.getRid(),comparacao.getEspecie().getGi()));

			 context = FacesContext.getCurrentInstance();
				context.addMessage(
						null,
						new FacesMessage("Compara��o efetuada com �xito", ""));
				this.setMensagem(context);
                
				uMB.getUsuario().getComparacoes().add(comparacao);
				DAO dao= new  ComparacaoDAO();
				dao.inserir(comparacao);
				
				
				
				return ("mostrarResultados.xhtml");

			}

		} catch (RemoteException e2) {
			e2.printStackTrace();
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_ERROR,
					"Houve um erro ao efetuar compara��o!",
					"tente novamente mais tarde."));
			this.setMensagem(context);
			return ("./load.xhtml");
		}catch (NullPointerException e1) {
			e1.printStackTrace();
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_WARN,
					"N�o houve similaridade relevante na compara��o.",
					""));
			this.setMensagem(context);
			return ("./load.xhtml");
			
		}catch (Exception e1) {
			e1.printStackTrace();
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_ERROR,
					"Houve um erro ao efetuar compara��o!",
					"tente novamente mais tarde."));
			this.setMensagem(context);
			return ("./load.xhtml");
			
		}
		return ("");
	}


	public String verHistorico() {

		return ("./historico.xhtml?faces-redirect=true");
	}

	public String remover(Comparacao c){		
		DAO dao= new  ComparacaoDAO();
		try {
			dao.remover(c.getId(), c);
			uMB.getUsuario().getComparacoes().remove(c);
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_INFO,
					"Compara��o removida!",
					""));
			this.setMensagem(context);
		
		} catch (SQLException e){
			e.printStackTrace();
		}
		return("historico.xhtml");
	}
	
	public String selecionar(Comparacao c){		
		
			comparacao = c;
		
		return("exportar.xhtml?faces-redirect=true");
	}
	
	public String exportarResultados(){
		
          return("exportar.xhtml");
	}
	
	public void preProcessPDF(Object document) throws IOException, BadElementException, DocumentException {
	    Document pdf = (Document) document;
	 //   pdf.setMargins(800f, 800f, 800f, 800f);  
	    pdf.setPageSize(PageSize.A4);  
	    pdf.addTitle("T�tulo here brother");  
	      
	    pdf.open();
	    //pdf.setPageSize(PageSize.A4);
	 
	    ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
	    String logo = servletContext.getRealPath("") + File.separator + "images" + File.separator + "relatorio.jpg";
	 
	  
	    pdf.add(Image.getInstance(logo));
	    pdf.add( new Paragraph("         ")); 
	    pdf.add( new Paragraph("         ")); 
	    pdf.add(new Paragraph("Usu�rio: "+comparacao.getUsuario().getNome()));  
	    pdf.add(new Paragraph("Esp�cie Comparada: "+comparacao.getEspecie().getNome()));
	    pdf.add(new Paragraph("Amostra apresentada: "+comparacao.getAmostra()));
	    DateFormat df= new SimpleDateFormat("dd/MM/YYYY - HH:mm");
	    pdf.add( new Paragraph("         ")); 
	    pdf.add(new Paragraph("Data de emiss�o: "+df.format(new Date()))); 
	 //   p.setAlignment("center");  
	    
	    pdf.add( new Paragraph("         ")); 
	    pdf.add( new Paragraph("         ")); 

	}
	
	public Comparacao getComparacao() {
		return comparacao;
	}

	public void setComparacao(Comparacao comparacao) {
		this.comparacao = comparacao;
	}

	public List<Comparacao> getComparacoes() {
		return comparacoes;
	}

	public void setComparacoes(List<Comparacao> comparacoes) {
		this.comparacoes = comparacoes;
	}

	public FacesContext getCtx() {
		return ctx;
	}

	public void setCtx(FacesContext ctx) {
		this.ctx = ctx;
	}

	public FacesContext getMensagem() {
		return mensagem;
	}

	public void setMensagem(FacesContext mensagem) {
		this.mensagem = mensagem;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	

}
