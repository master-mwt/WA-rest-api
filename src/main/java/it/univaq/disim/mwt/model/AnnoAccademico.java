package it.univaq.disim.mwt.model;

import lombok.Data;

@Data
public class AnnoAccademico {
    private int aa_id;
    private String des;
    private String data_inizio;
    private String data_fine;
}
