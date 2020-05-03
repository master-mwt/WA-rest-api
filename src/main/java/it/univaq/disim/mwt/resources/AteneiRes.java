package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.AppException;
import it.univaq.disim.mwt.Esse3Interface;
import it.univaq.disim.mwt.JSONDealer;
import it.univaq.disim.mwt.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.AteneoList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("atenei")
public class AteneiRes {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAtenei() {
        Map<String, String> inputParameters = new HashMap<String, String>();

        try {
            AteneoList ateneoList = Esse3Interface.atenei(inputParameters);

            return Response.ok(JSONDealer.toJSON(ateneoList)).build();
        } catch (AppException e){
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "Internal Server Error");
        }
    }
}
