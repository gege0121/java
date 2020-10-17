package LeetCode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List result = new LinkedList();

        //null not memory address( 空指针), isempty 有内存空间，但内容为空
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> level=new ArrayList<>();

            //level traversal
            int size=queue.size();
            for(int i=0; i<size;i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

            }
            result.add(level);
        }
        return result;
    }

}
