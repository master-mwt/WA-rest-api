package it.univaq.disim.mwt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlRootElement(name = "DataSet")
@XmlAccessorType(XmlAccessType.FIELD)
public class AnnoAccademicoList {
    @XmlElement(name = "Row")
    @JsonProperty("data")
    List<AnnoAccademico> annoAccademicoList;
}
