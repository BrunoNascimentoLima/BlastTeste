package edu.fatec.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.Email;



@Entity
public class Usuario implements Serializable,Bean {

	private static final long serialVersionUID = -4800291468959291912L;
	private long id;
    private String nome,userId,password,email;
	private Telefone telefone;
	private Endereco endereco;
    private List<Comparacao> comparacoes;
    
    
    public Usuario(){
    	telefone= new Telefone();
    	endereco= new Endereco();
    	comparacoes = new ArrayList<Comparacao>();
    	
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
	@Column
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Column
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column
	@Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(targetEntity=Comparacao.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="usuario_id")
	public List<Comparacao> getComparacoes() {
		return comparacoes;
	}

	public void setComparacoes(List<Comparacao> comparacoes) {
		this.comparacoes = comparacoes;
	}

	@OneToOne(targetEntity=Telefone.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="telefone_id")
	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	@OneToOne(targetEntity=Endereco.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="endereco_id")
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
    
    


}
