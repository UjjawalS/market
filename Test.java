public class Test{

	public static void main(String args[]){
		System.out.println("In Main method..");
		Test chi = new Test();
		this.name("Raju");
	}
	public Test(){
	//	this = null;
		System.out.println("In child method..");


	}
	public static void name(String name){
			System.out.println("name "+name);
		}
}