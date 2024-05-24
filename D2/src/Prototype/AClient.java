package Prototype;

import java.util.ArrayList;

public abstract class AClient implements Cloneable  {
    private String id;
    protected String tip;

    protected ArrayList<String> listaServicii;

    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return id;
    }

    public String getTip(){
        return tip;
    }

    public ArrayList<String> getListaServicii(){
        return listaServicii;
    }

    @Override
    public AClient clone()  {

        Object clone=null;
        try {
            clone = super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return (AClient) clone;
    }
    abstract void printare();

    @Override
    public String toString(){
        return "Client [ id = " +id + " , " + " tip = " + tip +  "listaServicii=" + listaServicii + "]";
    }
}
