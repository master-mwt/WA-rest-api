package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.esse3.Esse3Interface;
import it.univaq.disim.mwt.exceptions.AppException;
import it.univaq.disim.mwt.exceptions.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.AnnoAccademicoList;
import it.univaq.disim.mwt.model.lists.CorsoDiStudioList;
import it.univaq.disim.mwt.utils.JSONDealer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("anni_accademici")
public class AnniAccademiciRes {

    @GET
    @Path("corrente/{tipo_data_rif_cod: (DR_CALESA|DR_CARR|DR_IPO|DR_ISCR|DR_OFF|DR_PASS|DR_RICO|DR_SOSP|DR_TASSE|DR_TRASF|DR_TRA_IN){1}}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAnnoAccademicoCorrente(@PathParam("tipo_data_rif_cod") String tipo_data_rif_cod, @QueryParam("tipo_corso_cod") String tipo_corso_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("tipo_data_rif_cod", tipo_data_rif_cod);

        if (tipo_corso_cod != null) {
            inputParameters.put("tipo_corso_cod", tipo_corso_cod);
        }

        try {
            AnnoAccademicoList annoAccademicoList = Esse3Interface.annoAccademicoCorrente(inputParameters);

            if (annoAccademicoList.getAnnoAccademicoList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(annoAccademicoList)).build();

        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{aa_ini_id: ([0-9]{4})}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getElencoAnniAccademici(@PathParam("aa_ini_id") String aa_ini_id) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("aa_ini_id", aa_ini_id);

        try {
            AnnoAccademicoList annoAccademicoList = Esse3Interface.elencoAnniAccademici(inputParameters);

            if (annoAccademicoList.getAnnoAccademicoList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(annoAccademicoList)).build();

        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{aa_id: ([0-9]+)}/corsi_di_studio/{tipo_corso: (L1|L2|LC5|LC6|LS|LM|LM5|LM6|D|D1|DU|M1|M2|S1|SDFS|SHSP){1}}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCorsiDiStudioTipoCorso(@PathParam("aa_id") String aa_id, @PathParam("tipo_corso") String tipo_corso, @QueryParam("cla_id") String cla_id, @QueryParam("fac_id") String fac_id, @QueryParam("cds_des") String cds_des, @QueryParam("aa_ord_id") String aa_ord_id, @QueryParam("norm_id") String norm_id, @QueryParam("cds_id") String cds_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("aa_id", aa_id);
        inputParameters.put("tipo_corso", tipo_corso);

        if (cla_id != null) {
            inputParameters.put("cla_id", aa_ord_id);
        }

        if (fac_id != null) {
            inputParameters.put("fac_id", fac_id);
        }

        if (cds_des != null) {
            inputParameters.put("cds_des", cds_des);
        }

        if (aa_ord_id != null) {
            inputParameters.put("aa_ord_id", aa_ord_id);
        }

        if (norm_id != null) {
            inputParameters.put("norm_id", norm_id);
        }

        if (cds_id != null) {
            inputParameters.put("cds_id", cds_id);
        }

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            CorsoDiStudioList corsoDiStudioList = Esse3Interface.corsiDiStudio(inputParameters);

            if (corsoDiStudioList.getCorsoDiStudioList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(corsoDiStudioList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{aa_id: ([0-9]+)}/corsi_di_studio/{cds_id: ([0-9]+)}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCorsiDiStudioCdsId(@PathParam("aa_id") String aa_id, @PathParam("cds_id") String cds_id, @QueryParam("cla_id") String cla_id, @QueryParam("fac_id") String fac_id, @QueryParam("cds_des") String cds_des, @QueryParam("aa_ord_id") String aa_ord_id, @QueryParam("norm_id") String norm_id, @QueryParam("tipo_corso") String tipo_corso, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("aa_id", aa_id);
        inputParameters.put("cds_id", cds_id);

        if (cla_id != null) {
            inputParameters.put("cla_id", aa_ord_id);
        }

        if (fac_id != null) {
            inputParameters.put("fac_id", fac_id);
        }

        if (cds_des != null) {
            inputParameters.put("cds_des", cds_des);
        }

        if (aa_ord_id != null) {
            inputParameters.put("aa_ord_id", aa_ord_id);
        }

        if (norm_id != null) {
            inputParameters.put("norm_id", norm_id);
        }

        if (tipo_corso != null) {
            if (tipo_corso.matches("(L1|L2|LC5|LC6|LS|LM|LM5|LM6|D|D1|DU|M1|M2|S1|SDFS|SHSP){1}")) {
                inputParameters.put("tipo_corso", tipo_corso);
            }
        }

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            CorsoDiStudioList corsoDiStudioList = Esse3Interface.corsiDiStudio(inputParameters);

            if (corsoDiStudioList.getCorsoDiStudioList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(corsoDiStudioList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }
}
