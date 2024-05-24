package Template;

public  class RetragereBancomat  extends ARetragereBancomat{

    @Override
    public void introduecereCard() {
        System.out.println("S-a introdus cardul.");
    }

    @Override
    public void introducerePin() {
        System.out.println("S-a introdus PIN-ul.");
    }

    @Override
    public void sumaSolicitata() {
        System.out.println("S-a introdus suma solicitata.");
    }

    @Override
    public void retragereSuma() {
        System.out.println("S-a retras suma.");
    }

    @Override
    public void retragereCard() {
        System.out.println("S-a ridicat cardul.");
    }
}
