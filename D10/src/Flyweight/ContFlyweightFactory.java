package Flyweight;
import java.util.*;

public class ContFlyweightFactory {



    private static Map<TipCont, SituatieCont> listaConturi = new HashMap<TipCont, SituatieCont>();
    private static int nrSituatiiDeContPrintate=0;

    public ContFlyweightFactory(){

    }

    public static SituatieCont getSituatieCont(TipCont tipCont){
        ++nrSituatiiDeContPrintate;
        SituatieCont situatieCont = (SituatieCont) listaConturi.get(tipCont);
        if(situatieCont== null){
            situatieCont= new SituatieCont(tipCont);
            listaConturi.put(tipCont,situatieCont);
        }
        return situatieCont;
    }
    public static int getNrMatriteConturi(){
        return listaConturi.size();
    }

    public static int getNrSituatiiDeContPrintate() {
        return nrSituatiiDeContPrintate;
    }
}