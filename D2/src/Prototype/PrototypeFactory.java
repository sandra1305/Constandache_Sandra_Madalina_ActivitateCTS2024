package Prototype;

import java.util.HashMap;
import java.util.*;

public class PrototypeFactory {
    private static Map<String, AClient> prototipuriClienti= new HashMap<>();
    static{
    System.out.println("Initializare clienti: ");
    PersoanaJuridica persoanaJuridica = new PersoanaJuridica();
    persoanaJuridica.setId("PJ");
    prototipuriClienti.put("PJ",persoanaJuridica);

    PersoanaFizica persoanaFizica=new PersoanaFizica();
    persoanaFizica.setId("PF");
    prototipuriClienti.put("PF",persoanaFizica);
    System.out.println("\n");
    }

    public static AClient getPrototip(String id){
        AClient copiePrototip=null;
        AClient prototip = prototipuriClienti.get(id);
        if(prototip!=null) {
            copiePrototip = (AClient) prototip.clone();
        }
        return  copiePrototip;

    }

}
