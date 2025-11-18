package q6;
import java.time.LocalDate;

public class PayrollPeriod extends Employee {
    private int month;
    private int year;
    private LocalDate startDate;
    private LocalDate endDate;

    public PayrollPeriod(int id, LocalDate createdDate, LocalDate updatedDate,
                         String orgName, String orgCode, String rssbNumber, String contactEmail,
                         String deptName, String deptCode, String managerName,
                         int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                         int month, int year, LocalDate startDate, LocalDate endDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered);
        if (month < 1 || month > 12) throw new IllegalArgumentException("27135: Month must be 1-12");
        if (year < 2000) throw new IllegalArgumentException("27135: Year must be >= 2000");
        if (startDate == null || endDate == null)
            throw new IllegalArgumentException("27135: Dates cannot be null");
        this.month = month;
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getMonth() { return month; }
    public int getYear() { return year; }
    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }
}
