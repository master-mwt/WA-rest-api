package it.univaq.disim.mwt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.univaq.disim.mwt.model.AnnoAccademico;
import it.univaq.disim.mwt.model.AnnoAccademicoList;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        //AnnoAccademicoList annoAccademicoList = Esse3Interface.elencoAnniAccademici();

        /*System.out.println("annoAccademicoList length: " + annoAccademicoList.getAnnoAccademicoList().size());
        System.out.println("--------------------------------");
        for (AnnoAccademico ac: annoAccademicoList.getAnnoAccademicoList()) {
            System.out.println("id: " + ac.getAa_id());
            System.out.println("data_inizio: " + ac.getData_inizio());
            System.out.println("data_fine: " + ac.getData_fine());
            System.out.println("des: " + ac.getDes());
            System.out.println("--------------------------------");
        }*/

        //Creating the ObjectMapper object
        //ObjectMapper mapper = new ObjectMapper();
        //Converting the Object to JSONString
        //String jsonString = mapper.writeValueAsString(annoAccademicoList);
        //System.out.println(jsonString);
    }
}
