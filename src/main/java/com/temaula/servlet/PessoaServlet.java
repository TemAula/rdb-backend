package com.temaula.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.temaula.service.PessoaService;

@WebServlet("pessoa")
public class PessoaServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Inject
	private PessoaService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	PrintWriter pw = resp.getWriter();
	service.listar().forEach(resultado -> pw.print("nome: "+resultado.getNome()));
	pw.close();
	
	}
	

	
}
