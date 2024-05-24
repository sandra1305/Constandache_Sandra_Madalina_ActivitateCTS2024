package Factory;

public class Program {
    public static void main(String[] args) {
        IFactory iFactory = null;
        iFactory = new FactoryCrediteIpotecare();
        ICredite iCredite = null;
        iCredite = iFactory.creareCredite();
        iCredite.afisareDescriere();
    }
}
