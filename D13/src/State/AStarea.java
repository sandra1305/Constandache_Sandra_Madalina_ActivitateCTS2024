package State;

public abstract class AStarea {

    protected Bancomat bancomat;

    public AStarea(Bancomat bancomat){
        super();
        this.bancomat=bancomat;
    }
    public abstract  void cardIntrodus();


    public abstract  void pinIntrodus(int pin);

    public abstract void realizareRetragere(float suma);
    public abstract void cardRetras();



}
