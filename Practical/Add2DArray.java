package Java;

public class Add2DArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {5,6,7,8,9};
		int c[]= new int[a.length];
		int j= a.length;

		System.out.print("Addition of Two Array(a+b): ");

		for(int i=0; i<a.length; i++) {
			//c[i]=a[i]+b[i];
			c[j-1]=a[i]+b[i];
			j=j-1;
			System.out.print(c[j]+"  ");
		}

	}

}
