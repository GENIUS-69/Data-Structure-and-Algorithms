
import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int p = 0;
    int q = 1;
    System.out.println(p + "\n" + q + "");

    for (int i = 3; i <= n; i++) {

      int sum = p + q;
      p = q;
      q = sum;
      System.out.println(sum + " ");
    }

  }
}
