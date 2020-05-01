package it.univaq.disim.mwt;

import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

public class JAXBDealer {
    
    public static <T> T unMarshall(Class classType, String xml) throws AppException {
        
        T result = null;
        
        try {
            result = unMarshallAux(classType, xml);
            
        } catch (JAXBException | UnsupportedEncodingException ex) {
            throw new AppException(ex);
        }
        
        return result;
    }
    
    private static <T> T unMarshallAux(Class classType, String xml) throws JAXBException, UnsupportedEncodingException {
        JAXBContext jaxbContext = JAXBContext.newInstance(classType);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
     
        return (T)jaxbUnmarshaller.unmarshal(new InputSource(new ByteArrayInputStream(xml.getBytes("UTF-8"))));
    }
}
