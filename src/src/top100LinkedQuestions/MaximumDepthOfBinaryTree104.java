package top100LinkedQuestions;

import java.util.HashMap;
import java.util.Map;

// depth-first-search
public class MaximumDepthOfBinaryTree104 {

    public static void main(String[] args) {

    }

    int depth = 0;
    Map<String, Integer> map = new HashMap<>();
    public int maxDepth(TreeNode root) {

        if(null == root) return 0;
        ++depth;
        if(null != root.left) maxDepth(root.left);
        if(null != root.right) maxDepth(root.right);
        if(null == root.right && null == root.left) {
            int maxDepth = null != map.get("depth") ? map.get("depth") : 0;
            if (depth < maxDepth) depth = maxDepth;
        }
        map.put("depth", depth);

        return depth;
    }

}