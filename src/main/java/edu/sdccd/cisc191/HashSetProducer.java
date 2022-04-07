package edu.sdccd.cisc191;

import java.util.HashSet;

public class HashSetProducer {

    private HashSet<String> list;

    public HashSetProducer(HashSet<String> list) {
        this.list = list;
    }

    public boolean produce(String string) {
        if (list.contains(string))
            return false;
        else {
            list.add(string);
            return true;
        }
    }
}
