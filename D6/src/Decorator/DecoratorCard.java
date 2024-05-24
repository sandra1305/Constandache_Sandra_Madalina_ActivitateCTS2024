package Decorator;

import jdk.jfr.Percentage;

public abstract class DecoratorCard extends ACard{
    protected  final ACard aCard;
    public  DecoratorCard(ACard aCard){
        this.aCard=aCard;
    }
    @Override
    public String getComponenteCard(){
        return aCard.getComponenteCard();
    }

    @Override
    public  float getCost(){
        return aCard.cost;
    }


}
