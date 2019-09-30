package Algorithms.Queue;

public class Queue {
    private int queSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s)
    {
        queSize=s;
        queArray=new String[queSize];
        front=0;
        rear=-1;
        nItems=0;
    }
    public boolean insert(String j)
    {
        if(isFull())
        {
            return false;
        }
        if(rear==queSize-1)
        {
            rear=-1;
        }
        rear ++;
        queArray[rear]=j;
        nItems ++;
        return true;
    }
    public String remove()
    {
        if(isEmpty())
        {
            return null;
        }
        String temp=queArray[front];
        front ++;
        if(front==queSize)
        {
            front=0;
        }
        nItems --;
        return temp;
    }
    public String peekFront()
    {
        return queArray[front];
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
    public String getElement(int position)
    {
        return queArray[position-1];
    }
}
