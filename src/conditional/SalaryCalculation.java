package conditional;

import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        double monthlySalary, coefficientsSalary, yearsOfService;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coefficients salary: ");
        coefficientsSalary = scanner.nextDouble();
        System.out.println("Years of service: ");
        yearsOfService = scanner.nextDouble();
        monthlySalary = coefficientsSalary * 4000000 + yearsOfService * 500000;

        System.out.printf("Monthly salary: %.2f", monthlySalary);
    }
}
