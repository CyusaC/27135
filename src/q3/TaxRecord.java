package q3;
import java.time.LocalDate;

public final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;

    public TaxRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                     String authorityName, String region, String email,
                     String categoryName, double rate, String code,
                     String tin, String taxpayerName, String address,
                     String employerName, String employerTIN, String contact,
                     String employeeName, double salary, String employeeTIN,
                     String declarationMonth, double totalIncome,
                     LocalDate assessmentDate, double assessedTax,
                     LocalDate paymentDate, double paymentAmount,
                     String receiptNo, double totalTax) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
                tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN,
                declarationMonth, totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount);
        this.receiptNo = receiptNo;
        this.totalTax = totalTax;
    }

    public void computeTax() {
        double credits = 30000; // Tax credits
        double computedTax = (getSalary() * getRate()) - credits;

        System.out.println("\n27135 - TAX RECORD");
        System.out.println("=".repeat(50));
        System.out.println("Receipt No: 27135-" + receiptNo);
        System.out.println("Taxpayer: 27135-" + getTaxpayerName());
        System.out.println("TIN: 27135-" + getTin());
        System.out.println("Employee: 27135-" + getEmployeeName());
        System.out.println("Salary: 27135-" + getSalary());
        System.out.println("Tax Rate: 27135-" + (getRate() * 100) + "%");
        System.out.println("Tax Credits: 27135-" + credits);
        System.out.println("Computed Tax: 27135-" + computedTax);
        System.out.println("Total Tax Paid: 27135-" + totalTax);
        System.out.println("Month: 27135-" + getDeclarationMonth());
        System.out.println("=".repeat(50));
    }
}