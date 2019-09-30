package Trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree {
    public static void main(String args[]) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String s = buff.readLine();
        AsciiEncodingClass aec = new AsciiEncodingClass();
        int [] aecarray = aec.AsciiEncodingClass(s);
        int i = 0 , T1 = Integer.MIN_VALUE , T2 = Integer.MIN_VALUE ;
        while(i!=aecarray.length){
            if(aecarray[i]>0) {
                new Node(aecarray[i]);
                if(aecarray[i]>T1){
                    T1 = aecarray[i];
                    if(aecarray[i+1]==T1) T2 = aecarray[i+1];
                }
            }
            i++;
        }
        /*Node n=new Node(T1+T2);
        while(i!=aecarray.length){
            //n.left=T1;
            //n.;

        }*/

    }
}
