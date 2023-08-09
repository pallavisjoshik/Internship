import java.util.*;
public class Permutation {
    public static List< Integer > nextGreaterPermutation(List< Integer > A){  //storing the array as list
        int n = A.size(); //A is the list and n its size
// To find the break-point, using a loop we will traverse the array backward and store the index i where arr[i] is less than the value at index (i+1) i.e. arr[i+1].
        int index = -1; 
        for (int i = n-2; i>=0; i--){
            if(A.get(i)<A.get(i+1)){ //checking for break point
                index = i; //initializing index at break point
                break;
            }
        }
// if no break point is found, it means it is the last permutation and hence the next permutation will be the first one so we will just reverse the array
        if(index == -1){ //if break point is not there then index value wont change
            Collections.reverse(A);  //reversing the list to get next permutation
            return A;
        }
// finding the next greater number and swapping it will number at i
        for(int i= n-1; i>index ;i--){
            if(A.get(i)>A.get(index)){
                //swapping elements using third variable temp
                int temp = A.get(i);
                A.set(i, A.get(index));
                A.set(index, temp);
                break;
            }

        }
// to get the remaining elements of permutation, we can reverse the remaining array since we need it sorted in ascending order and we would have it in descending order
        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);
        return A;
}
public static void main(String args[]) {
    List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0}); //declaring list A
    List<Integer> ans = nextGreaterPermutation(A); //calling permutation function

    System.out.print("The next permutation is: [");
    for (int i = 0; i < ans.size(); i++) {
        System.out.print(ans.get(i) + " ");
    }
    System.out.println("]");

}
}