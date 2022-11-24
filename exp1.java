import java.util.*;
import java.lang.Math;
public class exp1 {
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the coefficients a,b,c");
 int a=sc.nextInt();
 int b=sc.nextInt();
 int c=sc.nextInt();
 double disc=(b*b)-(4*a*c);
double r1,r2;
 if(disc>0){
 r1=(-b-(Math.sqrt(disc)))/(2*a);
 r2=(-b+(Math.sqrt(disc)))/(2*a);
 System.out.println("the roots are real and distinct: ");
System.out.println("root 1 : "+r1);
System.out.println("root 2 : "+r2);
 }
else if(disc==0){
r1=(-b)/(2*a);
 System.out.println("the roots are real and equal: ");
System.out.println("root 1 : "+r1);
}

 else{
 System.out.println("roots are imaginary");
double d;
d=Math.abs(disc);
r1=(-b)/(2*a);
r2=(Math.sqrt(d))/(2*a);
System.out.println("root 1 :"+r1+"+i"+r2);
System.out.println("root 2 :"+r1+"-i"+r2);
 }
 }
}