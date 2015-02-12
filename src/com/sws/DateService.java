package com.sws;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("dateservice")
public class DateService {

	@GET
	@Path("getdate")
	@Produces(MediaType.TEXT_HTML)
	public Response getDate() {
		String date = null;
		Date currentDate = Calendar.getInstance().getTime();
		date = currentDate.toString();
		return Response.status(200).entity(date).build();
	}

}