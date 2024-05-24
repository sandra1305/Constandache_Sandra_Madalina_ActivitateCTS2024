package Composite;

import java.util.ArrayList;
import java.util.List;
public class Structura extends ANod{

    private List<ANod> structura=new ArrayList<>();

    private String denumireStructura;

    public Structura(String denumireStructura){
        this.denumireStructura=denumireStructura;
    }

    @Override
    public String getNume() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getOcupatie() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getInfo() {
        String info="";
        info+=denumireStructura+"\n";
        for(ANod n:structura){
            info+=" " + n.getInfo();
            info+="\n";
        }
        return  info;
    }

    @Override
    public void adaugareNod(ANod elemStuctura) {
        structura.add(elemStuctura);
    }

    @Override
    public void eliminareNod(ANod elemStructura) {
       structura.remove(elemStructura);
    }

    @Override
    public ANod getNod(int i) {
        return (ANod)structura.get(i);
    }
}
