package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayProducer {

    private String list[];

    public ArrayProducer(String list[])
    {
        // TODO complete the constructor
        this.list = list;

    }

    public void produce(int i, String string)
    {
        list[i] = string;
    }
}
