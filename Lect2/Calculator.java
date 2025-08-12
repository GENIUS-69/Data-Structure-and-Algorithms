
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      char op = sc.next().trim().charAt(0);
      if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
        // input two number
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (op == '+') {
          System.out.println(n1 + n2);
        }
        if (op == '-') {
          System.out.println(n1 - n2);
        }
        if (op == '*') {
          System.out.println(n1 * n2);
        }
        if (op == '/') {
          System.out.println(n1 / n2);
        }
        if (op == '%') {
          System.out.println(n1 % n2);
        }
      } else if (op == 'x') {
        break;
      } else {
        System.out.println("Wrong input...");
        continue;
      }
    }
  }
}
