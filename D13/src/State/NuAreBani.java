package State;

public class NuAreBani extends AStarea{
    public NuAreBani(Bancomat bancomat) {
        super(bancomat);
    }

    @Override
    public void cardIntrodus() {
        System.out.println("Introduce-ti cardul");
    }

    @Override
    public void pinIntrodus(int pin) {
        System.out.println("Introduce-ti PIn-ul");
    }

    @Override
    public void realizareRetragere(float suma) {
        System.out.println("Fonduri insuficiente in bancomat");
    }

    @Override
    public void cardRetras() {
        System.out.println("Retragere card");
    }
}
