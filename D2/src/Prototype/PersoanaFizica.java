package Prototype;

import java.util.ArrayList;
import java.util.Optional;

public class PersoanaFizica extends  AClient{

    public PersoanaFizica(){
        System.out.println("Adaugare client PF in BD");
        listaServicii= new ArrayList<>();
        listaServicii.add("Deschide cont");
        listaServicii.add("Deschide cont economii");
        this.tip="PF";
    }
    @Override
    public void printare(){
        System.out.println("Client de tip " + this.tip);
    }

}
