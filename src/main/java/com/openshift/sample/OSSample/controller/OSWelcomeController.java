package com.openshift.sample.OSSample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OSWelcomeController {

    @GetMapping("/")
    public String landing(){
        return "Welcome to OpenShift";
    }

    @GetMapping("/cities")
    public List<String> getCities(){
        List<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Kolkata");
        cities.add("New Delhi");
        cities.add("Chennai");
        return cities;
    }

}
