public class CountCompleteTreeNodes {

    public static int countNodes(MaximumDepthOfBinaryTree.TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left + right + 1;
    }


}
