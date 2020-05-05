package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class Ateneo {
    private int ateneo_id;
    private String des;
    private String citta;
    private String prov;
    private String via;
    private String url_guida_web;
}
