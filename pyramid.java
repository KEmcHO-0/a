
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pyramid {
  public static void main(String[] args) throws IOException {
      System.out.println("Enter a number");
      InputStreamReader in = new InputStreamReader(System.in);
      BufferedReader bf = new BufferedReader(in);
      String input = bf.readLine();
      int n = Integer.parseInt(input);
      System.out.println(n);
  }
}
