import java.util.*;
public class LinearSystem {
public static void main(String[] args) {
			// TODO Auto-generated constructor stub
			Scanner sc=new Scanner(System.in);
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double c=sc.nextDouble();
			double d= sc.nextDouble();
			double e=sc.nextDouble();
			double f=sc.nextDouble();
			double doff=a*e-d*b;
			double dx=c*e-b*f;
			double dy=a*f-c*d;
			if (doff==0&&dx==0) System.out.print("VoSoNghiem");
			else if (doff==0) System.out.print("VoNghiem");
			else System.out.print("Phuong trinh co hai nghiem la"+" "+"x="+dx/doff+" "+"y="+dy/doff);
			
}
}
