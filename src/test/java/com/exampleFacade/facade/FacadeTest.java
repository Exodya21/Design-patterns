package com.exampleFacade.facade;

import com.exampleFacade.facade.models.Client;
import com.exampleFacade.facade.models.Invoice;
import com.exampleFacade.facade.models.Store;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



class FacadeTests {

    @Test
    void aClientAskForInvoice() {
        Client client = new Client("Rodolfo", 10.0);
        Store store = new Store();

        var sut = store.generateInvoice( client );

        assertThat(sut.getDeliveryName(), equalTo( "Rodolfo" ) );
        assertThat(sut.getSub_TotalPrice(), equalTo( 10.0 ) );
        assertThat(sut.getTax(), equalTo( 0.1 ) );
        assertThat(sut.getTotalPriceToPay(), equalTo( 11.0 ) );

    }

}
