package Adapter;

public class Framework {
    private String numeClient;
    private int nrLuniSalarii;
    private int[] salarii;

    public Framework(String numeClient, int nrLuniSalarii, int[] salarii) {
        this.numeClient = numeClient;
        this.nrLuniSalarii = nrLuniSalarii;
        this.salarii = salarii;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getNrLuniSalarii() {
        return nrLuniSalarii;
    }

    public int[] getSalarii() {
        return salarii;
    }
}
