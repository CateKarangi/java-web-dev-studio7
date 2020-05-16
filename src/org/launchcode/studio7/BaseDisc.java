package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc implements ISpin, IDataStore{

    private String name;
    private int capacity;
    private ArrayList<Object> contents;
    private String discType;
    private int minPRM;
    private int maxPRM;

    public BaseDisc(int minPRM, int maxPRM){
        this.minPRM = minPRM;
        this.maxPRM = maxPRM;
    }

    public String getName(){
        return name;
    }

    public int getCapacity(){
        return capacity;
    }

    @Override
    public void Spin(){
        System.out.println("A"+this.toString()+"spins at between"+this.minPRM+"_"+this.maxPRM);
    }

}
