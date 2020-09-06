package com.temaula.rdb.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.temaula.rdb.dao.PessoaDAO;
import com.temaula.rdb.model.Pessoa;

@Stateless
public class PessoaService {
	
	@Inject
	private PessoaDAO dao;
	
	public List<Pessoa> listarTodos(){
		return dao.listarTodos();
	}
	
	public void inserir(Pessoa pessoa) {
		dao.inserir(pessoa);
	}
	
	public Pessoa pesquisarId(Long id) {
		return dao.pesquisarId(id);
	}
	
	public void deletar(Long id) {
		Pessoa p = dao.pesquisarId(id);
		dao.deletar(p);
	}
	
	public void atualizar (Pessoa p){
		dao.atualizar(p);
	}
}
