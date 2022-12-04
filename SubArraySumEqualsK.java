class Solution {
    public int subarraySum(int[] nums, int k){
       Map<Integer,Integer> m=new HashMap<>();
            int count=0;
            int currSum=0;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                   currSum+=nums[i];  
                   if(currSum==k)
                           count++;
                   if(m.containsKey(currSum-k)){
                           count+=m.get(currSum-k);
                   }
                    if(m.containsKey(currSum)) 
                          m.put(currSum,m.get(currSum)+1);  
                    else m.put(currSum,1);
            }
     return count;
    }
}
