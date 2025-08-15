public class ThreeArmstrong {
  public static void main(String[] args) {
    for (int i = 100; i <= 999; i++) {
      int sum = sumval(i);
      if (i == sum) {
        System.out.println(i);
      }
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
