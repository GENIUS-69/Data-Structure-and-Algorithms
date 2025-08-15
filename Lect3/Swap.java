
import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // int a = 10;
    // int b = 20;

    // int temp = a;
    // a = b;
    // b = temp;

    swap(10, 20);
  }

  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.println("After Swap: a=" + a + " b=" + b);
  }
}
