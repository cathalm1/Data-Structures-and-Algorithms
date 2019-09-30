package Quicksort;

import java.util.*;

public class myQuicksort {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        //String [] array = {"s","t","w","a","p","g","q","l","r","z"};
        String [] array = s.nextLine().split(" ");
        quicksort(array, 0, array.length-1);
        int p = 0;
       /* while(p < array.length){
            System.out.print(array[p++]+", ");
        }*/
    }

    public static void quicksort(String[] array, int left, int right) {
        //if left goes beyond right error so return
        if(left >= right) {
            return;
        }
        //create string pivot
        //if you dont use this method of pivot and use right+left you will run into problems
        String pivot = array[left + (right - left)/2];

        System.out.println(pivot);
        System.out.println(" ");
        //set l&r variables equal left&right so we can use left&right later
        int l=left;
        int r=right;

        while (l <= r) {
            //while true increase left position
            while (identify(array[l],pivot)) {
                int p = 0;
                System.out.println(" ");
                while(p < array.length){
                    System.out.print(array[p++]+", ");
                }
                l++;
            }
            //while true decrease right position so partition getting smaller
            while (identify(pivot,array[r])) {
                int p = 0;
                System.out.println(" ");
                while(p < array.length){
                    System.out.print(array[p++]+", ");
                }
                r--;
            }

            if (l <= r) {
                swap(array, l, r);
                l++;
                r--;
            }
            int p = 0;
            System.out.println(" ");
            while(p < array.length){
                System.out.print(array[p++]+", ");
            }
        }
        if(left<r) quicksort(array, left, r);
        if (right>l)quicksort(array, l, right);
    }

        //swaps the current two strings
        public static String[] swap( String[] array, int left, int right){
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            return array;
        }

        //finds the greatest character in the string and returns that char to identify method
        public static char greatest(String in) {
            int i = 0;
            char thegreat = in.charAt(0);
            while(i < in.length()) {
                if((int)in.charAt(i) > (int)thegreat){
                    thegreat = in.charAt(i);
                }
                i++;
            }
            return thegreat;
        }

        //identifies the left/right is smaller/larger than the current string pivot value
        //if the two characters are equal then compare lexicographically

        public static boolean identify(String first, String second) {
            if(greatest(first) == greatest(second)) {
                if(second.compareToIgnoreCase(first) > 0) {
                    return true;
                }
                return false;
            }
            if(greatest(first) < greatest(second))return true;
            return false;
        }
    }
