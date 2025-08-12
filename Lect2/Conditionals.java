public class Conditionals {
  public static void main(String[] args) {
    /*
     * if(boolean Expression True or False){
     * Conditions 1
     * }else{
     * Condition 2
     * }
     */
    int salary = 25400;
    // if (salary > 10000) {
    // salary += 2000;
    // } else {
    // salary += 1000;
    // }
    // System.out.println(salary);
    /*
     * Multiple if else
     * if (condition) {
     * 
     * } else if(){
     * 
     * }else{
     * 
     * }
     */
    if (salary > 20000) {
      salary += 5000;
    } else if (salary > 10000) {
      salary += 3000;
    } else {
      salary += 1000;
    }
    System.out.println(salary);

  }
}
