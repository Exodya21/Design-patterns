package com.exampleFacade.facade;

import com.exampleFacade.facade.models.Client;
import com.exampleFacade.facade.models.Invoice;

public class InvoiceFacade implements I_InvoiceFacade {
    public Invoice writingInvoice (Client client, Double tax) {
        Invoice invoice =  new Invoice(
                client.getName(),
                client.getShoppingKart(),
                tax
        );

        invoice.calculateTotalPrice();
        return invoice;
    }
}
