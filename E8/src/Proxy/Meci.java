package Proxy;
import java.util.*;
public class Meci implements IMeci{
    private  String data;

    private List<String>listaInvitati;
    private List<Client>listaParticipanti;

    public Meci(String data,List<String>listaInvitati){
        this.data=data;
        this.listaInvitati=listaInvitati;
        this.listaParticipanti=new ArrayList<>();
    }
    @Override
    public void adaugaParticipanti(Client client) {
        this.listaParticipanti.add(client);
        System.out.println("Clientul " + client +  " a primit bilet");
    }

    @Override
    public void afisareProgramMeci() {

    }
}
