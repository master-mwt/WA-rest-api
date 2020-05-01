package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class PercorsoDiStudio {
    int cds_id;
    int aa_ord_id;
    int pds_id;
    String cod;
    String des;
    String p06_stati_ord_des;
    int web_immat_flg;
    int web_view_flg;
    String stato_cod;
}
