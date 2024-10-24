import java.util.*;
public class NumericArray {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  double[] a=new double[n];
	  TreeMap<Double,Integer> map= new TreeMap<>();
	  for (int i=0; i<n; i++) {
		  a[i]=sc.nextDouble();
		  if (map.containsKey(a[i])) {
			  int x= map.get(a[i]);
			  x++;
			  map.put(a[i], x);
		  }
		  else map.put(a[i], 1);
		  
	  }
	  double sum = 0;
	 Set<Map.Entry<Double, Integer>> set=map.entrySet();
	 for (Map.Entry<Double, Integer> x:set) {
		 for (int i=1; i<=x.getValue(); i++) {System.out.print(x.getKey()+" ");
		 sum += x.getKey()*x.getValue();
		 }
		 }
	 
	 System.out.print("\n");
	 System.out.println("Tong la: " + sum);
	 System.out.println("Average is: "+  sum/n);
	 
	  
  }
	
}
