package Java;
import java.util.Arrays;
import java.util.Scanner;

public class Basics1 {
    public static void main(String[] args) {
        allNumbers();
        even();
        prime();
        square();
        charIdentifier();
    }

    static void allNumbers(){
        System.out.println("************ Print ALL numbers from 1 to 100.");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    static void even(){
        System.out.println("Print only even numbers from 1 to 100.");
        for (int i = 2; i <= 100; i=i+2) {
            System.out.println(i);
        }
        System.out.println();
    }

    static void prime() {
        System.out.println("Print all prime numbers below 100.");
        boolean isPrime = true;
        String primeNum = "";

        for (int i = 2; i <= 100; i++) {
            for (int x = 2; x <= i / 2; x++) {
                if (i % x == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeNum = primeNum + i + " ";
            }
            isPrime = true;
        }
        System.out.println(primeNum + "\n");
    }

    static void square(){
        System.out.println("Draw a box using the star character ('*').");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter size:");

        int size = input.nextInt();

        int last = size-1;

        String star = "* ";
        String space = "  ";

        for (int i = 0; i < size; i++){
            if (i == 0 || i == size-1) {
                for (int x = 0; x < size + 1; x++) {
                    System.out.print(star);
                }
                System.out.println();
            }
             else{
                    System.out.print(star);
                    for (int x = 0; x < size-1; x++){
                        System.out.print(space);
                    }
                    System.out.print(star + "\n");
            }
        }
        System.out.println();
    }

    static void charIdentifier(){
        System.out.println("Write a program that prints 'vowel' when the given character is a vowel, and print 'consonant' otherwise.\n" +
                "Bonus: also print 'number' when it is a number.");

        String[] vowels = {"A","E","I","O","U"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");

        char c = input.next().charAt(0);

        if (Character.isDigit(c)){
            System.out.println("Number");
        }
        else{
            String letter = Character.toString(c).toUpperCase();

            boolean contains = Arrays.stream(vowels).anyMatch(letter::equals);
            String result = contains ? "Vowel" : "Consonant";

            System.out.println(result);
        }
    }
}

