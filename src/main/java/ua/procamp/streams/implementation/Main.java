package ua.procamp.streams.implementation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};

        List list = new ArrayList();
        list.add(-1);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        IntKeeper intKeeper = new IntKeeper(intArr);
        Iterator i = intKeeper.geiIterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
