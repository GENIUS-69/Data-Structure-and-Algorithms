import java.util.Scanner;

public class Method {
  public static void main(String[] args) {
    // Q: Take an input of two number and print Sum
    System.out.println(Sum2());
    System.out.println(sum3(10, 20));
  }

  static int sum3(int a, int b) {
    int sum = a+b;
    return sum;
  }

  public static int Sum2() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    return a + b;
  }

  public static void Sum() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(a + b);
  }
}