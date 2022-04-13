package com.exampleFacade.facade.models;

import com.exampleFacade.facade.InvoiceFacade;

public class Store implements InvoiceFacade {

    public Store() {
    }

    public Invoice generateInvoice( Client client ) {
        return new Invoice(
                client.getName(),
                client.getShoppingKart(),
                this.tax
        );
    };
}
