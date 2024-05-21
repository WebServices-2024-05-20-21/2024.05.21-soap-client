package com.comarch.szkolenia.soap.client.countries;

import com.comarch.szkolenia.soap.client.countries.api.Country;
import com.comarch.szkolenia.soap.client.countries.api.GetCountryRequest;
import com.comarch.szkolenia.soap.client.countries.api.GetCountryResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapClient extends WebServiceGatewaySupport {

    public Country getCounty(String name) {
        GetCountryRequest getCountryRequest = new GetCountryRequest();
        getCountryRequest.setName(name);

        GetCountryResponse getCountryResponse = (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(getCountryRequest);
        return getCountryResponse.getCountry();
    }
}
