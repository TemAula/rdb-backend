package com.temaula.rdb.controller;

import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.temaula.rdb.model.PessoaModel;
import com.temaula.rdb.service.PessoaService;

@Path("pessoa")
public class PessoaController {
	
	@Inject
	private PessoaService service;
	
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response listar() {
		return Response.ok(service.listar()).build();
	}
	
	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	public Response inserir(PessoaModel pessoa) {
		service.inserir(pessoa);
		return Response.status(201).build();
	}

}
