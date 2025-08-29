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

