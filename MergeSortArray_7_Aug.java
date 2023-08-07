public class MergeSortArray{
    public static void merge(int[]nums1, int[]nums2, int m, int n){
        // nums1 is array with length m and nums2 is array with length n
        // we will take three pointer i, j, k where i will point to end of nums1 (but actually at end of elememt till where value is not null); j will point to end of nums2 and k will poit to end of nums1 (at end of even null elements)
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        // since the arrays are already sorted, we will start comparing the nums1 array from mid to first with nums2 array from last to first
        while(j>=0){  //that is nums2 elements from last till first
            if(i>=0 && nums1[i]>nums2[j]) { //comparing last element of nums1 with that of nums 2 and whichever is larger will be added at end of nums1
            nums1[k]=nums1[i]; //putting nums[i] at mid+1 positon since that is from where array is empty
            k--;  //shifting the pointer one step back from end to add next element
            i--;  // shifting pointer one step back for nums1 to check for next element next time
        }
        // here we are comparing each element of nums1 from back to front with that of nums2 and putting the greater value in the nums1 empty elemets
        else{  //when nums2[j]>nums1[i], we will put nums2[j]at nums1[k]
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    }
}
    public static void main(String[]args){
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={3,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, nums2, m,n); //calling merge function
        for(int i=0;i<m+n;i++){   //printing the resultant merged array
            System.out.print(nums1[i]+" ");
        }

    }
}