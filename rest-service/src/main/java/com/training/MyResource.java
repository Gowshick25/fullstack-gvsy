package com.training;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("noun")
public class MyResource {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage()
	{
		return "Hello World";
	}

}
