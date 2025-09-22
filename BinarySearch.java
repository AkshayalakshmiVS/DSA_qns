QN 1:Ceil The Floor
  class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int floor=-1,ceil=-1;
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==x){
                return new int[]{x,x};
            }
            else if(arr[mid]<x){
                floor=arr[mid];
                i=mid+1;
                
            }
            else{
                ceil=arr[mid];
                j=mid-1;
            }
        }
        return new int[] {floor,ceil};
    }
}
QN 2:First and Last Occurrences
// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first=findOccurance(arr,x,true);
        int last=findOccurance(arr,x,false);
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(first);
        list.add(last);
        
        return list;
        
    }
    private int findOccurance(int[] arr,int x,boolean flag){
        int i=0;
        int j=arr.length-1;
        int ans=-1;
        
        while(i<=j){
            int mid=i+(j-i)/2;
        if(arr[mid]==x){
            ans=mid;
            if(flag){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
            
        }
        else if(arr[mid]>x){
            j=mid-1;
        }
        else{
            i=mid+1;
        }
        
        }
        return ans;
        
    }
}
QN 3:Missing in Array
class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(arr[mid]==mid+1){
                i=mid+1;
                
            }
            else{
                j=mid;
            }
            
        }
        if(j+1==arr[n-1]){
            return n+1;
        }
        return j+1;
    }
}
