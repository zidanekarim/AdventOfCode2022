import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;//import java.util.Hashtable;
import java.util.ArrayList;

public class Day1 {
    public static void main(String[] args) {
        File input = new File("input.txt");
        int currentCalorie = 0;
        ArrayList<Integer> calorieTable = new ArrayList<Integer>();
        try {
            Scanner sc = new Scanner(input);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (!line.equals("")) {
                    currentCalorie += Integer.parseInt(line);
                   
                } else {
                    calorieTable.add(currentCalorie);
                    currentCalorie = 0;
                }
                
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        // get top 3 max of calorieTable
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        for (int i = 0; i < calorieTable.size(); i++) {
            if (calorieTable.get(i) > max1) {
                max3 = max2;
                max2 = max1;
                max1 = calorieTable.get(i);
            } else if (calorieTable.get(i) > max2) {
                max3 = max2;
                max2 = calorieTable.get(i);
            } else if (calorieTable.get(i) > max3) {
                max3 = calorieTable.get(i);
            }
        }
        
        System.out.println(max1+max2+max3);
        

    }
}
