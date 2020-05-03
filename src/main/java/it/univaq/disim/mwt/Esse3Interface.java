package it.univaq.disim.mwt;

import it.univaq.disim.mwt.model.lists.*;

import java.util.Map;

public class Esse3Interface {

    public static AnnoAccademicoList annoAccademicoCorrente(Map<String, String> inputParameters) throws AppException {
        // OP: ANNO_ACCADEMICO_CORRENTE
        String opcode = "GET_CURR_AA";

        return soapToObj(opcode, inputParameters, AnnoAccademicoList.class);
    }

    public static AnnoAccademicoList elencoAnniAccademici(Map<String, String> inputParameters) throws AppException {
        // OP: ELENCO_ANNI_ACCADEMICI
        String opcode = "AA_LOOKUP";

        return soapToObj(opcode, inputParameters, AnnoAccademicoList.class);
    }

    public static ClasseMiurList classi(Map<String, String> inputParameters) throws AppException {
        // OP: CLASSI
        String opcode = "CLASSI";

        return soapToObj(opcode, inputParameters, ClasseMiurList.class);
    }

    public static FacoltaList facolta(Map<String, String> inputParameters) throws AppException {
        // OP: FACOLTA
        String opcode = "FACOLTA";

        return soapToObj(opcode, inputParameters, FacoltaList.class);
    }

    public static AteneoList atenei(Map<String, String> inputParameters) throws AppException {
        // OP: ATENEI
        String opcode = "ATENEI";

        return soapToObj(opcode, inputParameters, AteneoList.class);
    }

    public static CorsoDiStudioList corsiDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: CDS_FACOLTA
        String opcode = "CDS_FACOLTA";

