import java.util.ArrayList;

public class Zadanie1 {

    public static void main(String[] args) {

        // Zadanie 1

        System.out.println(reverseString("Kamil"));

        // Zadanie 2
        System.out.println(countWords("Kamil Surma"));

        int[] intArray = new int[] {4,5,6,7,8};
        System.out.println(isInOrder(new int[] {1,2,3,4,4,8,9}));



    }

// Zadanie 1

    private static String reverseString(String s) {

        return new StringBuilder(s).reverse().toString();
    }
// Zadanie 2

    private static int countWords(String s) {

        int liczba = s.toCharArray().length;
        return liczba;
    }

// Zadanie 3


    public static int isInOrder(int[] numbers) {
         for (int i = 0; i < numbers.length; i++) {
                  }return  numbers.length;
    }

}

