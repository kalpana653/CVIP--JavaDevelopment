package BMI;
import java.util.Scanner;
public class BmiCalculation {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your weight in kg: ");
		        double weight = scanner.nextDouble();

		        System.out.print("Enter your height in meter: ");
		        double height = scanner.nextDouble();

		        double bmi = calculateBMI(weight, height);
		        
		        System.out.println("Your BMI is: " + bmi);
		        System.out.println("Interpretation: " + interpretBMI(bmi));

		        scanner.close();
		    }

		    public static double calculateBMI(double weight, double height) {
		        return weight / (height * height);
		    }

		    public static String interpretBMI(double bmi) {
		        if (bmi < 18.5) {
		            return " you are Underweight!!";
		        } else if (bmi >= 18.5 && bmi < 25) {
		            return " you are Normal weight!!";
		        } else if (bmi >= 25 && bmi < 30) {
		            return " you are Overweight!!";
		        } else {
		            return " you are Obese!!";
		        }
		    }
		}


	
