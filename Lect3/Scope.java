public class Scope {
  public static void main(String[] args) {
    int a = 20;
    int b = 30;
    System.out.println(a + b);
  }
}
/*
 * Scope is defined as the restriction of value inside a codeblock enclosed by {}.
 * <className>{
 *    main(){
 *      value 1;<only accessed inside main>
 *    }
 *    fnc1(){
 *      Value 2; < only accesed inside this block>
 *    }
 * }
 * The Loops, Conditionals blocks have the scoping feature.
 */
