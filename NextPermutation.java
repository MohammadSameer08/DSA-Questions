class Solution {
    public void nextPermutation(int[] nums){
           int n=nums.length;
           int index1=-1;
           for(int i=n-2;i>=0;i--){      // (lastpeek-1)
               if(nums[i] < nums[i+1]){
                   index1=i;
                   break;    
               }      
           }
           if(index1==-1){
             Arrays.sort(nums);
           }else{
           int index2=-1;
           for(int i=n-1;i>index1;i--){
              if(nums[i] > nums[index1]){
                  index2=i;
                  break;    
              }          
           }
           swap(nums,index1,index2);
           Arrays.sort(nums,index1+1,n);        
           }
    }        
    public void swap(int nums[],int i,int j){
          int temp=nums[i];
          nums[i]=nums[j];
          nums[j]=temp;
    }
}
