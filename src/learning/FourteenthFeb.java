package learning;

import java.util.Scanner;

public class FourteenthFeb {
	
	public static float AverageOfSubjects(float math, float phy, float chem) {
		float averageOfSub = (math + phy + chem)/3;
		return averageOfSub;
	}
	
	public static float PercentageOfSubjects(float math, float phy, float chem) {
		float percentageOfSub = ((math + phy + chem)/300)*100;
		return percentageOfSub;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of Math: ");
		float math = sc.nextInt();
		System.out.println("Enter marks of Physics: ");
		float phy = sc.nextInt();
		System.out.println("Enter marks of Chemistry: ");
		float chem = sc.nextInt();
		
		System.out.println("The average of three subjects is: " + AverageOfSubjects(math, phy, chem));
		System.out.println("The percentages of three subjects is: " + PercentageOfSubjects(math, phy, chem));

	}

}
