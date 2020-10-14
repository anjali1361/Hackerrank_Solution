
import java.util.*;

class Custom_Node{
    Custom_Node left,right;
    int data;
    Custom_Node(int data){
        this.data=data;
        left=right=null;
    }
}
class LevelOrderBST{

	static void levelOrder(Custom_Node root){
      Queue<Custom_Node> q = new LinkedList<>();

      Custom_Node temp_node = root;

      while(temp_node != null){
          System.out.print(temp_node.data+" ");
          if(temp_node.left != null)
            q.add(temp_node.left);
          
         if(temp_node.right != null)
          q.add(temp_node.right);

          temp_node=q.poll();
          
      }

      
    }

	public static Custom_Node insert(Custom_Node root,int data){
        if(root==null){
            return new Custom_Node(data);
        }
        else{
            Custom_Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Custom_Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
            sc.close();
        }
        
}