package Decorator;

public class CardNormal extends ACard{
    CardNormal(String numeClient,float cost){
        this.numeClient=numeClient;
        this.cost=cost;

    }
    @Override
    public String getComponenteCard() {
        return "Plata se poate efectua online.";
    }

    @Override
    public float getCost() {
        return this.cost;
    }
}
