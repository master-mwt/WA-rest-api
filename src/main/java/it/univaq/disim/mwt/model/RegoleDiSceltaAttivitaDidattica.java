package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class RegoleDiSceltaAttivitaDidattica {
    private int cds_id;
    private int aa_ord_id;
    private int aa_id;
    private int aa_off_id;
    private int ad_id;
    private String stato_att_cod;
    private String anno_corso;
    private String ad_obl;
}
