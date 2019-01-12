import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Lekcja4 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("doskonale.txt")) ) {
            String[] data;
            String line;
            int i;
            while ((line = br.readLine()) != null) {
                data = line.split("\\s+");
                    for(String s : data) {
                    i = Integer.parseInt(s);
                    if(sumOfDividers(i)==i){
                        System.out.println(i + " jest doskonala");
                    }

                }
            }

        }catch (Exception e) {

            e.printStackTrace();
        }


    }

    public static int sumOfDividers(int n) {
        int sum=0;

        for (int i=1;i<=n/2; i++) {
            if (n%i==0){
                sum +=i;
            }

        }
        return sum;
    }

    public static void countOfDividers() {

        try {

            List<String> lines  = Files.readAllLines(Paths.get("doskonale.txt"));


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
