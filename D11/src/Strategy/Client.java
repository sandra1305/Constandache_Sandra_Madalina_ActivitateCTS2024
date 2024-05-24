package Strategy;

public class Client {
    private String nume;
    private TipClient tipClient;

    public Client(String nume, TipClient tipClient) {
        this.nume = nume;
        this.tipClient = tipClient;
    }

    public String getNume() {
        return nume;
    }

    public TipClient getTipClient() {
        return tipClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + getNume() + '\'' +
                ", tipClient='" + getTipClient() + '\'' +
                '}';
    }
}
