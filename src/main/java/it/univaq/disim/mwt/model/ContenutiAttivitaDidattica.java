package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class ContenutiAttivitaDidattica {
    String fat_part_cod;
    String dom_part_cod;
    int ad_log_id;
    int des_ad_pubbl_flg;
    String testi_rif_des;
    String dom_part_des;
    String contenuti_des;
    String obiett_form_des;
    String prerequisiti_des;
    String metodi_did_des;
    // TODO: Duplicated
    String metodi_did_des2;

    String mod_ver_appr_des;
    String altre_info_des;
}
