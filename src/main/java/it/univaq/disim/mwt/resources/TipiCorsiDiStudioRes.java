package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.AppException;
import it.univaq.disim.mwt.Esse3Interface;
import it.univaq.disim.mwt.JSONDealer;
import it.univaq.disim.mwt.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.TipoCorsoDiStudioList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("tipi_corsi_di_studio")
public class TipiCorsiDiStudioRes {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTipiCorsiDiStudio() {
        Map<String, String> inputParameters = new HashMap<String, String>();

        try {

            TipoCorsoDiStudioList tipoCorsoDiStudioList = Esse3Interface.tipiCorsiDiStudio(inputParameters);

            return Response.ok(JSONDealer.toJSON(tipoCorsoDiStudioList)).build();

        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }
}
