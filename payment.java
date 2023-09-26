package payment;
import java.util.Scanner;
public class payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String a,b,c,d;
		int e,f,g,h;
	
		a=in.next();
	System.out.println("Enter course one"+a);
	b=in.next();
	System.out.println("Enter course 2"+b);
	c=in.next();
	System.out.println("Enter course 3"+c);
	d=in.next();
	System.out.println("Enter course 4"+d);
	e=in.nextInt();
	System.out.println("Enter score one"+e);
	f=in.nextInt();
	System.out.println("Enter score two"+f);
	g=in.nextInt();
	System.out.println("Enter score three"+g);
	h=in.nextInt();
	System.out.println("Enter score four"+h);
System.out.println("                      Department of Computer Science");
System.out.println("                           End Semester Results");
System.out.println("---------------------------------------------------------------------------");
System.out.println("|Name:-Faith achieng	  |Roll_No:c026-01-0974/2022	Semester:2.2");
System.out.println("___________________________________________________________________________");
System.out.println("|Unit Code			|Unit Name:			Score");
System.out.println("---------------------------------------------------------------------------");
System.out.print("|"+a);
System.out.print("\t\t\t|Database");
System.out.println("\t\t\t|"+e);
System.out.print("|"+b);
System.out.print("\t\t\t|Systems");
System.out.println("\t\t\t|"+f);
System.out.print("|"+c);
System.out.print("\t\t\t|Algorithm");
System.out.println("\t\t\t|"+g);
System.out.print("|"+d);
System.out.print("\t\t\t|Statistics");
System.out.println("\t\t\t|"+h);
System.out.println("-----------------------------------------------------------------------------");
System.out.print("|Total");
int total=e+f+g+h;
System.out.println("\t\t\t\t\t\t\t\t|"+total);
System.out.println("-----------------------------------------------------------------------------");
System.out.print("|Average");
double average=total/4;
System.out.printf("\t\t\t\t\t\t\t|%.2f\n",average);
System.out.println("-------------------------------------------------------------------------------");
System.out.print("|Grade");
if (average==100) {
	System.out.println("\t\t\t\t\t\t\t\t|A");
}
else if(average>=70) {System.out.println("\t\t\t\t\t\t\t\t|A");

	}
else if(average>=60) {System.out.println("\t\t\t\t\t\t\t\t|B");
}
else if(average>=50) {System.out.println("\t\t\t\t\t\t\t\t|C");
}
else if(average>=40) {System.out.println("\t\t\t\t\t\t\t\t|D");}
else {System.out.print("E");}
System.out.println("-------------------------------------------------------------------------------");
System.out.println("\t\t\t\t\t\t  Recommendation|");
System.out.println("--------------------------------------------------------------------------------");
System.out.println("Grading Criteria             Overall Grade(A-D)       Recommend Pass");
System.out.println("70-100       A");
System.out.println("60-70        B");
System.out.println("50-60        C");
System.out.println("40-50        D");
System.out.println("Below 40     F");
System.out.println("---------------------------------------------------------------------------------");

	}
}




