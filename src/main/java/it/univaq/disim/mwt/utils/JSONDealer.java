package it.univaq.disim.mwt.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
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

    /**
     * Function that extract the AppException message and writes it in a JSON String
     *
     * @param e An AppException object
     * @return JSON String
     */
    public static String errorToJSON(AppException e) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode objectNode = mapper.createObjectNode();
        objectNode.put("error", (e.getCause() != null) ? e.getCause().getMessage() : e.getMessage());

        return objectNode.toString();
    }
}
