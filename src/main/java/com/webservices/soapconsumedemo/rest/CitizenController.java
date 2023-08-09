package com.webservices.soapconsumedemo.rest;

import com.webservices.soapconsumedemo.client.CitizenClient;
import com.webservices.soapconsumedemo.generated.GetCitizenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/citizen")
public class CitizenController {

    private final CitizenClient citizenClient;

    @Autowired
    public CitizenController(CitizenClient citizenClient) {
        this.citizenClient = citizenClient;
    }

    @GetMapping(path = "/{id}")
    public GetCitizenResponse getCitizen(@PathVariable(value = "id") String id){
        return this.citizenClient.getCitizen(id);
    }
}
