package com.exampleFacade.facade;

import com.exampleFacade.facade.models.Client;
import com.exampleFacade.facade.models.Invoice;
import com.exampleFacade.facade.models.Store;
import org.junit.jupiter.api.Test;

class FacadeTests {

    @Test
    void aClientAskForInvoice() {
        Client client = new Client();
        Store store = new Store();

        var sut = store.generateInvoice( client );


    }

}
