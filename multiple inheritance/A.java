class A 
{ 
 public A(String s) 
 
 {s="hello"; } 
} 
 
public class B extends A 
{ 
 public B(String s) 
 { 
     
s="b"; 
 } 
 
 public static void main(String[] args) 
 { 
 new B(“C”); 
 System.out.println(“ ”); 
 } 
}
