package com.webservices.soapconsumedemo.configuration;

import com.webservices.soapconsumedemo.client.CitizenClient;
import com.webservices.soapconsumedemo.client.CountryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CitizenClientConfig {

    @Bean
    public CitizenClient citizenClient(Jaxb2Marshaller marshaller) {
        CitizenClient client = new CitizenClient();
        client.setDefaultUri("http://localhost:8080/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
