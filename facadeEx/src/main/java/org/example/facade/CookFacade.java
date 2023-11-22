package org.example.facade;

import org.example.domain.Carrot;
import org.example.domain.Garlic;
import org.example.domain.Onion;

public class CookFacade {
    private final Carrot carrot;
    private final Garlic garlic;
    private final Onion onion;

    public CookFacade(Carrot carrot, Garlic garlic, Onion onion) {
        this.carrot = carrot;
        this.garlic = garlic;
        this.onion = onion;
    }

    public void cook() {
        carrot.chop();
        garlic.chop();
        onion.chop();

        carrot.add();
        garlic.add();
        onion.add();
    }
}
