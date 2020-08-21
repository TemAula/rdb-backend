package com.temaula.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.temaula.dao.PessoaDAO;
import com.temaula.model.PessoaModel;

@Stateless
public class PessoaService {
	
	@Inject
	private PessoaDAO dao;
	
	public List<PessoaModel> listar(){
		return dao.listar();
	}
	
	public void inserir(PessoaModel pessoa) {
		dao.inserir(pessoa);
	}

}
