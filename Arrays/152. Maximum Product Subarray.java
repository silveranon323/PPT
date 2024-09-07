class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct=Integer.MIN_VALUE;
        int curr=1;
        for(int i=0 ;i<nums.length;i++){
            curr=curr*nums[i];
            maxproduct=Math.max(curr,maxproduct);
            if(curr==0){
                curr=1;
            }
        }
        curr=1;
        for(int i=nums.length-1 ;i>=0;i--){
            curr=curr*nums[i];
            maxproduct=Math.max(curr,maxproduct);
            if(curr==0){
                curr=1;
            }
        }

        return maxproduct;

    }
}
