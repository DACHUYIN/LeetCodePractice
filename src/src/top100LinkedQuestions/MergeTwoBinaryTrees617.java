package top100LinkedQuestions;


import java.util.ArrayList;

// breadth-first-search
public class MergeTwoBinaryTrees617 {

    public static void main(String[] args) {

    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(null == t1) return t2;
        if(null == t2) return t1;
        TreeNode t3 = new TreeNode(t1.val + t2.val);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        while (null == t1.left && null == t1.right) {
            if(null == t1.left) {
                TreeNode leftNode = t1.left;
                arrayList1.add(leftNode.val);
            } else {
                arrayList1.add(0);
            }

            if(null == t1.right) {
                TreeNode rightNode = t1.right;
                arrayList1.add(rightNode.val);
            } else {
                arrayList1.add(0);
            }
        }



        return  t3;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

