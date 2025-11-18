package q4;
import java.time.LocalDate;

public class Supplier extends Department {
    private String supplierName;
    private String supplierTIN;
    private String contact;

    public Supplier(int id, LocalDate createdDate, LocalDate updatedDate,
                    String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode);
        String cleanTin = supplierTIN == null ? "" : supplierTIN.replaceAll("[^0-9]", "");
        if (cleanTin.length() != 9)
            throw new IllegalArgumentException("27135: Supplier TIN must be 9 digits");
        String cleanPhone = contact == null ? "" : contact.replaceAll("[^0-9]", "");
        if (cleanPhone.length() != 10)
            throw new IllegalArgumentException("27135: Contact must be 10 digits");
        this.supplierName = supplierName;
        this.supplierTIN = supplierTIN;
        this.contact = contact;
    }

    public String getSupplierName() { return supplierName; }
    public String getSupplierTIN() { return supplierTIN; }
    public String getContact() { return contact; }
}