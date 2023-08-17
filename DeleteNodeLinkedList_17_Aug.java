// Leetcode 237 - delete node when head is not accessible 
// hence we can move only forward of given node and not backward thus cannot point prev node to next node of given node

// but since we can move forward, we can replace the node value with node.next and point node to node.next.next
public class Solution {
    public void deleteNode(ListNode node) {
       node.val = node.next.val;
       node.next = node.next.next; 
    }
    // public void main(String[]args){
    //     LinkedList llist = new LinkedList();
    //     llist.push(4);
    //     llist.push(5);
    //     llist.push(1);
    //     llist.push(9);
    //     System.out.println(deleteNode(5));
    // }
}