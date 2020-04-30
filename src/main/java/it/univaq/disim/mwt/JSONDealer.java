package it.univaq.disim.mwt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JSONDealer {
    public static String toJSON(Object obj){
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = mapper.writeValueAsString(obj);

        } catch (JsonProcessingException ex) {
            Logger.getLogger(JAXBDealer.class.getName()).log(Level.SEVERE, null, ex);
        }

        return jsonString;
    }
}
