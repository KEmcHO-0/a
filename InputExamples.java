import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class InputExamples {
    public static void main(String[] args) throws IOException {
        
        // ============================================
        // 1. CONSOLE INPUT using Scanner (Most Common)
        // ============================================
        System.out.println("=== 1. Scanner Input ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (Scanner): ");
        int num1 = scanner.nextInt();
        System.out.println("You entered: " + num1 + "\n");

        // ============================================
        // 2. CONSOLE INPUT using BufferedReader
        // ============================================
        System.out.println("=== 2. BufferedReader Input ===");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number (BufferedReader): ");
        int num2 = Integer.parseInt(br.readLine());
        System.out.println("You entered: " + num2 + "\n");

        // ============================================
        // 3. GUI INPUT using JOptionPane
        // ============================================
        System.out.println("=== 3. GUI Input (JOptionPane) ===");
        String guiInput = JOptionPane.showInputDialog("Enter a number (GUI):");
        int num3 = Integer.parseInt(guiInput);
        System.out.println("GUI input received: " + num3 + "\n");
        JOptionPane.showMessageDialog(null, "You entered: " + num3);

        // ============================================
        // 4. COMMAND LINE ARGUMENTS (args[])
        // ============================================
        System.out.println("=== 4. Command Line Arguments ===");
        if (args.length > 0) {
            System.out.println("Arguments received:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("  args[" + i + "] = " + args[i]);
            }
        } else {
            System.out.println("No command line arguments. Run with: java InputExamples arg1 arg2");
        }
        System.out.println();

        // ============================================
        // 5. FILE INPUT using BufferedReader
        // ============================================
        System.out.println("=== 5. File Input ===");
        // First, create a sample file
        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Hello from file!\nThis is line 2.\nLine 3 here.");
        fw.close();
        System.out.println("Created sample.txt");

        // Now read from the file
        BufferedReader fileReader = new BufferedReader(new FileReader("sample.txt"));
        String line;
        System.out.println("Reading from sample.txt:");
        while ((line = fileReader.readLine()) != null) {
            System.out.println("  " + line);
        }
        fileReader.close();
        System.out.println();

        // ============================================
        // 6. FILE INPUT using Scanner
        // ============================================
        System.out.println("=== 6. File Input with Scanner ===");
        Scanner fileScanner = new Scanner(new File("sample.txt"));
        System.out.println("Reading with Scanner:");
        while (fileScanner.hasNextLine()) {
            System.out.println("  " + fileScanner.nextLine());
        }
        fileScanner.close();

        // Cleanup
        scanner.close();
        System.out.println("\n=== All examples completed! ===");
    }
}
