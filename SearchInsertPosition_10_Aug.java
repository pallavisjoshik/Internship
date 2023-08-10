public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        // we can search the target using binary search 
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high = mid-1;

            }
            else {    //if(nums[mid]<target)
                low = mid+1;

            }
        }
        return low; //if the target will not be present in array then will be assigned at resultant low index
    }
    public static void main(String[]args){
        int nums[]= {1,3,5,6};
        int target = 2;
        int result = searchInsert(nums,target);
        System.out.println(result);
    }
}