package Algorithms.MergeSort;

public class mergesort {
    public static void main(String args[]) {
        int amain[] = {17,2,1,0,1000,60,3};
        mergeSort(amain,new int[amain.length],0,amain.length-1);

    }
    public static int[] mergeSort(int amain[],int temp[],int leftStart,int rightEnd){
        if(leftStart>=rightEnd)return amain;
        int middle=(leftStart+rightEnd)/2;
        mergeSort(amain,temp,leftStart,middle);
        mergeSort(amain,temp,middle+1,rightEnd);
        mergeTwoHalves(amain,temp,leftStart,rightEnd);

        return amain;
    }
    public static int [] mergeTwoHalves(int amain[],int temp[],int leftStart,int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;
        while (left <= leftEnd && right <= rightEnd) {
            if (amain[left] <= amain[right]) {
                temp[index] = amain[left];
                left++;
            } else {
                temp[index] = amain[right];
                right++;
            }
            index++;
        }
        System.arraycopy(amain,left,temp,index,leftEnd-left+1);
        System.arraycopy(amain,right,temp,index,rightEnd-right+1);
        System.arraycopy(temp,leftStart,amain,leftStart,size);
        return amain;
    }
}

