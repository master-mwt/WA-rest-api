package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class ComunitaWebAttivitaDidattica {
    private int comunita_id;
    private int ambiente_id;
    private String des;
    private String stato;
    private int profilo_def_id;
    private int sys_flg;
    private int grp_id;
    private int p18_classe_cls_id;
    private String p18_classe_des;
    private String nota;
    private String p18_classe_email_amm;
    private String p18_ambiente_cod;
    private String tipo_com_cod;
    private int pubblico_def_flg;
    private int fac_fac_id;
    private int fac_aa_off_id;
}
