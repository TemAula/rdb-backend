package com.temaula.rdb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.temaula.rdb.model.PessoaModel;

@Stateless
public class PessoaDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public List<PessoaModel> listarTodos() {
		return entityManager.createQuery("SELECT p FROM Pessoa p",
				PessoaModel.class).getResultList();
	}

	public void inserir(PessoaModel pessoa) {
		entityManager.persist(pessoa);
	}

	public void atualizar(PessoaModel t) {
	entityManager.merge(t);	
	}


	public PessoaModel pesquisarId(Long id) {
		return entityManager.find(PessoaModel.class, id);
	}

	public void deletar(PessoaModel t) {
		entityManager.remove(pesquisarId(t.getId()));
	}
	

}
