package Flyweight;

public class Program {

    public static void main(String[]args){


           ContInformatii contInformatii=new ContInformatii("RO29BRDRON12346789",200);

            ContFlyweightFactory.getSituatieCont(TipCont.EUR).printeaza(contInformatii);
            System.out.println(ContFlyweightFactory.getNrSituatiiDeContPrintate() + " situatii printate");
            System.out.println(ContFlyweightFactory.getNrMatriteConturi() + " matrite conturi folosite");
    }
}
