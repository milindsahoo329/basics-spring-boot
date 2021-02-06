package com.example.consumingwebservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CountryConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.consumingwebservice.wsdl");
        return marshaller;
    }

    @Bean
    public CountryClient countryClient(Jaxb2Marshaller jaxb2Marshaller){
        CountryClient client = new CountryClient();
        client.setDefaultUri("http://localhost:8080/ws");
        client.setMarshaller(jaxb2Marshaller);
        client.setUnmarshaller(jaxb2Marshaller);
        return client;
    }

}
