package Facade;

public class Facade {
    private VerificareCazier verificareCazier;
    private VerificareCreante verificareCreante;
    private VerificareVarsta verificareVarsta;

    public Facade() {
        this.verificareCazier = new VerificareCazier();
        this.verificareCreante = new VerificareCreante();
        this.verificareVarsta = new VerificareVarsta();
    }

    public boolean esteEligibilPentruCont(int age,String persoanaID){
        boolean eligibil=verificareVarsta.verificareVarsta(age) && verificareCazier.nuAreCazier(persoanaID)
                && verificareCreante.verificareCreante(persoanaID);
        return eligibil;
    }
}
