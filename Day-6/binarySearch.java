/*

The basic steps to perform Binary Search are:

Begin with the mid element of the whole array as a search key.
If the value of the search key is equal to the item then return an index of the search key.
Or if the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
Otherwise, narrow it to the upper half.
Repeatedly check from the second point until the value is found or the interval is empty.

Step-by-step Binary Search Algorithm: We basically ignore half of the elements just after one comparison.

Compare x with the middle element.
If x matches with the middle element, we return the mid index.
Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.
Else (x is smaller) recur for the left half.

Time Complexity: O (log n)
Auxiliary Space: O (1)

*/
// code start here ------------------------------------------->

public class Binary {

    public static int getBinary(int arr[],int key)
    {

        int start=0,end =arr.length-1;

        while(start<=end) {
            int mid=(start+end)/2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key) //left
                end = mid - 1;

            else
                start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,89,789,769898,56876868};
        int key=56876868;
        int index=getBinary(arr,key);
        System.out.println(index);
       // System.out.println(getBinary(arr,key));
    }
}
