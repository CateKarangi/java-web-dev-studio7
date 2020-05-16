package org.launchcode.studio7;

import jdk.jshell.spi.ExecutionControl;

public class Spinner {

    private ISpin spinnyThing;

    public Spinner (ISpin spinnyThing){
        this.spinnyThing = spinnyThing;
    }

    public void SpinThing(){
        this.spinnyThing.Spin();
    }
}