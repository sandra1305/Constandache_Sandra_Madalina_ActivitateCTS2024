package ChainOfResponsability;

public class Plata {
    private float sumaDeAchitat;
    private String mesaj;

    public Plata(float sumaDeAchitat, String mesaj) {
        this.sumaDeAchitat = sumaDeAchitat;
        this.mesaj = mesaj;
    }

    public float getSumaDeAchitat() {
        return sumaDeAchitat;
    }

    public String getMesaj() {
        return mesaj;
    }
}
