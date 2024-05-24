package Command;
import java.util.*;
public class OperatoriBanci {

    private List<IComanda> listaComenzi;

    public OperatoriBanci(){
        this.listaComenzi=new ArrayList<>();
    }

    public void proceseazaComanda(IComanda c){
        this.listaComenzi.add(c);
    }

    public void transmiteComanda(){
        for(IComanda c: listaComenzi)
            c.proceseaza();
        listaComenzi.clear();
    }
}
