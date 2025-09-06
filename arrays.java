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

