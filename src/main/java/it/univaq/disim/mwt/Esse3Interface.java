package it.univaq.disim.mwt;

import it.univaq.disim.mwt.model.AnnoAccademicoList;

import java.util.HashMap;
import java.util.Map;

// TODO: hardcoded parameters
public class Esse3Interface {

    public static AnnoAccademicoList annoAccademicoCorrente(Map<String, String> inputParameters) {
        // OP: ANNO_ACCADEMICO_CORRENTE
        String opcode = "GET_CURR_AA";

        String response = Esse3SoapRequest.request(opcode, inputParameters);
        String xmlString = XmlDealer.getContent(response);

        return JAXBDealer.<AnnoAccademicoList>unMarshall(AnnoAccademicoList.class, xmlString);
    }

    public static AnnoAccademicoList elencoAnniAccademici(Map<String, String> inputParameters) {
        // OP: ELENCO_ANNI_ACCADEMICI
        String opcode = "AA_LOOKUP";

        String response = Esse3SoapRequest.request(opcode, inputParameters);
        String xmlString = XmlDealer.getContent(response);

        return JAXBDealer.<AnnoAccademicoList>unMarshall(AnnoAccademicoList.class, xmlString);
    }

}
