class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        boolean[] visited = new boolean[26];
        int[] freq = new int[26];

        // count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            freq[c - 'a']--;

            // skip if already in stack
            if (visited[c - 'a']) continue;

            // remove bigger characters if they appear later
            while (!st.isEmpty() && st.peek() > c && freq[st.peek() - 'a'] > 0) {
                visited[st.pop() - 'a'] = false;
            }

            st.push(c);
            visited[c - 'a'] = true;
        }

        // build result
        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }

        return result.toString();
    }
}