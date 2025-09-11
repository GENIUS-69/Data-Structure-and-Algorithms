import java.util.Arrays;
import java.util.Scanner;

public class InputArr {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] arr = new int[5];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println();

    for (int i : arr) {
      System.out.println(i);
    }

    System.out.println(Arrays.toString(arr));
  }
}
