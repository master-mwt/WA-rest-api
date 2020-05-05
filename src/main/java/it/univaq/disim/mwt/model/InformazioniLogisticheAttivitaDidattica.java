package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class InformazioniLogisticheAttivitaDidattica {
    private int cds_id;
    private int aa_off_id;
    private int ad_id;
    private int aa_ord_id;
    private int pds_id;
    private String fat_part_cod;
    private String dom_part_cod;
    private String part_cod;
    private int ad_log_id;
    private String dom_part_des;
    private String p06_part_des;
}
