package Algorithms.Queue;
import java.util.*;
public class QueueAlgorithm {
    public static void main(String args[])
    {
        Queue myQue=new Queue(20);
        Scanner scan=new Scanner(System.in);
        String input;
        int removecounter=0;

        while((input=scan.nextLine())!=null)
        {
            if(input.equals(""))
            {
                break;
            }
            if(input.matches("INSERT.*"))
            {
                String ar[]=input.split(" ");
                myQue.insert(ar[1]);
            }
            else if(input.matches("REMOVE.*"))
            {
                myQue.remove();
                removecounter++;
            }
        }
        //find median value
        //EVEN
        if(myQue.size()%2==0)
        {
            int s=myQue.size()/2;
            System.out.println("Size EVEN  "+myQue.size());
            System.out.println(myQue.getElement(s+removecounter));
        }
        //ODD
        else if(myQue.size()%2==1)
        {
            int s=myQue.size()/2;
            System.out.println("Size ODD  "+myQue.size());
            System.out.println(myQue.getElement(s+removecounter+1));
        }
    }
}
