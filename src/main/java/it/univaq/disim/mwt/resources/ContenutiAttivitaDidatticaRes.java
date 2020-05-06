package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.esse3.Esse3Interface;
import it.univaq.disim.mwt.exceptions.AppException;
import it.univaq.disim.mwt.exceptions.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.ContenutiAttivitaDidatticaList;
import it.univaq.disim.mwt.utils.JSONDealer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("contenuti_attivita_didattica")
public class ContenutiAttivitaDidatticaRes {
    @GET
    @Path("aa_off_id/{aa_off_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContenutiAttivitaDidattica(@PathParam("aa_off_id") String aa_off_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod, @QueryParam("cds_id") String cds_id, @QueryParam("aa_ord_id") String aa_ord_id, @QueryParam("pds_id") String pds_id, @QueryParam("ad_id") String ad_id, @QueryParam("ad_log_id") String ad_log_id) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("aa_off_id", aa_off_id);

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        if (ad_log_id != null) {
            inputParameters.put("ad_log_id", ad_log_id);
        } else {
            if (cds_id != null) {
                inputParameters.put("cds_id", cds_id);
            }

            if (aa_ord_id != null) {
                inputParameters.put("aa_ord_id", aa_ord_id);
            }

            if (pds_id != null) {
                inputParameters.put("pds_id", pds_id);
            }

            if (ad_id != null) {
                inputParameters.put("ad_id", ad_id);
            }
        }

        try {

            ContenutiAttivitaDidatticaList contenutiAttivitaDidatticaList = Esse3Interface.contenutiDiUnAttivitaDidatticaOfferta(inputParameters);

            return Response.ok(JSONDealer.toJSON(contenutiAttivitaDidatticaList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }
}
