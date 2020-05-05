package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class ClasseDiLaurea {
    private int cla_a_id;
    private int p06_cla_cds_cds_id;
    private int p07_cla_murst_cod;
    private String p07_cla_murst_tipo_corso_cod;
    private int p07_cla_murst_cla_m_id;
    private int p07_cla_murst_classe_miur_id;
    private String des;
}
