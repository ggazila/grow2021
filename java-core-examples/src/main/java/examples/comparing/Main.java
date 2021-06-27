package examples.comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Person sergey = new Person("Sergey", 27);
        Person sergeyClone = new Person("Sergey", 23);
        Person veronika = new Person("Veronika", 23);

        Person[] people = new Person[3];
        people[0] = sergey;
        people[1] = veronika;
        people[2] = sergeyClone;

//        Arrays.sort(people);
//        System.out.println(Arrays.toString(people));

        Comparator<Person> myComparator = Comparator
                .comparing(Person::getName)
                .thenComparing(Person::getYear).reversed();

        System.out.println(Arrays.toString(people));
        Arrays.sort(people,myComparator);
        System.out.println(Arrays.toString(people));

        Stream.of(people)
                .sorted(Comparator.comparing(Person::getName))
                .sorted(Comparator.comparing(Person::getYear).reversed())
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
