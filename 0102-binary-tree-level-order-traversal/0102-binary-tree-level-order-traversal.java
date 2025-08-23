class Solution {
    private void work(TreeNode root, int levelIndex, List<List<Integer>> list) {
        if (root == null)
            return;
        if (list.size() <= levelIndex) {
            List<Integer> subList = new ArrayList<>();
            subList.add(root.val);
            list.add(subList);
        } else {
            list.get(levelIndex).add(root.val);
        }
        work(root.left, levelIndex + 1, list);
        work(root.right, levelIndex + 1, list);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        work(root, 0, list);
        return list;
    }
}