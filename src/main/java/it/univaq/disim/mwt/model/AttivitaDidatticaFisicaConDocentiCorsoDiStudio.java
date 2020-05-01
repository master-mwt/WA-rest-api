package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class AttivitaDidatticaFisicaConDocentiCorsoDiStudio {
    int cod;
    int p09_ud_log_pds_ad_log_id;
    String ad_gen_des;
    String p09_ud_doc_part_fat_part_cod;
    String p09_ud_doc_part_dom_part_cod;
    String partizione;
    int docenti_docente_id;
    String docenti_cognome;
    String docenti_nome;
    int p09_ud_doc_part_titolare_flg;
    int p09_ud_doc_part_resp_did_flg;
    int p09_ud_doc_part_lez_flg;
}
