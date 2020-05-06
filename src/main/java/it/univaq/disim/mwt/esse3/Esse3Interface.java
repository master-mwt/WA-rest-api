package it.univaq.disim.mwt.esse3;

import it.univaq.disim.mwt.exceptions.AppException;
import it.univaq.disim.mwt.model.lists.*;
import it.univaq.disim.mwt.utils.JAXBDealer;
import it.univaq.disim.mwt.utils.XmlDealer;

import java.util.Map;

/**
 * Class used as an interface to the functions of the Esse3's server
 */
public class Esse3Interface {

    /**
     * ANNO_ACCADEMICO_CORRENTE operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return AnnoAccademicoList
     * @throws AppException
     */
    public static AnnoAccademicoList annoAccademicoCorrente(Map<String, String> inputParameters) throws AppException {
        // OP: ANNO_ACCADEMICO_CORRENTE
        String opcode = "GET_CURR_AA";

        return soapToObj(opcode, inputParameters, AnnoAccademicoList.class);
    }

    /**
     * ELENCO_ANNI_ACCADEMICI operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return AnnoAccademicoList
     * @throws AppException
     */
    public static AnnoAccademicoList elencoAnniAccademici(Map<String, String> inputParameters) throws AppException {
        // OP: ELENCO_ANNI_ACCADEMICI
        String opcode = "AA_LOOKUP";

        return soapToObj(opcode, inputParameters, AnnoAccademicoList.class);
    }

    /**
     * CLASSI operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return ClasseMiurList
     * @throws AppException
     */
    public static ClasseMiurList classi(Map<String, String> inputParameters) throws AppException {
        // OP: CLASSI
        String opcode = "CLASSI";

        return soapToObj(opcode, inputParameters, ClasseMiurList.class);
    }

    /**
     * FACOLTA operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return FacoltaList
     * @throws AppException
     */
    public static FacoltaList facolta(Map<String, String> inputParameters) throws AppException {
        // OP: FACOLTA
        String opcode = "FACOLTA";

        return soapToObj(opcode, inputParameters, FacoltaList.class);
    }

    /**
     * ATENEI operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return AteneoList
     * @throws AppException
     */
    public static AteneoList atenei(Map<String, String> inputParameters) throws AppException {
        // OP: ATENEI
        String opcode = "ATENEI";

        return soapToObj(opcode, inputParameters, AteneoList.class);
    }

    /**
     * CDS_FACOLTA operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return CorsoDiStudioList
     * @throws AppException
     */
    public static CorsoDiStudioList corsiDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: CDS_FACOLTA
        String opcode = "CDS_FACOLTA";

