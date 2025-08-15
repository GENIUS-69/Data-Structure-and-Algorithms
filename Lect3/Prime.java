import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(),c=0;

    for (int i = 1; i <= n; i++) {
      if (n%i==0) {
        c++;
      }
    }
    if (c==2) {
      System.out.println("Number is Prime");
    } else {
      System.out.println("Number is not prime");
    }
  }
}
