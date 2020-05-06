package it.univaq.disim.mwt.utils;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import it.univaq.disim.mwt.exceptions.AppException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Class that deals with XML parsing
 */
public class XmlDealer {

    /**
     * Function that pretty prints XML on STDOUT
     *
     * @param nonFormattedXml An XML String
     * @throws AppException
     */
    public static void out(String nonFormattedXml) throws AppException {
        try {
            xmlParser(nonFormattedXml);

        } catch (SAXException | IOException | ParserConfigurationException | TransformerException ex) {
            throw new AppException(ex);
        }
    }

    /**
     * Function that given Esse3 XML Response, it extracts the response content
     * and returns it as a String in the form:
     * <DataSet>
     * <Row>
     * data
     * </Row>
     * <Row>
     * data
     * </Row>
     * ...
     * </DataSet>
     *
     * @param xmlResponse Esse3 XML Response
     * @return Parsed content of the Esse3 XML Response
     * @throws AppException
     */
    public static String getContent(String xmlResponse) throws AppException {
        String xmlString = null;

        try {
            // converting to xml to object (document)
            Document body = getContentDocument(xmlResponse);

            // return row xml (formatted string xml)
            TransformerFactory transfac = TransformerFactory.newInstance();
            Transformer trans = transfac.newTransformer();
            trans.setOutputProperty(OutputKeys.METHOD, "xml");
            trans.setOutputProperty(OutputKeys.INDENT, "yes");
            trans.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", Integer.toString(2));

            StringWriter sw = new StringWriter();
            StreamResult result = new StreamResult(sw);
            DOMSource source = new DOMSource(body.getElementsByTagName("DataSet").item(0));

            trans.transform(source, result);

            xmlString = sw.toString();

        } catch (TransformerException ex) {
            throw new AppException(ex);
        }

        return xmlString;
    }

    /**
     * Auxiliary function that given the Esse3 XML Response, it extracts the response content from an Esse3 response
     * and returns it as a Document type
     *
     * @param xmlResponse Esse3 XML Response
     * @return Document with the content of Esse3 XML Response
     * @throws AppException
     */
    private static Document getContentDocument(String xmlResponse) throws AppException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            InputSource is = new InputSource(new StringReader(xmlResponse));
            is.setEncoding("UTF-8");
            Document document = builder.parse(is);

            String node = getResponseBody(document.getElementsByTagName("ns1:fn_retrieve_xml_pResponse").item(0).getTextContent());

            return builder.parse(new InputSource(new StringReader(node)));

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            throw new AppException(ex);
        }
    }

    /**
     * Auxiliary function that extract the response content from an Esse3 response
     *
     * @param xmlResponse Esse3 Response XML
     * @return String contained in ns1:fn_retrieve_xml_pResponse tag
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    private static String getResponseBody(String xmlResponse) throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xmlResponse));
        is.setEncoding("Windows-1252");
        Document document = builder.parse(is);
        OutputFormat format = new OutputFormat(document, "Windows-1252", true);
        Writer out = new StringWriter();
        XMLSerializer serializer = new XMLSerializer(out, format);
        serializer.serialize(document);
        String result = out.toString();

        return result;
    }

    /**
     * Auxiliary function that pretty prints XML on STDOUT
     *
     * @param nonFormattedXml An XML String
     * @throws SAXException
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws TransformerException
     */
    private static void xmlParser(String nonFormattedXml) throws SAXException, IOException, ParserConfigurationException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new StringReader(nonFormattedXml)));

        Transformer tform = TransformerFactory.newInstance().newTransformer();
        tform.setOutputProperty(OutputKeys.INDENT, "yes");
        tform.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        tform.transform(new DOMSource(document), new StreamResult(System.out));
    }
}
