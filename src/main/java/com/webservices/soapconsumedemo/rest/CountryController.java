package com.webservices.soapconsumedemo.rest;

import com.webservices.soapconsumedemo.client.CountryClient;
import com.webservices.soapconsumedemo.generated.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/country")
public class CountryController {

    private final CountryClient countryClient;

    @Autowired
    public CountryController(CountryClient countryClient) {
        this.countryClient = countryClient;
    }

    @GetMapping(path = "/{name}")
    public GetCountryResponse getCountry(@PathVariable(value = "name") String name){
        return countryClient.getCountry(name);
    }
}
