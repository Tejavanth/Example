package com.example.rest;
 

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/sample")
public class HelloWorldService {
 
	@GET
	//@Path("/msg")
	public Response getMsg() {
 
		String output = "Jersey say Hello !!";
 
		return Response.
			   status(200).
			   entity(output+"Hello").
			   build();
 
	}

	
	@GET
	@Path("/hello/{name}")
	public Response sayHello(@PathParam("name") String name) {
		
		String output = "Hi!!" + name + "How are you ?";
 
		return Response.status(200).entity(output).build();
 
	}

}