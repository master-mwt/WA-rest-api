package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class AmbitoDisciplinareRegolamentoDiPercorso {
    private int cds_id;
    private int aa_ord_id;
    private int pds_id;
    private int ins_id;
    private String prof_cod;
    private String tipi_profstu_des;
    private String tipo_af_cod;
    private int cfu_min;
    private int cfu_max;
    private int amb_id;
    private String p07_ambiti_des;
    private String tipi_af_des;
}
