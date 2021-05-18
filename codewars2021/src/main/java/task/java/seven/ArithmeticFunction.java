package task.java.seven;

import java.util.function.Function;

class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        Function<String, Integer> function = (o) -> {
            switch (o) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            }
            return a / b;
        };

        return function.apply(operator);
    }
}

/*
Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.

a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.

The four operators are "add", "subtract", "divide", "multiply".

A few examples:

arithmetic(5, 2, "add")      => returns 7
arithmetic(5, 2, "subtract") => returns 3
arithmetic(5, 2, "multiply") => returns 10
arithmetic(5, 2, "divide")   => returns 2.5
ArithmeticFunction.arithmetic(5, 2, "add")      => returns 7
ArithmeticFunction.arithmetic(5, 2, "subtract") => returns 3
ArithmeticFunction.arithmetic(5, 2, "multiply") => returns 10
ArithmeticFunction.arithmetic(5, 2, "divide")   => returns 2
 */
