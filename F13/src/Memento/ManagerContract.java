package Memento;

import java.util.ArrayList;

public class ManagerContract {
    private ArrayList<VersiuniContractuale> listaVersiuni=new ArrayList<VersiuniContractuale>();

    public void adaugareListaVersiuni(VersiuniContractuale versiuniContractuale){
        this.listaVersiuni.add(versiuniContractuale);
    }

    public VersiuniContractuale recuperareVersiune(int i){return  this.listaVersiuni.get(i);}
}
