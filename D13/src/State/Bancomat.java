package State;

public class Bancomat {
    private AStarea stare;

    private int pinClient;

    private float sumaClient;



    public Bancomat(int pinClient ,float sumaClient) {
        super();
        this.pinClient=pinClient;
        this.sumaClient=sumaClient;
        this.stare=new AreCard(this);
    }

    public int getPinClient() {
        return pinClient;
    }

    public float getSumaClient() {
        return sumaClient;
    }
    public void setSumaClient(float sumaClient) {
        this.sumaClient = sumaClient;
    }

    public void setStare(AStarea stare) {
        if(this.stare.equals(Stari.NuAreCard))
                this.stare = new NuAreCard(this);
        else if(this.stare.equals(Stari.NuAreBani))
            this.stare=new NuAreBani(this);
        else if(this.stare.equals(Stari.AreCard))
            this.stare=new AreCard(this);
        else
            this.stare=new ArePinIntrodus(this);
    }

    @Override
    public String toString() {
        return "Bancomat{" +
                "stare=" + stare +
                ", pinClient=" + pinClient +
                ", sumaClient=" + sumaClient +
                '}';
    }
}
