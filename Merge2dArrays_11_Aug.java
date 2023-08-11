public class Merge2dArrays {
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {

// we need to use Maps, since we are storing the value of id and then checking if same id value present in other array
// storing the data in hashmap and then copy the data in form of interger array
Map <Integer,Integer> map = new HashMap<>();
// record data of nums1
for(int[] a: nums1){
    map.put(a[0], a[1]);
}
//comparing id of nums 1 and nums 2 and if it matches then adding values of those ids
for( int[] a: nums2){
    if(map.containsKey(a[0])){
        map.put(a[0], a[1]+ map.get(a[0]));
    }else //if the id doesnt match then we will take the element as it is
    {
        map.put(a[0],a[1]);
    }
}
//now creating integer array to store our answer
int [][] ans = new int[map.size()][2]; //sixe will be of map size 
int i = 0;
for(int key: map.keySet()){  //wil go through each key in mapkey set
ans[i][0]=key; //at 0th index of a[i] we will put key //will place at 1th index of a[i], sum of the two array values
ans[i][1]=map.get(key);  //will place at 1th index of a[i], sum of the two array values
i++; 
}
//Also we need to sort the array so we will directly use sort function
Arrays.sort(ans, (a,b)->a[0]-b[0]);

return ans;
    }

public static void main(String[]args){
 int [][] nums1 = [(1,2),(2,3),(4,5)];
 int [][] nums2 = [(1,4),(3,2),(4,1)];
 System.out.println(mergeArrays(int[][] nums1, int[][] nums2));
}
}