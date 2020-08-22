package com.temaula.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.temaula.model.PessoaModel;

@Stateless
public class PessoaDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<PessoaModel> listar() {
		return entityManager.createQuery("SELECT p FROM Pessoa p",
				PessoaModel.class).getResultList();
	}

	public void inserir(PessoaModel pessoa) {
		entityManager.persist(pessoa);
	}
	

}
