package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class TipoCorsoDiStudio {
    String tipo_corso_cod;
    String tipo_corso_des;
    int durata_anni;
    int valore_min;
    int rif_flg;
    String tipo_titit_cod;
    String um_durata;
    int durata_effettiva;
}
