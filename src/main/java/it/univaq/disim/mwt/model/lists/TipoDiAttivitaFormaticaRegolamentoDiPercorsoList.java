package it.univaq.disim.mwt.model.lists;

import com.fasterxml.jackson.annotation.JsonProperty;
import it.univaq.disim.mwt.model.TipoDiAttivitaFormaticaRegolamentoDiPercorso;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name = "DataSet")
@XmlAccessorType(XmlAccessType.FIELD)
public class TipoDiAttivitaFormaticaRegolamentoDiPercorsoList {
    @XmlElement(name = "Row")
    @JsonProperty("data")
    private List<TipoDiAttivitaFormaticaRegolamentoDiPercorso> tipoDiAttivitaFormaticaRegolamentoDiPercorsoList;
}
