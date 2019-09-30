package Quicksort;
//hacker rank version sketchy
public class QuickSorter {
        public static void main(String args[]) {
            int [] array = {10, 6000, 1, 3, 5, 6, 9, 4, 2, 8};
            quicksort(array);

        }
        public static void quicksort(int[] array) {
            quicksort(array, 0, array.length-1);
            int i = 0;
            while(i < array.length){
                System.out.print(array[i] + ",");
                i++;
            }
        }
        public static int[] quicksort(int[] array, int left, int right) {
            if(left >= right)return array;
            int pivot = array[(left + right)/2];
            int partpoint = partArray(array, left, right, pivot);
            quicksort(array, left, partpoint-1);
            quicksort(array, partpoint, right);
            return array;
        }
        public static int partArray(int[] array, int left, int right, int pivot) {
            while (left <= right) {
                while (array[left] < pivot) {
                    left++;
                }
                while (array[right] > pivot) {
                    right--;
                }
                if (left <= right) {
                    swap(array, left, right);
                    left++;
                    right--;
                }
            }

            return left;
        }

        public static int[] swap( int[] array, int left, int right){
            int temp = 0;
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            return array;
        }

    }

