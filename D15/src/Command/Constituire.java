package Command;

public class Constituire implements IComanda{
    private String cont;
    private ContBancar contBancar;

    public Constituire(String cont, ContBancar contBancar) {
        super();
        this.cont = cont;
        this.contBancar = contBancar;
    }

    @Override
    public void proceseaza() {
        this.contBancar.proceseazaComandaConstituire(cont);
    }
}
