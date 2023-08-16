import java.util.*;
public class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // first Approach
        //since we need to see if node address is same to check if the lists are intersected
        //thus we need to hash the node address and not node value
        //there is possiblity of different length of two list
        //thus we can calculate length of both lists and then calculate the differnce
        //the longer list dummy head node can be shifted forward by the difference so that both lists dummy head nodes can shift one by one simulatenously
        //point where both list dummy nodes address match, from that point the lists are intersected
        // and if the list dont intersect, the both list dummy headnode will reach the end null simultaenously
        // that is if d1 = d2 = 0 , then list dont intersect

        //second approach
        // take two dummy head nodes, one for each list
        //move the dummy nodes one by one simultaneously for both lists
        // when each dummynode reach end of list that is null then it is assigned to head node of other list
        // and they keep moving one by one, when both nodes match, the lists are intersected 
        if (headA == null) return headA;
        if (headB == null) return headB;
    
        Set<ListNode> nodeAddress = new HashSet<>();
    
        while (headA != null) {
    
          nodeAddress.add(headA);
          headA = headA.next;
        }
    
        ListNode result = null;
    
        while (headB != null) {
          if (nodeAddress.contains(headB))
            return headB;
    
          headB = headB.next;
        }
    
        return result;
      }
        
}