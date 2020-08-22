package com.temaula.rdb.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.temaula.rdb.dao.PessoaDAO;
import com.temaula.rdb.model.PessoaModel;

@Stateless
public class PessoaService {
	
	@Inject
	private PessoaDAO dao;
	
	public List<PessoaModel> listarTodos(){
		return dao.listarTodos();
	}
	
	public void inserir(PessoaModel pessoa) {
		dao.inserir(pessoa);
	}
	
	public PessoaModel pesquisarId(Long id) {
		return dao.pesquisarId(id);
	}
	
	public void deletar(PessoaModel p) {
		dao.deletar(p);
	}
	
	public void atualizar (PessoaModel p){
		dao.atualizar(p);
	}
}
