package Prototype;

import java.util.ArrayList;

public class PersoanaJuridica extends AClient{

    PersoanaJuridica(){
        System.out.println("Adaugare client PJ");
        listaServicii=new ArrayList<>();
        listaServicii.add("Deschidere cont Corporate");
        listaServicii.add("IMM invest");
        this.tip="PJ";
    }
    @Override
    public AClient clone() {
        AClient clone = super.clone();
        clone.listaServicii = new ArrayList<>();
        for (int i = 0; i < listaServicii.size(); i++) {
            clone.listaServicii.add(new String((this.listaServicii.get(i))));
        }
        return clone;
    }
    public void printare(){
        System.out.println("Client " + this.tip);
    }
}

