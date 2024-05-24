package Facade;

import javax.swing.*;

public class Program {

    public static void main(String[] args) {
        Facade persoana = new Facade();
        int varsta = 25;
        String persoanaID = "123456789";

        boolean eligibil = persoana.esteEligibilPentruCont(varsta, persoanaID);
            if (eligibil)
                System.out.println("Contul poate fi create");
            else
                System.out.println("Contul nu poate fi create");
    }

}

