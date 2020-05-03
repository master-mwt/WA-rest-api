package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.AppException;
import it.univaq.disim.mwt.Esse3Interface;
import it.univaq.disim.mwt.JSONDealer;
import it.univaq.disim.mwt.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.AnnoAccademicoList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("anno_accademico_corrente")
public class AnnoAccademicoCorrenteRes {

    @GET
    @Path("{tipo_data_rif_cod: (DR_CALESA|DR_CARR|DR_IPO|DR_ISCR|DR_OFF|DR_PASS|DR_RICO|DR_SOSP|DR_TASSE|DR_TRASF|DR_TRA_IN){1}}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAnnoAccademicoCorrente(@PathParam("tipo_data_rif_cod") String tipo_data_rif_cod, @QueryParam("tipo_corso_cod") String tipo_corso_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("tipo_data_rif_cod", tipo_data_rif_cod);

        if (tipo_corso_cod != null) {
            inputParameters.put("tipo_corso_cod", tipo_corso_cod);
        }

        try {
            AnnoAccademicoList annoAccademicoList = Esse3Interface.annoAccademicoCorrente(inputParameters);

            return Response.ok(JSONDealer.toJSON(annoAccademicoList)).build();

        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "Internal Server Error");
        }
    }
}
