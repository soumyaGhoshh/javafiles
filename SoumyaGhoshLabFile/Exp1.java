//Check whether input character is vowel or consonant

// package SoumyaGhoshLabFile;
import java.util.Scanner;

public class Exp1 {
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a character: ");
  char ch = sc.next().charAt(0);

  String vowel = "aeiouAEIOU";        
  if(vowel.indexOf(ch) == -1)
    System.out.println("The char " + ch + " is a consonant.");
  else
    System.out.println("The character " + ch + " is a vowel.");
  sc.close();
  }
 }

 