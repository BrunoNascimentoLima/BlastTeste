package edu.fatec.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import edu.fatec.entidades.Especie;


public  class EspecieDAO implements DAO{

	private static EntityManagerFactory emf = null;

	public EspecieDAO(){
		if(emf==null){
			emf=Persistence.createEntityManagerFactory("CATAGA");
		}
	}
	
	@Override
	public void inserir(Object obj) throws SQLException {
		Especie especie;
		if(obj instanceof Especie){
		especie = (Especie)obj;
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(especie);
		em.getTransaction().commit();
		em.close();
		
		}
		
	}

	@Override
	public void remover(long id, Object obj) throws SQLException {
		if(obj instanceof Especie){
		EntityManager em = emf.createEntityManager();
		Especie especie = em.getReference(Especie.class, id);
		em.getTransaction().begin();
		em.remove(especie);
		em.getTransaction().commit();
		em.close();
		
		}
	}

	@Override
	public void atualizar(long id, Object obj) throws SQLException {
		if(obj instanceof Especie){
			Especie especie = (Especie)obj;
			EntityManager em = emf.createEntityManager();
			Especie especieAntiga = em.getReference(Especie.class, id);
			em.getTransaction().begin();
			especieAntiga.setGi(especie.getGi());
			especieAntiga.setDescricao(especie.getDescricao());
			especieAntiga.setNome(especie.getNome());
			especieAntiga.setNomeCientifico(especie.getNomeCientifico());
			em.getTransaction().commit();
			em.close();
			
			}
	}

	@Override
	public Object pesquisarPorNome(String nome) throws SQLException {
		EntityManager em = emf.createEntityManager();
		TypedQuery<Especie> qry = em.createQuery(
				"select especie from Especie especie where especie.nome like :nome"
				,Especie.class);
		qry.setParameter("nome", "%"+nome+"%");
		Especie resultado= qry.getSingleResult();
	    em.close();
		return resultado;
		
	}

	@Override
	public List pesquisarTodos() throws SQLException {
		EntityManager em = emf.createEntityManager();
		TypedQuery<Especie> qry = em.createQuery(
				"select especie from Especie especie"
				,Especie.class);
		List<Especie> resultado= qry.getResultList();
	    em.close();
		return resultado;
	}

	@Override
	public Object pesquisarPorId(long id) throws SQLException {
		EntityManager em = emf.createEntityManager();
		TypedQuery<Especie> qry = em.createQuery(
				"select especie from Especie especie where especie.id = :id"
				,Especie.class);
		qry.setParameter("id", id);
		Especie resultado= qry.getSingleResult();
	    em.close();
		return resultado;
	}

	@Override
	public List pesquisarEntreDatas(Date dataInicio, Date dataFim, long id)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
