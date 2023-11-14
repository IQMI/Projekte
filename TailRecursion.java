public class TailRecursion {

  // Compute power 2^n recursively.
  //
  // The computation must use _tail recursion_!
  // Note: This requires the implementation of a tail recursive
  //       auxiliary method that is called by pow2()!)
  //

  /*
   public static int powI(int a, int n){

      int potenz = a;
      if (n==0) return 1;
      else {
          for (int i=1; i<n ; i++){
          potenz = potenz * a;
        }
      }
      return potenz;
   }
      public static int powR(int k, int n){
          if (n==0) return 1;
          else return k* powR(k, n-1);
      }

   */


  private static int _pow2(int count, int value) {
    if (count == 0) return value;
    return _pow2(count -1, value * 2);
  }

  public static int pow2(int n) {
    return _pow2(n, 1);
  }

  /*
  public static int sumF1 (int n){
  int teilersumme = 0;
  int x;

  for (int i = 1; i < n; i++){
      x = n % i;
      if (x == 0){
          teilersumme += i;
          }
       }
       return teilersumme;
  }
   */

/*
public static int sumfR(int n, int i, int summe){
      if(n==0) return 0;
      if (i>n/2) return summe;
      else if (n%i ==0) return sumfR(n, i+l, summe+i);
      eles return summe;

    }
 */


  public static int _sumFactors(int n, int i, int sum) {
    if (i > n / 2) return sum;
    if(n % i == 0){
      sum += i;
    }
    return _sumFactors(n, i + 1, sum);
  }
  // Compute the sum of factors (divisors) of n
  // The factors include 1 but exclude n, e.g., sumFactors(6) ==
  // 1+2+3 == 6 .
  //
  // The computation must use _tail recursion_!
  //
  public static int sumFactors(int n) {
    if (n==0) return 0;
    else return _sumFactors(n, 1, 0);
  }

  // Test your implementation.
  //
  public static void main(String[] args) {
    System.out.println(pow2(5));
    System.out.println(sumFactors(6));
    System.out.println(sumFactors(12));
  }
}