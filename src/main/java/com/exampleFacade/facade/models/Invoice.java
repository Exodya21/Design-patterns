package com.exampleFacade.facade.models;

public class Invoice {
    String DeliveryName;
    int totalPriceToPay;
    Double tax;

    public Invoice(String deliveryName, int totalPriceToPay, Double tax) {
        DeliveryName = deliveryName;
        this.totalPriceToPay = totalPriceToPay;
        this.tax = tax;
    }
}
