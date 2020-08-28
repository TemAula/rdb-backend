package com.temaula.rdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Pessoa")
public class PessoaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 32, nullable = false)
	private String nome;

	@Column(length = 32, nullable = false)
	private String email;

	@Column(length = 16, nullable = false)
	private String telefone;

	@Column(length = 128)
	private String endereco;

	@Column(length = 16, nullable = false)
	private String senha;

	public PessoaModel() {
	}

	public PessoaModel(String nome, String email, String telefone, String endereco, String senha) {
		setNome(nome);
		setEmail(email);
		setTelefone(telefone);
		setEndereco(endereco);
		setSenha(senha);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.trim().length() <= 3) {
			throw new IllegalArgumentException("o nome deve conter mais de 3 caracteres válidos");
		}
		if (nome.length() > 32) {
			throw new IllegalArgumentException("o nome deve conter menos de 32 caracteres");
		}
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.trim().length() <= 3) {
			throw new IllegalArgumentException("o email deve conter mais de 3 caracteres válidos");
		}
		if (email.length() > 32) {
			throw new IllegalArgumentException("o email conter menos de 32 caracteres");
		}
		// TODO: implementar validador regex
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone.trim().length() < 8) {
			throw new IllegalArgumentException("o telefone deve conter mais de 8 caracteres válidos");
		}
		if (telefone.length() > 16) {
			throw new IllegalArgumentException("o telefone conter menos de 16 caracteres");
		}
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco.length() > 128) {
			throw new IllegalArgumentException("o endereco conter menos de 128 caracteres");
		}
		this.endereco = endereco;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if (senha.trim().length() < 4) {
			throw new IllegalArgumentException("a senha deve conter mais de 4 caracteres válidos");
		}
		if (senha.length() > 16) {
			throw new IllegalArgumentException("a senha conter menos de 16 caracteres");
		}
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaModel other = (PessoaModel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa: [id=" + id + ", nome=" + nome + " email=" + email + "]";
	}

}
