package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class RegoleDiSceltaAttivitaDidattica {
    int cds_id;
    int aa_ord_id;
    int aa_id;
    int aa_off_id;
    int ad_id;
    String stato_att_cod;
    String anno_corso;
    String ad_obl;
}
