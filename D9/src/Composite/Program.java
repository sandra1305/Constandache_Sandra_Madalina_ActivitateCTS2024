package Composite;

public class Program {
    public static void main(String[] args){
        Structura structuraEuropa=new Structura("Sucursala centrala Europa");
        Structura structuraAsia=new Structura("Sucursala centrala Asia");
        Structura structuraAmerica=new Structura("Sucursala centrala America");

        Structura structuraRomania = new Structura("Sucursala centrala Romania");
        Structura structuraEmirateleArabe = new Structura("Sucursala centrala Emiratele Arabe");
        Structura structuraUSA = new Structura("Sucursala centrala USA");

        Structura structuraBucuresti = new Structura("Sucursala Bucuresti");
        Structura agentii = new Structura("Filiala Armonica");
        Structura agentii2=new Structura("Filiala Unirea");

        Structura structuraConstanta = new Structura("Sucursala Constanta");
        Structura agentii3 = new Structura("Filiala Capitol");
        Structura agentii4=new Structura("Filiala Teatru");

        agentii.adaugareNod(new Angajat("Serban Constantean", "Director General"));
        agentii2.adaugareNod(new Angajat("Mihaela Radulescu","Consilier Credite"));
        structuraBucuresti.adaugareNod(agentii);
        structuraBucuresti.adaugareNod(agentii2);

        agentii.adaugareNod(new Angajat("Daniela Georgescu", "Director General"));
        agentii4.adaugareNod(new Angajat("Cristina Zaharua","Consilier Credite"));
        structuraConstanta.adaugareNod(agentii3);
        structuraConstanta.adaugareNod(agentii4);

        structuraRomania.adaugareNod(structuraConstanta);
        structuraRomania.adaugareNod(structuraBucuresti);
        structuraEuropa.adaugareNod(structuraRomania);

        System.out.println(structuraEuropa.getInfo());
        System.out.println(structuraAmerica.getInfo());
        System.out.println(structuraAsia.getInfo());
    }
}
