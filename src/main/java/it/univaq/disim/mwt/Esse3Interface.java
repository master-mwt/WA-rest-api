package it.univaq.disim.mwt;

import it.univaq.disim.mwt.model.lists.AnnoAccademicoList;
import it.univaq.disim.mwt.model.lists.ClasseMiurList;
import it.univaq.disim.mwt.model.lists.FacoltaList;

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


    private static <T> T soapToObj(String opcode, Map<String, String> inputParameters, Class targetClass) throws AppException {
        String response = Esse3SoapRequest.request(opcode, inputParameters);
        String xmlString = XmlDealer.getContent(response);

        return JAXBDealer.<T>unMarshall(targetClass, xmlString);
    }
}
