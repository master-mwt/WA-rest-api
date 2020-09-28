package it.univaq.disim.mwt.resources;

import it.univaq.disim.mwt.esse3.Esse3Interface;
import it.univaq.disim.mwt.exceptions.AppException;
import it.univaq.disim.mwt.exceptions.RestWebApplicationException;
import it.univaq.disim.mwt.model.lists.*;
import it.univaq.disim.mwt.utils.JSONDealer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("corsi_di_studio")
public class CorsiDiStudioRes {

    @GET
    @Path("tipologie")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTipiCorsiDiStudio() {
        Map<String, String> inputParameters = new HashMap<String, String>();

        try {

            TipoCorsoDiStudioList tipoCorsoDiStudioList = Esse3Interface.tipiCorsiDiStudio(inputParameters);

            if (tipoCorsoDiStudioList.getTipoCorsoDiStudioList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(tipoCorsoDiStudioList)).build();

        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/classe_di_laurea")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getClasseDiLaureaCorsoDiStudio(@PathParam("cds_id") String cds_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            ClasseDiLaureaList classeDiLaureaList = Esse3Interface.classeDiLaureaDiUnCorsoDiStudio(inputParameters);

            if (classeDiLaureaList.getClasseDiLaureaList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(classeDiLaureaList)).build();

        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getElencoOrdinamentiCorsoDiStudio(@PathParam("cds_id") String cds_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            OrdinamentoList ordinamentoList = Esse3Interface.elencoDegliOrdinamentiDiUnCorsoDiStudio(inputParameters);

            if (ordinamentoList.getOrdinamentoList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(ordinamentoList)).build();

        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/dati_di_dettaglio")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDatiDiDettaglioOrdinamentoDidattico(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            DatiDiDettaglioOrdinamentoList datiDiDettaglioOrdinamentoList = Esse3Interface.datiDiDettaglioDiUnOrdinamentoDidattico(inputParameters);

            if (datiDiDettaglioOrdinamentoList.getDatiDiDettaglioOrdinamentoList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(datiDiDettaglioOrdinamentoList)).build();

        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/percorsi_di_studio")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getElencoPercorsiCorsoDiStudio(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            PercorsoDiStudioList percorsoDiStudioList = Esse3Interface.elencoDeiPercorsiDiUnCorsoDiStudio(inputParameters);

            if (percorsoDiStudioList.getPercorsoDiStudioList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(percorsoDiStudioList)).build();

        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/percorsi_di_studio/{pds_id: ([0-9]+)}/dati_di_dettaglio")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDatiDiDettaglioPercorsoDiStudio(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("pds_id") String pds_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);
        inputParameters.put("pds_id", pds_id);

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            DatiDiDettaglioPercorsoDiStudioList datiDiDettaglioPercorsoDiStudioList = Esse3Interface.datiDiDettaglioDiUnPercorsoDiStudio(inputParameters);

            if (datiDiDettaglioPercorsoDiStudioList.getDatiDiDettaglioPercorsoDiStudioList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(datiDiDettaglioPercorsoDiStudioList)).build();

        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/percorsi_di_studio/{pds_id: ([0-9]+)}/offerta/{aa_off_id: ([0-9]+)}/attivita_didattiche")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getElencoAttivitaDidattichePercorsoDiStudio(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("aa_off_id") String aa_off_id, @PathParam("pds_id") String pds_id, @QueryParam("ad_id") String ad_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
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

            AttivitaDidatticaList attivitaDidatticaList = Esse3Interface.elencoDelleAttivitaDidatticheOfferteInUnPercorsoDiStudio(inputParameters);

            if (attivitaDidatticaList.getAttivitaDidatticaList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(attivitaDidatticaList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/percorsi_di_studio/{pds_id: ([0-9]+)}/offerta/{aa_off_id: ([0-9]+)}/periodo_didattico")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPeriodoDidatticoAttivitaDidattichePercorsoDiStudio(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("aa_off_id") String aa_off_id, @PathParam("pds_id") String pds_id, @QueryParam("ad_id") String ad_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);
        inputParameters.put("aa_off_id", aa_off_id);
        inputParameters.put("pds_id", pds_id);

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {
            PeriodoDidatticoAttivitaDidatticaList periodoDidatticoAttivitaDidatticaList = Esse3Interface.periodoDidatticoPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(inputParameters);

            if (periodoDidatticoAttivitaDidatticaList.getPeriodoDidatticoAttivitaDidatticaList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(periodoDidatticoAttivitaDidatticaList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/percorsi_di_studio/{pds_id: ([0-9]+)}/offerta/{aa_off_id: ([0-9]+)}/informazioni_logistiche")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInformazioniLogisticheAttivitaDidattichePercorsoDiStudio(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("aa_off_id") String aa_off_id, @PathParam("pds_id") String pds_id, @QueryParam("ad_id") String ad_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
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

            if (informazioniLogisticheAttivitaDidatticaList.getInformazioniLogisticheAttivitaDidatticaList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(informazioniLogisticheAttivitaDidatticaList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("ordinamenti/percorsi_di_studio/offerta/attivita_didattiche/{ad_log_id: ([0-9]+)}/docenti")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDocentiAttivitaDidattichePercorsoDiStudio(@PathParam("ad_log_id") String ad_log_id, @QueryParam("tit_flg") String tit_flg) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("ad_log_id", ad_log_id);

        if (tit_flg != null) {
            inputParameters.put("tit_flg", tit_flg);
        }

        try {

            DocenteAttivitaDidatticaList docenteAttivitaDidatticaList = Esse3Interface.docentiPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(inputParameters);

            if (docenteAttivitaDidatticaList.getDocenteAttivitaDidatticaList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(docenteAttivitaDidatticaList)).build();

        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/percorsi_di_studio/{pds_id: ([0-9]+)}/offerta/{aa_off_id: ([0-9]+)}/attivita_didattiche/{ad_id: ([0-9]+)}/docenti")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDocentiAttivitaDidattichePercorsoDiStudio(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("aa_off_id") String aa_off_id, @PathParam("pds_id") String pds_id, @PathParam("ad_id") String ad_id, @QueryParam("tit_flg") String tit_flg) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);
        inputParameters.put("aa_off_id", aa_off_id);
        inputParameters.put("pds_id", pds_id);
        inputParameters.put("ad_id", ad_id);

        if (tit_flg != null) {
            inputParameters.put("tit_flg", tit_flg);
        }

        try {

            DocenteAttivitaDidatticaList docenteAttivitaDidatticaList = Esse3Interface.docentiPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(inputParameters);

            if (docenteAttivitaDidatticaList.getDocenteAttivitaDidatticaList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(docenteAttivitaDidatticaList)).build();

        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/percorsi_di_studio/{pds_id: ([0-9]+)}/offerta/{aa_off_id: ([0-9]+)}/anno_regolamento/{anno_coorte: ([0-9]{4})}/regole_di_scelta")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRegoleSceltaAttivitaDidattichePercorsoDiStudio(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("aa_off_id") String aa_off_id, @PathParam("pds_id") String pds_id, @PathParam("anno_coorte") String anno_coorte) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);
        inputParameters.put("aa_off_id", aa_off_id);
        inputParameters.put("pds_id", pds_id);
        inputParameters.put("anno_coorte", anno_coorte);

        try {

            RegoleDiSceltaAttivitaDidatticaList regoleDiSceltaAttivitaDidatticaList = Esse3Interface.regoleDiSceltaPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(inputParameters);

            if (regoleDiSceltaAttivitaDidatticaList.getRegoleDiSceltaAttivitaDidatticaList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(regoleDiSceltaAttivitaDidatticaList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("ordinamenti/percorsi_di_studio/offerta/{aa_off_id: ([0-9]+)}/attivita_didattiche/{ad_log_id: ([0-9]+)}/segmenti")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSegmentiPercorsoDiStudioOAttivitaDidattica(@PathParam("aa_off_id") String aa_off_id, @PathParam("ad_log_id") String ad_log_id, @QueryParam("ad_id") String ad_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("aa_off_id", aa_off_id);
        inputParameters.put("ad_log_id", ad_log_id);

        if (ad_id != null) {
            inputParameters.put("ad_id", ad_id);
        }

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {
            SegmentiAttivitaDidatticaList segmentiAttivitaDidatticaList = Esse3Interface.segmentiInUnPercorsoDiStudioOAttivitaDidatticaOfferta(inputParameters);

            if (segmentiAttivitaDidatticaList.getSegmentiAttivitaDidatticaList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(segmentiAttivitaDidatticaList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/percorsi_di_studio/{pds_id: ([0-9]+)}/offerta/{aa_off_id: ([0-9]+)}/segmenti")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSegmentiPercorsoDiStudioOAttivitaDidattica(@PathParam("aa_off_id") String aa_off_id, @PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("pds_id") String pds_id, @QueryParam("ad_id") String ad_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("aa_off_id", aa_off_id);
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);
        inputParameters.put("pds_id", pds_id);

        if (ad_id != null) {
            inputParameters.put("ad_id", ad_id);
        }

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {
            SegmentiAttivitaDidatticaList segmentiAttivitaDidatticaList = Esse3Interface.segmentiInUnPercorsoDiStudioOAttivitaDidatticaOfferta(inputParameters);

            if (segmentiAttivitaDidatticaList.getSegmentiAttivitaDidatticaList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(segmentiAttivitaDidatticaList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("ordinamenti/percorsi_di_studio/offerta/{aa_off_id: ([0-9]+)}/contenuti")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContenutiAttivitaDidattica(@PathParam("aa_off_id") String aa_off_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod, @QueryParam("cds_id") String cds_id, @QueryParam("aa_ord_id") String aa_ord_id, @QueryParam("pds_id") String pds_id, @QueryParam("ad_id") String ad_id, @QueryParam("ad_log_id") String ad_log_id) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("aa_off_id", aa_off_id);

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        if (ad_log_id != null) {
            inputParameters.put("ad_log_id", ad_log_id);
        } else {
            if (cds_id != null) {
                inputParameters.put("cds_id", cds_id);
            }

            if (aa_ord_id != null) {
                inputParameters.put("aa_ord_id", aa_ord_id);
            }

            if (pds_id != null) {
                inputParameters.put("pds_id", pds_id);
            }

            if (ad_id != null) {
                inputParameters.put("ad_id", ad_id);
            }
        }

        try {

            ContenutiAttivitaDidatticaList contenutiAttivitaDidatticaList = Esse3Interface.contenutiDiUnAttivitaDidatticaOfferta(inputParameters);

            if (contenutiAttivitaDidatticaList.getContenutiAttivitaDidatticaList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(contenutiAttivitaDidatticaList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/percorsi_di_studio/{pds_id: ([0-9]+)}/regolamenti_di_percorso/{aa_reg_id: ([0-9]+)}/codici_professori/{prof_cod: ([0-9]+)}/tipi_attivita_formative")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRegoleDiPercorsoTipiAttivitaFormative(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("pds_id") String pds_id, @PathParam("prof_cod") String prof_cod, @PathParam("aa_reg_id") String aa_reg_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);
        inputParameters.put("pds_id", pds_id);
        inputParameters.put("prof_cod", prof_cod);
        inputParameters.put("aa_reg_id", aa_reg_id);

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {
            TipoDiAttivitaFormativaRegolamentoDiPercorsoList tipoDiAttivitaFormativaRegolamentoDiPercorsoList = Esse3Interface.regoleDiPercorsoTipiDiAttivitaFormative(inputParameters);

            if (tipoDiAttivitaFormativaRegolamentoDiPercorsoList.getTipoDiAttivitaFormaticaRegolamentoDiPercorsoList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(tipoDiAttivitaFormativaRegolamentoDiPercorsoList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/percorsi_di_studio/{pds_id: ([0-9]+)}/regolamenti_di_percorso/{aa_reg_id: ([0-9]+)}/codici_professori/{prof_cod: ([0-9]+)}/ambiti_disciplinari")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRegoleDiPercorsoAmbitiDisciplinari(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("pds_id") String pds_id, @PathParam("prof_cod") String prof_cod, @PathParam("aa_reg_id") String aa_reg_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);
        inputParameters.put("pds_id", pds_id);
        inputParameters.put("prof_cod", prof_cod);
        inputParameters.put("aa_reg_id", aa_reg_id);

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            AmbitoDisciplinareRegolamentoDiPercorsoList ambitoDisciplinareRegolamentoDiPercorsoList = Esse3Interface.regoleDiPercorsoAmbitiDisciplinari(inputParameters);

            if (ambitoDisciplinareRegolamentoDiPercorsoList.getAmbitoDisciplinareRegolamentoDiPercorsoList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(ambitoDisciplinareRegolamentoDiPercorsoList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/percorsi_di_studio/{pds_id: ([0-9]+)}/regolamenti_di_percorso/{aa_reg_id: ([0-9]+)}/codici_professori/{prof_cod: ([0-9]+)}/ambiti_disciplinari/{amb_id: ([0-9]+)}/tipi_attivita_formative/{taf_cod: ([a-zA-Z]+)}/settori_scientifico_disciplinari")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRegoleDiPercorsoSettoriScientificoDisciplinari(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("pds_id") String pds_id, @PathParam("prof_cod") String prof_cod, @PathParam("aa_reg_id") String aa_reg_id, @PathParam("taf_cod") String taf_cod, @PathParam("amb_id") String amb_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);
        inputParameters.put("pds_id", pds_id);
        inputParameters.put("prof_cod", prof_cod);
        inputParameters.put("aa_reg_id", aa_reg_id);
        inputParameters.put("amb_id", amb_id);
        inputParameters.put("taf_cod", taf_cod);

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {

            SettoriScientificoDisciplinariRegolamentoDiPercorsoList settoriScientificoDisciplinariRegolamentoDiPercorsoList = Esse3Interface.regoleDiPercorsoSettoriScientificoDisciplinari(inputParameters);

            if (settoriScientificoDisciplinariRegolamentoDiPercorsoList.getSettoriScientificoDisciplinariRegolamentoDiPercorsoList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(settoriScientificoDisciplinariRegolamentoDiPercorsoList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("ordinamenti/percorsi_di_studio/offerta/{aa_off_id: ([0-9]+)}/attivita_didattiche_fisiche")
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

            if (attivitaDidatticaFisicaCorsoDiStudioList.getAttivitaDidatticaFisicaCorsoDiStudioList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(attivitaDidatticaFisicaCorsoDiStudioList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("ordinamenti/percorsi_di_studio/offerta/{aa_off_id: ([0-9]+)}/attivita_didattiche_fisiche_con_docenti_e_partizioni")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getElencoAttivitaDidatticheFisicheConDocentiEPartizioni(@PathParam("aa_off_id") String aa_off_id, @QueryParam("fac_id") String fac_id, @QueryParam("cds_id") String cds_id, @QueryParam("doc_des") String doc_des, @QueryParam("att_did_des") String att_did_des, @QueryParam("titolare_flg") String titolare_flg, @QueryParam("resp_ud_flg") String resp_ud_flg, @QueryParam("lezione_flg") String lezione_flg, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
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

            AttivitaDidatticaFisicaConDocentiCorsoDiStudioList attivitaDidatticaFisicaConDocentiCorsoDiStudioList = Esse3Interface.elencoDelleAttivitaDidatticheFisicheConDocentiEPartizioni(inputParameters);

            if (attivitaDidatticaFisicaConDocentiCorsoDiStudioList.getAttivitaDidatticaFisicaConDocentiCorsoDiStudioList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(attivitaDidatticaFisicaConDocentiCorsoDiStudioList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/percorsi_di_studio/{pds_id: ([0-9]+)}/offerta/{aa_off_id: ([0-9]+)}/attivita_didattiche/{ad_id: ([0-9]+)}/unita_didattiche")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getElencoUnitaDidatticheAttivitaDidattica(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("pds_id") String pds_id, @PathParam("aa_off_id") String aa_off_id, @PathParam("ad_id") String ad_id, @QueryParam("lingua_iso6392_cod") String lingua_iso6392_cod) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);
        inputParameters.put("pds_id", pds_id);
        inputParameters.put("aa_off_id", aa_off_id);
        inputParameters.put("ad_id", ad_id);

        if (lingua_iso6392_cod != null) {
            inputParameters.put("lingua_iso6392_cod", lingua_iso6392_cod);
        }

        try {
            UnitaDidatticaAttivitaDidatticaList unitaDidatticaAttivitaDidatticaList = Esse3Interface.elencoDelleUnitaDidatticheDiUnaSpecificaAttivitaDidatticaOfferta(inputParameters);

            if (unitaDidatticaAttivitaDidatticaList.getUnitaDidatticaAttivitaDidatticaList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(unitaDidatticaAttivitaDidatticaList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }

    @GET
    @Path("{cds_id: ([0-9]+)}/ordinamenti/{aa_ord_id: ([0-9]+)}/percorsi_di_studio/{pds_id: ([0-9]+)}/offerta/{aa_off_id: ([0-9]+)}/attivita_didattiche/{ad_id: ([0-9]+)}/comunita_web")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getComunitaWebAttivitaDidattica(@PathParam("cds_id") String cds_id, @PathParam("aa_ord_id") String aa_ord_id, @PathParam("pds_id") String pds_id, @PathParam("aa_off_id") String aa_off_id, @PathParam("ad_id") String ad_id) {
        Map<String, String> inputParameters = new HashMap<String, String>();
        inputParameters.put("cds_id", cds_id);
        inputParameters.put("aa_ord_id", aa_ord_id);
        inputParameters.put("pds_id", pds_id);
        inputParameters.put("aa_off_id", aa_off_id);
        inputParameters.put("ad_id", ad_id);

        try {

            ComunitaWebAttivitaDidatticaList comunitaWebAttivitaDidatticaList = Esse3Interface.comunitaWebPerUnaAttivitaDidatticaOfferta(inputParameters);

            if (comunitaWebAttivitaDidatticaList.getComunitaWebAttivitaDidatticaList() == null) {
                // empty response, the server has not found the requested resource
                return Response.status(Response.Status.NOT_FOUND).entity(JSONDealer.errorToJSON("The server has not found your request")).build();
            }

            return Response.ok(JSONDealer.toJSON(comunitaWebAttivitaDidatticaList)).build();
        } catch (AppException e) {
            // e.getCause().printStackTrace();
            throw new RestWebApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), JSONDealer.errorToJSON(e));
        }
    }
}
