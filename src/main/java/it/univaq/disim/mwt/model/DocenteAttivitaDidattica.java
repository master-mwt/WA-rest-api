package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class DocenteAttivitaDidattica {
    int resp_did_flg;
    int docente_id;
    String part_cod;
    int ad_log_id;
    int matricola;
    int titolare_flg;
    String cognome;
    String nome;
    String docenti_hyperlink;
    String fat_part_cod;
    String dom_part_cod;
    int p09_ad_log_pds_aa_off_id;
    int p09_ad_log_pds_cds_id;
    int p09_ad_log_pds_aa_ord_id;
    int p09_ad_log_pds_pds_id;
    int p09_ad_log_pds_ad_id;
    int p09_ud_doc_part_ud_id;
    int p09_ud_doc_part_lez_flg;
    int p09_ud_doc_part_ges_desc_ad_flg;
}
