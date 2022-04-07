package edu.sdccd.cisc191;

public class ArrayConsumer {

    private String[] list;
    private int incrementor = 0;

    public ArrayConsumer(String[] list)
    {
        // TODO complete the constructor
        this.list = list;

    }

    public String consume()
    {
        // TODO change the returned value
        String test = list[incrementor];
        incrementor++;
        return test;
    }
}
