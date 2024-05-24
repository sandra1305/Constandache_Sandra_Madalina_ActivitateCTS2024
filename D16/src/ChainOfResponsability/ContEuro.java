package ChainOfResponsability;

public class ContEuro extends AHandler{
    @Override
    public void procesarePlata(Plata plata) {
        if(plata.getSumaDeAchitat()<1000){
            System.out.println("Suma achita din contul de euro"+ plata.getMesaj());
        }
        else {
            System.out.println("Fonduri insuficiente in contul de euro");
            if(this.getNextHandler()!=null){
                this.getNextHandler().procesarePlata(plata);
            }
        }
    }
}
