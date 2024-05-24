package Strategy;

import java.util.ArrayList;

public class AlegereCategorieClient {
    private ArrayList<Client>listaClienti=new ArrayList<>();
    private IProcesare strategie;

    public void addClient(Client c){this.listaClienti.add(c);}
    public void setStrategie(IProcesare strategie){this.strategie=strategie;}

    public Client alegereClient(){
        if(strategie!=null)
            return strategie.alegereClient(listaClienti);

        else throw new UnsupportedOperationException();
    }
}
