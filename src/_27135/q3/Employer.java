package _27135.q3;
import java.time.LocalDate;

public class Employer extends Taxpayer {
    private String employerName;
    private String employerTIN;
    private String contact;

    public Employer(int id, LocalDate createdDate, LocalDate updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
                tin, taxpayerName, address);
        String cleanTin = employerTIN == null ? "" : employerTIN.replaceAll("[^0-9]", "");
        if (cleanTin.length() != 9)
            throw new IllegalArgumentException("27135: Employer TIN must be 9 digits");
        String cleanPhone = contact == null ? "" : contact.replaceAll("[^0-9]", "");
        if (cleanPhone.length() != 10)
            throw new IllegalArgumentException("27135: Contact must be 10 digits");
        this.employerName = employerName;
        this.employerTIN = employerTIN;
        this.contact = contact;
    }

    public String getEmployerName() { return employerName; }
    public String getEmployerTIN() { return employerTIN; }
    public String getContact() { return contact; }
}