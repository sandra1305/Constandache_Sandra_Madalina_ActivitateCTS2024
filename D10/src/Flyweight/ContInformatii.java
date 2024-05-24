package Flyweight;

public class ContInformatii {



    private String numarCont;
    private float suma;

    public  ContInformatii(String numarCont, float suma){
        this.numarCont=numarCont;
        this.suma=suma;
    }
    public String getNumarCont() {
        return numarCont;
    }

    public float getSuma() {
        return suma;
    }
}
