package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class ContenutiAttivitaDidattica {
    private String fat_part_cod;
    private String dom_part_cod;
    private int ad_log_id;
    private int des_ad_pubbl_flg;
    private String testi_rif_des;
    private String dom_part_des;
    private String contenuti_des;
    private String obiett_form_des;
    private String prerequisiti_des;
    private String metodi_did_des;
    // TODO: Duplicated
    private String metodi_did_des2;

    private String mod_ver_appr_des;
    private String altre_info_des;
}
