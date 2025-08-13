class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        int prevAbsolute = Integer.MAX_VALUE;

        for(int i = 0; i < n - 2; i++){

            int j = i + 1; int k = n - 1;

            while( j < k ) {
                
                int sum = nums[i] + nums[j] + nums[k];
                int absolute = Math.abs(target - sum);
                if(absolute < prevAbsolute || (absolute == prevAbsolute && sum > ans)){
                    prevAbsolute = absolute;
                    ans = sum;
                }

                if(sum < target) j++;
                else k--;

            }
        }

        return ans;

    }
}