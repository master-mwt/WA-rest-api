package it.univaq.disim.mwt.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.univaq.disim.mwt.exceptions.AppException;

/**
 * Class that deals with JSON parsing
 */
public class JSONDealer {
    /**
     * Function that converts an object to a JSON String
     *
     * @param obj Object that must be converted
     * @return JSON String
     * @throws AppException
     */
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
