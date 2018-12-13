import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Zadanie1 {

    public static void main(String[] args) {

        // Zadanie 1

        System.out.println("Zadanie 1");
        System.out.println(reverseString("Kamil"));

        // Zadanie 2
        System.out.println("Zadanie 2");
        System.out.println(countWords("Kamil Surma"));

        // Zadanie 3
        System.out.println("Zadanie 3");
        System.out.println(isInOrder(new int[]{1, 2, 3, 4, 4, 8, 9}));

        //Zadanie 4
        System.out.println("Zadanie 4");
        contains(new int[]{123,22,33,44} , 4);


        //Zadanie 5
        System.out.println("Zadanie 5");
        System.out.println(lognestWord("Ostanio w kinie oglądaliśmy bardzo dobrą komedię"));
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


    public static boolean isInOrder(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (numbers[i] < numbers[i + 1]) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    //Zadanie 4

public static boolean contains(int[] array, int n){
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
        if(array.length==n) {
            System.out.println(true);
            return true;

        }else {
            System.out.println(false);
return false;

        }
    }



    //Zadanie 5
    public static String lognestWord(String s) {
     String maxCiag =  Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
    return maxCiag;
    }

    }




