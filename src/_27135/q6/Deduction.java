package q6;
import java.time.LocalDate;

public class Deduction extends SalaryStructure {
    private double rssbContribution;
    private double payeTax;
    private double loanDeduction;

    public Deduction(int id, LocalDate createdDate, LocalDate updatedDate,
                     String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                     int month, int year, LocalDate startDate, LocalDate endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double rssbContribution, double payeTax, double loanDeduction) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
                basicPay, transportAllowance, housingAllowance);
        if (rssbContribution < 0 || payeTax < 0 || loanDeduction < 0)
            throw new IllegalArgumentException("27135: Deductions cannot be negative");
        // Validate RSSB is 5% of basic pay
        double expectedRssb = basicPay * 0.05;
        if (Math.abs(rssbContribution - expectedRssb) > 0.01)
            throw new IllegalArgumentException("27135: RSSB must be 5% of basic pay");
        this.rssbContribution = rssbContribution;
        this.payeTax = payeTax;
        this.loanDeduction = loanDeduction;
    }

    public double getRssbContribution() { return rssbContribution; }
    public double getPayeTax() { return payeTax; }
    public double getLoanDeduction() { return loanDeduction; }
}