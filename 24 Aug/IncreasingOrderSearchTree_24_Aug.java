// leetcode- 897- increasing order search tree

class Solution {
    TreeNode head = new TreeNode(0,null,null);// create a head node 
       TreeNode ptr = new TreeNode(0,null,null);// create a ptr node  
       public TreeNode increasingBST(TreeNode root) {  
           TreeNode ptr = head; 
           helperMethod(root);
           return ptr.right;
       }
       //perform Inorder Traversal
       public void helperMethod(TreeNode root){
           if(root == null)
               return;
           helperMethod(root.left);//go to left
           head.right = new TreeNode(root.val);//add the value to newnode head --> right
           head = head.right;//move the head to point to next node
           helperMethod(root.right);// go to right
   
       }
   }