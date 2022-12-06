class Solution {
    public boolean check(int[] nums) {
      int k=0;
      int n=nums.length;      
      for(int i=0;i<nums.length;i++){
         if(nums[i] > nums[(i+1)%n]){   //(i+1) % n  need to compare last ele and fusrt ele [2,1,3,4] false since 4>2 
            k++;         
         }     
      }
      if(k > 1 ) return false;
      return true;      
    }
}
