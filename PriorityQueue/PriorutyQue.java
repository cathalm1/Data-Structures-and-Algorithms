package Algorithms.PriorityQueue;

public class PriorutyQue {
    private int queSize;
    private String quearray[];
    private int nItems;

    public PriorutyQue(int s)
    {
        queSize=s;
        quearray=new String[queSize];
        nItems=0;
    }
    public void insert(String word)
    {
        if(nItems==0)
        {
            quearray[0]=word;
        }
        else
        {
            int j=nItems;
            while(j>0&&quearray[j-1].compareToIgnoreCase(word)<0)
            {
                quearray[j]=quearray[j-1];
                j--;
            }
            quearray[j]=word;
        }
        nItems++;
        // to order the array by length
        lengthOrder();
    }
    //removes the item in the front of the priority que and also decreases the number of items in the array
   public String remove()
   {
       if(isEmpty()){
           return null;
       }
       return quearray[--nItems];
   }

    public boolean isEmpty()
    {
        return(nItems==0);
    }
    public boolean isFull()
    {
        return(nItems==queSize);
    }
    public int size()
    {
        return nItems;
    }

    //length order is a sorting algorithim (bubble sort)from a previous lab
    public String[] lengthOrder()
    {
        for(int i=nItems-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                int l1=quearray[j].length()-1;
                int l2=quearray[j+1].length()-1;
                if(l1<l2)
                {
                    String temp=quearray[j+1];
                    quearray[j+1]=quearray[j];
                    quearray[j]=temp;
                }
                if(l1==l2)
                {
                    String s1=quearray[j];
                    String s2=quearray[j+1];
                    if(s1.compareToIgnoreCase(s2)<0)
                    {
                        quearray[j]=s2;
                        quearray[j+1]=s1;
                    }
                }
            }
        }
        return quearray;
    }
}
