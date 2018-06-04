class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        else if(n == 1) return nums[0];
        int[] opt = new int[n];
        opt[0] = nums[0];
        opt[1] = Math.max(opt[0], nums[1]);
        for(int i=2;i<n;i++) {
            opt[i] = Math.max(opt[i-1], nums[i]+opt[i-2]);
        }
        return opt[n-1];
    }
}
