package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class CorsoDiStudio {
    int fac_id;
    String p06_cds_cod;
    String p06_cds_des;
    int p06_cds_rif_flg;
    String tipi_corso_tipo_corso_des;
    String p06_cds_tipo_corso_cod;
    int cds_id;
    int p06_cdsord_aa_ord_id;
    int num_lingue;
    int p06_cds_sett_flg;
    int cla_m_id;
    int test_flg;
    int conc_flg;
    int num_posti_tot;
    String p06_cds_um_peso_cod;
    String p06_cds_tipo_spec_cod;
    int p06_cdsord_valore_min;
    int p06_cds_posti_stat_flg;
    int durata_anni;
    String um_durata;
    int durata_effettiva;
    int p06_cds_web_view_flg;
    int p06_cds_web_immat_flg;
    int p07_cla_ateneo_cod;
    String p06_cds_tipo_titit_cod;
    String p06_cds_ds_tipo_tit_des;
    int aa_att_id;
    String istat_cod;
    int ciclo_istituito_flg;
    String p06_cdsord_stato_cod;
    String p06_cdsord_aa_ord_cess_id;
    String p06_cdsord_data_var;
    String url_sito_web;
    String url_info_web;
    int p06_cds_norm_id;
    String p07_normativa_norm_cod;
    String p07_normativa_des;
}