        return soapToObj(opcode, inputParameters, CorsoDiStudioList.class);
    }

    public static TipoCorsoDiStudioList tipiCorsiDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: TIPI_CORSO
        String opcode = "TIPI_CORSO";

        return soapToObj(opcode, inputParameters, TipoCorsoDiStudioList.class);
    }

    public static ClasseDiLaureaList classeDiLaureaDiUnCorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: CLASSE_CDS
        String opcode = "CLASSE_CDS";

        return soapToObj(opcode, inputParameters, ClasseDiLaureaList.class);
    }

    public static OrdinamentoList elencoDegliOrdinamentiDiUnCorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_CDSORD
        String opcode = "LISTA_CDSORD";

        return soapToObj(opcode, inputParameters, OrdinamentoList.class);
    }

    public static DatiDiDettaglioOrdinamentoList datiDiDettaglioDiUnOrdinamentoDidattico(Map<String, String> inputParameters) throws AppException {
        // OP: DETT_CDSORD
        String opcode = "DETT_CDSORD";

        return soapToObj(opcode, inputParameters, DatiDiDettaglioOrdinamentoList.class);
    }

    public static PercorsoDiStudioList elencoDeiPercorsiDiUnCorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_PDSORD
        String opcode = "LISTA_PDSORD";

        return soapToObj(opcode, inputParameters, PercorsoDiStudioList.class);
    }

    public static DatiDiDettaglioPercorsoDiStudioList datiDiDettaglioDiUnPercorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: DETT_PDSORD
        String opcode = "DETT_PDSORD";

        return soapToObj(opcode, inputParameters, DatiDiDettaglioPercorsoDiStudioList.class);
    }

    public static AttivitaDidatticaList elencoDelleAttivitaDidatticheOfferteInUnPercorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_AD_PDSORD
        String opcode = "LISTA_AD_PDSORD";

        return soapToObj(opcode, inputParameters, AttivitaDidatticaList.class);
    }

    public static PeriodoDidatticoAttivitaDidatticaList periodoDidatticoPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: INFO_PART_AD_PDSORD
        String opcode = "INFO_PART_AD_PDSORD";

        return soapToObj(opcode, inputParameters, PeriodoDidatticoAttivitaDidatticaList.class);
    }

    public static InformazioniLogisticheAttivitaDidatticaList informazioniLogistichePerAttivitaDidatticheOfferteInUnPercorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: INFO_LOG_AD_PDSORD
        String opcode = "INFO_LOG_AD_PDSORD";

        return soapToObj(opcode, inputParameters, InformazioniLogisticheAttivitaDidatticaList.class);
    }

    public static DocenteAttivitaDidatticaList docentiPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_DOCENTI_AD
        String opcode = "LISTA_DOCENTI_AD";

        return soapToObj(opcode, inputParameters, DocenteAttivitaDidatticaList.class);
    }

    public static RegoleDiSceltaAttivitaDidatticaList regoleDiSceltaPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: INFO_REGSCE_PDSORD
        String opcode = "INFO_REGSCE_PDSORD";

        return soapToObj(opcode, inputParameters, RegoleDiSceltaAttivitaDidatticaList.class);
    }

    public static SegmentiAttivitaDidatticaList segmentiInUnPercorsoDiStudioOAttivitaDidatticaOfferta(Map<String, String> inputParameters) throws AppException {
        // OP: SEG_PDSORD
        String opcode = "SEG_PDSORD";

        return soapToObj(opcode, inputParameters, SegmentiAttivitaDidatticaList.class);
    }

    public static ContenutiAttivitaDidatticaList contenutiDiUnAttivitaDidatticaOfferta(Map<String, String> inputParameters) throws AppException {
        // OP: CONTENUTI_AD_PDSORD
        String opcode = "CONTENUTI_AD_PDSORD";

        return soapToObj(opcode, inputParameters, ContenutiAttivitaDidatticaList.class);
    }

    public static TipoDiAttivitaFormaticaRegolamentoDiPercorsoList regoleDiPercorsoTipiDiAttivitaFormative(Map<String, String> inputParameters) throws AppException {
        // OP: REGP_TAF
        String opcode = "REGP_TAF";

        return soapToObj(opcode, inputParameters, TipoDiAttivitaFormaticaRegolamentoDiPercorsoList.class);
    }

    public static AmbitoDisciplinareRegolamentoDiPercorsoList regoleDiPercorsoAmbitiDisciplinari(Map<String, String> inputParameters) throws AppException {
        // OP: REGP_AMB
        String opcode = "REGP_AMB";

        return soapToObj(opcode, inputParameters, AmbitoDisciplinareRegolamentoDiPercorsoList.class);
    }

    public static AttivitaDidatticaFisicaCorsoDiStudioList elencoDelleAttivitaDidatticheFisiche(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_AD_FISICHE
        String opcode = "LISTA_AD_FISICHE";

        return soapToObj(opcode, inputParameters, AttivitaDidatticaFisicaCorsoDiStudioList.class);
    }

    public static AttivitaDidatticaFisicaConDocentiCorsoDiStudioList elencoDelleAttivitaDidatticheFisicheConDocentiEPartizioni(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_AD_FISICHE_DOCENTE
        String opcode = "LISTA_AD_FISICHE_DOCENTE";

        return soapToObj(opcode, inputParameters, AttivitaDidatticaFisicaConDocentiCorsoDiStudioList.class);
    }

    public static UnitaDidatticaAttivitaDidatticaList elencoDelleUnitaDidatticheDiUnaSpecificaAttivitaDidatticaOfferta(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_UD_PDSORD
        String opcode = "LISTA_UD_PDSORD";

        return soapToObj(opcode, inputParameters, UnitaDidatticaAttivitaDidatticaList.class);
    }

    public static ComunitaWebAttivitaDidatticaList comunitaWebPerUnaAttivitaDidatticaOfferta(Map<String, String> inputParameters) throws AppException {
        // OP: COMUNITA_AD_PDSORD
        String opcode = "COMUNITA_AD_PDSORD";

        return soapToObj(opcode, inputParameters, ComunitaWebAttivitaDidatticaList.class);
    }


    private static <T> T soapToObj(String opcode, Map<String, String> inputParameters, Class targetClass) throws AppException {
        String response = Esse3SoapRequest.request(opcode, inputParameters);
        String xmlString = XmlDealer.getContent(response);

        return JAXBDealer.<T>unMarshall(targetClass, xmlString);
    }
}
