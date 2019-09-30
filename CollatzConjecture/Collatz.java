package Algorithms.CollatzConjecture;
/*
  Collatz Conjecture states that when we start off with any positive integer number X,
  we check to see if this number is even or odd,
  if even we divide the number 2,
  if odd we multiply by 3 and add 1,
  if these steps are repeated we will always reach one.
 */

import java.util.*;
public class Collatz {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        long startNumber=scan.nextLong(),counter=0;
        System.out.println("Counter  "+calculation(startNumber,counter));
    }
    public static long calculation(long input,long counter){
        if(input==1)return counter; //Returns counter once complete
        if (input % 2 == 0) {      //If input is even
            input /= 2;           //Divide the input by two
        } else if (input % 2 == 1) { //If the input is odd
            input = input * 3 + 1;   //Multiply the input by 3 and add 1
        }
        counter++;
        return calculation(input,counter);   //Recursive method runs until the input is equal 1
    }
}
