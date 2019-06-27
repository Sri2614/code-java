class Demo{
	int num1;
	int num2;
	int result;
	
	 public Demo(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Hello");
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo(12,15);
		System.out.println(d.num1);
		System.out.println(d.num2);
	}

}
