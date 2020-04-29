package it.univaq.disim.mwt.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("dummy")
public class DummyRes {
    @GET
    @Produces("application/json")
    public Response getDummy() {
        return Response.ok("Dummy").build();
    }
}
