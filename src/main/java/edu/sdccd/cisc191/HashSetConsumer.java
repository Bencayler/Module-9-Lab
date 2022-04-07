package edu.sdccd.cisc191;

import java.util.HashSet;

public class HashSetConsumer {

    private HashSet<String> list;

    public HashSetConsumer(HashSet<String> list) {
        this.list = list;
    }

    public boolean consume(String string) {
        if (list.contains(string)) {
            list.remove(string);
            return true;
        }
        else
            return false;
    }
}
