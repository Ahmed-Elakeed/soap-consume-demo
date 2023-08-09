package com.webservices.soapconsumedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapConsumeDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SoapConsumeDemoApplication.class, args);
    }

//    @Bean
//    CommandLineRunner lookup(SOAPConnector soapConnector) {
//        return args -> {
//            GetCountryRequest request = new GetCountryRequest();
//            request.setName("Egypt");
//            GetCountryResponse response =(GetCountryResponse) soapConnector.callWebService("http://localhost:8080/ws/", request);
//            System.out.println("Got Response As below ========= : ");
//            System.out.println("Name : "+response.getCountry().getName());
//            System.out.println("Capital : "+response.getCountry().getCapital());
//            System.out.println("Currency : "+response.getCountry().getCurrency());
//        };
//    }
}
