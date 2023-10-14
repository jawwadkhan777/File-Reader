package Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("J:\\Documents\\DSA\\MyFile.txt"); //File path
        Scanner scan  = new Scanner(file); //scanning the file.
        String readFile = ""; //empty string.
        System.out.println("--------------File content--------------");
        int lineCount = 0;
        int wordCount = 0;
        int letterCount = 0;
        while (scan.hasNextLine()) {
            lineCount++; //count total number of lines occurring in the file.
            readFile = scan.nextLine(); //read line content of the file
            System.out.println(readFile); //print file content.
            String [] words = readFile.split(" ");
            wordCount = wordCount+words.length; //count total number of words occurring in the file.
            for (String  word : words) {
                char [] letters = word.toCharArray();
                for (char letter : letters) {
                    if (letter!='.') {
                        letterCount++; //count total number of letters occurring in the file.
                    }
                }
            }
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Number of lines occurring in the file: "+lineCount);
        System.out.println("Number of words occurring in the file: "+wordCount);
        System.out.println("Number of letters occurring in the file: "+letterCount);
    }
}
