import java.util.Scanner;

/**
 * LinearSearch
 */
public class LinearSearch {

    public static SearchResult LinearSearch(int[] array, int search){
        for(int i=0; i<array.length-1; i++){
            if(search == array[i]){
                return new SearchResult(i+1, array[i]);
            }
        }

        return new SearchResult(-1, -1);
    }
    
    public static void main(String[] args) {
        int r,find;
        System.out.println("<<----Here we are performing Linear Search---->>");
        System.out.print("Enter the Length of an Array: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        int[] a = new int[r];
        System.out.println("Enter the values in Array: ");
        for(int i=0; i<r; i++){
            System.out.print("Enter "+(i+1)+" elements: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number to searched in Array: ");
        find = sc.nextInt();

        SearchResult result = LinearSearch.LinearSearch(a, find);
        result.display();
        sc.close();
    }
}