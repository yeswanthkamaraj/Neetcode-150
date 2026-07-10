class Solution {
    public int[] getConcatenation(int[] nums) {
        
    int ans[]=new int[nums.length*2];
    int j=0;
    int i=0;
    while(i<nums.length){
        
        if(ans.length>j){
            ans[j]=nums[i];
            i++;
            j++;
        }
        else{
            return ans;
        }
        if(i==nums.length){
            i=0;
        }
        
      }

    
    return new int[]{0,0};
    }
}