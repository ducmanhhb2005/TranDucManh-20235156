import java.util.*;
public class Mat {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
	double[][]	a=new double[n][m];
	double[][]  b=new double[n][m];
	double[][]  res=new double[n][m];
	for (int i=0; i<n; i++) {
		for (int j=0; j<m; j++) a[i][j]=sc.nextDouble();
	}
	for (int i=0; i<n; i++) {
		for (int j=0; j<m; j++) b[i][j]=sc.nextDouble();
	}
	for (int i=0; i<n; i++) {
		for (int j=0; j<m; j++) res[i][j]=a[i][j]+b[i][j];
	}
	for (int i=0; i<n; i++) {
		for (int j=0; j<m; j++) System.out.print(res[i][j]+" ");
		System.out.print("\n");
	}
	}
}