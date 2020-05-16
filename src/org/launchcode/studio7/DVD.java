package org.launchcode.studio7;

public class  DVD extends BaseDisc {

    public DVD (){
        super(570, 1600);
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
        return "DVD";
    }



    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
