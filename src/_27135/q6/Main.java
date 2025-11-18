package q6;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("=== 27135 PAYSLIP GENERATOR ===\n");


            System.out.print("Enter ID (>0): ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Organization Name: ");
            String orgName = sc.nextLine();

            System.out.print("Organization Code (>=3 chars): ");
            String orgCode = sc.nextLine();

            System.out.print("RSSB Number (8 digits): ");
            String rssbNumber = sc.nextLine();

            System.out.print("Organization Email: ");
            String email = sc.nextLine();


            System.out.print("Department Name: ");
            String deptName = sc.nextLine();

            System.out.print("Department Code (>=3 chars): ");
            String deptCode = sc.nextLine();

            System.out.print("Manager Name: ");
            String managerName = sc.nextLine();


            System.out.print("Employee ID (>=1000): ");
            int empID = sc.nextInt();
            sc.nextLine();

            System.out.print("Full Name: ");
            String fullName = sc.nextLine();

            System.out.print("Position: ");
            String position = sc.nextLine();

            System.out.print("Base Salary (>0): ");
            double baseSalary = sc.nextDouble();

            System.out.print("Registered with RSSB (true/false): ");
            boolean registered = sc.nextBoolean();

            System.out.print("Month (1-12): ");
            int month = sc.nextInt();

            System.out.print("Year (>=2000): ");
            int year = sc.nextInt();
            sc.nextLine();

            System.out.print("Start Date (YYYY-MM-DD): ");
            LocalDate startDate = LocalDate.parse(sc.nextLine());

            System.out.print("End Date (YYYY-MM-DD): ");
            LocalDate endDate = LocalDate.parse(sc.nextLine());

            System.out.print("Basic Pay: ");
            double basicPay = sc.nextDouble();

            System.out.print("Transport Allowance: ");
            double transport = sc.nextDouble();

            System.out.print("Housing Allowance: ");
            double housing = sc.nextDouble();


            double expectedRssb = basicPay * 0.05;
            System.out.println("\n* RSSB auto-check: 5% of Basic Pay = " + expectedRssb);

            System.out.print("RSSB Contribution (must equal 5% Basic Pay): ");
            double rssbContr = sc.nextDouble();

            System.out.print("PAYE Tax: ");
            double paye = sc.nextDouble();

            System.out.print("Loan Deduction: ");
            double loan = sc.nextDouble();

            System.out.print("Overtime Hours: ");
            double overtimeHours = sc.nextDouble();

            System.out.print("Overtime Rate: ");
            double overtimeRate = sc.nextDouble();

            System.out.print("Bonus: ");
            double bonus = sc.nextDouble();


            System.out.print("Gross Salary: ");
            double gross = sc.nextDouble();

            System.out.print("Total Deductions: ");
            double totalDeductions = sc.nextDouble();

            System.out.print("Net Salary: ");
            double netSalary = sc.nextDouble();
            sc.nextLine();


            System.out.print("Payslip Number: ");
            String payslipNumber = sc.nextLine();

            System.out.print("Issue Date (YYYY-MM-DD): ");
            LocalDate issueDate = LocalDate.parse(sc.nextLine());


            Payslip payslip = new Payslip(
                    id, LocalDate.now(), LocalDate.now(),
                    orgName, orgCode, rssbNumber, email,
                    deptName, deptCode, managerName,
                    empID, fullName, position, baseSalary, registered,
                    month, year, startDate, endDate,
                    basicPay, transport, housing,
                    rssbContr, paye, loan,
                    overtimeHours, overtimeRate, bonus,
                    gross, totalDeductions, netSalary,
                    payslipNumber, issueDate
            );


            System.out.println("\n=== GENERATING PAYSLIP ===");
            payslip.generatePayslip();

        } catch (Exception e) {
            System.out.println("\nERROR 27135: " + e.getMessage());
        }

        sc.close();
    }
}
