package Proxy;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<String> listaInvitati = new ArrayList<>();
        listaInvitati.add("Gigi Becali");
        listaInvitati.add("Petre Roman");
        Client cl1 = new Client("George Tudose", 20);
        Client cl2 = new Client("Ramona Olaru", 15);
        Client cl3 = new Client("George Buhnici", 45);
        Client cl4 = new Client("Serban Mocanu", 20);
        IMeci meci = new Meci("24.05.20240", listaInvitati);
        meci.adaugaParticipanti(cl1);
        IMeci meciProxy = new ProxyMeci(meci);
        meciProxy.adaugaParticipanti(cl2);
        meciProxy.adaugaParticipanti(cl3);
        meciProxy.adaugaParticipanti(cl4);
    }
}
