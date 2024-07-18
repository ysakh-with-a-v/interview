package com.interview.preparation.design.patterns;

public class HeavyBoy {

    private static HeavyBoy oneHeavyBoy;

    private HeavyBoy(){}

    public static synchronized HeavyBoy getInstance(){
        if(oneHeavyBoy==null){
            oneHeavyBoy=new HeavyBoy();

        }
        return oneHeavyBoy;
    }

}
