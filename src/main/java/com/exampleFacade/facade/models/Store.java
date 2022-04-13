package com.exampleFacade.facade.models;

import com.exampleFacade.facade.InvoiceFacade;

public class Store {

    private Double tax = 0.1;
    InvoiceFacade invoiceFacade = new InvoiceFacade();

    public Store() {
    }

    public Invoice generateInvoice( Client client ) {
        var invoice = invoiceFacade.writingInvoice(client, tax);
        return invoice;
    };
}
