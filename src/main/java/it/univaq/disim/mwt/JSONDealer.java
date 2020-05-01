package it.univaq.disim.mwt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONDealer {
    public static String toJSON(Object obj) throws AppException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = mapper.writeValueAsString(obj);

        } catch (JsonProcessingException ex) {
            throw new AppException(ex);
        }

        return jsonString;
    }
}
