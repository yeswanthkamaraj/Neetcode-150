class Solution {
    public int[] shuffle(int[] nums, int n) {

        int ans[]=new int[nums.length];
        int l=nums.length/2;
        int k=0;
        for(int i=0;i<ans.length;i++){
           
           if(i%2==0){
             ans[i]=nums[k++];
           }
           else{
            ans[i]=nums[l++];
           }
           

        }
       return ans; 
    }
}