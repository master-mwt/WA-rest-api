package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.esse3.Esse3Interface;
import it.univaq.disim.mwt.exceptions.AppException;
import it.univaq.disim.mwt.exceptions.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.RegoleDiSceltaAttivitaDidatticaList;
import it.univaq.disim.mwt.utils.JSONDealer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("regole_di_scelta_per_attivita_didattiche_offerte_in_un_percorso_di_studio")
public class RegoleDiSceltaPerAttivitàDidatticheOfferteInUnPercorsoDiStudioRes {
    @GET
    @Path("{cds_id: ([0-9]+)}/{aa_ord_id: ([0-9]+)}/{aa_off_id: ([0-9]+)}/{pds_id: ([0-9]+)}/{anno_coorte: ([0-9]{4})}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRegoleDiSceltaPerAttivitàDidatticheOfferteInUnPercorsoDiStudio(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("aa_off_id") String aa_off_id, @PathParam("pds_id") String pds_id, @PathParam("anno_coorte") String anno_coorte) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);
        inputParameters.put("aa_off_id", aa_off_id);
        inputParameters.put("pds_id", pds_id);
        inputParameters.put("anno_coorte", anno_coorte);

        try {

            RegoleDiSceltaAttivitaDidatticaList regoleDiSceltaAttivitaDidatticaList = Esse3Interface.regoleDiSceltaPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(inputParameters);

            return Response.ok(JSONDealer.toJSON(regoleDiSceltaAttivitaDidatticaList)).build();
        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }
}
