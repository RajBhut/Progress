public class B_T_
{
    public static void main(String[] args) {
        int[] nods = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_Tree tree = new Binary_Tree();
        Node root = Binary_Tree.buildtree(nods);
        System.out.println(root.data);

    }
    Node root;
   public static class Node {
        int data;
        Node left , right;
        Node (int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;

        }

    }
     static class Binary_Tree{
       static  int index = -1;
        public static Node buildtree( int[] nods)
        {
            index++;
            if(nods[index] == -1)
            {
                return null;
            }
            Node newnode = new Node(nods[index]);
            newnode.left = buildtree(nods);
            newnode.right = buildtree(nods);
            return newnode;


        }
    }

}
