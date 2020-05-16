package org.launchcode.studio7;

import jdk.jshell.spi.ExecutionControl;

public class Main {

    public static void main(String[] args){

        CD newCD = new CD();
        DVD dvd = new DVD();


        Spinner newSpinner = new Spinner(dvd);
        newSpinner.SpinThing();



        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
