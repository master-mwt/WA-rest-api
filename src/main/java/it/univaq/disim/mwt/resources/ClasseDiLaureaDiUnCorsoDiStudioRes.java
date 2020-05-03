package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.AppException;
import it.univaq.disim.mwt.Esse3Interface;
import it.univaq.disim.mwt.JSONDealer;
import it.univaq.disim.mwt.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.ClasseDiLaureaList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("classe_di_laurea_di_un_corso_di_studio")
public class ClasseDiLaureaDiUnCorsoDiStudioRes {

    @GET
    @Path("{cds_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getClasseDiLaureaDiUnCorsoDiStudio(@PathParam("cds_id") int cds_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", String.valueOf(cds_id));

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {
            // TODO: Da provare
            ClasseDiLaureaList classeDiLaureaList = Esse3Interface.classeDiLaureaDiUnCorsoDiStudio(inputParameters);

            return Response.ok(JSONDealer.toJSON(classeDiLaureaList)).build();

        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }
}
