package edu.sdccd.cisc191;

import java.util.HashMap;

public class HashMapConsumer {

    private HashMap<String, String> list;

    public HashMapConsumer(HashMap<String, String> list) {
        this.list = list;
    }

    public String consume(String string) {
        String test = list.get(string);
        return test;
    }
}
