package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class DatiDiDettaglioOrdinamento {
    int aa_ord_id;
    int cds_id;
    String es;
    int durata_anni;
    String cod;
    String titolo;
    int pds_flg;
    int valore_min;
    String ds_accesso_studi_des;
    String ds_status_prof_des;
    String prova_finale_des;
    String des_dott;
    String data_ini_ciclo;
    int dott_internaz_flg;
    int max_mesi_estero;
    int cotutela_flg;
    int ac_scelta;
    int gen_ad_app_flg;
    String obiett_for_des;
    String conosc_rich_des;
}
