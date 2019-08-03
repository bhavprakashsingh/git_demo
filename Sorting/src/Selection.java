
public class Selection {
	static void select(int a[]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			int min =i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}

	public static void main(String[] args) {
		int a[]= {20,40,15,90,10,5};
		select(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
