import java.util.*;
public class HeightOfStar {
   public static void main (String[] args) {
	   Scanner sc = new Scanner (System.in);
	   int n = sc.nextInt();
	   int temp = n - 1 ;
	   while (temp >= 0) {
		   for (int i = temp; i>=1; i--)
		   System.out.print(" ");
		   for (int j = 1; j <= 2*(n - temp) - 1 ; j++ ) System.out.print("*");
		   System.out.print("\n");
		   temp --;
	   }
   }

}
