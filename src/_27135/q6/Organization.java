package _27135.q6;
import java.time.LocalDate;

public class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String rssbNumber;
    private String contactEmail;

    public Organization(int id, LocalDate createdDate, LocalDate updatedDate,
                        String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, createdDate, updatedDate);
        String cleanRssb = rssbNumber == null ? "" : rssbNumber.replaceAll("[^0-9]", "");
        if (cleanRssb.length() != 8)
            throw new IllegalArgumentException("27135: RSSB number must be 8 digits");
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"))
            throw new IllegalArgumentException("27135: Invalid email format");
        if (orgCode == null || orgCode.length() < 3)
            throw new IllegalArgumentException("27135: Org code must be >= 3 characters");
        this.orgName = orgName;
        this.orgCode = orgCode;
        this.rssbNumber = rssbNumber;
        this.contactEmail = contactEmail;
    }

    public String getOrgName() { return orgName; }
    public String getOrgCode() { return orgCode; }
    public String getRssbNumber() { return rssbNumber; }
    public String getContactEmail() { return contactEmail; }
}
