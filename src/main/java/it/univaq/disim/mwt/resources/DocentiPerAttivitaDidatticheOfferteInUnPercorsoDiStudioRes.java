package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.AppException;
import it.univaq.disim.mwt.Esse3Interface;
import it.univaq.disim.mwt.JSONDealer;
import it.univaq.disim.mwt.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.DocenteAttivitaDidatticaList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("docenti_per_attivita_didattiche_offerte_in_un_percorso_di_studio")
public class DocentiPerAttivitaDidatticheOfferteInUnPercorsoDiStudioRes {
    @GET
    @Path("{ad_log_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDocentiPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(@PathParam("ad_log_id") int ad_log_id, @QueryParam("tit_flg") int tit_flg) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("ad_log_id", String.valueOf(ad_log_id));

        if (tit_flg != 0) {
            inputParameters.put("tit_flg", String.valueOf(tit_flg));
        }

        try {

            DocenteAttivitaDidatticaList docenteAttivitaDidatticaList = Esse3Interface.docentiPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(inputParameters);

            return Response.ok(JSONDealer.toJSON(docenteAttivitaDidatticaList)).build();

        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/{aa_ord_id: ([0-9]+)}/{aa_off_id: ([0-9]+)}/{pds_id: ([0-9]+)}/{ad_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDocentiPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(@PathParam("cds_id") int cds_id, @PathParam("aa_ord_id") int aa_ord_id, @PathParam("aa_off_id") int aa_off_id, @PathParam("pds_id") int pds_id, @PathParam("ad_id") int ad_id, @QueryParam("tit_flg") int tit_flg) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", String.valueOf(cds_id));
        inputParameters.put("aa_ord_id", String.valueOf(aa_ord_id));
        inputParameters.put("aa_off_id", String.valueOf(aa_off_id));
        inputParameters.put("pds_id", String.valueOf(pds_id));
        inputParameters.put("ad_id", String.valueOf(ad_id));

        if (tit_flg != 0) {
            inputParameters.put("tit_flg", String.valueOf(tit_flg));
        }

        try {

            DocenteAttivitaDidatticaList docenteAttivitaDidatticaList = Esse3Interface.docentiPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(inputParameters);

            return Response.ok(JSONDealer.toJSON(docenteAttivitaDidatticaList)).build();

        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }
}
