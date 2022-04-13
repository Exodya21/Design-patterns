package com.exampleFacade.facade.models;

public class Invoice {
    private String DeliveryName;
    private Double sub_TotalPrice;
    private Double tax;
    private Double totalPriceToPay;

    public Invoice(String deliveryName, Double totalPriceToPay, Double tax) {
        DeliveryName = deliveryName;
        this.sub_TotalPrice = totalPriceToPay;
        this.tax = tax;
    }

    public void calculateTotalPrice() {
        totalPriceToPay = (sub_TotalPrice * tax) + sub_TotalPrice;
    }

    public String getDeliveryName() {
        return DeliveryName;
    }

    public Double getSub_TotalPrice() {
        return sub_TotalPrice;
    }

    public Double getTax() {
        return tax;
    }

    public Double getTotalPriceToPay() {
        return totalPriceToPay;
    }
}
