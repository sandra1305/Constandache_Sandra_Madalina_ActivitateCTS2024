package Proxy;

public class ProxyMeci implements IMeci{

    private IMeci meci;

    public ProxyMeci(IMeci meci){
        this.meci=meci;
    }
    @Override
    public void adaugaParticipanti(Client client) {
        if (client.getVarsta() >= 18) {
            this.meci.adaugaParticipanti(client);
        } else {
            System.out.println("Clientul " + client.getNume() + " nu are varsta minima de 18 ani");
        }
    }


    @Override
    public void afisareProgramMeci() {this.afisareProgramMeci();

    }
}
