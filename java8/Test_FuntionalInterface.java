package capgemini.java8;

@FunctionalInterface
interface Hello{
	void sayHello();
	//void sayHi();
}


//Before JDK 8
/*class HelloImpl implements Hello{
	@Override
	public void sayHello() {
		System.out.println("HelloImpl->Hello....");
	}
}
*/
public class Test_FuntionalInterface {
	public static void main(String[] args) {
		//Before JDK 8
		//Hello hello=new HelloImpl();
		//hello.sayHello();
		
		//anonymous class implementation
		
	/*	Hello hello1 =new Hello (){
			@Override
			public void sayHello() {
				System.out.println("Anonymous->Hello....");				
			}
		};*/
		
		/*Hello hello2 =new Hello (){
			@Override
			public void sayHello() {
				System.out.println("Anonymous->Hi....");				
			}
		};
		
		Hello hello3 =new Hello (){
			@Override
			public void sayHello() {
				System.out.println("Anonymous->HiHello....");				
			}
		};
		
		hello1.sayHello();
		hello2.sayHello();
		hello3.sayHello();*/
		
		//Type Inference...
		Hello hello1 =() ->	System.out.println("Anonymous->Hello....");				
		
		Hello hello4 =() -> System.out.println("Lambda->Hello....");		
		Hello hello5 =() -> System.out.println("Lambda->Hi....");		
		Hello hello6 =() -> System.out.println("Lambda->HiHello....");		
		
		hello4.sayHello();
		hello5.sayHello();
		hello6.sayHello();
	}

}
