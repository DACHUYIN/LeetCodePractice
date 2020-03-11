package top100LinkedQuestions;

import java.util.HashMap;
import java.util.Map;

// depth-first-search
public class MaximumDepthOfBinaryTree104 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;
        int depth = new MaximumDepthOfBinaryTree104().maxDepth(root);
        System.out.println(depth);
    }

    int depth = 0;
    Map<String, Integer> map = new HashMap<>();
    public int maxDepth(TreeNode root) {

        if(null == root) return 0;
        ++depth;
        if(null != root.right && null != root.left) map.put("crossDepth", depth);
        if(null != root.left) maxDepth(root.left);
        if(null != root.right) maxDepth(root.right);
        map.put("depth", depth > (null != map.get("depth") ? map.get("depth") : 0) ? depth : map.get("depth"));
        depth = depth - (null != map.get("crossDepth") ? map.get("crossDepth") : 0);

        return map.get("depth");
    }

}