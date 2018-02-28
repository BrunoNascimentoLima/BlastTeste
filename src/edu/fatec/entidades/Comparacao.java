package edu.fatec.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comparacao implements Serializable,Bean {
	
	
	private static final long serialVersionUID = -2989564656676010653L;
	private long id;
	private String rid,amostra;
	private double porcentagem;
	private Date data;
	private Especie especie;
	private Usuario usuario;
    
    
    public Comparacao(){

		
	}



    @Column
	public String getRid() {
		return rid;
	}




	public void setRid(String rid) {
		this.rid = rid;
	}



    @Column(columnDefinition="LONGTEXT",length=100000)
	public String getAmostra() {
		return amostra;
	}




	public void setAmostra(String amostra) {
		this.amostra = amostra;
	}



    @Column
	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



   @Id
   @GeneratedValue
   @Override
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}


	 @ManyToOne(targetEntity=Especie.class)
	public Especie getEspecie() {
		return especie;
	}



	public void setEspecie(Especie especie) {
		this.especie = especie;
	}


   @ManyToOne(targetEntity=Usuario.class)
	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


    @Column
	public double getPorcentagem() {
		return porcentagem;
	}



	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	
    
    
	
}

