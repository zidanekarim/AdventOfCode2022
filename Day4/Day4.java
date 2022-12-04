import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//import java.util.ArrayList;

public class Day4 {
    public static void main(String[] args) {
        File file = new File("input.txt");


        try {
            Scanner input = new Scanner(file);
            int sum = 0;
            while (input.hasNextLine()) {
            
                String line = input.nextLine();


                String[] splitLine = line.split(",");
                String[] splitLine2 = splitLine[0].split("-");
                String[] splitLine3 = splitLine[1].split("-");

                int lower1 = Integer.parseInt(splitLine2[0]);
                int upper1 = Integer.parseInt(splitLine2[1]);
                int lower2 = Integer.parseInt(splitLine3[0]);
                int upper2 = Integer.parseInt(splitLine3[1]);

                // if (lower1 <= lower2 && upper2 <= upper1 || lower2 <= lower1 && upper1 <= upper2) {
                //     sum++;
                // }

                if (lower1 <= lower2 && upper2 <= upper1 
                || lower2 <= lower1 && upper1 <= upper2
                || lower1 <= lower2 && lower2 <= upper1
                || lower1 <= upper2 && upper2 <= upper1
                
                ) {
                    sum++;
                }

                
            }
            
            input.close();
            System.out.println(sum);

           // System.out.println(sectionID.get(0));
           // System.out.println(sectionID.get(1));


        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

    }

}