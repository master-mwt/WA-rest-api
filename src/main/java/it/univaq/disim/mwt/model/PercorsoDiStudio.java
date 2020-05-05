package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class PercorsoDiStudio {
    private int cds_id;
    private int aa_ord_id;
    private int pds_id;
    private String cod;
    private String des;
    private String p06_stati_ord_des;
    private int web_immat_flg;
    private int web_view_flg;
    private String stato_cod;
}
