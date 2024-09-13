import java.util.Scanner;

/**
 * SelectionSort
 */
public class SelectionSort {

    public int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
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
        System.out.println("<<----Here we are performing Selection sort---->>");
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

        SelectionSort selectionSort = new SelectionSort();  

        System.out.println("Unsorted array:");
        selectionSort.printArray(a);  

        int[] sortedArray = selectionSort.selectionSort(a);  

        System.out.println("Sorted array:");
        selectionSort.printArray(sortedArray);  
    }
}
