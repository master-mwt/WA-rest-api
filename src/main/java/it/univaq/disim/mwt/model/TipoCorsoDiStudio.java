package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class TipoCorsoDiStudio {
    private String tipo_corso_cod;
    private String tipo_corso_des;
    private int durata_anni;
    private int valore_min;
    private int rif_flg;
    private String tipo_titit_cod;
    private String um_durata;
    private int durata_effettiva;
}
