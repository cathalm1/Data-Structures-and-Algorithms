package Algorithms.PriorityQueue;
//this is a priority que that takes in the elements in alphabetical order
//and then sorts the elements in order of length
import Algorithms.PriorityQueue.PriorutyQue;

import java.util.Scanner;

public class PriorityQueueControl {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);

        String n=scan.nextLine();
        int num=Integer.parseInt(n); //num the number of commands taken in
        PriorutyQue q=new PriorutyQue(200); //GREATEST possible size is 200

        int start=0;

        while(start<num) //reading in the commands starts at 0 and continues until one less than num
        {
            String input=scan.nextLine();
            if(input.matches("INSERT.*"))
            {
                String ar[]=input.split(" ");
                q.insert(ar[1]);
            }
            else if(input.matches("REMOVE.*"))
            {
                q.remove();
            }
            start++;
        }
        //System.out.println(q.remove()); //printing all the elements in the priority que FIRST ELEMENT
        //remove all elements now in priority que
        while (q.isEmpty()==false){
            System.out.println(q.remove()); //printing all the elements in the priority que ALL ELEMENTS
        }
    }
}
