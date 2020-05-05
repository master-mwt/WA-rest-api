package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class Facolta {
    private int fac_id;
    private String via;
    private String citta;
    private String prov;
    private int cap;
    private String cod;
    private String des;
    private int web_view_flag;
}
