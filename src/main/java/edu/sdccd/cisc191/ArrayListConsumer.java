package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListConsumer
{
    private ArrayList<String> list;

    public ArrayListConsumer(ArrayList<String> list)
    {
        // TODO complete the constructor
        this.list = list;

    }

    public String consume()
    {
        // TODO change the returned value
        String test = list.get(0);
        list.remove(0);
        return test;
    }

}