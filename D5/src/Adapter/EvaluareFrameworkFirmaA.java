package Adapter;

public class EvaluareFrameworkFirmaA implements IEvaluareFrameworkFirmaA{
    @Override
    public void evaluareFrameWorkFirmaA(int salariu) {
        System.out.println("Analiza realizata de firma A: ");
        double dobanda = salariu*6.8;
        System.out.println("Se achita dobanda de " + dobanda);
        }
}

