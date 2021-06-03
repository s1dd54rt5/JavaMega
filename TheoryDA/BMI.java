package TheoryDA;
import java.util.Scanner;
public class BMI {
public static void main(String[] args) {
Scanner s = new Scanner(System.in); System.out.println("Enter your weight in kg: ");
float weight = s.nextFloat();
System.out.println("Enter your height in cm: "); float height = s.nextInt();
float heightInMeters = height/100;
float bmi = weight/(heightInMeters*heightInMeters); System.out.println("Your BMI is: " + bmi);
} }