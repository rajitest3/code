/*
In a binary tree, if in the path from root to the node A, 
there is no node with greater value than A’s, 
this node A is visible. We need to count the number of visible nodes in a binary tree.
*/

// Time: O(n)
// Space: O(n)

public int countVisibleNodes(TreeNode root) {
    return countVisibleNodes(root, Integer.MIN_VALUE);
}

private int countVisibleNodes(TreeNode node, int maxSoFar) {
    if (node == null) return 0;

    int count = 0;

    if (node.val >= maxSoFar) {
        count = 1;
        maxSoFar = node.val;
    }

    return count + countVisibleNodes(node.left, maxSoFar) + countVisibleNodes(node.right, maxSoFar);
}
