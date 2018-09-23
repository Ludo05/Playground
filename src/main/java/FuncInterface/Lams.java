package FuncInterface;

import Threads.Thr;

import java.util.Comparator;
import java.util.stream.IntStream;

public class Lams {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 5, 4, 5, 6, 5, 4, 6, 7, 7, 85};
        Answerable answerable = () -> {
            return "Hello";
        };
        System.out.println(answerable.answer());


        java.util.function.Predicate<Integer> number1 = (n)  -> n % 2 != 0;
        System.out.println(number1.test(5));


        Predicate number = (n) -> n % 2 != 0;

        System.out.println(number.number(2));

        Predicate num = (n) -> n == 5;

        System.out.println(num.number(5));


        SendString sendString = (s) -> s;

        System.out.println(sendString.Print("Hello World"));


        twoStrings m = (one, two) -> System.out.println(one + " " + two);
        m.strings("Lewis", "Williams");

        IntStream.of(array).filter(n -> n > 2)
                .map(n -> n * 2)
                .forEach(System.out::println);

        IntStream.range(1, 66)
                .forEach(System.out::print);


        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
            }

        };

        Thread thread = new Thread(runnable);
        thread.start();

        Comparator<Integer> i = Comparator.comparingInt(a -> a);

        System.out.println(i.compare(4,6));
    }
}

