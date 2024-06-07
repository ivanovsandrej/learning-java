package lv.acodemy.classroom;

public class PlayWithMethods {
    public static void main(String[] args) {
        greeting("Andrej");

        System.out.println(add(20, 10));

        System.out.println(iseven(47));

        System.out.println(findMax(23, 21));
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome("ded"));
        System.out.println(isPalindrome("univercity"));
    }

    public static void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }

    public static boolean iseven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int findMax(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            return numberOne;
        } else {
            return numberTwo;
        }

    }

    // palindrome (kayak, civic, rotator, madam)
    public static boolean isPalindrome(String word) {
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
        return word.equals(reverseWord);
    }
}
