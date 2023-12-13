//ex4:
//*******************************************************
//question 1:
 
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
 
    if(root==null||p==root||q==root)
       return root;
    TreeNode left=lowestCommonAncestor(root.left,p,q);
    TreeNode right=lowestCommonAncestor(root.right,p,q);
    
	 if(left==null)
       return right;
    if(right==null)
	    return left;
   
    return root;
    
    }
//*******************************************************
//question 2:
	
	
	
	
//*******************************************************
//question 3:
 
class Node{
	int value;
	Node left;
	Node right;

	public Node(int value){
		value=value;
		right=null;
		left=null;
	}
}

class BinarySearchTree{
    Node root;
	public BinarySearchTree(){	
		root=null
	}
	public Node insert (int value,Node root){
		if(root ==null){
			root=new Node(value);
			return root;
		}
		
		if(value>root.value)
			root.right=insert(value,root.right);
		else
			root.left=insert(value,root.left);
			
		return root;
	}
	
	 public Node delete(Node root,int value) {
        if(root==null)
            return root;
        if(root.value ==value)
         {   
             if(root.right!=null)     
               { Node suc=  successor(root.right  );
                 root.value=suc.value;
                 suc.value=value;
                 root.right=  delete(root.right,value );
               }
             else
                 return  delete(root.left,value );

         }
         else if(root.value>value)
                   root.left=delete(root.left,value );
         else if(root.value<value)     
                  root.right=delete(root.right,value );
         
           return root;
     
       
        
    }

    public Node successor(Node root  )
    {
        if(root==null||root.left==null )
            return root;
        
         return  successor(root.left );
    }

	
	public Node search(int value,Node root){
		if(root==null||root.value==value)
			return root;
		if(root.value>value)
			return search(value,root.left);
		else
			return search(value,root.right);
	
	}
}




