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
QN4:Write a program to print the divisors of a number recursively.
import java.util.*;
public class Main{
    public void printdiv(int n,int i){
        if(i>n){
            return ;
        }
        if(n%i==0){
            System.out.print(i+" ");
        }
        printdiv(n,i+1);
    }
    public static void main(String[] args){
        Main dig=new Main();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dig.printdiv(n,1);
        
    }
}
QN5:Write a Program to find the power of a number recursively. Take two inputs, number and the power.
import java.util.*;
public class Main{
    int pow(int n1,int n2){
        int res=1;
        if(n2==0){
            return 1;
        }
        return n1*pow(n1,n2-1);
    }
    public static void main(String[] args){
        Main dig=new Main();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        System.out.print(dig.pow(n,n2));
        
    }
}
