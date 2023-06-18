
import java.util.Scanner;
import java.util.Arrays;
class ArraySort{
    public static void main(String args[]){
        int n;
        System.out.print("Enter the size of array : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
           for(int i = 0; i < n; i++){
            System.out.print("Enter "+ (i+1) + " element : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Unsorted array ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
            System.out.println(" ");
          System.out.println("Enter the order in which you want to sort the array (1 - ascending, 2 - descending): ");
        int sortOption = scanner.nextInt();
        if (sortOption == 1) {
            Arrays.sort(arr); 
        } else if (sortOption == 2) {
            Arrays.sort(arr); 
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
        } else {
            System.out.println("Invalid sorting option. Please choose 1 for ascending or 2 for descending.");
            return;
        }
        System.out.print("Sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }  }
}