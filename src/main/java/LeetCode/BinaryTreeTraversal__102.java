package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Given a binary tree,
// return the level order traversal of its nodes' values. (ie, from left to right, level by level).
public class BinaryTreeTraversal__102 {

    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();

        if(root==null){
            //return 空数组
            return result;
        }

        //重要数据结构：queue
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //除了linkedlist还可以arraydeque，dynamic array, circular array,
        queue.offer(root);

        //层级遍历
        while(!queue.isEmpty()){

            ArrayList<Integer> level = new ArrayList<>();

            int size=queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.val);
                if(head.left!=null){
                    queue.offer(head.left);
                }
                if(head.right!=null){
                    queue.offer(head.right);
                }
                }
            result.add(level);
            }
        return result;
        }


    }
