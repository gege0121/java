package DataStructure;

public class BinaryTree {
    BinaryTreeNode head;

    public static class BinaryTreeNode{
      int val;
      BinaryTreeNode left;
      BinaryTreeNode right;

      BinaryTreeNode(int num){
          val=num;
          left=right=null;
      }
    }



    BinaryTree(){
        head=null;
    }

    BinaryTree(BinaryTreeNode start){
        head=start;
    }

    //preorder
    void print_preorder(BinaryTreeNode head){
        if(head==null){return;}
        System.out.println(head.val);
        print_preorder(head.left);
        print_preorder(head.right);
    }
    void print_preorder(){
        print_preorder(head);
    }

    //inorder
    void print_inorder(BinaryTreeNode head){
        if(head==null){
            return;
        }

        print_inorder(head.left);
        System.out.println(head.val);
        print_inorder(head.right);
    }
    void print_inorder(){
        print_inorder(head);
    }

    //postorder
    void print_postorder(BinaryTreeNode head){
        if(head==null){
            return;
        }
        print_postorder(head.left);
        print_postorder(head.right);
        System.out.println(head.val);
    }

    void print_postorder(){
        print_postorder(head);
    }

    //130 maximum deepth
    //divide conquer
    static int maxDepth(BinaryTreeNode head){
        if(head==null){
            return 0;
        }

        int left=maxDepth(head.left);
        int right=maxDepth(head.right);

        int max=Math.max(left,right);
        return max;

    }
    //146
    //convert an sorted array to binary search tree
    public static BinaryTreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0)
            return null;

        return sortedArrayToBST(num, 0, num.length - 1);
    }

    public static BinaryTreeNode sortedArrayToBST(int[] num, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        BinaryTreeNode root = new BinaryTreeNode(num[mid]);
        root.left = sortedArrayToBST(num, start, mid - 1);
        root.right = sortedArrayToBST(num, mid + 1, end);

        return root;
    }
    static void traverseTree(BinaryTreeNode root) {
        if (root != null) {
            traverseTree(root.left);
            traverseTree(root.right);
            System.out.println(root.val);
        }
    }

    //150
    //if a binary tree is a subtree of another binary tree.

    public static boolean is_Subtree(BinaryTreeNode T1, BinaryTreeNode T2) {
        if (T2 == null) return true;
        if (T1 == null) return false;
        if (is_Same(T1, T2)) return true;
        if (is_Subtree(T1.left, T2) || is_Subtree(T1.right, T2)) return true;
        return false;
    }

    public static boolean is_Same(BinaryTreeNode t1, BinaryTreeNode t2) {
        if (t1 == null || t2 == null) {
            return t1 == t2;
        } else if (t1.val != t2.val) {
            return false;
        } else {
            return is_Same(t1.left, t2.left) && is_Same(t1.right, t2.right);
        }
    }

    public static void main(String[] args){
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.head=new BinaryTreeNode(55);
        binaryTree.head.left=new BinaryTreeNode(21);
        binaryTree.head.right=new BinaryTreeNode(80);
        binaryTree.head.left.left=new BinaryTreeNode(9);
        binaryTree.head.left.right=new BinaryTreeNode(29);
        binaryTree.head.right.left=new BinaryTreeNode(76);
        binaryTree.head.right.right=new BinaryTreeNode(91);

       // binaryTree.print_preorder();
       // binaryTree.print_inorder();
        binaryTree.print_postorder();


    }


}
