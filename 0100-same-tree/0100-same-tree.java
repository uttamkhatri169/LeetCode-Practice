class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Case 1: both null → same
        if (p == null && q == null) {
            return true;
        }

        // Case 2: one null, one not → not same
        if (p == null || q == null) {
            return false;
        }

        // Case 3: values differ → not same
        if (p.val != q.val) {
            return false;
        }

        // Case 4: recursively check left and right
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
