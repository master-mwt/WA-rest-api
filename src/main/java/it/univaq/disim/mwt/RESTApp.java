package it.univaq.disim.mwt;

import it.univaq.disim.mwt.resources.*;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("rest")
public class RESTApp extends Application {

    private final Set<Class<?>> classes;

    public RESTApp() {
        HashSet<Class<?>> c = new HashSet<Class<?>>();

        c.add(AnnoAccademicoCorrenteRes.class);
        c.add(ElencoAnniAccademiciRes.class);
        c.add(ClassiRes.class);
        c.add(FacoltaRes.class);
        c.add(AteneiRes.class);
        c.add(CorsiDiStudioRes.class);
        c.add(TipiCorsiDiStudioRes.class);
        c.add(ClasseDiLaureaCorsoDiStudioRes.class);
        c.add(ElencoOrdinamentiCorsoDiStudioRes.class);
        c.add(DatiDiDettaglioOrdinamentoDidatticoRes.class);
        c.add(ElencoPercorsiCorsoDiStudioRes.class);
        c.add(DatiDiDettaglioPercorsoDiStudioRes.class);
        c.add(ElencoAttivitaDidattichePercorsoDiStudioRes.class);
        c.add(PeriodoDidatticoAttivitaDidattichePercorsoDiStudioRes.class);
        c.add(InformazioniLogisticheAttivitaDidattichePercorsoDiStudioRes.class);
        c.add(DocentiAttivitaDidattichePercorsoDiStudioRes.class);
        c.add(RegoleSceltaAttivitaDidattichePercorsoDiStudioRes.class);
        c.add(SegmentiPercorsoDiStudioOAttivitaDidatticaRes.class);
        c.add(ContenutiAttivitaDidatticaRes.class);
        c.add(RegoleDiPercorsoTipiAttivitaFormativeRes.class);
        c.add(RegoleDiPercorsoAmbitiDisciplinariRes.class);
        c.add(ElencoAttivitaDidatticheFisicheRes.class);
        c.add(ElencoAttivitaDidatticheFisicheConDocentiEPartizioniRes.class);
        c.add(ElencoUnitaDidatticheAttivitaDidatticaRes.class);
        c.add(ComunitaWebAttivitaDidatticaRes.class);

        classes = Collections.unmodifiableSet(c);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
