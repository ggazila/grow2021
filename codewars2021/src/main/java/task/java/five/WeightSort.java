//package task.java.five;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class WeightSort {
//
//    public static String orderWeight(String strng) {
//        List<String> collect = Stream.of(strng.split(" ")).map(String::trim)
//                .collect(Collectors.toList());
//
//        List<String> weight = collect.stream()
//                .map(s -> Arrays.stream(s.split("")).map(Integer::parseInt)
//                        .reduce(Integer::sum).map(String::valueOf).get())
//                .collect(Collectors.toList());
//        StringBuilder builder = new StringBuilder();
//
//        while (collect.size() > 0) {
//            String s = weight.stream().min(x->
//                    Comparator.comparing(value -> Integer.parseInt(x)).thenComparing(Comparator::thenComparing))
//                    .get();
//
//            int index = weight.indexOf(s);
//            builder.append(collect.get(index));
//            collect.remove(index);
//            weight.remove(index);
//        }
//        for (int i = 0; i < collect.size(); i++) {
//            System.out.println(collect.get(i) + "==" + weight.get(i));
//        }
//
//        return builder.toString();
//    }
//}
//
///*
//My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with the weights of members is published and each month he is the last on the list which means he is the heaviest.
//
//I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list". It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.
//
//For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.
//
//Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?
//
//Example:
//"56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:
//
//"100 180 90 56 65 74 68 86 99"
//When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering) and not numbers:
//
//180 is before 90 since, having the same "weight" (9), it comes before as a string.
//
//All numbers in the list are positive numbers and the list can be empty.
//
//Notes
//it may happen that the input string have leading, trailing whitespaces and more than a unique whitespace between two consecutive numbers
//For C: The result is freed.
//
// */
