package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class SegmentiAttivitaDidattica {
    int aa_off_id;
    int cds_id;
    int ad_id;
    int aa_ord_id;
    int seg_id;
    int pds_id;
    String p09_seg_cds_sett_cod;
    String p09_seg_cds_disc_cod;
    String p07_disc_des;
    int freq_obblig_flg;
    int peso;
    String p09_seg_cds_tipo_cre_cod;
    int ore_min_freq;
    int ud_id;
    int des;
    int p09_seg_cds_dur_uni_val;
    String tipi_cred_des;
    String tipi_af_des;
    String p07_sett_des;
    String p09_ad_gen_cod;
    int ad_des;
    int p06_fac_cds_fac_id;
    String tipi_af_tipo_af_cod;
    String fac_des;
    String cds_des;
    String cdsord_des;
    String pds_des;
}
