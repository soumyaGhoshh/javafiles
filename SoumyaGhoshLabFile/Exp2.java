//finding factorial of a given number normal method

package SoumyaGhoshLabFile;
import java.util.Scanner;

public class Exp2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int fact = 1;
    System.out.println("Enter an integer: ");
    int num = sc.nextInt();
    if (num < 0) {
      System.out.println("Enter non negative integer.");
    } else {
      int original = num;
      for (int i = 1; i <= num; i++) {
        fact *= i;
      }
      System.out.println("The factorial of " + original + " is: " + fact);
    }
    sc.close();
  }
}

//factorial of a given number by recursive method

// public class Exp2 {

//     int factorial(int num){
//       if(num <= 1)
//         return 1;
//       else
//         return num * factorial(num-1);
//     }

//     public static void main(String args[]){
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter a number to check factorial: ");
//       int fact = sc.nextInt();
//       Exp2 exp = new Exp2();
//       System.out.println("Factorial of the given number is: " + exp.factorial(fact));
//       sc.close();
//     }
//   }