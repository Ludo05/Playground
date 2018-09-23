package Generi;

import java.util.StringJoiner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Gen<Integer>  i = new Gen<>();
        Gen<String>  m = new Gen<>();

        i.add(3);
        i.add(5);
        m.add("Lewis");


        System.out.println(i.get());
        System.out.println(m.get());


        Integer[] am = {4,5,4,3,5,6,7,8};
        int[] me = {4,5,3,4,5,6,6,5,6,7,7};

        IntStream.of(me).forEach(System.out::print);

        StringJoiner stringJoiner = new StringJoiner(",","{","}");
        stringJoiner.add("Hello");
        stringJoiner.add("World");

        String mm = stringJoiner.toString();
        System.out.println(mm);

        StringBuilder stringBuilder = new StringBuilder();
        String lewis = "Lewis";
        for (char c:
             lewis.toCharArray()) {
            stringBuilder.append(c);
            System.out.println(c);
        }


        array(am);

    }


    public static <E> void array(E[] arr){
        for (E t:
             arr) {
            System.out.print(t + " ");

        }
    }
}
