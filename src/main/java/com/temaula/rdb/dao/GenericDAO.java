package com.temaula.rdb.dao;

import java.util.List;

import javax.ejb.Stateless;

@Stateless
public interface GenericDAO<T> {
	
	public void inserir(T t);
	public void atualizar(T t);
	public List<T> listarTodos();
	public T procurarId(Long id);
	public void deletar(T t);
}
