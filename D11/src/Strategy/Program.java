package Strategy;

public class Program {
    public static  void main(String[] args){

        Client client=new Client("Matei Dima",TipClient.PJ);
        Client client2=new Client("Matei Dinu",TipClient.PF);
        Client client4=new Client("Alina Rusu",TipClient.PF);
        Client client3=new Client("Alina Paraschiv",TipClient.PJ);
        AlegereCategorieClient alegereCategorieClient=new AlegereCategorieClient();
        alegereCategorieClient.addClient(client);
        alegereCategorieClient.addClient(client2);
        alegereCategorieClient.addClient(client4);
        alegereCategorieClient.addClient(client3);



        alegereCategorieClient.setStrategie(new StrategiePF());
        System.out.println("Lista clienti PF este " + alegereCategorieClient.alegereClient());


        alegereCategorieClient.setStrategie(new StrategiePJ());
        System.out.println("Lista clienti PJ este " + alegereCategorieClient.alegereClient());


    }

}
