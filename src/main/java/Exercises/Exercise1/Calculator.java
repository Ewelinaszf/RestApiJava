package Exercises.Exercise1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

    }


    public int takeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();
        return number;
    }
}
