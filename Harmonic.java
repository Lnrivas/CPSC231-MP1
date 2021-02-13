/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Mastery Project 1: Recursion and Intro to Classes - PART 1: Harmonic
 * The purpose of this program is to print the first twenty harmonic numbers twice, first iteratively and then recursively.
 * @version 1.0
 */
public class Harmonic {

  /**
    * Method finding the harmonic of the number passed in, iteratively
    * @param n int to find harmonic of
    * @return a double value representing the harmonic of parameter n
    */
  public static double calcIterativeHarmonic(int n) {
    double harmonic = 0;
    while (n > 0) {
      harmonic += (1.0/n);
      n--;
    }
    return harmonic;
  }

  /**
    * Method finding the harmonic of the number passed in, recursively
    * @param n int to find harmonic of
    * @return a double value representing the harmonic of parameter n
    */
  public static double calcRecursiveHarmonic(int n) {
    if (n <= 1) {
      return 1.0;
    }
    else {
      return (1.0/n) + Harmonic.calcRecursiveHarmonic(n - 1);
    }
  }

  /**
    * Loops through the numbers 1-20, passing each number to the calcIterativeHarmonic() method, returning and printing the harmonic of each number.
    * Then it loops through the numbers 1-20 again, passing each number to the calcRecursiveHarmonic() method, returning and printing the harmonic of each number.
    * @param args command-line arguments
    */
  public static void main (String [] args) {
    System.out.println("Iteratively: ");
    for (int i = 1; i <= 20; i++) {
      System.out.println("Harmonic(" + i + ") = " + Harmonic.calcIterativeHarmonic(i));
    }
    System.out.println("\nRecurseively: ");
    for (int i = 1; i <= 20; i++) {
      System.out.println("Harmonic(" + i + ") = " + Harmonic.calcRecursiveHarmonic(i));
    }
  }
}