        return soapToObj(opcode, inputParameters, CorsoDiStudioList.class);
    }

    /**
     * TIPI_CORSO operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return TipoCorsoDiStudioList
     * @throws AppException
     */
    public static TipoCorsoDiStudioList tipiCorsiDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: TIPI_CORSO
        String opcode = "TIPI_CORSO";

        return soapToObj(opcode, inputParameters, TipoCorsoDiStudioList.class);
    }

    /**
     * CLASSE_CDS operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return ClasseDiLaureaList
     * @throws AppException
     */
    public static ClasseDiLaureaList classeDiLaureaDiUnCorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: CLASSE_CDS
        String opcode = "CLASSE_CDS";

        return soapToObj(opcode, inputParameters, ClasseDiLaureaList.class);
    }

    /**
     * LISTA_CDSORD operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return OrdinamentoList
     * @throws AppException
     */
    public static OrdinamentoList elencoDegliOrdinamentiDiUnCorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_CDSORD
        String opcode = "LISTA_CDSORD";

        return soapToObj(opcode, inputParameters, OrdinamentoList.class);
    }

    /**
     * DETT_CDSORD operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return DatiDiDettaglioOrdinamentoList
     * @throws AppException
     */
    public static DatiDiDettaglioOrdinamentoList datiDiDettaglioDiUnOrdinamentoDidattico(Map<String, String> inputParameters) throws AppException {
        // OP: DETT_CDSORD
        String opcode = "DETT_CDSORD";

        return soapToObj(opcode, inputParameters, DatiDiDettaglioOrdinamentoList.class);
    }

    /**
     * LISTA_PDSORD operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return PercorsoDiStudioList
     * @throws AppException
     */
    public static PercorsoDiStudioList elencoDeiPercorsiDiUnCorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_PDSORD
        String opcode = "LISTA_PDSORD";

        return soapToObj(opcode, inputParameters, PercorsoDiStudioList.class);
    }

    /**
     * DETT_PDSORD operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return DatiDiDettaglioPercorsoDiStudioList
     * @throws AppException
     */
    public static DatiDiDettaglioPercorsoDiStudioList datiDiDettaglioDiUnPercorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: DETT_PDSORD
        String opcode = "DETT_PDSORD";

        return soapToObj(opcode, inputParameters, DatiDiDettaglioPercorsoDiStudioList.class);
    }

    /**
     * LISTA_AD_PDSORD operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return AttivitaDidatticaList
     * @throws AppException
     */
    public static AttivitaDidatticaList elencoDelleAttivitaDidatticheOfferteInUnPercorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_AD_PDSORD
        String opcode = "LISTA_AD_PDSORD";

        return soapToObj(opcode, inputParameters, AttivitaDidatticaList.class);
    }

    /**
     * INFO_PART_AD_PDSORD operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return PeriodoDidatticoAttivitaDidatticaList
     * @throws AppException
     */
    public static PeriodoDidatticoAttivitaDidatticaList periodoDidatticoPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: INFO_PART_AD_PDSORD
        String opcode = "INFO_PART_AD_PDSORD";

        return soapToObj(opcode, inputParameters, PeriodoDidatticoAttivitaDidatticaList.class);
    }

    /**
     * INFO_LOG_AD_PDSORD operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return InformazioniLogisticheAttivitaDidatticaList
     * @throws AppException
     */
    public static InformazioniLogisticheAttivitaDidatticaList informazioniLogistichePerAttivitaDidatticheOfferteInUnPercorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: INFO_LOG_AD_PDSORD
        String opcode = "INFO_LOG_AD_PDSORD";

        return soapToObj(opcode, inputParameters, InformazioniLogisticheAttivitaDidatticaList.class);
    }

    /**
     * LISTA_DOCENTI_AD operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return DocenteAttivitaDidatticaList
     * @throws AppException
     */
    public static DocenteAttivitaDidatticaList docentiPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_DOCENTI_AD
        String opcode = "LISTA_DOCENTI_AD";

        return soapToObj(opcode, inputParameters, DocenteAttivitaDidatticaList.class);
    }

    /**
     * INFO_REGSCE_PDSORD operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return RegoleDiSceltaAttivitaDidatticaList
     * @throws AppException
     */
    public static RegoleDiSceltaAttivitaDidatticaList regoleDiSceltaPerAttivitaDidatticheOfferteInUnPercorsoDiStudio(Map<String, String> inputParameters) throws AppException {
        // OP: INFO_REGSCE_PDSORD
        String opcode = "INFO_REGSCE_PDSORD";

        return soapToObj(opcode, inputParameters, RegoleDiSceltaAttivitaDidatticaList.class);
    }

    /**
     * SEG_PDSORD operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return SegmentiAttivitaDidatticaList
     * @throws AppException
     */
    public static SegmentiAttivitaDidatticaList segmentiInUnPercorsoDiStudioOAttivitaDidatticaOfferta(Map<String, String> inputParameters) throws AppException {
        // OP: SEG_PDSORD
        String opcode = "SEG_PDSORD";

        return soapToObj(opcode, inputParameters, SegmentiAttivitaDidatticaList.class);
    }

    /**
     * CONTENUTI_AD_PDSORD operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return ContenutiAttivitaDidatticaList
     * @throws AppException
     */
    public static ContenutiAttivitaDidatticaList contenutiDiUnAttivitaDidatticaOfferta(Map<String, String> inputParameters) throws AppException {
        // OP: CONTENUTI_AD_PDSORD
        String opcode = "CONTENUTI_AD_PDSORD";

        return soapToObj(opcode, inputParameters, ContenutiAttivitaDidatticaList.class);
    }

    /**
     * REGP_TAF operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return TipoDiAttivitaFormaticaRegolamentoDiPercorsoList
     * @throws AppException
     */
    public static TipoDiAttivitaFormativaRegolamentoDiPercorsoList regoleDiPercorsoTipiDiAttivitaFormative(Map<String, String> inputParameters) throws AppException {
        // OP: REGP_TAF
        String opcode = "REGP_TAF";

        return soapToObj(opcode, inputParameters, TipoDiAttivitaFormativaRegolamentoDiPercorsoList.class);
    }

    /**
     * REGP_AMB operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return AmbitoDisciplinareRegolamentoDiPercorsoList
     * @throws AppException
     */
    public static AmbitoDisciplinareRegolamentoDiPercorsoList regoleDiPercorsoAmbitiDisciplinari(Map<String, String> inputParameters) throws AppException {
        // OP: REGP_AMB
        String opcode = "REGP_AMB";

        return soapToObj(opcode, inputParameters, AmbitoDisciplinareRegolamentoDiPercorsoList.class);
    }

    /**
     * LISTA_AD_FISICHE operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return AttivitaDidatticaFisicaCorsoDiStudioList
     * @throws AppException
     */
    public static AttivitaDidatticaFisicaCorsoDiStudioList elencoDelleAttivitaDidatticheFisiche(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_AD_FISICHE
        String opcode = "LISTA_AD_FISICHE";

        return soapToObj(opcode, inputParameters, AttivitaDidatticaFisicaCorsoDiStudioList.class);
    }

    /**
     * LISTA_AD_FISICHE_DOCENTE operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return AttivitaDidatticaFisicaConDocentiCorsoDiStudioList
     * @throws AppException
     */
    public static AttivitaDidatticaFisicaConDocentiCorsoDiStudioList elencoDelleAttivitaDidatticheFisicheConDocentiEPartizioni(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_AD_FISICHE_DOCENTE
        String opcode = "LISTA_AD_FISICHE_DOCENTE";

        return soapToObj(opcode, inputParameters, AttivitaDidatticaFisicaConDocentiCorsoDiStudioList.class);
    }

    /**
     * LISTA_UD_PDSORD operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return UnitaDidatticaAttivitaDidatticaList
     * @throws AppException
     */
    public static UnitaDidatticaAttivitaDidatticaList elencoDelleUnitaDidatticheDiUnaSpecificaAttivitaDidatticaOfferta(Map<String, String> inputParameters) throws AppException {
        // OP: LISTA_UD_PDSORD
        String opcode = "LISTA_UD_PDSORD";

        return soapToObj(opcode, inputParameters, UnitaDidatticaAttivitaDidatticaList.class);
    }

    /**
     * COMUNITA_AD_PDSORD operation
     *
     * @param inputParameters Esse3 Request parameters
     * @return ComunitaWebAttivitaDidatticaList
     * @throws AppException
     */
    public static ComunitaWebAttivitaDidatticaList comunitaWebPerUnaAttivitaDidatticaOfferta(Map<String, String> inputParameters) throws AppException {
        // OP: COMUNITA_AD_PDSORD
        String opcode = "COMUNITA_AD_PDSORD";

        return soapToObj(opcode, inputParameters, ComunitaWebAttivitaDidatticaList.class);
    }


    /**
     * This class will call the Esse3SoapRequest class in order to send request to the Esse3 server.
     * The XML result will be parsed with JAX-B in order to reconstruct the model object.
     *
     * @param opcode          Esse3 Request Operation Code
     * @param inputParameters Esse3 Request parameters
     * @param targetClass     Class of the returned object
     * @param <T>             Class type of the returned object
     * @return Object of the model filled by JAX-B
     * @throws AppException
     */
    private static <T> T soapToObj(String opcode, Map<String, String> inputParameters, Class targetClass) throws AppException {
        String response = Esse3SoapRequest.request(opcode, inputParameters);
        String xmlString = XmlDealer.getContent(response);

        return JAXBDealer.<T>unMarshall(targetClass, xmlString);
    }
}
