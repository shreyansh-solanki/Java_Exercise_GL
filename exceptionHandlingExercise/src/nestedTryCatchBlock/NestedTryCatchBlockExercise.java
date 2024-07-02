package nestedTryCatchBlock;

import java.io.*;

//Write a program that reads a file path from the user and
// attempts to open the file. Handle both FileNotFoundException and IOException.
public class NestedTryCatchBlockExercise {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the file path: ");
        String filePath = null;
        try {
            filePath = reader.readLine();
            FileReader fileReader = new FileReader(filePath);

            System.out.println("File Read successfully!!");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing input stream: " + e.getMessage());
            }
        }
    }
}
