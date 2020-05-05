package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.esse3.Esse3Interface;
import it.univaq.disim.mwt.exceptions.AppException;
import it.univaq.disim.mwt.exceptions.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.InformazioniLogisticheAttivitaDidatticaList;
import it.univaq.disim.mwt.utils.JSONDealer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("informazioni_logistiche_per_attivita_didattiche_offerte_in_un_percorso_di_studio")
public class InformazioniLogistichePerAttivitaDidatticheOfferteInUnPercorsoDiStudioRes {
    @GET
    @Path("cds_id/{cds_id: ([0-9]+)}/aa_ord_id/{aa_ord_id: ([0-9]+)}/aa_off_id/{aa_off_id: ([0-9]+)}/pds_id/{pds_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInformazioniLogistichePerAttivitaDidatticheOfferteInUnPercorsoDiStudio(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("aa_off_id") String aa_off_id, @PathParam("pds_id") String pds_id, @QueryParam("ad_id") String ad_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);
        inputParameters.put("aa_off_id", aa_off_id);
        inputParameters.put("pds_id", pds_id);

        if (ad_id != null) {
            inputParameters.put("ad_id", ad_id);
        }

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            InformazioniLogisticheAttivitaDidatticaList informazioniLogisticheAttivitaDidatticaList = Esse3Interface.informazioniLogistichePerAttivitaDidatticheOfferteInUnPercorsoDiStudio(inputParameters);

            return Response.ok(JSONDealer.toJSON(informazioniLogisticheAttivitaDidatticaList)).build();
        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }
}
