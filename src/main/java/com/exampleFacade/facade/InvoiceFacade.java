package com.exampleFacade.facade;

import com.exampleFacade.facade.models.Client;
import com.exampleFacade.facade.models.Invoice;

public interface InvoiceFacade {
    Invoice generateInvoice( Client client );
}
