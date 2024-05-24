package Command;

public class Retragere implements IComanda {

    private float suma;
    private ContBancar contBancar;

    public Retragere(float suma, ContBancar contBancar) {
        this.suma = suma;
        this.contBancar = contBancar;
    }

    @Override
    public void proceseaza() {
        this.contBancar.proceseazaComandaRetragere(suma);
    }
}
