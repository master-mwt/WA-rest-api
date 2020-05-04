package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.AppException;
import it.univaq.disim.mwt.Esse3Interface;
import it.univaq.disim.mwt.JSONDealer;
import it.univaq.disim.mwt.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.CorsoDiStudioList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("corsi_di_studio")
public class CorsiDiStudioRes {
    @GET
    @Path("{aa_id: ([0-9]+)}/{tipo_corso: (L1|L2|LC5|LC6|LS|LM|LM5|LM6|D|D1|DU|M1|M2|S1|SDFS|SHSP){1}}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCorsiDiStudio(@PathParam("aa_id") int aa_id, @PathParam("tipo_corso") String tipo_corso, @QueryParam("cla_id") int cla_id, @QueryParam("fac_id") int fac_id, @QueryParam("cds_des") String cds_des, @QueryParam("aa_ord_id") int aa_ord_id, @QueryParam("norm_id") int norm_id, @QueryParam("cds_id") int cds_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("aa_id", String.valueOf(aa_id));
        inputParameters.put("tipo_corso", tipo_corso);

        if (cla_id != 0) {
            inputParameters.put("cla_id", String.valueOf(aa_ord_id));
        }

        if (fac_id != 0) {
            inputParameters.put("fac_id", String.valueOf(fac_id));
        }

        if (cds_des != null) {
            inputParameters.put("cds_des", cds_des);
        }

        if (aa_ord_id != 0) {
            inputParameters.put("aa_ord_id", String.valueOf(aa_ord_id));
        }

        if (norm_id != 0) {
            inputParameters.put("norm_id", String.valueOf(norm_id));
        }

        if (cds_id != 0) {
            inputParameters.put("cds_id", String.valueOf(cds_id));
        }

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            CorsoDiStudioList corsoDiStudioList = Esse3Interface.corsiDiStudio(inputParameters);

            return Response.ok(JSONDealer.toJSON(corsoDiStudioList)).build();
        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }

    @GET
    @Path("{aa_id: ([0-9]+)}/{cds_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCorsiDiStudio(@PathParam("aa_id") int aa_id, @PathParam("cds_id") int cds_id, @QueryParam("cla_id") int cla_id, @QueryParam("fac_id") int fac_id, @QueryParam("cds_des") String cds_des, @QueryParam("aa_ord_id") int aa_ord_id, @QueryParam("norm_id") int norm_id, @QueryParam("tipo_corso") String tipo_corso, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("aa_id", String.valueOf(aa_id));
        inputParameters.put("cds_id", String.valueOf(cds_id));

        if (cla_id != 0) {
            inputParameters.put("cla_id", String.valueOf(aa_ord_id));
        }

        if (fac_id != 0) {
            inputParameters.put("fac_id", String.valueOf(fac_id));
        }

        if (cds_des != null) {
            inputParameters.put("cds_des", cds_des);
        }

        if (aa_ord_id != 0) {
            inputParameters.put("aa_ord_id", String.valueOf(aa_ord_id));
        }

        if (norm_id != 0) {
            inputParameters.put("norm_id", String.valueOf(norm_id));
        }

        if (tipo_corso != null) {
            // TODO: Regex da controllare
            if (tipo_corso.matches("(L1|L2|LC5|LC6|LS|LM|LM5|LM6|D|D1|DU|M1|M2|S1|SDFS|SHSP){1}")) {
                inputParameters.put("tipo_corso", tipo_corso);
            }
        }

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            CorsoDiStudioList corsoDiStudioList = Esse3Interface.corsiDiStudio(inputParameters);

            return Response.ok(JSONDealer.toJSON(corsoDiStudioList)).build();
        } catch (AppException e) {
            e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getCause().getMessage());
        }
    }
}
