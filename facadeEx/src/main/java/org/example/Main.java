package org.example;

import org.example.domain.Carrot;
import org.example.domain.Garlic;
import org.example.domain.Onion;
import org.example.facade.CookFacade;

public class Main {
    public static void main(String[] args) {
        Carrot carrot = new Carrot();
        Garlic garlic = new Garlic();
        Onion onion = new Onion();
        CookFacade cookFacade = new CookFacade(carrot, garlic, onion);

        //파사드 적용
        cookFacade.cook();
    }
}