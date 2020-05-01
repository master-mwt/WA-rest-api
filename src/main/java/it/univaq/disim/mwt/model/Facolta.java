package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class Facolta {
    int fac_id;
    String via;
    String citta;
    String prov;
    int cap;
    String cod;
    String des;
    int web_view_flag;
}
