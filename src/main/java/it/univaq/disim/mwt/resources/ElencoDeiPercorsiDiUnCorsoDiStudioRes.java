package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.AppException;
import it.univaq.disim.mwt.Esse3Interface;
import it.univaq.disim.mwt.JSONDealer;
import it.univaq.disim.mwt.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.PercorsoDiStudioList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("elenco_dei_percorsi_di_un_corso_di_studio")
public class ElencoDeiPercorsiDiUnCorsoDiStudioRes {

    @GET
    @Path("{cds_id: ([0-9]+)}/{aa_ord_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getElencoDeiPercorsiDiUnCorsoDiStudio(@PathParam("cds_id") int cds_id, @PathParam("aa_ord_id") int aa_ord_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", String.valueOf(cds_id));
        inputParameters.put("aa_ord_id", String.valueOf(aa_ord_id));

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {
            // TODO: Da provare
            PercorsoDiStudioList percorsoDiStudioList = Esse3Interface.elencoDeiPercorsiDiUnCorsoDiStudio(inputParameters);

            return Response.ok(JSONDealer.toJSON(percorsoDiStudioList)).build();

        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }
}
