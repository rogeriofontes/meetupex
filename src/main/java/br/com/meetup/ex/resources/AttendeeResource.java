package br.com.meetup.ex.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.meetup.ex.service.AttendeeService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/hello")
public class AttendeeResource {

    @Inject
    private AttendeeService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/attendee/{name}")
    public String greeting(@PathParam String name) {
        return service.greeting(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
}
