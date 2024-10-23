import java.util.*;
public class Calculate {
public static void main(String[] args) {
			// TODO Auto-generated constructor stub
			Scanner sc=new Scanner(System.in);
			String x = sc.nextLine();
                        String y = sc.nextLine();
                        double a = Double.parseDouble(x);
			double b = Double.parseDouble(y);
                         
			double sum=a+b;
			double difference= a-b;
			double product = a*b;
			System.out.print(sum+" "+difference+" "+product+" ");
			if (b!=0) System.out.print(a/b);
		}
}