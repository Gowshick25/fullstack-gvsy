package com.training.resources;

import java.util.List;

import com.training.Product;
import com.training.service.ProductService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/products")
public class ProductResource {
	
	
	private static ProductService service = new ProductService();
	public ProductResource() {
		super();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> findAll()
	{
		return service.findAll();
	}
	@GET
	@Path("srch/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("id")int id) {
		try {
			Product entity=service.findById(id).orElseThrow(()->new RuntimeException("Id not found"));
		return Response.ok(entity).build();
			}catch(RuntimeException e) {
				e.printStackTrace();
				return Response.ok("id not found").status(400).build();
			}
	}
}