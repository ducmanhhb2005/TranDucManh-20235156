import java.util.*;
public class SecondDegreeEquation {
public static void main(String[] args) {
			// TODO Auto-generated constructor stub
			Scanner sc=new Scanner(System.in);
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double c=sc.nextDouble();
			double delta=b*b-4*a*c;
			if (a==0) {
				if (b==0 && c==0) System.out.print("VoSoNghiem");
				else if (b==0) System.out.print("VoNghiem");
				else System.out.print("Nghiem la:"+" "+-c/b);
			}
			else {
				if (delta<0) System.out.print("VoNghiem");
				else if(delta==0) System.out.print("Nghiem la:"+" "+-b/(2*a));
				else System.out.print("Hai nghiem lan luot la:"+" "+(-b+Math.sqrt(delta))/(2*a)+" "+(-b-Math.sqrt(delta))/(2*a));
			}
			
}
}