
import java.io.IOException;
import java.util.Scanner;
public class SelectionSort {
    void getarr(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  sc.nextInt();
        }
        sc.close();
    }
    void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] >arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    void display(int[] arr){
        System.out.println("Sorted array ......");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        SelectionSort obj = new SelectionSort();
        System.out.println("Enter size of array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        obj.getarr(arr);
        obj.sort(arr);
        obj.display(arr);
        s.close();
    }
}
/*
 * time complexity   O(N2)
 * Space complexity O(1) 
 */