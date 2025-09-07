QN1:Write a recursive algorithm to find the count of digits in a number.
import java.util.*;
public class Main{
    int countdigit(int n){
        if(n%10==n) return 1;
        else{
            return 1+countdigit(n/10);
        }
    }
    public static void main(String[] args){
        Main dig=new Main();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=dig.countdigit(n);
        System.out.print(res);
        
    }
}
QN2:sum the digits in a number
import java.util.*;
public class Main{
    int countdigit(int n){
        if(n%10==n) return n;
        else{
            return n%10+countdigit(n/10);
        }
    }
    public static void main(String[] args){
        Main dig=new Main();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=dig.countdigit(n);
        System.out.print(res);
        
    }
}
QN3:*****************************************************count zeros in a digit*****************************************************************
  import java.util.*;
public class Main{
    int countzero(int n){
        if(n%10==n){
            if(n%10==0) return 1;
            else return 0;
        }
        if(n%10==0){
            return 1+countzero(n/10);
        }
        else{
            return countzero(n/10);
        }
    }
    public static void main(String[] args){
        Main dig=new Main();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=dig.countzero(n);
        System.out.print(res);
        
    }
}
