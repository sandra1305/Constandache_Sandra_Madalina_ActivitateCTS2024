package Decorator;

public  class ContactLess extends DecoratorCard{
    public ContactLess(ACard aCard) {
        super(aCard);
    }
    @Override
    public String getComponenteCard() {
        return super.getComponenteCard() +", plata se poate efectua contactless.";
    }

    @Override
    public float getCost() {
        return super.getCost()+8;
    }

}
