package Java;

import java.util.Arrays;

public class Basics2 {
    public static void main(String[] args){
        descendingStars();
        ascendingNumbers();
        predecesors(7);
        reverse();
        isPalindrome("Civic");
        toHex("A");
    }

    static void descendingStars() {
        for (int i=7; i >= 1; i--){
            char[] c = new char[i];
            Arrays.fill(c, '*');
            System.out.println(new String(c));
        }
    }

    static void ascendingNumbers() {
//        String n = "";
//        String str = "*******";
//        for (int x = 1; x <= 7; x++){
//            n = n + Integer.toString(x);
//            str = str.substring(0, str.length() - 1);
//            System.out.println(n + str);
//        }
        for (int i = 1; i <= 7; i++)
        {
            for (int j = 1; j <= i; ++j)
                System.out.print(j);

            for (int k = 7 - i; k >= 1; k--)
                System.out.print("*");

            System.out.println();
        }
    }

    static void predecesors(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
            System.out.println(i + " - " + sum);
        }
    }

    static void reverse(){
        String n = "123456";

        char[] num = n.toCharArray();

        for (int i = num.length-1; i>=0; i--){
            System.out.print(num[i]);
        }
    }

    static void isPalindrome(String str){
        String word = str.toLowerCase();
        int i = 0, j = word.length() - 1;
        boolean palindrome = true;

        while (i < j) {

            if (word.charAt(i) != word.charAt(j))
                palindrome = false;

            i++;
            j--;
        }
        if(palindrome){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("It's not a palindrome.");
        }
    }

    static void toHex(String hex){
        int decimal=Integer.parseInt(hex,16);
        System.out.println(decimal);
    }
}
