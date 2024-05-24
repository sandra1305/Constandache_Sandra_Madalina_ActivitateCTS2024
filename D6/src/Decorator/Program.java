package Decorator;

public class Program {

    public static void main(String[] args)
    {
        CardNormal cardNormal=new CardNormal("MIHAI MIHAIOVICI",0);
        ContactLess cardContactless=new ContactLess(cardNormal);
        System.out.println(cardNormal.getComponenteCard());
        System.out.println(cardNormal.getCost());
        System.out.println(cardContactless.getComponenteCard());
        System.out.println(cardContactless.getCost());
    }
}
