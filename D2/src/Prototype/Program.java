package Prototype;

import java.util.ArrayList;
import java.util.Objects;

public class Program {
    //fara prototypeFactory
    public static void main(String[] args) {
        //fara prototypeFactory
        AClient clientPF = new PersoanaFizica();
        System.out.println(clientPF);
        AClient clientPF3 = (PersoanaFizica) clientPF.clone();
        PersoanaFizica clientPF2 = new PersoanaFizica();
        System.out.println(clientPF2);

        //cu prototype

        AClient clientPJ1= PrototypeFactory.getPrototip("PJ");
        if(clientPJ1!=null){
            clientPJ1.setId("1");
            System.out.println(clientPJ1);
        }

        AClient clientPJ3= PrototypeFactory.getPrototip("PJ");
        if(clientPJ3!=null) {
            clientPJ3.setId("3");
            System.out.println(clientPJ3);
        }
        //testare shallow-copy fara Prototype

        System.out.println("\nTestare shallow copy fara Prototype");
        if(clientPF.getListaServicii()==clientPF2.getListaServicii())
            System.out.println("Aceleasi servicii oferite");
		else
            System.out.println("Referinte la obiecte diferite");

        //testare shallow-copy cu Prototype
        System.out.println("Testare shallow-copy cu Prototype");
        if(clientPJ1.getListaServicii() == clientPJ3.getListaServicii())
            System.out.println("Aceleasi servicii oferite");
        else
            System.out.println("Referinte la obiecte diferite");
    }
}
