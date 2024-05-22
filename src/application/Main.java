package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Tax;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Tax> taxPayer = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int taxPayers = sc.nextInt();
		for (int i = 1; i <= taxPayers; i++) {
			System.out.println("Tax payer #" + i + " data: ");

			System.out.print("Individual or Company (i/c): ");
			char ch = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health Expenditure: ");
				double healthExpenditure = sc.nextDouble();
				taxPayer.add(new Individual(name, anualIncome, healthExpenditure));
			} else if (ch == 'c') {
				System.out.print("Number of Employes: ");
				double numberEmployes = sc.nextDouble();
				taxPayer.add(new Company(name, anualIncome, numberEmployes));
			}
		}
		System.out.println("Taxes paid: ");
		for (Tax z : taxPayer) {
			System.out.print(z);
		}
		double sum = 0.00;
		for (Tax x : taxPayer) {
			sum += x.taxCalculation();
		}
		System.out.print("\n\nTotal Taxes: $ " + String.format("%.2f", sum));

		sc.close();
	}

}
