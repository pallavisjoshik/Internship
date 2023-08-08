public class Solution {
    // since it is sorted array we will use binary search
    // in single binary search first and last occurance wont be known so two binary search will be done , one for first and other for last occurance
    //for finding first occurance we will focus on left side of array
    public static int firstOccurance(int[] nums, int target, int n) {
        // we will initialize first occurance as -1 since if target is not in array it will return same
        int first = -1;
        int high = n-1;
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                first = mid;
                // and to check on left side for previous occurance of target in sorted array
                high = mid-1;
            }
            else if (nums[mid]<target){  //means target will not be on left side and we need to look in right sid eof array
                low = mid+1; //shifting focus on right half array
            }
            else //if nums[mid]>target then we will search in left side of array
                high = mid -1;  //shifting focus on left half array
        } 
        return first;   
    }
    // for finding last occurance we will focus on right side of array since it is sorted array
    public static int lastOccurance(int[] nums, int target, int n) {
        // we will initialize  last occurance as -1 since if target is not in array it will return same
        int last =-1;
        int high = n-1;
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                last = mid;
               // and to check on right side for further occurance of target in sorted array  
               low = mid+1;
            }
            else if (nums[mid]<target){  //means target will not be on left side and we need to look in right sid eof array
                low = mid+1; //shifting focus on right half array
            }
            else //if nums[mid]>target then we will search in left side of array
                high = mid -1;  //shifting focus on left half array
        }
        return last;
    }
    public static void main(String[]args){
        int nums[]={1,5,8,8,8,9,9,10,11,12};
        int n =10;
        int target = 8;
        int first = firstOccurance(nums,8,10);
        if(first==-1){
            System.out.println("the given target is not present in the array");
        }
        int last = lastOccurance(nums,8,10);
        int ans[]={first,last};
        System.out.println("the given target is present in the array at the position { "+ first +" , " +last + " }");
    }
}