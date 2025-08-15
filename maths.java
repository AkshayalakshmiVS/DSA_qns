QN1:Write a program that gets n as input and print the number of digits in the number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),c=0;
		while(n>0){
		    int dig=n%10;
		    n/=10;
		    c++;
		}
		System.out.println(c);
	}
}

QN2:Given a number N, find the sum of first and last digit of N.

class Solution {
    public int corner_digitSum(int n) {
        if(n<10){
            return n;
        }
        // code here
        int ldig=n%10;
        int fdig=0;
        while(n>0){
            fdig=n%10;
            n/=10;
        }
        int val=ldig+fdig;
        return val;
        
    }
}

QN3:Given two numbers a and b, find kth digit from right of ab.

class Solution {
    static long kthDigit(int a, int b, int k) {
        // code here
        long power=(long)Math.pow(a,b);
        long dig=0;
        for(int i=1;i<=k;i++){
            dig=power%10;
            power/=10;
        }
        return dig;
        
    }
}
