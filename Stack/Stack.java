package Algorithms.Stack;

public class Stack {
    private int stackSize;
    private int stackArray[];
    private int top;

    public Stack(int input)
    {
        stackSize=input;
        stackArray=new int[stackSize];
        top=-1;
    }
    public void push(int input)
    {
        top++;
        stackArray[top]=input;
    }
    public int pop()
    {
        if (top==-1)
        {
            return 0;
        }
        return stackArray[top--];
    }
    public int peek()
    {
        return stackArray[top];
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }
    public boolean isFull()
    {
        return (top==stackSize-1);
    }
    public void makeEmpty()
    {
        top=-1;
    }
}

