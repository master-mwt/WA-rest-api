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

        //anno accademico corrente
        c.add(AnnoAccademicoCorrenteRes.class);
        //elenco anni accademici
        c.add(ElencoAnniAccademiciRes.class);
        //classi
        c.add(ClassiRes.class);
        //facoltà
        c.add(FacoltaRes.class);
        //atenei
        c.add(AteneiRes.class);
        //(INPUT MAN CALL) corsi di studio
        //tipi corsi di studio
        c.add(TipiCorsiDiStudioRes.class);
        //classe di laurea di un corso di studio
        c.add(ClasseDiLaureaDiUnCorsoDiStudioRes.class);
        //elenco degli ordinamenti di un corso di studio
        c.add(ElencoDegliOrdinamentiDiUnCorsoDiStudioRes.class);
        //dati di dettaglio di un ordinamento didattico
        c.add(DatiDiDettaglioDiUnOrdinamentoDidatticoRes.class);
        //elenco dei percorsi di un corso di studio
        c.add(ElencoDeiPercorsiDiUnCorsoDiStudioRes.class);
        //dati di dettaglio di un percorso di studio
        c.add(DatiDiDettaglioDiUnPercorsoDiStudioRes.class);
        //elenco delle attività didattiche offerte in un percorso di studio
        c.add(ElencoDelleAttivitaDidatticheOfferteInUnPercorsoDiStudioRes.class);
        //periodo didattico per attività didattiche offerte in un percorso di studio
        c.add(PeriodoDidatticoPerAttivitaDidatticheOfferteInUnPercorsoDiStudioRes.class);
        //informazioni logistiche per attività didattiche offerte in un percorso di studio
        c.add(InformazioniLogistichePerAttivitaDidatticheOfferteInUnPercorsoDiStudioRes.class);
        //(INPUT MAN CALL) docenti per attività didattiche offerte in un percorso di studio
        c.add(DocentiPerAttivitaDidatticheOfferteInUnPercorsoDiStudioRes.class);
        //regole di scelta per attività didattiche offerte in un percorso di studio
        c.add(RegoleDiSceltaPerAttivitàDidatticheOfferteInUnPercorsoDiStudioRes.class);
        //(INPUT MAN CALL) segmenti di un percorso di studio o attività didattica offerta
        //(INPUT OPT CALL) contenuti di un'attività didattica offerta
        c.add(ContenutiDiUnAttivitaDidatticaOffertaRes.class);
        //regole di percorso tipi di attività formative
        c.add(RegoleDiPercorsoTipiDiAttivitaFormativeRes.class);
        //regole di percorso ambiti disciplinari
        c.add(RegoleDiPercorsoAmbitiDisciplinariRes.class);
        //elenco delle attività didattiche fisiche
        c.add(ElencoDelleAttivitaDidatticheFisicheRes.class);
        //elenco delle attività didattiche fisiche con docenti e partizioni
        c.add(ElencoDelleAttivitaDidatticheFisicheConDocentiEPartizioniRes.class);
        //elenco delle unità didattiche di una specifica attività didattica offerta
        c.add(ElencoDelleUnitaDidatticheDiUnaSpecificaAttivitaDidatticaOffertaRes.class);
        //comunità web per un'attività didattica offerta
        c.add(ComunitaWebPerUnAttivitaDidatticaOffertaRes.class);

        classes = Collections.unmodifiableSet(c);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
