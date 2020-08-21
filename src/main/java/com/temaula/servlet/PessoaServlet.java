package com.temaula.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.temaula.model.PessoaModel;
import com.temaula.service.PessoaService;

@WebServlet("pessoa")
public class PessoaServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Inject
	private PessoaService service;

	private String[] String[];
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	PrintWriter pw = resp.getWriter();
	service.listar().forEach(resultado -> pw.print("nome: "+resultado.getNome()));
	pw.close();	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BufferedReader reader = req.getReader();
		String[] text  = reader.readLine().split(",");
	// Long id, String nome, String email, String telefone, String endereço, String senha
		PessoaModel pessoa = new PessoaModel(null, text[0],text[1],text[2],text[3],text[4]);
		service.inserir(pessoa);
	}

	
}
