package com.temaula.rdb.controller;



import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.temaula.rdb.model.PessoaModel;
import com.temaula.rdb.service.PessoaService;

@Path("pessoa")
public class PessoaController{
	
	@Inject
	private PessoaService service;
	
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response listarTodos(){
		return Response.ok(service.listarTodos()).build();
	}
	
	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response pesquisarId(@PathParam("id") Long id){
		return Response.ok(service.pesquisarId(id)).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserir(PessoaModel p) {
		
		//TODO: melhorar esse tratamento de erro, apresentar motivo do erro para o usuario
		try {
		service.inserir(p);
		return Response.status(201).build();
			
		} catch (Exception e) {
		return Response.status(500).build();
		}
	}
	
    @DELETE
    @Path("/{id}")
    @Consumes(value = {MediaType.APPLICATION_JSON})
    public Response deletar(@PathParam("id") Long id) {
    	service.deletar(id);
        return Response.status(202).build();
    }
    
    
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response atualizar(@PathParam("id") Long id, PessoaModel p) {
		p.setId(id);
		service.atualizar(p);
		return Response.status(202).build();
	}
	


	
}
