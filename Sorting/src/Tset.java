
public class Tset {
	
	String a,b;
	
	    public Tset(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	    public   void display() {
	    	System.out.println(a +" "+b);
	    }
	    public String toString(){ 
	    	  return this.a+" " +this.b;  
	    	 } 

		public static void main (String args[]) 
	    { 
	    	@SuppressWarnings("unused")
			Tset t1= new Tset("BHAV","SINGH");
	    	System.out.println(t1);
	    
	    } 
	} 


