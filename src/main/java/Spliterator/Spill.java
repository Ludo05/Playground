package Spliterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Spliterator;

public class Spill {

    public static void main(String[] args) {

        Collection<Person> people = new ArrayList<>();
        people.add(new Person("L","Will"));
        people.add(new Person("ldldd","Jolly"));
        people.add(new Person("ldldd","Kolly"));
        people.add(new Person("ldldd","Dollu"));

        Spliterator<Person> peopleSpliterator = people.spliterator();
        System.out.println(" " + peopleSpliterator.characteristics());
        System.out.println(" " + peopleSpliterator.estimateSize());
        System.out.println(peopleSpliterator.trySplit());


    }
}
