package Memento;

public class Program {
    public static void main(String[]args){
        Autobuz autobuz=new Autobuz("Mercedes", 25, 2005);
        Autobuz autobuz2=new Autobuz("Volvo", 30, 2010);
        Autobuz autobuz3=new Autobuz("Mercedes", 15, 2021);

        ManagerContract managerContract = new ManagerContract();

        autobuz2.adaugaSofer("Marius");

        VersiuniContractuale versiuniContractuale = new VersiuniContractuale("Marius",20);
        autobuz2.refacereVersiuneContractAnterior(versiuniContractuale);
        managerContract.adaugareListaVersiuni(autobuz2.salveazaVersiune());
        System.out.println(autobuz2);
        autobuz2.refacereVersiuneContractAnterior(new VersiuniContractuale("Tilica",25));
        managerContract.adaugareListaVersiuni(autobuz2.salveazaVersiune());
        System.out.println(autobuz2);


        managerContract.recuperareVersiune(1);
        System.out.println(autobuz2);
    }
}
