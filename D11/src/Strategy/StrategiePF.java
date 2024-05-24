package Strategy;

import java.util.ArrayList;
import java.util.Objects;

public class StrategiePF implements IProcesare {
    @Override
    public Client alegereClient(ArrayList<Client> listaClienti) {
        boolean alegere = false;
        Client clientPF = listaClienti.get(0);
        for (Client c : listaClienti) {
            if (TipClient.PF == c.getTipClient())
                clientPF = c;
        }
            return clientPF;
        }
    }


