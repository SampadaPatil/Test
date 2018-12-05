package durga;

class p
{
	public  void m1()
	{
		System.out.println("Parent Method");
	}
}
class c extends p
{
	public  void m1()
	{
		System.out.println("child Method");
	}
}

public class overriding {
	public static void main(String[] args) {
		p p1=new p();
		p1.m1();
		
		c c1=new c();
		c1.m1();
		
		//c c2=new p();
		//c1.m1();
		
		p p2=new c();
		p2.m1();
		
	}

}
