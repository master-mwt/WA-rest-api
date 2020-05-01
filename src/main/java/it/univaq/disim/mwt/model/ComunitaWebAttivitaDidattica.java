package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class ComunitaWebAttivitaDidattica {
    int comunita_id;
    int ambiente_id;
    String des;
    String stato;
    int profilo_def_id;
    int sys_flg;
    int grp_id;
    int p18_classe_cls_id;
    String p18_classe_des;
    String nota;
    String p18_classe_email_amm;
    String p18_ambiente_cod;
    String tipo_com_cod;
    int pubblico_def_flg;
    int fac_fac_id;
    int fac_aa_off_id;
}
