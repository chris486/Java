class Fu{
	public void show(){
		System.out.println("fu show");
	}
}
class Zi extends Fu{
	public void show(){
		System.out.println("zi show");
	}

	public void method(){
		System.out.println("zi method");
	}
}
//编译报错
class DuoTaiTest {
	public static void main(String[] args) {
		Fu f = new Zi();
		f.method();
	}
}