package com.epam.mjc;

import java.util.LinkedList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> {
            List<Integer> integerList = new LinkedList<>();
            for (Integer i : list) {
                integerList.add(i / divider);
            }
            return integerList;
        };
    }
}
