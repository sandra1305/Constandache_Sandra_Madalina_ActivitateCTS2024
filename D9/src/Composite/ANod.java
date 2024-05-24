package Composite;

public abstract class ANod {

    public abstract String getNume();
    public abstract String getOcupatie();

    public String getInfo(){
        return this.getNume() + " " + this.getOcupatie();
    }

    public void adaugareNod(ANod elemStuctura){
        throw new UnsupportedOperationException();
    }
    public void eliminareNod(ANod elemStructura){
        throw new UnsupportedOperationException();
    }

    public ANod getNod(int i){
        throw new UnsupportedOperationException();
    }
}
