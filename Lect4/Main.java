public class Main {
  public static void main(String[] args) {
    // syntax
    // datatype[] variable = new datatype[size];

    int[] arr = new int[5];
    int[] arr2 = { 1, 2, 3, 4, 5 };

    int[] ros; // declaration of array. defined in the stack
    ros = new int[5]; // initialization. actually object is created in heap memory

    String[] arrstr = new String[5];
    System.out.println(arrstr[0]); //null
  }
}