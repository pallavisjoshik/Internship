//for 0based indexing, root node is marked 0 and right node will (2i+2) and left node(2i+1)- where i is indexed value of root node
//this has to be done, at each level node to find index of its right and left node
//thus indices of nodes will be [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14...] -till 14 for 4 level binary tree
// however the concept wil fail in case of skewed tree - that is where nodes of only one side are prsesnt
//thus it is better to number 1,2,3.. freshly at each level - for that we need to consider each subsequent root node (2i-1)while calculating left and right node
// now we can get max width between nodes by substacting the last child nodes +1
// we can get any level width of binary tree by subtracting the numberings of two nodes which we are examining

import java.util.*;
class TreeNode { 
  int data;
  TreeNode  left,  right;
  TreeNode(int data)
  {
      this.data=data;
      left=null;
      right=null;
  }
}

class Pair {
    TreeNode node; 
    int num; 
    Pair(TreeNode _node, int _num) {
        num = _num;
        node = _node; 
    }
}
class Solution {
    public static int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0; //if there is no binary tree
        int ans = 0;
        Queue<Pair> q = new LinkedList<>(); 
        q.offer(new Pair(root, 0)); 
        while(!q.isEmpty()){
            int size = q.size();
            int mmin = q.peek().num;    //to make the id starting from zero //taking minimum index possible
            int first = 0,last = 0;
            for(int i=0; i<size; i++){
                int cur_id = q.peek().num-mmin; // making sure current index i subtracted by min index so that overflow doesnt happen in case of skewed tree
                TreeNode node = q.peek().node;
                q.poll();
                if(i==0) first = cur_id;
                if(i==size-1) last = cur_id;
                if(node.left != null)
                    q.offer(new Pair(node.left, cur_id*2+1)); //going for left node
                if(node.right != null) 
                    q.offer(new Pair(node.right, cur_id*2+2)); //going for right node
            }
            ans = Math.max(ans, last-first+1);
        }
        return ans;
    }


public static void main(String args[]) {

  TreeNode  root = new TreeNode(1);
  root . left = new TreeNode(3);
  root . left . left = new TreeNode(5);
  root . left . left . left = new TreeNode(7);
  root . right = new TreeNode(2);
  root . right . right = new TreeNode(4);
  root . right . right . right = new TreeNode(6);

  int maxWidth = widthOfBinaryTree(root);
  System.out.println("The maximum width of the Binary Tree is "+maxWidth);

  
}
}