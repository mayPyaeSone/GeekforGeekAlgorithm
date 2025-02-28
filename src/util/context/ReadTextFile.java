/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.context;

/**
 *
 * @author User
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadTextFile {

    public static int[] txtFileToArray(String filePath) {
        // Specify the file path (modify this according to your directory)
        filePath = "C:\\Users\\User\\Desktop\\temp\\codeOutput.txt"; // Windows path
        // String filePath = "/path/to/your/file.txt"; // Linux/Mac path

        // Read the file
        List<Integer> numbersList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
            while ((line = br.readLine()) != null) {
                // Split the line by spaces and convert to integers
                String[] parts = line.trim().split("\\s+");
                for (String part : parts) {
                    numbersList.add(Integer.parseInt(part));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: File contains non-numeric values.");
        }
        // Convert List to an array
        int[] numbersArray = numbersList.stream().mapToInt(Integer::intValue).toArray();
        return numbersArray;
        // Print the array
//        System.out.println("Numbers in the file:");
//        System.out.println(Arrays.toString(numbersArray));
    }
}
