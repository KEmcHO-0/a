import java.io.*;
import java.util.Scanner;

public class file {
    // public static void main(String[] args) throws IOException {
    //     // Read integer from file using Scanner
    //     Scanner sc = new Scanner(new File("input.txt"));
    //     int num = sc.nextInt();
    //     sc.close();
        
    //     System.out.println("Read from file: " + num);
    // }
    public static void main(String[] args) throws IOException{
      Scanner sc = new Scanner(new File("input.txt"));
      int number = sc.nextInt();
      sc.close();
      System.out.println("The number is : " + number);

    }
}
