package ChainOfResponsability;

public class Program {
    public static void main(String[]args){
        Plata plata1=new Plata(500,"Pantofi");
        Plata plata2=new Plata(100,"Carte");
        Plata plata3=new Plata(1500,"Televizor");

        ContCurent contCurent=new ContCurent();
        ContEuro contEuro = new ContEuro();
        ContUSD contUSD = new ContUSD();
        contCurent.setNextHandler(contEuro);
        contEuro.setNextHandler(contUSD);

        contCurent.procesarePlata(plata1);
        System.out.println("Achitat - " + plata1.getMesaj());
        contCurent.procesarePlata(plata2);
        System.out.println("Achitat - " + plata2.getMesaj());
        contCurent.procesarePlata(plata3);
        System.out.println("Achitat - " + plata3.getMesaj());
    }
}
