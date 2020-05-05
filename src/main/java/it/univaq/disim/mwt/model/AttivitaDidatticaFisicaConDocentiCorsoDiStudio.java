package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class AttivitaDidatticaFisicaConDocentiCorsoDiStudio {
    private int cod;
    private int p09_ud_log_pds_ad_log_id;
    private String ad_gen_des;
    private String p09_ud_doc_part_fat_part_cod;
    private String p09_ud_doc_part_dom_part_cod;
    private String partizione;
    private int docenti_docente_id;
    private String docenti_cognome;
    private String docenti_nome;
    private int p09_ud_doc_part_titolare_flg;
    private int p09_ud_doc_part_resp_did_flg;
    private int p09_ud_doc_part_lez_flg;
}
