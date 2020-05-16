package org.launchcode.studio7;

public class CD extends BaseDisc{

    public CD(){
        super(200, 500);
    }

    @Override
    public void WriteData(Object stuff){

    }

    @Override
    public Object ReadData(){
        return null;
    }

    @Override
    public void StopSpin(){

    }

    @Override
    public void setSpeed(int speed){

    }

    @Override
    public String toString(){
        return "CD";
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
