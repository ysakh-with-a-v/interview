package com.interview.preparation.design.patterns;

public class Pizza {

    private String toppingsA;

    private String toppingB;

    private boolean sauce;


    private Pizza(String a, String b, boolean isSauce){
        this.toppingB=b;
        this.toppingsA=a;
        this.sauce=isSauce;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "toppingsA='" + toppingsA + '\'' +
                ", toppingB='" + toppingB + '\'' +
                ", sauce=" + sauce +
                '}';
    }

    public static class PizzaBuilder{

        private String toppingsA;

        private String toppingB;

        private boolean sauce;

        public PizzaBuilder sauce(boolean sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder toppingsA(String toppingsA) {
            this.toppingsA = toppingsA;
            return this;
        }

        public PizzaBuilder toppingB(String toppingB) {
            this.toppingB = toppingB;
            return this;
        }

        public Pizza build(){
            return new Pizza(toppingsA,toppingB,sauce);
        }
    }

}
