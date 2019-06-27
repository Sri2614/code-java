class Casio{
	public void add(int i, int j) {
		System.out.println(i+j);
	}
	
	public void add(int i, int j, int k) {
		System.out.println(i*j%k);
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio c = new Casio();
		c.add(45,56);
		c.add(45,5,11);
		
	}

}
