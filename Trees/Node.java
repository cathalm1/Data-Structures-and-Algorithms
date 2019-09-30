package Trees;

public class Node {
    Node left,right;
    int data;
    public Node(int input){
        this.data=input;
    }

    public void insert(int invalue){
        if(invalue<=data){
            if(left==null)left=new Node(invalue);
            else left.insert(invalue);
        }
        else{
            if(right==null)right=new Node(invalue);
            else right.insert(invalue);
        }
    }
    public boolean contains(int key){
        if(key==data){
            return true;
        }
        else if(key<data){
            if(left==null)return false;
            else return left.contains(key);
            }
        else{
            if(right==null)return false;
            else return right.contains(key);
        }
    }

    public void printInOrderTraversal(){
        if(left!=null)left.printInOrderTraversal();
        System.out.print(data+" ");
        if(right!=null)right.printInOrderTraversal();
    }
    public void printPreOrderTraversal(){
        System.out.print(data+" ");
        if(left!=null)left.printInOrderTraversal();
        if(right!=null)right.printInOrderTraversal();
    }
    public void printPostOrderTraversal(){
        if(left!=null)left.printInOrderTraversal();
        if(right!=null)right.printInOrderTraversal();
        System.out.print(data+" ");
    }
}

