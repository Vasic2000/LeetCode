package Yandex;

import java.util.Vector;

public class BinareThreeLayers {
    public static void main(String[] args) {
        BinareThreeLayers tree = new BinareThreeLayers();
        tree.insertNode(1);
        tree.insertNode(2);
        tree.insertNode(3);
        tree.insertNode(4);
        tree.insertNode(5);
        tree.insertNode(6);
        tree.insertNode(7);
        tree.insertNode(8);
    }

    public static void insertNode(int value) { // метод вставки нового элемента

    }






    public static Vector get_layered_representation(TreeNode root) {
        Vector result = new Vector();
        DFS(root, 0, result);
        return result;
    }

    public static void DFS(TreeNode node, int depth, Vector result) {

        if (node == null)
            return;
        // Т.к. мы выбрали preorder, то результат нужно увеличивать
        // не больше, чем на 1
        if (depth >= result.size())
            result.add(node.val);

        DFS(node.left, depth + 1, result);
        DFS(node.right, depth + 1, result);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
