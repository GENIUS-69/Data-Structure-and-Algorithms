
import java.util.Scanner;

public class CountingOccurence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), c = 0, x = sc.nextInt();

    while (n != 0) {
      int t = n % 10;
      if (t == x) c++;
      n=n/10;
    }
    System.out.println("Occurence = "+ c);
  }
}
