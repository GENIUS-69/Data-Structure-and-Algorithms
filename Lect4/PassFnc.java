
import java.util.Arrays;
import java.util.Scanner;

public class PassFnc {

  public static void change(int[] arr) {
    arr[0] = 99;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] num = { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.toString(num));
    change(num);
    System.out.println(Arrays.toString(num));
    
  }
}
