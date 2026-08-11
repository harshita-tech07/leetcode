class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<n;i++){
            if(a==nums[i]) a++;
            else return a;
        }
        return n;
    }
}