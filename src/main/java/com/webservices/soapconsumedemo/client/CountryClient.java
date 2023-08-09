package com.webservices.soapconsumedemo.client;

import com.webservices.soapconsumedemo.generated.GetCountryRequest;
import com.webservices.soapconsumedemo.generated.GetCountryResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class CountryClient extends WebServiceGatewaySupport {

    public GetCountryResponse getCountry(String country){
        GetCountryRequest request=new GetCountryRequest();
        request.setName(country);

        return (GetCountryResponse) getWebServiceTemplate()
                .marshalSendAndReceive(request);

    }
}
