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
        c.add(ClasseDiLaureaDiUnCorsoDiStudioRes.class);
        c.add(ElencoDegliOrdinamentiDiUnCorsoDiStudioRes.class);
        c.add(DatiDiDettaglioDiUnOrdinamentoDidatticoRes.class);
        c.add(ElencoDeiPercorsiDiUnCorsoDiStudioRes.class);
        c.add(DatiDiDettaglioDiUnPercorsoDiStudioRes.class);
        c.add(ElencoDelleAttivitaDidatticheOfferteInUnPercorsoDiStudioRes.class);
        c.add(PeriodoDidatticoPerAttivitaDidatticheOfferteInUnPercorsoDiStudioRes.class);
        c.add(InformazioniLogistichePerAttivitaDidatticheOfferteInUnPercorsoDiStudioRes.class);
        c.add(DocentiPerAttivitaDidatticheOfferteInUnPercorsoDiStudioRes.class);
        c.add(RegoleDiSceltaPerAttivitàDidatticheOfferteInUnPercorsoDiStudioRes.class);
        c.add(SegmentiDiUnPercorsoDiStudioOAttivitaDidatticaOffertaRes.class);
        c.add(ContenutiDiUnAttivitaDidatticaOffertaRes.class);
        c.add(RegoleDiPercorsoTipiDiAttivitaFormativeRes.class);
        c.add(RegoleDiPercorsoAmbitiDisciplinariRes.class);
        c.add(ElencoDelleAttivitaDidatticheFisicheRes.class);
        c.add(ElencoDelleAttivitaDidatticheFisicheConDocentiEPartizioniRes.class);
        c.add(ElencoDelleUnitaDidatticheDiUnaSpecificaAttivitaDidatticaOffertaRes.class);
        c.add(ComunitaWebPerUnAttivitaDidatticaOffertaRes.class);

        classes = Collections.unmodifiableSet(c);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
