package Trees;

import java.io.UnsupportedEncodingException;

//The cat sat on the mat
public class AsciiEncodingClass{
    public int [] AsciiEncodingClass(String s) throws UnsupportedEncodingException {
        byte[] ba = s.getBytes("US-ASCII");
        String st[] = new String[ba.length];
        int inc = 0;
        while (inc != ba.length) {
            String blank = Integer.toBinaryString(ba[inc]);
            st[inc] = AsciiStringArray(blank);
            inc++;
        }
        int[] ASCIIarray = new int[256];
        inc = 0;
        while (inc != st.length) {
            //System.out.print(st[inc]+" ");
            int r = Integer.parseInt(st[inc], 2);
            ASCIIarray[r]++;
            inc++;
        }
        return ASCIIarray;
    }

    public static String AsciiStringArray(String blank) {
        if (blank.length() < 7) {
            return AsciiStringArray(blank = "0" + blank);
        }
        return blank;
    }
}
