package Exercises.Exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        int age= takeNumber();
        if (age<18) {
            System.out.println("Nie możesz kupić alkoholu");
        }else
            System.out.println("Dziękuję za zakupy");

    }
    public static int takeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int number = 0;
        try {
            number = scanner.nextInt();
        }catch (InputMismatchException exception){
            System.out.println("Niepoprawny format");
        }
        return number;
    }

}
