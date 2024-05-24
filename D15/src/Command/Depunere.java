package Command;

public class Depunere implements IComanda{
    private float suma;
    private ContBancar contBancar;

    public Depunere(float suma, ContBancar contBancar) {
        this.suma = suma;
        this.contBancar = contBancar;
    }

    @Override
    public void proceseaza() {
        this.contBancar.proceseazaComandaDepunere(suma);
    }
}
