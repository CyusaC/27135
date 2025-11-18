package _27135.q5;
import java.time.LocalDate;

public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;

    public Institution(int id, LocalDate createdDate, LocalDate updatedDate,
                       String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);
        if (code == null || code.length() < 3)
            throw new IllegalArgumentException("27135: Code must be >= 3 characters");
        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }

    public String getInstitutionName() { return institutionName; }
    public String getCode() { return code; }
    public String getAddress() { return address; }
}