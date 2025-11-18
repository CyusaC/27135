package q3;
import java.time.LocalDate;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate;
    private String code;

    public TaxCategory(int id, LocalDate createdDate, LocalDate updatedDate,
                       String authorityName, String region, String email,
                       String categoryName, double rate, String code) {
        super(id, createdDate, updatedDate, authorityName, region, email);
        if (rate <= 0) throw new IllegalArgumentException("27135: Tax rate must be > 0");
        if (code == null || code.length() < 3)
            throw new IllegalArgumentException("27135: Code must be >= 3 characters");
        this.categoryName = categoryName;
        this.rate = rate;
        this.code = code;
    }

    public String getCategoryName() { return categoryName; }
    public double getRate() { return rate; }
    public String getCode() { return code; }
}