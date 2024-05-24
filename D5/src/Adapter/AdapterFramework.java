package Adapter;

public class AdapterFramework extends EvaluareFrameworkFirmaA implements IEvaluareFrameworkFirmaB{

    public int calculDobandaPeUltimileSalarii(Framework framework){

        int total=0;
        for(int i=0;i < framework.getNrLuniSalarii();i++){
            total+=framework.getSalarii()[i];
        }
        return total;
    }
    @Override
    public void evaluareFrameWorkFirmaA(Framework framework) {
        System.out.println("Analiza dupa Firma B ");
        this.evaluareFrameWorkFirmaA(calculDobandaPeUltimileSalarii(framework));
    }
}
