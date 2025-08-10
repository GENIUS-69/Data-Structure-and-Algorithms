
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Celsius = sc.nextFloat();
        float Farhenite = (Celsius * 9 / 5) + 32;
        System.out.println(Farhenite);
    }
}
