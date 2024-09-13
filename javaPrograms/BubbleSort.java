import java.util.Scanner;

/**
 * BubbleSort
 */
public class BubbleSort {

    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {  
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    // Method to print the array
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int r;
        System.out.println("<<----Here we are performing Bubble sort---->>");
        System.out.print("Enter the Length of the Array: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        int[] a = new int[r];
        System.out.println("Enter the values in the Array (Unsorted): ");
        for (int i = 0; i < r; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            a[i] = sc.nextInt();
        }
        sc.close();

        BubbleSort bubbleSort = new BubbleSort();  

        System.out.println("Unsorted array:");
        bubbleSort.printArray(a);  

        int[] sortedArray = bubbleSort.bubbleSort(a);  

        System.out.println("Sorted array:");
        bubbleSort.printArray(sortedArray);  
    }
}
