import java.util.List;

public class Zadanie2 {

    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        System.out.println(endWith("Kamil Surma" , "ma"));
        System.out.println("Zadanie 2");
        System.out.println(firstHalf("Mój kot wabi się Tygrys"));
        System.out.println("Zadanie 3");
        System.out.println(countUpperCase("Kamil Surma"));
        System.out.println("Zadanie 4");
        System.out.println(remove("TekstX maX dziesiećX znaków" , 'X'));
        System.out.println("Zadanie 4 wersja  z Replace");
        System.out.println(removeWithReplace("TekstX maX pięćX znaków", 'X'));
    }



    // Zadanie 1

public static boolean endWith(String s , String substring) {
       int sizeString =  s.length();
       int sizeSubstring= substring.length();
       if (s.substring(sizeString - sizeSubstring).equals(substring)){
           return true;
       }else {
           return false;
       }
}

// Zadanie 2
public static String firstHalf(String s) {
        int sizeString = s.length();
        int halfString = sizeString/2;
        String firstString = s.substring(0 ,halfString);
        return firstString;


}


   // Zadanie 3


    public static int countUpperCase(String s){
        int counter=0;
         for (char c: s.toCharArray()) {
                if(Character.isUpperCase(c)){
                    counter++;
                    //  counter += Character.isUpperCase(c) ? 1:0;
                }
            } return counter;
        }


        // Zadanie 4
    public static String remove(String str, char x){
        StringBuilder strBuilder = new StringBuilder();
        char[] rmString = str.toCharArray();
        for(int i=0; i<rmString.length; i++){
            if(rmString[i] == x){

            } else {
                strBuilder.append(rmString[i]);
            }
        }
        return strBuilder.toString();
    }

    // Zadanie 4 wersja z replace
    public static String removeWithReplace(String str, char x){
        String stringToReplace = Character.toString(x);
        return  str.replace(stringToReplace , "");

    }


}



