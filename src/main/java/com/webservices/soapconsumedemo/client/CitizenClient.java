package com.webservices.soapconsumedemo.client;

import com.webservices.soapconsumedemo.generated.GetCitizenRequest;
import com.webservices.soapconsumedemo.generated.GetCitizenResponse;
import com.webservices.soapconsumedemo.generated.GetCountryRequest;
import com.webservices.soapconsumedemo.generated.GetCountryResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CitizenClient extends WebServiceGatewaySupport {

    public GetCitizenResponse getCitizen(String id){
        GetCitizenRequest request=new GetCitizenRequest();
        request.setId(id);

        return (GetCitizenResponse) getWebServiceTemplate()
                .marshalSendAndReceive(request);
    }
}
