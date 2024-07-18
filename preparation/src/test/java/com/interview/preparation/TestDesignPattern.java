package com.interview.preparation;


import com.interview.preparation.design.patterns.Car;
import com.interview.preparation.design.patterns.HeavyBoy;
import com.interview.preparation.design.patterns.Pizza;
import com.interview.preparation.design.patterns.ToyFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Incubating;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

@ExtendWith(MockitoExtension.class)
public class TestDesignPattern {


    @InjectMocks
    private ToyFactory toyFactory;

    @Mock
    private ObjectFactory<Car> carFactory;

    @Test
    public void buildPizza() {
        Pizza p = new Pizza.PizzaBuilder().
                toppingsA("onion").
                toppingB("meat").
                sauce(true).build();
        System.out.println("The pizza is "+p.toString());
    }

    @Test
    public void testFactory(){
        Mockito.when(carFactory.getObject()).thenReturn(new Car());
        toyFactory.getObjects("Car").play();

    }

    @Test
    public void testSingleton(){
        HeavyBoy boy1= HeavyBoy.getInstance();
        HeavyBoy boy2 = HeavyBoy.getInstance();

        System.out.println( boy1);
        System.out.println(boy2);

    }


}
