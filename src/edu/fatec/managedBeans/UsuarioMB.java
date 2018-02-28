package edu.fatec.managedBeans;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;



import edu.fatec.dao.DAO;
import edu.fatec.dao.UsuarioDAO;
import edu.fatec.entidades.Usuario;

@ManagedBean(name = "usuarioMB")
@SessionScoped
public class UsuarioMB implements Serializable {

	private static final long serialVersionUID = 6561135493175018624L;
	private Usuario usuario;
	private List<Usuario> usuarios;
	private FacesContext ctx;
	private FacesContext mensagem;
	private boolean logado = false;
	
	
	public UsuarioMB() {

		usuario = new Usuario();
		usuarios = new ArrayList<Usuario>();
		
	}

	public String logar() {
		Usuario u;
		DAO uDAO = new UsuarioDAO();
		try {
			u = (Usuario) uDAO.pesquisarPorNome(usuario.getUserId());
			if (u != null && u.getPassword().equals(usuario.getPassword())) {
				usuario = u;
				this.logado = true;

				// System.out.println(usuario.getEnderecos().get(0).getBairro());

				FacesContext context = FacesContext.getCurrentInstance();
				context.addMessage(null,
						new FacesMessage("Login efetuado com Sucesso", "Olá "
								+ usuario.getNome()));

				this.setMensagem(context);

				return "./menu.xhtml";
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"Erro ao efetuar login", ""));
		this.setMensagem(context);

		return "./login.xhtml";
	}

	
	public String cadastro() {
		usuario = new Usuario();
		return "./cadastroUsuario.xhtml?faces-redirect=true";
	}

	
	
	public String cancela() {

		return ("");
	}
	
	public String cadastrar(){
		
	     Usuario u = usuario;
	     DAO uDAO = new UsuarioDAO();
	     if(u!=null){
	    	 try {
	    		Usuario usu=(Usuario)uDAO.pesquisarPorNome(u.getUserId());
	    		if((usu==null)||(usu.getEmail()==u.getEmail())||(usu.getPassword()==u.getPassword())){
				uDAO.inserir(u);
				
				FacesContext context = FacesContext.getCurrentInstance();
	        	context.addMessage(null, new FacesMessage("Login efetuado com Sucesso", "Olá " + usuario.getNome())); 
				this.setMensagem(context);
	        	this.logado=true;
				 return "./menu.xhtml";
	    		}
	    		FacesContext context = FacesContext.getCurrentInstance();
	        	context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuário já cadastrado!", "")); 
				this.setMensagem(context);
	    	 return "./cadastroUsuario.xhtml";
	    	 } catch (SQLException e) {
				e.printStackTrace();
			}
	     }
		
		return "./cadastroUsuario.xhtml";
	}
	
     public String cancelar(){
		
		return"./login.xhtml?faces-redirect=true";
	}
     
     public String sair(){
 		this.setLogado(false);
 		usuario= new Usuario();
 		return("./login.xhtml");
 	}
     
     public String atualizarPerfil(){
    	 
    	 return("editarPerfil.xhtml?faces-redirect=true");
     }
     
     public String editarPerfil(){
    	 DAO uDAO = new UsuarioDAO();
    	 try {
		
    		uDAO.atualizar(usuario.getId(), usuario);
			
			FacesContext context = FacesContext.getCurrentInstance();
        	context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Perfil atualizado com sucesso!", "")); 
			this.setMensagem(context);
		} catch (SQLException e) {
			FacesContext context = FacesContext.getCurrentInstance();
        	context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro ao atualizar perfil!", "")); 
			this.setMensagem(context);
			e.printStackTrace();
		}
    	 
    	 return("menu.xhtml");
     }
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
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

	

	
}
