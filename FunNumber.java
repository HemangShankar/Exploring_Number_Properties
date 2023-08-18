//Creates and manipulates a number
public class FunNumber
{
  private String myNum;

  /*Constructs a FunNumber representation of the String by parsing the string argument and returning it as an integer
  */
  public FunNumber(String n){
    myNum = n;
  }

  //Returns the number of digits in the Fun Number
  public int numDigits(){
    int count = 0;
    int temp =Integer.parseInt(myNum);
    /*Uses while loop and Integer division to increment the       number of digits by removing the last digit of the integer
    */
    while(temp != 0){
      temp = temp / 10;
      count++;
    }
    return count;
  }
  //returns the sum of the digits in the FunNumber
  public int sumDigits(){
    int sum = 0;
    int temp =Integer.parseInt(myNum);
    /*Uses While loop and Modulus loop to get the last digit     and add it to the Sum. Then we shorten the number by using integer division. 
    */
    while(temp != 0){
      sum += temp % 10;
      temp = temp /10;
    }
    return sum;
  }

  //Determines if this FunNumber is perfect
  public boolean isPerfect()
  {
    int sumOfFactors = 0;
    int temp =Integer.parseInt(myNum);
    //Uses for loop to first find the factors using the modulus
    //After finding the factor, it adds it to the sum of factors 
    //variable
    for(int i = 1; i < temp;i++){
      if(temp % i == 0){
        sumOfFactors += i;
      }
    }

    //If the sum of the number's factors equals to the number itself
    //then the number is prime and it returns true, else it returns
    //false
    if(sumOfFactors == temp){
      return true;
    }
    else{
      return false;
    }
  }
  
  //Determines if this FunNumber is prime
  public boolean isPrime(){
    int temp =Integer.parseInt(myNum);
    //If the number is belove 1, it returns false
    if(temp <= 1){
      return false;
    }
    //Uses for loop to go through the factors of the given 
    //number and validate if it is a factor using the help 
    //of modulus. If the number is divisible by the value of 
    //i, this proves that there is a factor, thus returning 
    //false. If there are no factors found in the loop,
    //the program returns true;
    for(int i = 2; i<= temp/2; i++){
      if(temp % i == 0){
        return false;
      }
    }
    return true;
  }

  //Returns the FunNumber whose digits are in the reverse
  //order of the digits in this FunNumber
  public FunNumber reverseNum()
  {
    String reverseNum = "";
    char ch;

    //Loops through the whole number
    for (int i=0;i<myNum.length();i++)
      {
        //Stores each number as a string into ch
        ch = myNum.charAt(i);
        //Adds the number as a string to the variable
        reverseNum = ch + reverseNum;
      }
    myNum = reverseNum;
    return this;
  }

  //Returns the string representation of this FunNumber
  public String toString(){
    return  "" + myNum;
  }
}
