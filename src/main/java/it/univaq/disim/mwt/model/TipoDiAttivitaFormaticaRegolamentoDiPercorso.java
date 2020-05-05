package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class TipoDiAttivitaFormaticaRegolamentoDiPercorso {
    private int cds_id;
    private int aa_ord_id;
    private int pds_id;
    private int ins_id;
    private int prof_cod;
    private String tipi_profstu_des;
    private int cfu_max;
    private int cfu_min;
    private String tipo_af_cod;
    private String tipi_af_des;
}
