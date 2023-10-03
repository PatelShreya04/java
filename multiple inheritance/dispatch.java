class A 
{
	public A(){
	    
	   System.out.println("Inside A's callme method");
	}
	void details ()
	{
		System.out.println("hey its a printing...!!!");
	}
        }
class B extends A {
// override callme()
	public B(){
	System.out.println("Inside B's callme method");
	   }
}
class C extends B {
// override callme()
	 public C()
	 {
	System.out.println("Inside C's callme method");
	
		}
}
class dispatch {
	public static void main(String args[]) {
	//A a = new C(); // object of type A
   // A b=new B();
	A c=new C();
	c.details();// object of type C

	}
}