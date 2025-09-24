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
QN 4:Single Among Doubles in a Sorted
class Solution {
    int single(int[] arr) {
        // code here
        int n=arr.length;
        int i=0,j=n-2;
        while(i<=j){
            int mid=(i+j)/2;
            if(mid%2==0){
                if(arr[mid]==arr[mid+1]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
            else{
                if(arr[mid]==arr[mid-1]){
                    i=mid+1;
                }
                else {
                    j=mid-1;
                }
            }
            
        }
        return arr[i];
    }
}
QN 5:Search in Rotated Sorted Array
class Solution {
    int search(int[] arr, int key) {
        // code here
        int n=arr.length;
        int i=0,j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[i]<=arr[mid]){
                if(key>=arr[i] && key<arr[mid]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else{
                if(key<=arr[j]&&key>arr[mid]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }
        return -1;
    
    }
}
QN 6:153. Find Minimum in Rotated Sorted Array
class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]<arr[(mid-1+n)%n] && arr[mid]<arr[(mid+1)%n]){
                return arr[mid];
            }
        
                if(arr[j]>arr[mid]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            

        }
        return arr[0];
        
    }
}
QN 7:Find Kth Rotation
class Solution {
    public int findKRotation(int arr[]) {
        int n=arr.length;
       int i=0;
       int j=n-1;
       while(i<=j){
           int mid=i+(j-i)/2;
           if(arr[mid]<arr[(mid-1+n)%n] && arr[mid]<arr[(mid+1)%n]){
               return mid;
           }
           if(arr[j]>arr[mid]){
               j=mid-1;
           }
           else{
               i=mid+1;
           }
       }
       return 0;
    }
}
QN 7:162. Find Peak Element
class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        if(n==1) return 0;
        int i=0;
        int j=n-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(mid==0){
                return arr[j]>arr[i]?j:i;
            }
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid-1]<arr[mid]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return j;
        
    }
}
