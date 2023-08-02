class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); //creating a dummy list node for storing the values after addition
        ListNode head = dummy; //head is pointer of dummy linkedlist
        int carry = 0; //declaring carry as 0 initially
        while(l1!=null || l2!=null) //either of the linked list should not be null 
        {
            int z = carry;
            //let l1 be 2->4->4-.>3 AND L2 be 5->6->4
            if(l1!=null) {
                z += l1.val; // z will store value 2
                l1 = l1.next; // l1 will point to 4
            }
            if(l2!=null) {
                z += l2.val; // z =2 +5 i.e. z = 7
                l2 = l2.next; // l2 will point to 6
            }
            head.next = new ListNode(z%10); // the dummy head will store 7%10 = 7 but if two digit sum would be there then only first digit would be stored
            head = head.next; //now head will point to next node of dummy list
            carry = z/10; //here carry is zero but for two digit z value, z/10 = mostly 1,  will be carry and added to sum of next two nodes
        }
        if (carry!=0) //in case carry is left at last node then we will have to display that too thus by creating one more node
        {
            head.next = new ListNode(carry, null);//here second value of node indicates that after carry node , next node will be null   
        }
       return dummy.next; 
    }
}