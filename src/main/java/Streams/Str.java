package Streams;


import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Str {

    public static void main(String[] args) {
        //You are able to chain consumers together using the Consumer methods.
        List<Integer> list = new ArrayList<>();
        Person p = new Person("Lewis",25);
        //  ------------------------------------------------------------------------------------
        Consumer<Integer> s = list::add;
        Consumer<Integer> s1 = System.out::println;

        Consumer<Integer> c2 = s.andThen(s1);

        c2.accept(4);
        c2.accept(55);
        //  ------------------------------------------------------------------------------------

        Predicate<Integer> p1 = n -> n > 20;
        Stream<Integer> stream = Stream.of(3,4,5,4,3,4,5,6,5,44,5,6,7);
        stream.map(n -> n * 2)
                .filter(p1)
                .forEach(System.out::println);
        //  ------------------------------------------------------------------------------------


        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(5);

        Stream<Integer> stream1 = list1.stream();
        Stream<Integer> filtered =
                stream1.filter(n -> n > 0);
        filtered.forEach(System.out::println);
        //  ------------------------------------------------------------------------------------


        Function<Person,Integer> function = (m) -> m.getAge();
        Function<Person,String> stringFunction = l -> l.getName();

        String word = String.join(",",stringFunction.apply(p),"Lewis");
        System.out.println(word);
        System.out.println(function.apply(p));

        //  ------------------------------------------------------------------------------------


        boolean b = list.removeIf( n -> n > 5);
        System.out.println(b);
        list.forEach(System.out::print);

    }
}
