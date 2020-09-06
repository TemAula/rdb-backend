package com.temaula.rdb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.temaula.rdb.model.Pessoa;

@Stateless
public class PessoaDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public List<Pessoa> listarTodos() {
		return entityManager.createQuery("SELECT p FROM pessoa p",
				Pessoa.class).getResultList();
	}

	public void inserir(Pessoa pessoa) {
		pessoa.setId(null);
		entityManager.persist(pessoa);
	}

	public void atualizar(Pessoa t) {
	entityManager.merge(t);	
	}


	public Pessoa pesquisarId(Long id) {
		return entityManager.find(Pessoa.class, id);
	}

	public void deletar(Pessoa t) {
		entityManager.remove(pesquisarId(t.getId()));
	}
	

}
