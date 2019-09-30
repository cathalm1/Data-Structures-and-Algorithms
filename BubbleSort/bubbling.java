package BubbleSort;

public class bubbling {
    public static void main(String args[]) {
        int[] a = {12, 24, 20, 2, 15};
        a = bubble(a);

        for (int i : a) {
            System.out.println(i);
        } }


    public static int[] bubble(int in[]) {
        for (int i = 0; i < in.length; i++) {
            for (int j = in.length-1; j > i; j--) {
                if (in[i] > in[j]) {
                    int t = in[i];
                    in[i] = in[j];
                    in[j] = t;
                } } }
        return in;
    } }
