package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.AppException;
import it.univaq.disim.mwt.Esse3Interface;
import it.univaq.disim.mwt.JSONDealer;
import it.univaq.disim.mwt.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.ClasseMiurList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("classi")
public class ClassiRes {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getClassi(@QueryParam("cla_m_id") int cla_m_id) {
        Map<String, String> inputParameters = new HashMap<String, String>();

        if(cla_m_id != 0){
            inputParameters.put("cla_m_id", String.valueOf(cla_m_id));
        }

        try {
            ClasseMiurList classeMiurList = Esse3Interface.classi(inputParameters);

            return Response.ok(JSONDealer.toJSON(classeMiurList)).build();
        } catch (AppException e) {
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "Internal Server Error");
        }
    }
}
