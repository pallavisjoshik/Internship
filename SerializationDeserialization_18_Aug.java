// leetcode
import java.util.*;
public class Codec {
    // using level order traversal - that is traveersing the  binary tree level by level starting from root
    // Level Order Traversal for traversal in the tree (other traversal also can be used) to serialize the tree into String
    // while travesing for each node , if we found node is not null just simply add its value into StringBuilder.
    // if node is equal to null , add any character to reprenting it null (I am using "#" for representing nulls in string.

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
           if(root == null) return ""; 
            
            // Simple Level Order Traversal
            
            Queue<TreeNode> q = new LinkedList();
            StringBuilder b = new StringBuilder();
                
                q.offer(root);
                while(!q.isEmpty()){
                    TreeNode node = q.poll();
                        
                    // if node is null add any reference , which indicate node is null(i am using # for null representation)
                    if(node == null){ 
                         b.append("# ");
                         
                         // cant go null's left and right so skip that
                         continue;
                    }
                    
                    /* if we reach at this point means node is not null , 
                        add its val in stringBuilder and 
                        also add nodes' left and right into queue,
                        for furthur all nodes's traversal	*/
                        
                    b.append(node.val+ " "); 
                    q.add(node.left);    
                    q.add(node.right);    
                }
                
                // here entrie traversal is completed return the encoded string
                return b.toString();   
        }
    
        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == "") return null;
            
            Queue<TreeNode> q = new LinkedList<>();
            // Make values array by spliting the String on every " ".
            String[] values = data.split(" ");
            
            // It is pretty obvious Ist value in values is our root.
            TreeNode root = new TreeNode(Integer.parseInt( values[0] ));
             q.add(root);
                
            /*
            now traverse the String by checking its values,
            if val is not equal to # (means node was not null),
            make a new node of that value ,(say left)
            add that node into the left of cur node.
            for furthur travesal through whole string add left into queue.
            
            and then check next value if that is also not # 
            make a new node of that value ,(say right)
            add that node into right of cur node.
            for furthur travesal through whole string add right into queue.
            
            
            */
            for(int i=1; i< values.length; i++){
                
                TreeNode cur = q.poll();
                if(!values[i].equals("#")){
                     TreeNode left = new TreeNode(Integer.parseInt( values[i] ));
                     cur.left = left;
                     q.add(left);
                }
                if(!values[++i].equals("#")){
                     TreeNode right = new TreeNode(Integer.parseInt( values[i] ));
                     cur.right = right;
                     q.add(right);
                }
            }
                
                //  At this point we  deserialize the string into tree, return root of that tree
                return root;
        }
}
