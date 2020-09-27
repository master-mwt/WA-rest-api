package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.esse3.Esse3Interface;
import it.univaq.disim.mwt.exceptions.AppException;
import it.univaq.disim.mwt.exceptions.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.ClasseMiurList;
import it.univaq.disim.mwt.utils.JSONDealer;

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
    public Response getClassi(@QueryParam("cla_m_id") String cla_m_id) {
        Map<String, String> inputParameters = new HashMap<String, String>();

        if (cla_m_id != null) {
            inputParameters.put("cla_m_id", cla_m_id);
        }

        try {
            ClasseMiurList classeMiurList = Esse3Interface.classi(inputParameters);

            if(classeMiurList.getClasseMiurList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(classeMiurList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }
}
