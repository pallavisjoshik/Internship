// find largest value in each tree level
// we will use level order traversal and find largest value in each level

class Solution{
    public List<Integer> largestValues(TreeNode root) {
        // create a list to return the answer
        List<Integer> result = new ArrayList<>();
        // if root is null then we can return result which would be null
        if(root == null) return result;
        // creating queue to do level order traversal -  implemented using linked list
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); //adding the root value to queue
        q.offer(null); //to identify that next level has started
        int max = Integer.MIN_VALUE;
        while(!q.isEmpty()){ //while the q is not empty
            TreeNode temp = q.poll(); //that is q value will go to temp that is initially temp = root
            if(temp!=null){ //if the end of level is not reached and we need o ckcek other nodes if their value is greater than max value
                if(max < temp.val){
                    max = temp.val;
                }
                // checking for left and right node
                if(temp.left != null) q.offer(temp.left); //if temp.left is not null then offering temp.left value to queue
                if(temp.right != null) q.offer(temp.right);
            }
            else{ //means if end of level is reached and increase in level needs to be done
                result.add(max);
                max = Integer.MIN_VALUE;
                // to segregate the level, add null at end
                if(!q.isEmpty()) q.offer(null);
            }
        }

        return result;
    }
}