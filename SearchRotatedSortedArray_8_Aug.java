import java.util.*;
public class SearchRotatedSortedArray {
    public static int search(ArrayList<Integer> arr, int n, int target) {
        int high = n-1;
        int low = 0;
        // finding mid of array
        while(low<=high){
            int mid = (low +high)/2;
        // since we need to search in sorted array we will use binary search
        // but since the array is rotated we will check each time which half side is sorted and if target lies in which side and then consider only that side for further analysis
        // if mid point sto target
        if(arr.get(mid) == target){
            return mid;
        }

        // if left side of array is sorted then the low will be smaller than mid
        if(arr.get(low)<= arr.get(mid)){
            // checking if target is greater than mid and low is less than target then we can continue searching in next left half array
            if(arr.get(low)<= target && target <=arr.get(mid)){
                high = mid-1; //shifting focus to left side half array
            }
            else {
                // if the target doesnot lie between low and mid then we will focus on right side half array
                low = mid + 1;
            }
        }
        else {
            //if right side of array is sorted 
                if(arr.get(mid)<=target && target<=arr.get(high)){
                    low = mid+1;
                }
                else{
                    //if target doesnt fall between mid and high
                    high = mid - 1; //shifting focus to left side of half array
                }
            }   
        }
    return -1; //if the target not found in the array
    }
    public static void main(String[]args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7,8,9,1,2,3,4,5,6));
        int n = 9;
        int target = 9;
        int result = search(arr, n, target);
        if (result == -1){
            System.out.println("the target is not present in the array");
        }
            else {
            System.out.println("the target is  present in the array at the position "+ result);
        }

    }
}