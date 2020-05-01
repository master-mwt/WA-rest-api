package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class TipoDiAttivitaFormaticaRegolamentoDiPercorso {
    int cds_id;
    int aa_ord_id;
    int pds_id;
    int ins_id;
    int prof_cod;
    String tipi_profstu_des;
    int cfu_max;
    int cfu_min;
    String tipo_af_cod;
    String tipi_af_des;
}
