package Composite;

public class Angajat extends ANod {
    String nume;
    String ocupatie;

    public Angajat(String nume,String ocupatie){
        this.nume=nume;
        this.ocupatie=ocupatie;
    }
    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public String getOcupatie() {
        return this.ocupatie;
    }
}
