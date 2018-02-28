package edu.fatec.managedBeans;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import edu.fatec.dao.DAO;
import edu.fatec.dao.EspecieDAO;
import edu.fatec.entidades.Especie;

@ManagedBean(name="especieMB")
@SessionScoped
public class EspecieMB implements Serializable {

	
	private static final long serialVersionUID = 7976500021068875047L;
    private Especie especie;
    private List<Especie> especies;
    private FacesContext ctx;
    private FacesContext mensagem;
    
    public EspecieMB(){ 	
   	 especie= new Especie();
   	 especies = new ArrayList<Especie>();
  
    }
    
    public String compareSequencia(){
    	DAO espDAO = new EspecieDAO();
    	try {
    	   especies = new ArrayList<Especie>();
    	   especies=(ArrayList<Especie>) espDAO.pesquisarTodos();
	    
     
       
       } catch (SQLException e) {
		e.printStackTrace();
	}	
    	
    	
    	
    	return("especie.xhtml?faces-redirect=true");
    }
    
    
    public String escolha (Especie e){
    	
    	especie=e;
    	
    	return("comparacao.xhtml?faces-redirect=true");
    }
    
    public Especie getEspecie() {
		return especie;
	}
	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	public List<Especie> getEspecies() {
		return especies;
	}
	public void setEspecies(List<Especie> especies) {
		this.especies = especies;
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
