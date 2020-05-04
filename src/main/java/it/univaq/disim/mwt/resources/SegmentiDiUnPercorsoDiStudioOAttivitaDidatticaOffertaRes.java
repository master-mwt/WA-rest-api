package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.AppException;
import it.univaq.disim.mwt.Esse3Interface;
import it.univaq.disim.mwt.JSONDealer;
import it.univaq.disim.mwt.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.SegmentiAttivitaDidatticaList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("segmenti_di_un_percorso_di_studio_o_attivita_didattica_offerta")
public class SegmentiDiUnPercorsoDiStudioOAttivitaDidatticaOffertaRes {
    @GET
    @Path("{ad_off_id: ([0-9]+)}/{ad_log_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSegmentiDiUnPercorsoDiStudioOAttivitaDidatticaOffertaRes(@PathParam("ad_off_id") int ad_off_id, @PathParam("ad_log_id") int ad_log_id, @QueryParam("ad_id") int ad_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("ad_off_id", String.valueOf(ad_off_id));
        inputParameters.put("ad_log_id", String.valueOf(ad_log_id));

        if (ad_id != 0) {
            inputParameters.put("ad_id", String.valueOf(ad_id));
        }

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {
            SegmentiAttivitaDidatticaList segmentiAttivitaDidatticaList = Esse3Interface.segmentiInUnPercorsoDiStudioOAttivitaDidatticaOfferta(inputParameters);

            return Response.ok(JSONDealer.toJSON(segmentiAttivitaDidatticaList)).build();
        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }

    @GET
    @Path("{ad_off_id: ([0-9]+)}/{cds_id: ([0-9]+)}/{aa_ord_id: ([0-9]+)}/{pds_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSegmentiDiUnPercorsoDiStudioOAttivitaDidatticaOffertaRes(@PathParam("ad_off_id") int ad_off_id, @PathParam("cds_id") int cds_id, @PathParam("aa_ord_id") int aa_ord_id, @PathParam("pds_id") int pds_id, @QueryParam("ad_id") int ad_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("ad_off_id", String.valueOf(ad_off_id));
        inputParameters.put("cds_id", String.valueOf(cds_id));
        inputParameters.put("aa_ord_id", String.valueOf(aa_ord_id));
        inputParameters.put("pds_id", String.valueOf(pds_id));

        if (ad_id != 0) {
            inputParameters.put("ad_id", String.valueOf(ad_id));
        }

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {
            SegmentiAttivitaDidatticaList segmentiAttivitaDidatticaList = Esse3Interface.segmentiInUnPercorsoDiStudioOAttivitaDidatticaOfferta(inputParameters);

            return Response.ok(JSONDealer.toJSON(segmentiAttivitaDidatticaList)).build();
        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }
}
