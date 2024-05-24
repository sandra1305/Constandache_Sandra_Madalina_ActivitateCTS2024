package ChainOfResponsability;

public class ContCurent extends AHandler{
    @Override
    public void procesarePlata(Plata plata) {
        if(plata.getSumaDeAchitat()<=100){

            System.out.println("Suma a fost achita din contul de lei" + plata.getMesaj() );
        }

        else{
            System.out.println("Fonduri insuficiente in contul curent");
            if(this.getNextHandler()!=null)
                this.getNextHandler().procesarePlata(plata);
        }
    }
}
