import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Day3 {
    public final String lowercase = "abcdefghijklmnopqrstuvwxyz";
    public final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public static void main(String[] args) {
    try {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        int sum = 0;
        // while (scanner.hasNextLine()) {
        //     String line = scanner.nextLine();
        //     int length = line.length();

        //     String halfOne = line.substring(0, length/2);
        //     String halfTwo = line.substring(length/2, length);
        //     for (int i = 0; i < halfOne.length(); i++) {
        //         if (halfTwo.contains(halfOne.charAt(i)+"")) {
                    
        //             if (Character.isUpperCase(halfOne.charAt(i))) {
        //                 sum += (int)halfOne.charAt(i) - 38;
        //             } else {
        //                 sum += (int)halfOne.charAt(i) - 96;
        //             }
        //         break;
        //         }
        //     }
        // }
        while (scanner.hasNextLine()) {
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            String line3 = scanner.nextLine();

            // get common char in all three lines
            for (int i = 0; i < line1.length(); i++) {
                if (line2.contains(line1.charAt(i)+"") && line3.contains(line1.charAt(i)+"")) {
                    if (Character.isUpperCase(line1.charAt(i))) {
                        sum += (int)line1.charAt(i) - 38;
                    } else {
                        sum += (int)line1.charAt(i) - 96;
                    }
                    break;
                }
            }

        }


        scanner.close();
        System.out.println(sum);
    } catch (FileNotFoundException e) {
        System.out.println("File not found!");
    }
    
    }
}