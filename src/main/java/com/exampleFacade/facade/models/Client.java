package com.exampleFacade.facade.models;

import javax.swing.event.DocumentEvent;

public class Client {

    private String name;
    private Double totalToPay;

    public Client(String name, Double totalToPay) {
        this.name = name;
        this.totalToPay = totalToPay;
    }

    public String getName() {
        return name;
    }

    public Double getShoppingKart() {
        return totalToPay;
    }
}
