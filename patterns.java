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
class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

output:5
	* 
	* *
	* * *
	* * * *
	* * * * *
	* * * *
	* * * 
	* * 
	* 
PATTERN10:
class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
output:4
   *
  * * *
 * * * * * 
* * * * * * *
PATTERN11:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i-1;j++){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=2*n-(2*i-1);k++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
output:4
*******
 *****
  ***
   *
PATTERN12:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n-i;j++){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=2*i-1;k++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for(int i=1;i<=n-1;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=2*n-(2*i+1);k++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
output:4
   *
  ***
 *****
*******
 *****
  ***
   *
PATTERN13:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int count=1;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(count+" ");
		        count++;
		    }
		    System.out.println();
		}
	}
}
output:4
1
2 3 
4 5 6
7 8 9 10
PATTERN14:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(i);
		      
		    }
		    System.out.println();
		}
	}
}
output:6
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
6 6 6 6 6 6 


	

