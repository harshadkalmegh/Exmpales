
public class StaticNonStatic {

	 String name="Harshad";
	 static int i=25;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//call directly static
		sumwithstatic();
		System.out.println(i);
		//call by class name static
		StaticNonStatic.sumwithstatic();
		System.err.println(StaticNonStatic.i);
		//create object for non static
		StaticNonStatic nonstatic=new StaticNonStatic();
		nonstatic.sumwithoutstatic();
		System.out.println(nonstatic.name);
		
		//we can call static method by object reference but it is not a good practice
		nonstatic.sumwithstatic();
		System.out.println(nonstatic.i);
		
	}
	
	public static void sumwithstatic(){
		System.out.println("Static method");
		
	}

	public void sumwithoutstatic(){
		System.out.println("non static method");
		
	}
}
