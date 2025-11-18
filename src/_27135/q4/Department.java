package _27135.q4;
import java.time.LocalDate;

public class Department extends Organization {
    private String deptName;
    private String deptCode;

    public Department(int id, LocalDate createdDate, LocalDate updatedDate,
                      String orgName, String address, String contactEmail,
                      String deptName, String deptCode) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);
        if (deptCode == null || deptCode.length() < 3)
            throw new IllegalArgumentException("27135: Department code must be >= 3 characters");
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
}