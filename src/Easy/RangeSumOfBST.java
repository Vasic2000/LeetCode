package Easy;
//TASK.938

public class RangeSumOfBST {
    public static void main(String[] args) {
        TreeNode dva = new TreeNode(10);

        dva.left = new TreeNode(5);
        dva.left.left = new TreeNode(3);
        dva.left.right = new TreeNode(7);

        dva.right = new TreeNode(15);


        TreeNode tri = new TreeNode(10);

        tri.left = new TreeNode(5);
        tri.left.left = new TreeNode(3);
        tri.left.left.left = new TreeNode(1);
        tri.left.right = new TreeNode(7);
        tri.left.right.left = new TreeNode(6);

        tri.right = new TreeNode(15);
        tri.right.left = new TreeNode(13);
        tri.right.right = new TreeNode(18);

        System.out.println(rangeSumBST(dva, 7, 15));
        System.out.println(rangeSumBST(tri, 6, 10));
    }

    private static int rangeSumBST(TreeNode root, int low, int high) {
        int result = 0;
        if(root!=null) {
            if((root.val <= high) && (root.val >= low))
                result += root.val;
            if(root.left!=null)
                result += rangeSumBST(root.left, low, high);
            if(root.right!=null)
                result += rangeSumBST(root.right, low, high);
        }
        return result;
    }
}
