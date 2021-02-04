import java.util.Scanner;

public class TreeNode {

    String item;
    TreeNode left;
    TreeNode right;

    TreeNode(String str) {
        item = str;
    }

    private static TreeNode root;

    // treeContains is used to search for a given item in the tree using recursive
    static boolean treeContains(TreeNode root, String item) {
        if (root == null) {
            return false;
        } else if (item.equals(root.item)) {
            return true;
        } else if (item.compareTo(root.item) < 0) {
            return treeContains(root.left, item);
        } else {
            return treeContains(root.right, item);
        }

    }

    public static void treeInsert(String newItem) {
        if (root == null) {
            root = new TreeNode(newItem);
            return;

        }

        TreeNode runner;
        runner = root;
        while (true) {
            if (newItem.compareTo(runner.item) < 0) {
                if (runner.left == null) {
                    runner.left = new TreeNode(newItem);
                    return;

                } else {
                    runner = runner.left;
                }
            } else {
                if (runner.right == null) {
                    runner.right = new TreeNode(newItem);
                    return;
                } else
                    runner = runner.right;
            }
        }
    }

    public static int countNodes(TreeNode node) {
        if (node == null)
            return 0;
        else {
            int count = 1;
            count += countNodes(node.left);
            count += countNodes(node.right);
            return count;
        }
    }

    static void preorderPrint(TreeNode root) {
        if (root != null) {
            System.out.println(root.item + " ");
            preorderPrint(root.left);
            preorderPrint(root.right);

        }

    }

    static void postorderPrint(TreeNode root) {
        if (root != null) {
            postorderPrint(root.left);
            postorderPrint(root.right);
            System.out.println(root.item + " ");
        }
    }

    static void inorderPrint(TreeNode node) {
        inorderPrint(node.left);
        System.out.println(" " + node.item);
        inorderPrint(node.right);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // for reading user's input

        System.out.println("This program stores strings that you enter in a binary sort");
        System.out.println("tree.  After each item is inserted, the contents of the tree");
        System.out.println("are displayed.  The number of nodes in the tree is also output.");
        System.out.println("    Any string you enter will be converted to lower case.");
        System.out.println("Duplicate entries are ignored.");

        while (true) {
            // Get one string from the user, insert it into the tree,
            // and print some information about the tree. Exit if the
            // user enters an empty string. Note that all strings are
            // converted to lower case.
            System.out.println("\n\nEnter a string to be inserted, or press return to end.");
            System.out.print("?  ");
            String item; // The user's input.
            item = in.nextLine().trim().toLowerCase();
            if (item.length() == 0)
                break;
            if (treeContains(root, item)) {
                // Don't insert a second copy of an item that is already
                // in the tree.
                System.out.println("\nThat item is already in the tree.");
            } else {
                treeInsert(item); // Add user's string to the tree.
                System.out.println("\nThe tree contains " + countNodes(root) + " items.");
                System.out.println("\nContents of tree:\n");
                // treeList(root);
                inorderPrint(root);
            }
        } // end while

        System.out.println("\n\nExiting program.");
        in.close();

    } // end main()

}