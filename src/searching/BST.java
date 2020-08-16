package searching;

public class BST <Key extends Comparable<Key>,Val>
{
    private Node root;
    private class Node
    {
        private Key key;
        private Val val;
        private Node left,right;
        public Node(Key key,Val val)
        {
            this.key=key;
            this.val=val;
        }
    }
    public void insert(Key key,Val val)
    {
        root=insert(root,key,val);
    }
    private Node insert(Node x,Key key,Val val)
    {
        if(x==null)
            return new Node(key,val);
        int cmp=key.compareTo(x.key);
        if(cmp<0)
            x.left=insert(x.left,key,val);
        else if(cmp>0)
            x.right=insert(x.right,key,val);
        else //if(cmp==0)
            x.val=val;
        return x;
    }
    public Val get(Key key)
    {
        Node x=root;
        while(x!=null)
        {
            int cmp=key.compareTo(x.key);
            if(cmp>0)
                x=x.right;
            else if(cmp<0)
                x=x.left;
            else
                return x.val;
        }
        return null;
    }
    public static void main(String args[])
    {
        BST<Integer,Integer>bst=new BST<>();
        bst.insert(4,6);
        bst.insert(5,4);
        bst.insert(10,1);
        System.out.println(bst.get(5));
    }
}