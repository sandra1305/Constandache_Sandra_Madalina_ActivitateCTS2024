package Command;

public class ContBancar {
    private String numeCont;

    public ContBancar(String numeCont){
        this.numeCont=numeCont;
    }

    public void proceseazaComandaConstituire(String tipCont){
        System.out.println("Clientul care detine contul cu numarul " + " " + numeCont + " " + " a dorit constituirea unui " + " " + tipCont );
    }

    public void proceseazaComandaDepunere(float suma){
        System.out.println("S-a depus in contul " + " " + numeCont + " " + " suma de " + " "+ suma);
    }

    public void proceseazaComandaRetragere(float suma){

        System.out.println("S-a retras din contul " + " " + numeCont + " " + " suma de " + " "+ suma);
    }
}
