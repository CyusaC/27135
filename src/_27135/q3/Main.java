package _27135.q3;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 27135 TAX RECORD INPUT SYSTEM ===");

        try {
            System.out.print("Enter ID (>0): ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Authority Name: ");
            String authorityName = sc.nextLine();

            System.out.print("Region: ");
            String region = sc.nextLine();

            System.out.print("Authority Email: ");
            String email = sc.nextLine();

            System.out.print("Tax Category Name: ");
            String categoryName = sc.nextLine();

            System.out.print("Tax Rate (e.g. 0.3 for 30%): ");
            double rate = sc.nextDouble();
            sc.nextLine();

            System.out.print("Tax Code: ");
            String code = sc.nextLine();

            System.out.print("Taxpayer TIN (9 digits): ");
            String tin = sc.nextLine();

            System.out.print("Taxpayer Name: ");
            String taxpayerName = sc.nextLine();

            System.out.print("Taxpayer Address: ");
            String address = sc.nextLine();

            System.out.print("Employer Name: ");
            String employerName = sc.nextLine();

            System.out.print("Employer TIN (9 digits): ");
            String employerTIN = sc.nextLine();

            System.out.print("Employer Contact (10 digits): ");
            String contact = sc.nextLine();

            System.out.print("Employee Name: ");
            String employeeName = sc.nextLine();

            System.out.print("Employee Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Employee TIN (9 digits): ");
            String employeeTIN = sc.nextLine();

            System.out.print("Declaration Month: ");
            String declarationMonth = sc.nextLine();

            System.out.print("Total Income: ");
            double totalIncome = sc.nextDouble();
            sc.nextLine();

            System.out.print("Assessed Tax: ");
            double assessedTax = sc.nextDouble();
            sc.nextLine();

            System.out.print("Payment Amount: ");
            double paymentAmount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Receipt Number: ");
            String receiptNo = sc.nextLine();

            TaxRecord record = new TaxRecord(
                    id, LocalDate.now(), LocalDate.now(),
                    authorityName, region, email,
                    categoryName, rate, code,
                    tin, taxpayerName, address,
                    employerName, employerTIN, contact,
                    employeeName, salary, employeeTIN,
                    declarationMonth, totalIncome,
                    LocalDate.now(), assessedTax,
                    LocalDate.now(), paymentAmount,
                    receiptNo, assessedTax
            );

            String computedResult = record.computeTax();
            String finalOutput = "27135:" + computedResult;

            System.out.println("\n=== COMPUTED TAX RECORD (Student ID: 27135) ===");
            System.out.println(finalOutput);

        } catch (Exception e) {
            System.out.println("27135:Error - " + e.getMessage());
        } finally {
            sc.close();
        }

        System.out.println("\n>>> END OF EXECUTION [StudentID:27135] <<<");
    }
}