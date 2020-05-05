package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.esse3.Esse3Interface;
import it.univaq.disim.mwt.exceptions.AppException;
import it.univaq.disim.mwt.exceptions.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.AnnoAccademicoList;
import it.univaq.disim.mwt.utils.JSONDealer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("elenco_anni_accademici")
public class ElencoAnniAccademiciRes {

    @GET
    @Path("{aa_ini_id: ([0-9]{4})}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getElencoAnniAccademici(@PathParam("aa_ini_id") String aa_ini_id) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("aa_ini_id", aa_ini_id);

        try {
            AnnoAccademicoList annoAccademicoList = Esse3Interface.elencoAnniAccademici(inputParameters);

            return Response.ok(JSONDealer.toJSON(annoAccademicoList)).build();

        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "Internal Server Error");
        }
    }
}
