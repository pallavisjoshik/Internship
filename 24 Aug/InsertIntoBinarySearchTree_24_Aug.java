// leetcode- 701- Insert into a binary search tree

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        root = insert(root,val); //call helper function
        return root;
    }
    public TreeNode insert(TreeNode root, int val){
        if(root == null) //suitable place to create new node
            return new TreeNode(val,null,null);
        if(val < root.val) //check whether the value is less than current node value
            root.left = insert(root.left,val);
        else if(val > root.val) //check whether the value is greater than current node value
            root.right = insert(root.right,val);
        return root;
    }
}