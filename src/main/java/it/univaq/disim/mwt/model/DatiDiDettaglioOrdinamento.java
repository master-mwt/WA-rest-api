package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class DatiDiDettaglioOrdinamento {
    private int aa_ord_id;
    private int cds_id;
    private String es;
    private int durata_anni;
    private String cod;
    private String titolo;
    private int pds_flg;
    private int valore_min;
    private String ds_accesso_studi_des;
    private String ds_status_prof_des;
    private String prova_finale_des;
    private String des_dott;
    private String data_ini_ciclo;
    private int dott_internaz_flg;
    private int max_mesi_estero;
    private int cotutela_flg;
    private int ac_scelta;
    private int gen_ad_app_flg;
    private String obiett_for_des;
    private String conosc_rich_des;
}
