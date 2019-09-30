package Algorithms.BinarySearch;

public class BinarySearch {
    public static void main(String args[]) {
        int ar1[] = {2,31,44,78,91,200};
        System.out.println(find(31,ar1));
    }

    public static int find(int searchKey,int ar1[]) {
        int found=0;
        int lowerBound = 0;
        int nElems=ar1.length;
        int upperBound = nElems - 1;
        int check=0;

        while (found!=searchKey) {
            check = (lowerBound + upperBound) / 2;
            if (ar1[check] == searchKey) {
                found = ar1[check]; // found it
            }
            else if(lowerBound > upperBound){
                return -1; // can't find it divide range
            }
            else{
                if (ar1[check] < searchKey) {
                    lowerBound = check + 1; // it's in upper half
                } else {
                    upperBound = check - 1; // it's in lower half
                }
            }
        }
        return found;
    }
}
