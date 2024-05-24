package Flyweight;

public class SituatieCont implements IPrint {
    private TipCont tipCont;
    private String numeClient;
    private String numeBanca;
    private String sucursala;


    public SituatieCont(TipCont tipCont){
        this.tipCont=tipCont;
    }


    public TipCont getTipCont(){
        return tipCont;
    }
    public String getNumeClient(){
        return  numeClient;
    }

    public void setNumeClient(String numeClient){
        this.numeClient=numeClient;
    }


    public String getNumeBanca() {
        return numeBanca;
    }

    public void setNumeBanca(String numeBanca) {
        this.numeBanca = numeBanca;
    }

    public String getSucursala() {
        return sucursala;
    }

    public void setSucursala(String sucursala) {
        this.sucursala = sucursala;
    }


    @Override
    public void printeaza(ContInformatii contInformatii) {
        System.out.println("Se printeaza situatia de cont: " + tipCont + " deschis la banca: " + this.numeBanca + "in cadrul sucursalei"+ this.sucursala+ "pentru clientul" + this.numeClient);
        System.out.println("Numarul de cont " +" " + contInformatii.getNumarCont() + " " + "Suma disponibila : "+ " " + contInformatii.getSuma());

    }
}
