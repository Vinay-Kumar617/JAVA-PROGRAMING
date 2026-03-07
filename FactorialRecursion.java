package javaprogrmas;
import java.util.Scanner;
public class FactorialRecursion {
  public  static int factorial(int num) {
	  if(num==0  || num==1) {
		  return 1;
	  }
	  else if(num<0) {
		  return -1;
	  }
	  else {
	  int fact=1;
	  return num*factorial(num-1) ;
	  }
  }
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any  number: ");
	int num=sc.nextInt();
	System.out.println("The Factorial of the given number :"+ factorial(num));
	
}
}
