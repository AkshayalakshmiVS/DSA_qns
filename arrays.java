QN1:Count Odd and Even
  class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int even=0,odd=0;
        for(int i:arr){
            if(i%2==0) even++;
            else odd++;
        }
        return new int[] {odd,even};
    }
}
QN2:Given an array arr[]. The task is to find the largest element and return it.
  class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=0;
        for(int i:arr){
            if(i>max)max=i;
            else continue;
            
        }
        return max;
    }
}
QN17:********************************************First and Second Smallests************************************************
class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> arrlist=new ArrayList<>();
        int small=Integer.MAX_VALUE;
        int secSmall=Integer.MAX_VALUE;
        if(arr.length<2){
            arrlist.add(-1);
            return arrlist;
        }
        for(int i:arr){
            if(i<small) {
                secSmall=small;
                small=i;
            }
            if(i>small && i<secSmall){
                secSmall=i;
            }
        }
        if(secSmall==Integer.MAX_VALUE) arrlist.add(-1);
        else{
            arrlist.add(small);
            arrlist.add(secSmall);
        }
        return arrlist;
        
    }
}
QN18:Min and Max in Array
class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i:arr){
            if(i<min) min=i;
            if(i>max) max=i;
        }
        return new Pair(min,max);
    }
}
QN19:Alternates in an Array

class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i+=2){
            res.add(arr[i]);
        }
        return res;
    }
}
QN20:Array Search
class Solution {
    public int search(int arr[], int x) {
        // code here
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) {
                res=i;
                break;}
            else res=-1;
        }
        return res;
    }
}
QN21:Find element at a given Index
class Solution {
    public static int findElementAtIndex(int key, int[] arr) {
        // code here
        if(key<arr.length)
           return arr[key];
        else
           return -1;
    }
}
QN22:Palindrome Array

class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        int res[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            res[j++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=res[i])
               return false;
        }
        return true;
    }
}
QN23:Max and Min Product from 2 Arrays
class Solution {
    // Function to find the maximum element from array arr1 and
    // the minimum element from array arr2 and return their product.
    public long findMultiplication(int[] arr1, int[] arr2) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int i:arr1){
            if(i>max) max=i;
            
        }
        int min=Integer.MAX_VALUE;
        for(int i:arr2){
            if(i<min) min=i;
        }
        long res=(long)min*max;
        return res;
    }
}
QN 24:*****************************************Sieve of Eratosthenes***********************************************************************

class Solution {
    public int[] sieve(int n) {
        // code here
        int[] arr=new int[n+1];
        Arrays.fill(arr,1);
        for(int i=2;i<=Math.sqrt(n);i++){
            if(arr[i]==1){
                for(int j=2*i;j<=n;j+=i){
                    arr[j]=0;
                }
            }
        }
        int c=0;
        for(int i=2;i<=n;i++){
            if(arr[i]==1) c++;
        }
        int[] primes=new int[c];
        int ind=0;
        for(int i=2;i<=n;i++){
            if(arr[i]==1){
                primes[ind++]=i;
            }
        }
        return primes;
        
    }
}

QN:25 ***************************Given a range [L, R]. The task is to find the sum of all the prime numbers in the given range from L to R both inclusive.*********************
  import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int[] arr=new int[r+1];
		Arrays.fill(arr,1);
		for(int i=2;i<=Math.sqrt(r);i++){
		    if(arr[i]==1){
		        for(int j=2*i;j<=r;j+=i){
		            arr[j]=0;
		        }
		    }
		}
		int sum=0;
		for(int i=l;i<=r;i++){
		    if(arr[i]==1){
		        sum+=i;
		    }
		}
		System.out.print(sum);
	}
}

QN 26:Sort 0s,1s,2s
class Solution {
    public void sort012(int[] arr) {
        // code here
        
        int left=0;
        int right=arr.length-1;
        int mid=0;
        while(mid<=right){
        if(arr[mid]==1) mid++;
        else if(arr[mid]==0) {
            swap(arr,mid,left);
            mid++;
            left++;
        }
        else if(arr[mid]==2){
            swap(arr,mid,right);
            right--;
        }
    }
    }
    private void swap(int[] arr,int a,int b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
}
qn 27:Rotate Array by One
class Solution {
    public void rotate(int[] arr) {
        // code here
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
            
        }
        arr[0]=temp;
    }
}
qn 28:189. Rotate Array
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] copy=new int[n-k];
        for(int i=0;i<n-k;i++){
            copy[i]=nums[i];
        }
        int j=0;
        for(int i=n-k;i<n;i++){
            nums[j]=nums[i];
            j++;
        }
        for(int i=0;i<copy.length;i++){
            nums[j]=copy[i];
            j++;
        }
    }
}
QN29:Find Kth Rotation

class Solution {
    public int findKRotation(int arr[]) {
       int x=-1;
       for(int i=0;i<arr.length-1;i++){
           if(arr[i]>arr[i+1]){
               x=i;
               break;
           }
           
       }
       return (x!=-1)?x+1:0;
    }
}
QN 30:Check Equal Arrays
class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        if(a.length!=b.length) return false;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        for(int num:a){
            
            if(num!=b[i]) {
                return false;
            }
            i++;
            
            
        }
    
        return true;
    }
}
QN 31:Check if array is sorted
class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
QN 32:Move All Zeroes to End
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
            arr[i]=0;
        }
    }
}
QN 33:Remove Duplicates Sorted Array
class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                list.add(arr[i]);
            }
        }
        list.add(arr[n-1]);
        return list;
    }
}
QN 34:Move all negative elements to end
class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> pos=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) neg.add(arr[i]);
            else pos.add(arr[i]);
        }
        int j=0;
        for(int num:pos) arr[j++]=num;
        for(int num:neg) arr[j++]=num;
        
    }
}
QN:35 Wave Array HINT:SWAP
Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place). In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on. If there are multiple solutions, find the lexicographically smallest one.
	class Solution {
    public void sortInWave(int arr[]) {
        // code here
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        
    }
}
