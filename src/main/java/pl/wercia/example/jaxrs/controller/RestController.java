package pl.wercia.example.jaxrs.controller;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path(value = "/")
public class RestController {

	@GET
	@Path(value = "tomorrow")
	@Produces(MediaType.APPLICATION_JSON)
	public LocalDate getTomorrow(@QueryParam(value = "today") LocalDate today) {
		return today.plusDays(1);
	}

}
