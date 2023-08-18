/*
Programmer:Hemang Shankar
*/

import java.util.Scanner; //Import the Scanner Class

class Main {
  public static void main(String[] args) {
  //Initialized variable
  String funnyNumber;

  Scanner myObj = new Scanner(System.in); //Creates a Scanner

    //Stores the number 
    System.out.print("\nEnter a number: ");
    funnyNumber = myObj.nextLine();
    
     //Repeatedly prompts the user to enter a valid number that 
    //is greater or equal to 0
    while(Integer.parseInt(funnyNumber) < 0 || Long.parseLong(funnyNumber) >= 2147483647){
      System.out.println("\nPlease enter a valid positive integer number from 0 to 2147483646 !");
      funnyNumber = myObj.nextLine();
    }
    

    //Creates an object
    FunNumber funny = new FunNumber(funnyNumber);
    
    //Prints all the information by calling the methods
    System.out.println("number of digits : " + funny.numDigits());
    System.out.println("sum of digits : " + funny.sumDigits());
    if (funny.isPerfect())
      System.out.println("number is perfect");
    else
      System.out.println("number is not perfect");
    if (funny.isPrime())
      System.out.println("number is prime");
    else
      System.out.println("number is not prime");
    System.out.println("number reversed is : " + funny.reverseNum());
  }
}

/*Test cases
Enter a number: 28
number of digits : 2
sum of digits : 10
number is perfect
number is not prime
number reversed is : 82
_____________________________________________________
Enter a number: 421
number of digits : 3
sum of digits : 7
number is not perfect
number is prime
number reversed is : 124
_______________________________________________________
Enter a number: 8365
number of digits : 4
sum of digits : 22
number is not perfect
number is not prime
number reversed is : 5638
*/
