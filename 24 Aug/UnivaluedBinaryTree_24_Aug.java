// leetcode - 965 - univalued binary tree


class Solution {
    public boolean isUnivalTree(TreeNode root) {
        // checking if root is null then true
        if (root == null){
return true;
}

// if any node value doesnt match root value then it is not univalued and hence false
    if (root.left != null && root.val != root.left.val)
        return false;

    if (root.right != null&& root.val != root.right.val)
        return false;
    
    return isUnivalTree(root.left) && isUnivalTree(root.right);
    // calling the function recursively for both right and left side nodes to traverse the entire tree
    }
}