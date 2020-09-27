package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.esse3.Esse3Interface;
import it.univaq.disim.mwt.exceptions.AppException;
import it.univaq.disim.mwt.exceptions.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.AttivitaDidatticaFisicaCorsoDiStudioList;
import it.univaq.disim.mwt.utils.JSONDealer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("elenco_attivita_didattiche_fisiche")
public class ElencoAttivitaDidatticheFisicheRes {

    @GET
    @Path("aa_off_id/{aa_off_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getElencoAttivitaDidatticheFisiche(@PathParam("aa_off_id") String aa_off_id, @QueryParam("fac_id") String fac_id, @QueryParam("cds_id") String cds_id, @QueryParam("doc_des") String doc_des, @QueryParam("att_did_des") String att_did_des, @QueryParam("titolare_flg") String titolare_flg, @QueryParam("resp_ud_flg") String resp_ud_flg, @QueryParam("lezione_flg") String lezione_flg, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("aa_off_id", aa_off_id);

        if (fac_id != null) {
            inputParameters.put("fac_id", fac_id);
        }

        if (cds_id != null) {
            inputParameters.put("cds_id", cds_id);
        }

        if (doc_des != null) {
            inputParameters.put("doc_des", doc_des);
        }

        if (att_did_des != null) {
            inputParameters.put("att_did_des", att_did_des);
        }

        if (titolare_flg != null) {
            inputParameters.put("titolare_flg", titolare_flg);
        }

        if (resp_ud_flg != null) {
            inputParameters.put("resp_ud_flg", resp_ud_flg);
        }

        if (lezione_flg != null) {
            inputParameters.put("lezione_flg", lezione_flg);
        }

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {
            AttivitaDidatticaFisicaCorsoDiStudioList attivitaDidatticaFisicaCorsoDiStudioList = Esse3Interface.elencoDelleAttivitaDidatticheFisiche(inputParameters);

            if(attivitaDidatticaFisicaCorsoDiStudioList.getAttivitaDidatticaFisicaCorsoDiStudioList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(attivitaDidatticaFisicaCorsoDiStudioList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }
}
