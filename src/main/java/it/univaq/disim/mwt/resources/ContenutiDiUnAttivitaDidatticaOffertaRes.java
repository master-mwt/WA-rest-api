package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.AppException;
import it.univaq.disim.mwt.Esse3Interface;
import it.univaq.disim.mwt.JSONDealer;
import it.univaq.disim.mwt.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.ContenutiAttivitaDidatticaList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("contenuti_di_un_attivita_didattica_offerta")
public class ContenutiDiUnAttivitaDidatticaOffertaRes {
    @GET
    @Path("{aa_off_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContenutiDiUnAttivitaDidatticaOfferta(@PathParam("aa_off_id") int aa_off_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod, @QueryParam("cds_id") int cds_id, @QueryParam("aa_ord_id") int aa_ord_id, @QueryParam("pds_id") int pds_id, @QueryParam("ad_id") int ad_id, @QueryParam("ad_log_id") int ad_log_id) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("aa_off_id", String.valueOf(aa_off_id));

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        if (ad_log_id != 0) {
            inputParameters.put("ad_log_id", String.valueOf(ad_log_id));
        } else {
            if (cds_id != 0) {
                inputParameters.put("cds_id", String.valueOf(cds_id));
            }

            if (aa_ord_id != 0) {
                inputParameters.put("aa_ord_id", String.valueOf(aa_ord_id));
            }

            if (pds_id != 0) {
                inputParameters.put("pds_id", String.valueOf(pds_id));
            }

            if (ad_id != 0) {
                inputParameters.put("ad_id", String.valueOf(ad_id));
            }
        }

        try {

            ContenutiAttivitaDidatticaList contenutiAttivitaDidatticaList = Esse3Interface.contenutiDiUnAttivitaDidatticaOfferta(inputParameters);

            return Response.ok(JSONDealer.toJSON(contenutiAttivitaDidatticaList)).build();
        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }
}
