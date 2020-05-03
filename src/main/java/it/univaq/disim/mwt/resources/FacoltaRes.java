package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.AppException;
import it.univaq.disim.mwt.Esse3Interface;
import it.univaq.disim.mwt.JSONDealer;
import it.univaq.disim.mwt.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.FacoltaList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("facolta")
public class FacoltaRes {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFacolta(@QueryParam("fac_id") int fac_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod){
        Map<String, String> inputParameters = new HashMap<String, String>();

        if(fac_id != 0){
            inputParameters.put("fac_id", String.valueOf(fac_id));
        }

        if(lingua_iso6392_cod != null){
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            FacoltaList facoltaList = Esse3Interface.facolta(inputParameters);

            return Response.ok(JSONDealer.toJSON(facoltaList)).build();

        } catch(AppException e){
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }
}
