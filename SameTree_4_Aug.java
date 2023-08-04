// we need to check if root node value is same, left child node value is same and right child node value is same for both trees
class Node {
    int data;
    Node left, right;
 
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 
class BinaryTree {
    Node root1, root2;
 
    /* Given two trees, return true if they are
       structurally identical */
    boolean identicalTrees(Node a, Node b)
    {
        /*1. both empty */
        if (a == null && b == null)
            return true;
 
        /* 2. both non-empty -> compare them */
        if (a != null && b != null)
            return (a.data == b.data
                    && identicalTrees(a.left, b.left)
                    && identicalTrees(a.right, b.right));
 
        /* 3. one empty, one not -> false */
        return false;
    }
 
    /* Driver code*/
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
 
        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);
 
        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root2.left.right = new Node(5);
 
          // Function call
        if (tree.identicalTrees(tree.root1, tree.root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");
    }
}
// another approach
// public class Solution {
//     Node root1, root2;
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if(p==null && q==null) //when both are empty trees
//         return true;
//         if(p!=null && q==null || p==null&&q!=null) //if anyone tree is not null
//         return false;
//         //when both are not null trees
//         if(p.val!=q.val) //checking if root nodes of p an dq are different
//         return false;
//         boolean leftTreeMatch = isSameTree(p.left, q.left);  //checking if left side nodes of both trees match
//         boolean rightTreeMatch = isSameTree(p.right, q.right); //same for right side
//         return leftTreeMatch && rightTreeMatch; //if both side match is true then we will get true otherwise false
//     }