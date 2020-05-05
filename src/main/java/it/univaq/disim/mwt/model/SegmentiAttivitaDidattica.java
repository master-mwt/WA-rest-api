package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class SegmentiAttivitaDidattica {
    private int aa_off_id;
    private int cds_id;
    private int ad_id;
    private int aa_ord_id;
    private int seg_id;
    private int pds_id;
    private String p09_seg_cds_sett_cod;
    private String p09_seg_cds_disc_cod;
    private String p07_disc_des;
    private int freq_obblig_flg;
    private int peso;
    private String p09_seg_cds_tipo_cre_cod;
    private int ore_min_freq;
    private int ud_id;
    private int des;
    private int p09_seg_cds_dur_uni_val;
    private String tipi_cred_des;
    private String tipi_af_des;
    private String p07_sett_des;
    private String p09_ad_gen_cod;
    private int ad_des;
    private int p06_fac_cds_fac_id;
    private String tipi_af_tipo_af_cod;
    private String fac_des;
    private String cds_des;
    private String cdsord_des;
    private String pds_des;
}
