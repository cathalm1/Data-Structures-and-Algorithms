package Algorithms.Stack;

import java.util.*;
public class StackLargest {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String inputnumber=scan.nextLine();
        int commandnumber=Integer.parseInt(inputnumber);
        Stack myStack=new Stack(commandnumber);
        int start=0;
        int mylen=commandnumber;
        while(start<commandnumber)
        {
            String inputLine=scan.nextLine();
            String inputArray[]=inputLine.split(" ");
            if(inputLine.matches("PUSH.*"))
            {
                int stackNumber=Integer.parseInt(inputArray[1]);
                myStack.push(stackNumber);
            }
            else
            {
                mylen--;
                myStack.pop();
            }

            start++;
        }
        getLargest(myStack,mylen);
    }
    public static void getLargest(Stack myStack, int mylen)
    {
        if(myStack.isEmpty()==false)
        {
            int start=0;
            int largest=Integer.MIN_VALUE;
            while(start<mylen)
            {
                if(myStack.peek()>largest)
                {
                    largest=myStack.peek();
                    myStack.pop();
                }
                start ++;
            }
            System.out.println(largest);
        }
        else if(myStack.isEmpty()==true)
        {
            System.out.println("empty");
        }
    }
}
