package Adapter;

public class Program {
    public static void main(String[] args){
        int[] salarii=new int[]{3000,4000,5000,855};
        Framework framework=new Framework("Marius",4,salarii);
        IEvaluareFrameworkFirmaB iEvaluareFrameworkFirmaB= new AdapterFramework();
        iEvaluareFrameworkFirmaB.evaluareFrameWorkFirmaA(framework);
    }
}
