package com.temaula.rdb.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.temaula.rdb.model.Evento;
import com.temaula.rdb.service.EventoService;

@Path("/eventos")
public class EventoController {

	@Inject
	private EventoService eventoService;

	@GET
	@Path("/")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response listarTodos() {
		return Response.ok(eventoService.listarTodos()).build();
	}

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response pesquisarId(@PathParam("id") int id) {

		if (eventoService.pesquisarId(id) == null) {
			return Response.status(Response.Status.NOT_FOUND).entity("{ \"erro\" : \"ID não encontrado\" }").build();
		}
		return Response.ok(eventoService.pesquisarId(id)).build();
	}

	@POST
	@Path("/")
	@Consumes(value = MediaType.APPLICATION_JSON)
	public Response inserir(Evento evento) {
		eventoService.inserir(evento);
		return Response.status(201).build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(value = MediaType.APPLICATION_JSON)
	public Response deletar(@PathParam("id") int id) {
		eventoService.deletar(id);
		return Response.status(202).build();
	}
}
