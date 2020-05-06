package it.univaq.disim.mwt.utils;

import it.univaq.disim.mwt.exceptions.AppException;
import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

/**
 * Class that deals with JAX-B
 */
public class JAXBDealer {

    /**
     * Function that recontruct the model object from XML using JAX-B
     *
     * @param classType Object model class
     * @param xml XML String
     * @param <T> Object model class type
     * @return Model object filled from XML
     * @throws AppException
     */
    public static <T> T unMarshall(Class classType, String xml) throws AppException {

        T result = null;

        try {
            result = unMarshallAux(classType, xml);

        } catch (JAXBException | UnsupportedEncodingException ex) {
            throw new AppException(ex);
        }

        return result;
    }

    /**
     * Helper function used for unmarshalling XML with JAX-B
     *
     * @param classType Object model class
     * @param xml XML String
     * @param <T> Object model class type
     * @return Model object filled from XML
     * @throws JAXBException
     * @throws UnsupportedEncodingException
     */
    private static <T> T unMarshallAux(Class classType, String xml) throws JAXBException, UnsupportedEncodingException {
        JAXBContext jaxbContext = JAXBContext.newInstance(classType);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        return (T) jaxbUnmarshaller.unmarshal(new InputSource(new ByteArrayInputStream(xml.getBytes("UTF-8"))));
    }
}
