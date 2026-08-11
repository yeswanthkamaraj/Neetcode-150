class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int maxsp=nums[0];
        int mx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                maxsp+=nums[i];
            }else{
               break;
            }
          
        
        }
        int ans=0;
        for(int i=0;i<s.size();i++){
            if(s.contains(maxsp)){
                maxsp++;
            }else{
                return maxsp;
            }
        }
        return maxsp;
    }
}