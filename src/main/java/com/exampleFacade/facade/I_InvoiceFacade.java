package com.exampleFacade.facade;

import com.exampleFacade.facade.models.Client;
import com.exampleFacade.facade.models.Invoice;
import com.exampleFacade.facade.models.Store;

public interface I_InvoiceFacade {
    Invoice writingInvoice( Client client, Double tax );
}
