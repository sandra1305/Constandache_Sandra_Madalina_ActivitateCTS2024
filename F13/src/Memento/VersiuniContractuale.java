package Memento;

public class VersiuniContractuale {
    private String numeSofer;
    private float consumMediu;


    public VersiuniContractuale(String numeSofer, float consumMediu) {
        super();
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public float getConsumMediu() {
        return consumMediu;
    }
}
