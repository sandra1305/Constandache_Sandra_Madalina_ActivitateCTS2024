package State;

public class ArePinIntrodus extends AStarea {
    public ArePinIntrodus(Bancomat bancomat){
        super(bancomat);
    }

    @Override
    public void cardIntrodus() {
        System.out.println("Cardul a fost introdus");
    }

    @Override
    public void pinIntrodus(int pin) {
        System.out.println("PIN corect");
    }

    @Override
    public void realizareRetragere(float sumaDeRetras) {
            if(bancomat.getSumaClient()>sumaDeRetras){
                System.out.println("Retrage suma de " + sumaDeRetras);
                bancomat.setSumaClient(bancomat.getSumaClient()-sumaDeRetras);
            }
            else {
                System.out.println("Fonduri insuficiente");
            }

    }

    @Override
    public void cardRetras() {
        System.out.println("Card Retras");
    }
}
