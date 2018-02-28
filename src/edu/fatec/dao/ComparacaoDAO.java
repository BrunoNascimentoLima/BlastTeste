package edu.fatec.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.fatec.entidades.Comparacao;

public class ComparacaoDAO implements DAO{

	private static EntityManagerFactory emf = null;

	public ComparacaoDAO(){
		if(emf==null){
			emf=Persistence.createEntityManagerFactory("CATAGA");
		}
	}
	
	
	@Override
	public void inserir(Object obj) throws SQLException {
		 Comparacao comp;
	      if(obj instanceof Comparacao){
	    	  comp=(Comparacao)obj;
	    	  EntityManager em = emf.createEntityManager();
	    	  em.getTransaction().begin();
	    	  em.persist(comp);
	    	  em.getTransaction().commit();
	    	  em.close();
	      }
			
		
	}

	@Override
	public void remover(long id, Object obj) throws SQLException {
		if(obj instanceof Comparacao){
			EntityManager em = emf.createEntityManager();
			Comparacao comp = em.getReference(Comparacao.class, id);
			em.getTransaction().begin();
			em.remove(comp);
			em.getTransaction().commit();
			em.close();
		}
		
	}

	@Override
	public void atualizar(long id, Object obj) throws SQLException {
		if(obj instanceof Comparacao){
			Comparacao com =(Comparacao)obj;
			EntityManager em = emf.createEntityManager();
			Comparacao comAntigo = em.getReference(Comparacao.class, id);
			comAntigo.setRid(com.getRid());
			comAntigo.setAmostra(com.getAmostra());
			comAntigo.setData(com.getData());
			comAntigo.setPorcentagem(com.getPorcentagem());
			em.getTransaction().commit();
			em.close();
		}
		
	}

	@Override
	public Object pesquisarPorNome(String nome) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List pesquisarTodos() throws SQLException {
		EntityManager em = emf.createEntityManager();
		TypedQuery<Comparacao> qry = em.createQuery( 
				"SELECT comparacao FROM Comparacao comparacao"
				, Comparacao.class);
		List<Comparacao> com = qry.getResultList();
		em.close();
		return com;
	}

	@Override
	public Object pesquisarPorId(long id) throws SQLException {
		EntityManager em = emf.createEntityManager();
		TypedQuery<Comparacao> qry = em.createQuery( 
				"SELECT comparacao FROM Comparacao comparacao WHERE" +
				" comparacao.id = :id"
				, Comparacao.class);
		qry.setParameter("id", id);
		Comparacao com = qry.getSingleResult();
		em.close();
		return com;
	}


	@Override
	public List pesquisarEntreDatas(Date dataInicio, Date dataFim, long id)
			throws SQLException {
		
		return null;
	}

}
