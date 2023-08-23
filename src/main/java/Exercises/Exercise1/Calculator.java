package Exercises.Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int a = takeNumber();
        int b = takeNumber();
        System.out.println("Suma liczb to "+(a+b));
    }


    public static int takeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = 0;
        try {
            number = scanner.nextInt();
        }catch (InputMismatchException exception){
            System.out.println("Niepoprawny format");
        }
        return number;
    }
}
