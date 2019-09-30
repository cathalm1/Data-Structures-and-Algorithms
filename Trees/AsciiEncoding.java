package Trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//The cat sat on the mat
public class AsciiEncoding {
    public static void main(String args[]) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String s = buff.readLine();
        byte[] ba = s.getBytes("US-ASCII");
        String st[] = new String[ba.length];
        int inc = 0;
        while (inc != ba.length) {
            String blank = Integer.toBinaryString(ba[inc]);
            st[inc] = AsciiStringArray(blank);
            inc++;
        }
        int[] ASCIIarray = new int[256];
        inc=0;
        while(inc!=st.length){
            //System.out.print(st[inc]+" ");
            int r = Integer.parseInt(st[inc], 2);
            ASCIIarray[r]++;
            inc++;
        }
       /* System.out.println(" ");
        inc=0;
        while(inc!=ASCIIarray.length){
            if(ASCIIarray[inc]>0)System.out.println( "'" + (char) inc + "'" + " appeared " + ASCIIarray[inc] + " times");
            inc++;
        }*/
    }

    public static String AsciiStringArray(String blank) {
        if (blank.length() < 7) {
            return AsciiStringArray(blank = "0" + blank);
        }
        return blank;
    }
}

