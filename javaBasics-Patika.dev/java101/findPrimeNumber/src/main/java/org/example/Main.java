package org.example;


public class Main {
    public static void main(String[] args) {

        int num = 100;
        boolean isPrime = true;

        for (int i = 2; i <= num ; i++) {

            for (int j = 2; j < i ; j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
            isPrime = true;
        }





    }
}