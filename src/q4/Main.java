package q4;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== 27135 PROCUREMENT REPORT INPUT SYSTEM ===\n");

            System.out.print("Enter ID (>0): ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Organization Name: ");
            String orgName = sc.nextLine();

            System.out.print("Organization Address: ");
            String address = sc.nextLine();

            System.out.print("Organization Email: ");
            String email = sc.nextLine();

            System.out.print("Department Name: ");
            String deptName = sc.nextLine();

            System.out.print("Department Code (min 3 chars): ");
            String deptCode = sc.nextLine();

            System.out.print("Supplier Name: ");
            String supplierName = sc.nextLine();

            System.out.print("Supplier TIN (9 digits): ");
            String supplierTIN = sc.nextLine();

            System.out.print("Supplier Contact (10 digits): ");
            String contact = sc.nextLine();

            System.out.print("Product Name: ");
            String productName = sc.nextLine();

            System.out.print("Unit Price (>0): ");
            double unitPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            System.out.print("Purchase Order Number: ");
            String poNumber = sc.nextLine();

            System.out.print("Invoice Number: ");
            String invoiceNo = sc.nextLine();

            System.out.print("Invoice Amount: ");
            double invoiceAmount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Delivered By: ");
            String deliveredBy = sc.nextLine();

            System.out.print("Inspector Name: ");
            String inspectorName = sc.nextLine();

            System.out.print("Inspection Status (Passed/Failed): ");
            String status = sc.nextLine();

            System.out.print("Inspection Remarks: ");
            String remarks = sc.nextLine();

            System.out.print("Report Summary: ");
            String summary = sc.nextLine();



            ProcurementReport report = new ProcurementReport(
                    id,
                    LocalDate.now(),
                    LocalDate.now(),
                    orgName,
                    address,
                    email,
                    deptName,
                    deptCode,
                    supplierName,
                    supplierTIN,
                    contact,
                    productName,
                    unitPrice,
                    quantity,
                    poNumber,
                    LocalDate.now(),
                    unitPrice * quantity,
                    LocalDate.now(),
                    deliveredBy,
                    inspectorName,
                    status,
                    remarks,
                    invoiceNo,
                    invoiceAmount,
                    LocalDate.now(),
                    summary
            );

            System.out.println("\n=== GENERATING PROCUREMENT REPORT ===");
            report.calculateTotal();

        } catch (Exception e) {
            System.out.println("\nError 27135: " + e.getMessage());
        }

        sc.close();
    }
}
