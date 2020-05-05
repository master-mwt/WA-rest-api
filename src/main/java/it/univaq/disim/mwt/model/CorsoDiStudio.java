package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class CorsoDiStudio {
    private int fac_id;
    private String p06_cds_cod;
    private String p06_cds_des;
    private int p06_cds_rif_flg;
    private String tipi_corso_tipo_corso_des;
    private String p06_cds_tipo_corso_cod;
    private int cds_id;
    private int p06_cdsord_aa_ord_id;
    private int num_lingue;
    private int p06_cds_sett_flg;
    private int cla_m_id;
    private int test_flg;
    private int conc_flg;
    private int num_posti_tot;
    private String p06_cds_um_peso_cod;
    private String p06_cds_tipo_spec_cod;
    private int p06_cdsord_valore_min;
    private int p06_cds_posti_stat_flg;
    private int durata_anni;
    private String um_durata;
    private int durata_effettiva;
    private int p06_cds_web_view_flg;
    private int p06_cds_web_immat_flg;
    private int p07_cla_ateneo_cod;
    private String p06_cds_tipo_titit_cod;
    private String p06_cds_ds_tipo_tit_des;
    private int aa_att_id;
    private String istat_cod;
    private int ciclo_istituito_flg;
    private String p06_cdsord_stato_cod;
    private String p06_cdsord_aa_ord_cess_id;
    private String p06_cdsord_data_var;
    private String url_sito_web;
    private String url_info_web;
    private int p06_cds_norm_id;
    private String p07_normativa_norm_cod;
    private String p07_normativa_des;
}
