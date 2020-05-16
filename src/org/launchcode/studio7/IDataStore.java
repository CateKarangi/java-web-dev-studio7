package org.launchcode.studio7;

public interface IDataStore {

    void WriteData(Object stuff);

    Object ReadData();

    int MaxData = 0;


}
