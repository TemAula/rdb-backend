package com.temaula.rdb.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PessoaModelTest {
	static Pessoa pessoa = new Pessoa();

	@Test
	void testSetNome() {
		assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setNome("123");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setNome("123456789012345678901234567890123");
		});
	}

	@Test
	void testSetEmail() {
		assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setEmail("123");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setEmail("123456789012345678901234567890123");
		});
	}

	@Test
	void testSetTelefone() {
		assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setTelefone("1234567");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setTelefone("123456789012345678901234567");
		});
	}

	@Test
	void testSetEndereço() {
		StringBuffer str = new StringBuffer();

		while (str.length() < 129) {
			str.append("a");
		}

		assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setEndereco(str.toString());
		});
	}

	@Test
	void testSetSenha() {
		assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setSenha("123");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			pessoa.setSenha("12345678901234567");
		});
	}
}
