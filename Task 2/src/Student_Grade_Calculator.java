import java.util.Scanner;

public class Student_Grade_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter Total Number of Subjects");
		float n = in.nextInt();
		System.out.println("Enter the Marks of the Subjects");
		float sum=0;
		for(int i=0;i<n;i++) {
			float m = in.nextInt();
			 sum = sum + m;
		}
	//	System.out.println("Total Marks : " + sum);
		
		float total_sum = n*100;
	//	System.out.println("Total sum " + total_sum);
		double avg = (sum / total_sum) *100;
		System.out.println("Total Marks " + sum);
		System.out.println("Average Percentage : " + avg);
		
		// Grade Calculation
		if(avg >= 90)
			System.out.println("Grade : A ");
		else if(avg>= 80)
			System.out.println("Grade : B ");
		else if(avg >= 70)
			System.out.println("Grade : C ");
		else if(avg >=60)
			System.out.println("Grade : D ");
		else
			System.out.println("Grade : E ");
	
	}
}