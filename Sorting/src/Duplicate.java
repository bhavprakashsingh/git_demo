import java.util.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class Duplicate {

 static 	void dupli(int a[]) {
	 int n=a.length;
	 for(int i=0;i<n;i++) {
		 for (int j = i+1; j < a.length; j++) {
			 if(a[i]==a[j]) {
				 a[j]=a[n-1];
				 n--;
				 j--;
				 
			 }
			
		}
	 }
	 
	 
		
	}
	public static void main(String[] args) {
		int a[]= {1,1,2,1,2,2,3,3};
		Set<Integer> set = new HashSet<Integer>();

		for(int i = 0; i < a.length; i++){
		  set.add(a[i]);
		}
		java.util.Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
		  System.out.println(it.next());
		}
	}
}
