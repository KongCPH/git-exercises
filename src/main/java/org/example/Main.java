package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if(i % 5 == 0){
                System.out.print("Buzz");
            }

            System.out.println("i = " + i);
        }
    }
}