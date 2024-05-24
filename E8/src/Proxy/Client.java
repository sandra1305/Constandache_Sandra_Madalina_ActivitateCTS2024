package Proxy;

public class Client {

    private String nume;
    private int varsta;
    public Client(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }
    @Override
    public String toString(){
        return "[ Nume + " +" " + this.nume + " " + " Varsta " + " " + this.varsta + " ] ";
    }
}
