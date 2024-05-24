package Command;

public class Program {
    public static void main(String[] args){
        OperatoriBanci operatoriBanci= new OperatoriBanci();
        ContBancar contBancar =new ContBancar("RO20BDRRON569965631");
        IComanda c1= new Constituire("depozit",contBancar);
        IComanda c2 =new Depunere(2250, contBancar);
        IComanda c3 = new Retragere(100, contBancar);

        operatoriBanci.proceseazaComanda(c1);
        operatoriBanci.proceseazaComanda(c2);
        operatoriBanci.proceseazaComanda(c3);

        operatoriBanci.transmiteComanda();
    }
}
