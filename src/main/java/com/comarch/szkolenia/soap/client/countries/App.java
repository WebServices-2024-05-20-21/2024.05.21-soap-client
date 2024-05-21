package com.comarch.szkolenia.soap.client.countries;

import com.comarch.szkolenia.soap.client.countries.api.Country;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.comarch.szkolenia.soap.client.countries.AppConfiguration;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        SoapClient soapClient = context.getBean(SoapClient.class);
        Country country = soapClient.getCounty("Polska");

        System.out.println(country.getName());
        System.out.println(country.getCapital());
        System.out.println(country.getCurrency());
        System.out.println(country.getPopulation());
    }
}
