package com.platzi.functional._00_FRAN;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<Integer, Integer> fsquare = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println(fsquare.apply(4));

        Function<Integer, Integer> fsquare2 = x -> x * x;
        System.out.println(fsquare2.apply(4));

    }
}
