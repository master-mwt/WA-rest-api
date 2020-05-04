package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.AppException;
import it.univaq.disim.mwt.Esse3Interface;
import it.univaq.disim.mwt.JSONDealer;
import it.univaq.disim.mwt.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.AttivitaDidatticaFisicaConDocentiCorsoDiStudioList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("elenco_delle_attivita_didattiche_fisiche_con_docenti_e_partizioni")
public class ElencoDelleAttivitaDidatticheFisicheConDocentiEPartizioniRes {
    @GET
    @Path("{aa_off_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getElencoDelleAttivitaDidatticheFisicheConDocentiEPartizioni(@PathParam("aa_off_id") int aa_off_id, @QueryParam("fac_id") int fac_id, @QueryParam("cds_id") int cds_id, @QueryParam("doc_des") String doc_des, @QueryParam("att_did_des") String att_did_des, @QueryParam("titolare_flg") int titolare_flg, @QueryParam("resp_ud_flg") int resp_ud_flg, @QueryParam("lezione_flg") int lezione_flg, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("aa_off_id", String.valueOf(aa_off_id));

        if (fac_id != 0) {
            inputParameters.put("fac_id", String.valueOf(fac_id));
        }

        if (cds_id != 0) {
            inputParameters.put("cds_id", String.valueOf(cds_id));
        }

        if (doc_des != null) {
            inputParameters.put("doc_des", doc_des);
        }

        if (att_did_des != null) {
            inputParameters.put("att_did_des", att_did_des);
        }

        if (titolare_flg != 0) {
            inputParameters.put("titolare_flg", String.valueOf(titolare_flg));
        }

        if (resp_ud_flg != 0) {
            inputParameters.put("resp_ud_flg", String.valueOf(resp_ud_flg));
        }

        if (lezione_flg != 0) {
            inputParameters.put("lezione_flg", String.valueOf(lezione_flg));
        }

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            AttivitaDidatticaFisicaConDocentiCorsoDiStudioList attivitaDidatticaFisicaConDocentiCorsoDiStudioList = Esse3Interface.elencoDelleAttivitaDidatticheFisicheConDocentiEPartizioni(inputParameters);

            return Response.ok(JSONDealer.toJSON(attivitaDidatticaFisicaConDocentiCorsoDiStudioList)).build();
        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }
}
