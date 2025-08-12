
import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Q1 Print number from 1 to 5
    /*
     * Syntax:
     * For(initialization, condition, increament/decreament){
     * // body
     * }
     */

    /*
     * while (condition) {
     * //body
     * }
     */

    int num = 1;
    while (num <= 5) {
      System.out.println(1);
      num++;
    }
    // Run while loop when i dont know how many times the loop is going to run.

    /*
     * do {
     * // Body
     * } while (true);
     */
    do {
      System.out.println(num);
      num++;
    } while (num <= 5);
  }
}
