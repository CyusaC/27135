package q3;
import java.time.LocalDate;

public class Employee extends Employer {
    private String employeeName;
    private double salary;
    private String employeeTIN;

    public Employee(int id, LocalDate createdDate, LocalDate updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact,
                    String employeeName, double salary, String employeeTIN) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
                tin, taxpayerName, address, employerName, employerTIN, contact);
        if (salary <= 0) throw new IllegalArgumentException("27135: Salary must be > 0");
        String cleanTin = employeeTIN == null ? "" : employeeTIN.replaceAll("[^0-9]", "");
        if (cleanTin.length() != 9)
            throw new IllegalArgumentException("27135: Employee TIN must be 9 digits");
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeTIN = employeeTIN;
    }

    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public String getEmployeeTIN() { return employeeTIN; }
}