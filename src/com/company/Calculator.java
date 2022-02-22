package com.company;
import java.util.function.*;

    public class Calculator {
        public static final Supplier<Calculator> instance = Calculator::new;

        public final BinaryOperator<Integer> plus = (x, y) -> x + y;
        public final BinaryOperator<Integer> minus = (x, y) -> x - y;
        public final BinaryOperator<Integer> multiply = (x, y) -> x * y;
        public final BinaryOperator<Integer> divide = (x, y) -> y == 0 ? 0 : x / y;
        public final UnaryOperator<Integer> pow = x -> x * x;
        public final UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
        public final Predicate<Integer> isPositive = x -> x > 0;
        public final Consumer<Object> println = System.out::println;
    }
