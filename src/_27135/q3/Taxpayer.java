package q3;
import java.time.LocalDate;

public class Taxpayer extends TaxCategory {
    private String tin;
    private String taxpayerName;
    private String address;

    public Taxpayer(int id, LocalDate createdDate, LocalDate updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code);
        String cleanTin = tin == null ? "" : tin.replaceAll("[^0-9]", "");
        if (cleanTin.length() != 9)
            throw new IllegalArgumentException("27135: TIN must be exactly 9 digits");
        if (taxpayerName == null || taxpayerName.trim().isEmpty())
            throw new IllegalArgumentException("27135: Taxpayer name cannot be empty");
        this.tin = tin;
        this.taxpayerName = taxpayerName;
        this.address = address;
    }

    public String getTin() { return tin; }
    public String getTaxpayerName() { return taxpayerName; }
    public String getAddress() { return address; }
}