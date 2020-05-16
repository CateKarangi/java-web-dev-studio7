package org.launchcode.studio7;

import jdk.jshell.spi.ExecutionControl;

public class BaseWheel implements ISpin {
    @Override
    public void Spin(){
        System.out.println("Keep in mind to do this");
    }

    @Override
    public void StopSpin(){

    }

    @Override
    public void setSpeed(int speed){

    }

}
