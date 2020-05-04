package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.AppException;
import it.univaq.disim.mwt.Esse3Interface;
import it.univaq.disim.mwt.JSONDealer;
import it.univaq.disim.mwt.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.RegoleDiSceltaAttivitaDidatticaList;

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
    public Response getRegoleDiSceltaPerAttivitàDidatticheOfferteInUnPercorsoDiStudio(@PathParam("cds_id") int cds_id, @PathParam("aa_ord_id") int aa_ord_id, @PathParam("aa_off_id") int aa_off_id, @PathParam("pds_id") int pds_id, @PathParam("anno_coorte") int anno_coorte) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", String.valueOf(cds_id));
        inputParameters.put("aa_ord_id", String.valueOf(aa_ord_id));
        inputParameters.put("aa_off_id", String.valueOf(aa_off_id));
        inputParameters.put("pds_id", String.valueOf(pds_id));
        inputParameters.put("anno_coorte", String.valueOf(anno_coorte));

        try {

            RegoleDiSceltaAttivitaDidatticaList regoleDiSceltaAttivitaDidatticaList = Esse3Interface.regoleDiSceltaPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(inputParameters);

            return Response.ok(JSONDealer.toJSON(regoleDiSceltaAttivitaDidatticaList)).build();
        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }
}
