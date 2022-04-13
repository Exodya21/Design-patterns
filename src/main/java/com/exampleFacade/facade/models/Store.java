package com.exampleFacade.facade.models;

import com.exampleFacade.facade.InvoiceFacade;

public class Store implements InvoiceFacade {

    private Double tax = 0.1;

    public Store() {
    }

    public Invoice generateInvoice( Client client ) {
        Invoice invoice =  new Invoice(
                client.getName(),
                client.getShoppingKart(),
                this.tax
        );

        invoice.calculateTotalPrice();
        return invoice;
    };
}
