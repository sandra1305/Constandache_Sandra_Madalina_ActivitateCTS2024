package Memento;

public class Autobuz {


    private String model;
    private int nrLocuri;
    private int anFabricatie;
    private String numeSofer;
    private float consumMediu;

    public Autobuz(String model, int nrLocuri, int anFabricatie) {
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.anFabricatie = anFabricatie;
    }

    public String getModel() {
        return model;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void adaugaSofer(String sofer){
        this.numeSofer +=", " + sofer;
    }


    public void refacereVersiuneContractAnterior(VersiuniContractuale versiuniContractuale){

        this.consumMediu = versiuniContractuale.getConsumMediu();
        this.numeSofer = versiuniContractuale.getNumeSofer();
    }
    public VersiuniContractuale salveazaVersiune(){
        return new VersiuniContractuale(numeSofer,consumMediu);
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", nrLocuri=" + nrLocuri +
                ", anFabricatie=" + anFabricatie +
                ", numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                '}';
    }
}
