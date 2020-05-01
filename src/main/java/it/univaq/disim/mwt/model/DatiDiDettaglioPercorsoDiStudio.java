package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class DatiDiDettaglioPercorsoDiStudio {
    int p06_pdsord_cds_id;
    int p06_pdsord_aa_ord_id;
    int p06_pdsord_pds_id;
    String p06_cds_cod;
    String p06_cdsord_cod;
    String p06_pdsord_cod;
    String p06_cds_tipo_corso_cod;
    String p06_cds_um_peso_cod;
    String um_peso_des;
    String um_peso_um_peso_miur_cod;
    String p06_pdsord_stato_cod;
    String cds_des;
    String cdsord_des;
    String pds_des;
    String tipo_corso_des;
}
