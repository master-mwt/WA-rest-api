package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class AttivitaDidattica {
    int p09_ad_pdsord_cds_id;
    int p09_ad_pdsord_aa_ord_id;
    int p09_ad_pdsord_aa_off_id;
    int p09_ad_pdsord_pds_id;
    int p09_ad_pdsord_ad_id;
    int p09_ad_gen_cod;
    String ad_gen_des;
    int p09_ad_pdsord_peso_ar;
    int p09_ad_cds_no_lez_flg;
    int p09_ad_cds_cds_mut_id;
    int p09_ad_cds_ad_mut_id;
    int p09_ad_cds_aa_ord_mut_id;
    int p09_ad_cds_pds_mut_id;
    int cds_id_log;
    int aa_ord_id_log;
    int pds_id_log;
    int ad_id_log;
}
