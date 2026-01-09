import java.util.Scanner;

public class console {
    // public static void main(String[] args) {
        
    //     // Create Scanner object for console input
    //     Scanner sc = new Scanner(System.in);
        
    //     // Read integer
    //     System.out.print("Enter an integer: ");
    //     int num = sc.nextInt();
    //     System.out.println("You entered: " + num);
    //     // Close scanner
    //     sc.close();
    // }
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("You have entered "+ n);
        // System.out.println("Half pyramid ");
        // for(int i = 0; i < n; i++) {
        //   for(int j = 0; j < n - 1 - i; j++) {
        //     System.out.print(" ");
        //   }
        //   for(int j = 0; j <= 0; j++) {
        //     for(int k = 0; k <= i; k++) {
        //       System.out.print(k+1);
        //     }
        //   }
        //   System.out.println();
        // } 
        // System.out.println();
        System.out.println("Full pyramid");
        for(int i = 0; i < n; i++) {
          for(int j = 0; j < n - 1 - i; j++) {
            System.out.print(" ");
          }
          for(int j = 0; j <= i; j++) {
            System.out.print("*");
          }
          for(int j = 0; j < i; j++) {
            System.out.print("*");
          }
          System.out.println();
        }
    }
}
