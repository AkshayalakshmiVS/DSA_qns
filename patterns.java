PATTERN1:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=1;j<n;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
output:5
  * * * * *
  * * * * *
  * * * * *
  * * * * *
  * * * * * 
PATTERN2:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=1;j<=n;j++){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}
output:4
  1 2 3 4 
  1 2 3 4
  1 2 3 4
  1 2 3 4

PATTERN3:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}
output : 4
  1
  1 2
  1 2 3 
  1 2 3 4

PATTERN4:
class Solution {
    static void printPattern(int N) {
        // code here
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}
output: 3
  * ** ***

PATTERN5:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=1;j<=n-i;j++){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}
output: 4
  1 2 3 4
  1 2 3
  1 2 
  1

PATTERN6:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=1;j<=n-i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}

output:4
  ****
  ***
  **
  *
PATTER7:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=n-i;j>=1;j--){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}
output:4
  4321
  321
  21
  1

PATTERN8:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
output:4
  *
  **
  ***
  ****

PATTERN9:
  

