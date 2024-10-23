import java.util.*;
public class LinearEquation {
public static void main(String[] args) {
			// TODO Auto-generated constructor stub
			Scanner sc=new Scanner(System.in);
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			if (a==0&&b==0) System.out.print("Vo So Nghiem");
			else if (a==0&&b!=0) System.out.print("Vo Nghiem");
			else System.out.print("Nghiem la:"+" "+ -b/a);
		}
}