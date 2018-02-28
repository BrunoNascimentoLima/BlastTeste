package edu.fatec.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Especie implements Serializable,Bean{

	private static final long serialVersionUID = -6412414533070293379L;
    private long id;
	private String gi,nome,descricao,nomeCientifico;
	
	
	@Id
	@GeneratedValue
	@Override
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column
	public String getGi() {
		return gi;
	}
	public void setGi(String gi) {
		this.gi = gi;
	}
	@Column
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column(columnDefinition="LONGTEXT",length=7000)
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Column
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	
	
}
