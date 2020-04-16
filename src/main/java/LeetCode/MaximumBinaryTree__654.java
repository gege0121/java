package LeetCode;
//Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:
        //The root is the maximum number in the array.
        //The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
        //The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.

public class MaximumBinaryTree__654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        // find highest number in the array and its index
        int maxNumber = Integer.MIN_VALUE; int maxIndex = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > maxNumber) {
                maxNumber = nums[i];
                maxIndex = i;
            }
        }
        // create node for the highest number
        TreeNode root = new TreeNode(maxNumber);
        // recursively set the left node of the node with maximum
        // number using numbers to its left in the input array
        if(maxIndex > 0) {
            int[] leftNums = new int[maxIndex];
            for(int i=0; i < maxIndex; i++) {
                leftNums[i] = nums[i];
            }
            root.left = constructMaximumBinaryTree(leftNums);
        }
        // recursively set the right node of the node with maximum
        // number using numbers to its right in the input array
        if(maxIndex < nums.length - 1) {
            int[] rightNums = new int[nums.length-maxIndex-1];
            for(int i=maxIndex+1; i < nums.length; i++) {
                rightNums[i-maxIndex-1] = nums[i];
            }
            root.right = constructMaximumBinaryTree(rightNums);
        }
        return root;
    }

}
