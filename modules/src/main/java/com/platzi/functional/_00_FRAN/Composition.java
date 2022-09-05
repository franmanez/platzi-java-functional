package com.platzi.functional._00_FRAN;

import java.util.function.Function;

public class Composition {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy3 = x -> x * 3;
        Function<Integer, Integer> add1MultiplyBy3 =
                multiplyBy3.compose(y -> {
                    System.out.println("Le agregaré 1 a: " + y);
                    return y + 1;
                });

        Function<Integer, Integer> andSquare =
                multiplyBy3.andThen(y -> {
                    System.out.println("Estoy elevando a : " + y);
                    return y * y;
                });

        System.out.println(add1MultiplyBy3.apply(5));

        System.out.println(andSquare.apply(5));
    }
}
