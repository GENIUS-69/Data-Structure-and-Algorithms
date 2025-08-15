import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int sum=sumval(n);
    if (n==sum) {
      System.out.println("Armstrong");
    } else {
     System.out.println("Not Armstrong"); 
    }
  }

  static int sumval(int n) {
    int sum = 0, r;
    while (n != 0) {
      r = n % 10;
      sum = sum + (r * r * r);
      n = n / 10;
    }
    return sum;
  }
}
