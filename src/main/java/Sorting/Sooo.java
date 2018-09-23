package Sorting;

import java.util.stream.IntStream;

public class Sooo {

    public static void main(String[] args) {
        int[] m = {4,7,5,3,6,8,8,4,3,4,6,7,6,5,1,2,1,1,99};

        for (int i = m.length; i >= 0; i--) {
            for (int j = 0; j < m.length - 1 ; j++) {
                if(m[j] > m[j+1]){
                    int temp = m[j];
                    m[j] = m[j+1];
                    m[j+1] = temp;
                }
            }

        }
        IntStream.of(m)

                .forEach(System.out::print);

    }
}
