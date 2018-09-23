package Arrays;

import java.util.Arrays;

public class Arr {

    /**
     * Created by Sony VAIO on 08/12/2015.
     */

        int k;
        int[] randomArray = new int[20];
        String[] string = {"Joe", "Joseph", "Lewis", "Mike"};




        public void StringRandomarray() {
            for(int r : randomArray){
                System.out.print(r);
            }

        }

        public void numberArray(int[] numberArray) {
            for (int i = 0; i < numberArray.length; i++) {
                numberArray[i] = i;
                System.out.println(i);
            }
        }

        public void oneDbox(int[] numArray) {
            k = 1;
            while (k < 22){
                System.out.print('-'); k++; }
            System.out.println();
            for(int j = 0; j < numArray.length;j++){
                System.out.print("|" + j);
            }
            System.out.println("|");
        }

        public void twoDbox(String[][] twoDArray){
            for(int i = 0; i < twoDArray.length;i++){
                for(int j = 0; j < twoDArray[i].length;j++){
                    twoDArray[i][j] = + i + " " + j;
                }
            }

            k = 1;
            while (k < 52){
                System.out.print('-'); k++;
            }
            System.out.println();

            for(int i = 0; i < twoDArray.length;i++){
                for(int j = 0; j < twoDArray[i].length;j++) {
                    System.out.print("|" + twoDArray[i][j] + " ");
                }
                System.out.println("|");

            }
            k = 1;
            while (k < 52){
                System.out.print('-'); k++;
            }
            System.out.println();
        }

        public void ThreeDArray(String[][][] ThreeArray) {
            for (int a = 0; a < ThreeArray.length; a++) {
                for (int b = 0; b < ThreeArray[a].length; b++) {
                    for (int c = 0; c < ThreeArray[b][c].length; c++) {
                        ThreeArray[a][b][c] = "|" + a + b + c + "|";
                    }
                }
            }

            k = 1;
            while (k < 100) {
                System.out.print('-');
                k++;
            }

            for (int a = 0; a < ThreeArray.length; a++) {
                for (int b = 0; b < ThreeArray[a].length; b++) {
                    for (int c = 0; c < ThreeArray[a][b].length; c++) {
                        System.out.println("|" + ThreeArray[a][b][c]+ " ");
                    }

                }
            }
            System.out.print("|");

            k = 1;
            while (k < 100) {
                System.out.print('-');
                k++;

            }
        }

        public void enchanedArray(int[] row){
            for(int r : row){
                System.out.print("|" + r + "|");


            }


        }

        public void copyArray(){
            int[]  numberCopy = java.util.Arrays.copyOf(randomArray,4);
            for(int r : numberCopy){
                System.out.print(r);


                System.out.println(Arrays.copyOfRange(randomArray, 4, 10));

            }
        }
    }

