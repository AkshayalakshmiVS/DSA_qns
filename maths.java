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
QN4:prime number or not

class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
}
QN5:Number of divisors

class Solution {
    static int countDivisors(int n) {
        // code here
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(i%3==0) c++;
            }
        }
        return c;
    }
}

QN6: sum of numbers
class Solution {
    public static int findSum(int n) {
        // code here
        if(n==0) return 0;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
QN7:series 1, 3, 6, 10, 15, 21

class Solution {
    static int findNthTerm(int n) {
        // code here
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
};
QN8: series 1 + (1+2) + (1+2+3) + (1+2+3+4) + …… + (1+2+3+4+…+n)

class Solution {
    static long sumOfTheSeries(long n) {
        // code here<)
        int sum=0,seriesSum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            seriesSum+=sum;
        }
        return seriesSum;
    }
}

QN9:series 1 + (1+3) + (1+3+5) + (1+3+5+7) + …… + (1+3+5+7+…+(2n-1))

class Solution {
    static long sumOfTheSeries(long n) {
        // code here
        int sum=0,sumSeries=0;
        for(int i=1;i<=2*n-1;i+=2){
            sum+=i;
            sumSeries+=sum;
        }
        return sumSeries;
    }
}

QN10:series 13 + 23 + 33 + 43 + … 
	
class Solution {
    int sumOfSeries(int n) {
        // code here
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i*i*i;
        }
        return sum;
    }
}

QN11:Given an integer N, find the absolute difference between sum of the squares of first N natural numbers and square of sum of first N natural numbers.
	
class Solution {
    static long squaresDiff(int N) {
        // code here
        long sqr=0;long wsqr=0;long res=0;
        for(long i=1;i<=N;i++){
            sqr+=i*i;
            wsqr+=i;
            res=Math.abs(sqr-(wsqr*wsqr));
            
        }
        return res;
    }
}
	QN12 Given a number N.Find the sum of fifth powers of natural numbers till N i.e. 15+25+35+..+N5.
class Solution {
    long sumOfFifthPowers(long N) {
        long ans = 0;
        ans = ((N * N) * (N + 1) * (N + 1) * (2 * N * N + 2 * N - 1)) / 12;
        return ans;
    }
}
