class Solution {
    public int totalFruit(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        int left = 0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);
            while(map.size()>2){
                int value = map.get(nums[left]);
                if(value==1) map.remove(nums[left]);
                else map.put(nums[left], value-1);
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
    return ans;
    }
}
