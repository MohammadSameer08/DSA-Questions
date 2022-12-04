class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        int i=0,j=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                if(al.isEmpty() || al.get(al.size()-1) != arr1[i])
                   al.add(arr1[i]);
                i++;  
            }else if(arr1[i] < arr2[j]){
                if(al.isEmpty() || al.get(al.size()-1) != arr1[i])
                   al.add(arr1[i]);
                i++;  
            }else{
                if(al.isEmpty() || al.get(al.size()-1) != arr2[j])
                   al.add(arr2[j]);
               j++;
            } 
        }
        while(i<n){
           if(al.isEmpty() || al.get(al.size()-1) != arr1[i]){
                   al.add(arr1[i]); 
            }
            i++;
        }
        while(j<m){
           if(al.isEmpty() || al.get(al.size()-1) != arr2[j]){
                   al.add(arr2[j]); 
            }
            j++;
        }
        return al;
        
    }
}
