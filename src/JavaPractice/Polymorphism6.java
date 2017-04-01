package JavaPractice;

public interface Polymorphism6 {
void m1();
void m2();
void m3();

}
class Test implements Polymorphism6{

	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}

	@Override
	public void m2() {System.out.println("m2 mmethod");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {System.out.println("m3 method");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		t.m2();
		t.m3();
		
	}}