package _27135.q6;
import java.time.LocalDate;

public final class Payslip extends Payroll {
    private String payslipNumber;
    private LocalDate issueDate;

    public Payslip(int id, LocalDate createdDate, LocalDate updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, LocalDate startDate, LocalDate endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double rssbContribution, double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus,
                   double grossSalary, double totalDeductions, double netSalary,
                   String payslipNumber, LocalDate issueDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
                basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction,
                overtimeHours, overtimeRate, bonus, grossSalary, totalDeductions, netSalary);
        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }

    public String generatePayslip() {
        double overtimePay = getOvertimeHours() * getOvertimeRate();
        double calculatedGross = getBasicPay() + getTransportAllowance() + getHousingAllowance() + overtimePay + getBonus();
        double calculatedDeductions = getRssbContribution() + getPayeTax() + getLoanDeduction();
        double calculatedNet = calculatedGross - calculatedDeductions;

        System.out.println("\n27135 - PAYSLIP");
        System.out.println("=".repeat(60));
        System.out.println("Payslip Number: 27135-" + payslipNumber);
        System.out.println("Organization: 27135-" + getOrgName());
        System.out.println("RSSB Number: 27135-" + getRssbNumber());
        System.out.println("Department: 27135-" + getDeptName());
        System.out.println("=".repeat(60));
        System.out.println("Employee ID: 27135-" + getEmployeeID());
        System.out.println("Full Name: 27135-" + getFullName());
        System.out.println("Position: 27135-" + getPosition());
        System.out.println("RSSB Registered: 27135-" + (isRssbRegistered() ? "Yes" : "No"));
        System.out.println("=".repeat(60));
        System.out.println("Period: 27135-" + getMonth() + "/" + getYear());
        System.out.println("From: 27135-" + getStartDate() + " To: 27135-" + getEndDate());
        System.out.println("=".repeat(60));
        System.out.println("EARNINGS:");
        System.out.println("  Basic Pay: 27135-" + getBasicPay());
        System.out.println("  Transport Allowance: 27135-" + getTransportAllowance());
        System.out.println("  Housing Allowance: 27135-" + getHousingAllowance());
        System.out.println("  Overtime (" + getOvertimeHours() + " hrs @ " + getOvertimeRate() + "): 27135-" + overtimePay);
        System.out.println("  Bonus: 27135-" + getBonus());
        System.out.println("  GROSS SALARY: 27135-" + calculatedGross);
        System.out.println("=".repeat(60));
        System.out.println("DEDUCTIONS:");
        System.out.println("  RSSB Contribution (5%): 27135-" + getRssbContribution());
        System.out.println("  PAYE Tax: 27135-" + getPayeTax());
        System.out.println("  Loan Deduction: 27135-" + getLoanDeduction());
        System.out.println("  TOTAL DEDUCTIONS: 27135-" + calculatedDeductions);
        System.out.println("=".repeat(60));
        System.out.println("NET SALARY: 27135-" + calculatedNet);
        System.out.println("Issue Date: 27135-" + issueDate);
        System.out.println("=".repeat(60));
        return null;
    }
}