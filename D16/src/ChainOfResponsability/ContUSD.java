package ChainOfResponsability;

public class ContUSD extends AHandler{
    @Override
    public void procesarePlata(Plata plata) {
        System.out.println("Suma achitata din contul de USD" + plata.getMesaj());
    }
}
