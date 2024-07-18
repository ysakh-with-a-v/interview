package com.interview.preparation.design.patterns;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ToyFactory {

    @Autowired
    private ObjectFactory<Car> carsObjectFactory;

    @Autowired
    private ObjectFactory<Bike> bikeObjectFactory;


    public Toy getObjects(String type){
        if(type.equals("Car")){
            return carsObjectFactory.getObject();
        }else{
            return bikeObjectFactory.getObject();
        }

    }

}
