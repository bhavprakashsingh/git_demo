
public class OverFlow {
	 static OverFlow o= new OverFlow();
	 static public OverFlow getIns() {
		
		return o;
	}
	//OverFlow o= new OverFlow();
@SuppressWarnings("unused")
public static void main(String[] args) {
	OverFlow o1= getIns();
	System.out.println("bhav");
	
		/*A a1 =new A();
		a1.display();*/

	}

}
	/*class A{
		A a=new A();
		public void display() {
			System.out.println("BHAV");
		}
	}
*/
	

