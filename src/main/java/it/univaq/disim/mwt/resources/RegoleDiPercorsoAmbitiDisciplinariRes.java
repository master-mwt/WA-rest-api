package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.esse3.Esse3Interface;
import it.univaq.disim.mwt.exceptions.AppException;
import it.univaq.disim.mwt.exceptions.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.AmbitoDisciplinareRegolamentoDiPercorsoList;
import it.univaq.disim.mwt.utils.JSONDealer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("regole_di_percorso_ambiti_disciplinari")
public class RegoleDiPercorsoAmbitiDisciplinariRes {

    @GET
    @Path("{cds_id: ([0-9]+)}/{aa_ord_id: ([0-9]+)}/{pds_id: ([0-9]+)}/{prof_cod: ([0-9]+)}/{aa_reg_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRegoleDiPercorsoAmbitiDisciplinari(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("pds_id") String pds_id, @PathParam("prof_cod") String prof_cod, @PathParam("aa_reg_id") String aa_reg_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);
        inputParameters.put("pds_id", pds_id);
        inputParameters.put("prof_cod", prof_cod);
        inputParameters.put("aa_reg_id", aa_reg_id);

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            AmbitoDisciplinareRegolamentoDiPercorsoList ambitoDisciplinareRegolamentoDiPercorsoList = Esse3Interface.regoleDiPercorsoAmbitiDisciplinari(inputParameters);

            return Response.ok(JSONDealer.toJSON(ambitoDisciplinareRegolamentoDiPercorsoList)).build();
        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }
}
