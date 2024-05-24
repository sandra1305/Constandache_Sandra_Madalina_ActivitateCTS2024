package State;

public class Program {
    public static void main(String[] args){
            Bancomat b=new Bancomat(1234,100);
            AStarea s=new AreCard(b);
            b.setStare(s);
            System.out.println(b);





    }
}
