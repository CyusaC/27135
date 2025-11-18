package _27135.q6;
import java.time.LocalDate;

public class Department extends Organization {
    private String deptName;
    private String deptCode;
    private String managerName;

    public Department(int id, LocalDate createdDate, LocalDate updatedDate,
                      String orgName, String orgCode, String rssbNumber, String contactEmail,
                      String deptName, String deptCode, String managerName) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
        if (deptCode == null || deptCode.length() < 3)
            throw new IllegalArgumentException("27135: Dept code must be >= 3 characters");
        if (deptName == null || deptName.trim().isEmpty() || managerName == null || managerName.trim().isEmpty())
            throw new IllegalArgumentException("27135: Names cannot be empty");
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.managerName = managerName;
    }

    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
    public String getManagerName() { return managerName; }
}