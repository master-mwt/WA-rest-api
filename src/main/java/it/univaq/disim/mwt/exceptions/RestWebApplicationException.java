package it.univaq.disim.mwt.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestWebApplicationException extends WebApplicationException {

    public RestWebApplicationException() {
        super(Response.serverError().build());
    }

    public RestWebApplicationException(String message) {
        super(Response.serverError()
                .entity(message)
                .type(MediaType.TEXT_PLAIN)
                .build());
    }

    public RestWebApplicationException(int status, String message) {
        super(Response.status(status)
                .entity(message)
                .type(MediaType.TEXT_PLAIN)
                .build());
    }
}
