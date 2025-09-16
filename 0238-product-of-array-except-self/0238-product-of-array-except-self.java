class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[nums.length];
        int prodR=1;
        int prodL=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=prodR;
            prodR=prodR*nums[i];

        }
        for(int i=0;i<n;i++){
            ans[i]=prodL*ans[i];
            prodL=prodL*nums[i];
        }
        return ans;
        
    }
}