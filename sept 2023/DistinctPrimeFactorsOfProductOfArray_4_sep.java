// leetcode 2521 - Distinct prime factors of product of an array

class Solution {
    public int distinctPrimeFactors(int[] nums) {
       	Arrays.sort(nums);  // sorting makes it easier to count primes
						
		HashSet<Integer> set= new HashSet<>();
		
		for (int n :nums) {			
			int i=2;
		
			while(n>1) {  // reduce the n=0
				
				if(n % i ==0) {  // when prime is found , add in the set
					set.add(i);
					n/=i; }  // reduce n
					
				else {  // else increase i
					i++;}}}
		
	return set.size();	 // set size == total prime numbers
		 
    }
}