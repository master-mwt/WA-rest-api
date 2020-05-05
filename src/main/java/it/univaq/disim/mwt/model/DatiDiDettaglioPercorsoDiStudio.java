package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class DatiDiDettaglioPercorsoDiStudio {
    private int p06_pdsord_cds_id;
    private int p06_pdsord_aa_ord_id;
    private int p06_pdsord_pds_id;
    private String p06_cds_cod;
    private String p06_cdsord_cod;
    private String p06_pdsord_cod;
    private String p06_cds_tipo_corso_cod;
    private String p06_cds_um_peso_cod;
    private String um_peso_des;
    private String um_peso_um_peso_miur_cod;
    private String p06_pdsord_stato_cod;
    private String cds_des;
    private String cdsord_des;
    private String pds_des;
    private String tipo_corso_des;
}
