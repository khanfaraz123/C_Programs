import java.util.Scanner;

/**
 * BinarySearch
 */
public class BinarySearch {

    // Method to perform binary search
    public static SearchResult binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length-1;

        while(left <= right){
            int mid = (left+right)/2;
            if(target == array[mid]){
                return new SearchResult(mid+1, array[mid]);
            }
            if(target > array[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return new SearchResult(-1, -1);
    }


    public static void main(String[] args) {
        int r,find;
        System.out.print("Enter the Length of an Array: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        int[] a = new int[r];
        System.out.println("Enter the sorted values in Array: ");
        for(int i=0; i<r; i++){
            System.out.print("Enter "+(i+1)+" elements: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number to searched in Array: ");
        find = sc.nextInt();

        SearchResult result = BinarySearch.binarySearch(a, find);
        result.display();
        sc.close();
    }
}