package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class AmbitoDisciplinareRegolamentoDiPercorso {
    int cds_id;
    int aa_ord_id;
    int pds_id;
    int ins_id;
    String prof_cod;
    String tipi_profstu_des;
    String tipo_af_cod;
    int cfu_min;
    int cfu_max;
    int amb_id;
    String p07_ambiti_des;
    String tipi_af_des;
}
