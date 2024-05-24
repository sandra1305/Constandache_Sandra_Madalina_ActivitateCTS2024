package Template;

public abstract class ARetragereBancomat {
    public abstract void introduecereCard();
    public abstract void introducerePin();
    public abstract void sumaSolicitata();
    public abstract void retragereSuma();
    public abstract void retragereCard();

    public final void procesareRetragere(){
        introduecereCard();
        introducerePin();
        sumaSolicitata();
        retragereSuma();
        retragereCard();
    }
}
