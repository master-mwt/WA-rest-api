package it.univaq.disim.mwt.model.lists;

import com.fasterxml.jackson.annotation.JsonProperty;
import it.univaq.disim.mwt.model.Facolta;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name = "DataSet")
@XmlAccessorType(XmlAccessType.FIELD)
public class FacoltaList {
    @XmlElement(name = "Row")
    @JsonProperty("data")
    List<Facolta> facoltaList;
}