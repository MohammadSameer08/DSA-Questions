class Solution{
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {   
        if(x==0) return -1;
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
           int mid=(s+e)/2;
           if(arr[mid]<x){
             ans=mid;  
             s=mid+1;
           }else if(arr[mid]>x){
             e=mid-1;  
           }else{
             return mid;  
           }
        }
        return ans;    
    }
    
}
