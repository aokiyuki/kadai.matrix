package kadai.matrix;

import java.util.Arrays;

public class matrix_main {
	public static void main(String[] args) {
		double a[][]={{0,1},{2,0},{0,3}};
		double b[][]={{1,-1,2},{3,0,4}};
		matrix_lib mlib = new matrix_lib(a,b);
		System.out.println("Product = "+ Arrays.deepToString(mlib.getProduct()));
		System.out.println("t = "+ Arrays.deepToString(mlib.getTranspose(b)));
	}
	
	
	
	

}
