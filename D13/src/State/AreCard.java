package State;

public class AreCard extends AStarea{

    public AreCard(Bancomat bancomat){
        super(bancomat);
    }


    @Override
    public void cardIntrodus() {
        System.out.println("Cardul a fost Introdus");
    }

    @Override
    public void pinIntrodus(int pin) {
        if(bancomat.getPinClient()==pin)
             System.out.println("Pin Introdus Corect");

        else
            System.out.println("Mai ai 2 incercari");
    }

    @Override
    public void realizareRetragere(float suma) {
        System.out.println("Introdu pin-ul corect");
    }
    @Override
    public void cardRetras() {
        System.out.println("Card Retras");
    }


}
