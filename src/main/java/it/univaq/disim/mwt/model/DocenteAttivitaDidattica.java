package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class DocenteAttivitaDidattica {
    private int resp_did_flg;
    private int docente_id;
    private String part_cod;
    private int ad_log_id;
    private int matricola;
    private int titolare_flg;
    private String cognome;
    private String nome;
    private String docenti_hyperlink;
    private String fat_part_cod;
    private String dom_part_cod;
    private int p09_ad_log_pds_aa_off_id;
    private int p09_ad_log_pds_cds_id;
    private int p09_ad_log_pds_aa_ord_id;
    private int p09_ad_log_pds_pds_id;
    private int p09_ad_log_pds_ad_id;
    private int p09_ud_doc_part_ud_id;
    private int p09_ud_doc_part_lez_flg;
    private int p09_ud_doc_part_ges_desc_ad_flg;
}
