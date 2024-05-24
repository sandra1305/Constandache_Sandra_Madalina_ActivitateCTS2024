package State;

public class NuAreCard extends AStarea{
    public NuAreCard(Bancomat bancomat) {
        super(bancomat);
    }

    @Override
    public void cardIntrodus() {
        System.out.println("Introduceti cardul in ATM");
    }

    @Override
    public void pinIntrodus(int pin) {
        System.out.println("Introduceti cardul in ATM");
    }

    @Override
    public void realizareRetragere(float suma) {
        System.out.println("Introduceti cardul in ATM");
    }

    @Override
    public void cardRetras() {
        System.out.println("Introduceti cardul in ATM");
    }
}
