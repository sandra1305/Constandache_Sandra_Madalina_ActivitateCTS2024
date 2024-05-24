package Strategy;

import java.util.ArrayList;

public class StrategiePJ implements IProcesare {
    @Override
    public Client alegereClient(ArrayList<Client> listaClienti) {
        boolean verificare = false;
        Client clientiPJ = listaClienti.get(0);
        for (Client c : listaClienti) {
            if (TipClient.PJ == c.getTipClient())
                clientiPJ = c;

        }
        return clientiPJ;
    }
}

