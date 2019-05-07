package com.dell.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.dell.model.ProjectManager;
import com.dell.services.ProjectManagerService;

@Path("/manager")
public class ProjectManagerController {

	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("/pm")
	public Response getMessage(@PathParam("pm") String message) {
		//String output = "Jersey says " + message;
		List<ProjectManager> pm = new ProjectManagerService().findAll();
		return Response.status(200).entity(pm).build();

	}

}
