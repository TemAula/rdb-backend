package com.temaula.rdb.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PessoaModelTest {
	static PessoaModel pessoa = new PessoaModel();

	@Test
	void testSetNome() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setNome("123");
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setNome("123456789012345678901234567890123");
		});
	}

	@Test
	void testSetEmail() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setEmail("123");
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setEmail("123456789012345678901234567890123");
		});
	}

	@Test
	void testSetTelefone() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setTelefone("1234567");
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setTelefone("123456789012345678901234567");
		});
	}

	@Test
	void testSetEndereço() {		
		StringBuffer str = new StringBuffer();

		while (str.length()<129) {
			str.append("a");
		}
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setEndereço(str.toString());
		});
	}

	@Test
	void testSetSenha() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setSenha("123");
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setSenha("12345678901234567");
		});
	}
}
