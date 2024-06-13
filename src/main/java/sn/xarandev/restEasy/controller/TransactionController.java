package sn.xarandev.restEasy.controller;




import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sn.xarandev.restEasy.dto.TransactionDto;

@Path("/transactions")
public class TransactionController {

	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TransactionDto get(@PathParam("id") long id) {
		
		return new TransactionDto(id, -6700000);
	}
	
	/*
	 * @GET
	 * 
	 * @Path("/find/{id}")
	 * 
	 * @Produces(MediaType.APPLICATION_ATOM_XML) private TransactionDto
	 * find(@PathParam("id") long id) {
	 * 
	 * return new TransactionDto(id, -6700000); }
	 */
	
	@GET
	@Path("/all")
	@Produces({"application/json"})
	public List<TransactionDto> getAll() {
		
		return List.of(
				new TransactionDto(1L, 5000000), 
				new TransactionDto(2L, 1000000),
				new TransactionDto(3L, 2000000));
	}
}