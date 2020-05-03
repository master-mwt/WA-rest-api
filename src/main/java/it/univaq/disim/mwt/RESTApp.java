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
        //corsi di studio
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
        //informazioni logistiche per attività didattiche offerte in un percorso di studio
        //docenti per attività didattiche offerte in un percorso di studio
        //regole di scelta per attività didattiche offerte in un percorso di studio
        //segmenti di un percorso di studio o attività didattica offerta
        //contenuti di un'attività didattica offerta
        //regole di percorso tipi di attività formative
        //regole di percorso ambiti disciplinari
        //elenco delle attività didattiche fisiche
        //elenco delle attività didattiche fisiche con docenti e partizioni
        //elenco delle unità didattiche di una specifica attività didattica offerta
        //comunità web per un'attività didattica offerta

        classes = Collections.unmodifiableSet(c);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
