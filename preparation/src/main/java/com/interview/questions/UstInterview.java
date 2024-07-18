package com.interview.questions;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UstInterview {

    public void sortInput(){
        List<String> input= Arrays.asList("Banana:10","Strawberry:0","APPLE:1", "GRAPES:3","ORANGE:2");

        List<String> output = input.stream()
                .sorted(Comparator.comparing(value -> Integer.valueOf(value.split(":")[1]))).collect(Collectors.toList());

        output.forEach(System.out::println);
    }

    public void swapAdjacent(){

        List<Integer> numberList=Arrays.asList(11,22,33,44,55,55,66);

        List<Integer> swapList=new ArrayList<>();

        for(int i=0 ; i< numberList.size()-1;i+=2){

            swapList.add(numberList.get(i + 1));
            swapList.add(numberList.get(i));
        }
        swapList.forEach(System.out::println);
    }
}
