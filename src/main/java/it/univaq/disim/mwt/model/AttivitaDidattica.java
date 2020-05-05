package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class AttivitaDidattica {
    private int p09_ad_pdsord_cds_id;
    private int p09_ad_pdsord_aa_ord_id;
    private int p09_ad_pdsord_aa_off_id;
    private int p09_ad_pdsord_pds_id;
    private int p09_ad_pdsord_ad_id;
    private int p09_ad_gen_cod;
    private String ad_gen_des;
    private int p09_ad_pdsord_peso_ar;
    private int p09_ad_cds_no_lez_flg;
    private int p09_ad_cds_cds_mut_id;
    private int p09_ad_cds_ad_mut_id;
    private int p09_ad_cds_aa_ord_mut_id;
    private int p09_ad_cds_pds_mut_id;
    private int cds_id_log;
    private int aa_ord_id_log;
    private int pds_id_log;
    private int ad_id_log;
}
