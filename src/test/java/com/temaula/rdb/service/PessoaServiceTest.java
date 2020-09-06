package com.temaula.rdb.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.Test;

import com.temaula.rdb.model.Pessoa;

@Stateless(name = "TestPessoaService")
class PessoaServiceTest {
	
	@PersistenceContext
	private EntityManager em;
	
//	@Inject
//	static PessoaService service;

	@Test
	void testListarTodos() {
//		List<PessoaModel> pessoas = service.listarTodos();
//		assertNotEquals(0, pessoas.size());
		fail("Not yet implemented");
	}

	@Test
	void testInserir() {
		fail("Not yet implemented");
	}

	@Test
	void testPesquisarId() {
		fail("Not yet implemented");
	}

	@Test
	void testDeletar() {
		fail("Not yet implemented");
	}

	@Test
	void testAtualizar() {
		fail("Not yet implemented");
	}

}
