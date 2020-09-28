package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class SettoriScientificoDisciplinariRegolamentoDiPercorso {
    private int cds_id;
    private int aa_ord_id;
    private int pds_id;
    private int ins_id;
    private int tipi_profstu_prof_cod;
    private String tipi_profstu_des;
    private String tipo_af_cod;
    private int amb_id;
    private int cfu_min;
    private int cfu_max;
    private String sett_cod;
    private String tipi_af_des;
    private String p07_sett_des;
    private String p07_ambiti_des;
}
