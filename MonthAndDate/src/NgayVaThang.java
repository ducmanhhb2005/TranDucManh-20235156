import java.util.*;
public class NgayVaThang {
	 public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 ArrayList<String> arr= new ArrayList<>();
		 for (int i=1; i<=12; i++) {
			 switch(i){
			 case 1:
				 arr.add("January");
				 arr.add("Jan.");
				 arr.add("Jan");
				 arr.add("1");
				 break;
			 case 2:
				 arr.add("February");
				 arr.add("Feb.");
				 arr.add("Feb");
				 arr.add("2");
				 break;
			 case 3:
				 arr.add("March");
				 arr.add("Mar.");
				 arr.add("Mar");
				 arr.add("3");
				 break;
			 case 4:
				 arr.add("April");
				 arr.add("Apr.");
				 arr.add("Apr");
				 arr.add("4");
				 break;
			 case 5:
				 arr.add("May");
				 
				 arr.add("5");
				 break;
			 case 6:
				 arr.add("June");
				 arr.add("Jun");
				 arr.add("6");
				 break;
			 case 7:
				 arr.add("July");
				 arr.add("Jul");
				 arr.add("7");
				 break;
			 case 8:
				 arr.add("August");
				 arr.add("Aug.");
				 arr.add("Aug");
				 arr.add("8");
				 break;
			 case 9:
				 arr.add("September");
				 arr.add("Sep");
				 arr.add("Sept.");
				 arr.add("9");
				 break;
			 case 10:
				 arr.add("October");
				 arr.add("Oct.");
				 arr.add("Oct");
				 arr.add("10");
				 break;
			 case 11:
				 arr.add("November");
				 arr.add("Nov.");
				 arr.add("Nov");
				 arr.add("11");
				 break;
			 case 12:
				 arr.add("December");
				 arr.add("Dec.");
				 arr.add("Dec");
				 arr.add("12");
				 break;
			 }
		 }
		 int year;
		 do {
			 year = sc.nextInt();
		 }
		 while (year < 0);
		 String month;
		 do {
			  month = sc.nextLine();

		 }
		 while(!arr.contains(month));
		 switch (month) {
		 case "January": case "Jan.": case "Jan": case "1":
			 System.out.print("31");
			 break;
		 case "February": case "Feb.": case "Feb": case "2":
			 if (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)) System.out.print("29");
			 else System.out.print("28");
			 break;
		 case "March": case "Mar": case "Mar.": case "3":
			 System.out.print("31");
			 break;
		 case "April": case "Apr.": case "Apr": case "4":
			 System.out.print("30");
			 break;
		 case "May": case "5": case "July": case "Jul": case "7": case "August": case "Aug.": case "Aug": case "8": 
			 System.out.print("31");
			 break;
		 case "June": case "Jun": case "6": case "September": case "Sept.": case "Sep": case "9":
			 System.out.print("30");
			 break;
		 case "October": case "Oct.": case "Oct": case "10": case "December": case "Dec.": case "Dec": case "12":
			 System.out.print("31");
			 break;
		 case "November": case "Nov": case "Nov.": case "11":
			 System.out.print("30");
			 break;
		 }
	 }
	}

