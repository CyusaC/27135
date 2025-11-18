package _27135.q1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("27135 - STOCK MANAGEMENT SYSTEM");
        System.out.println("=".repeat(50));

        try {
            // Entity Data
            System.out.println("\n>>> ENTITY INFORMATION <<<");
            System.out.print("Enter Entity ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Warehouse Data
            System.out.println("\n>>> WAREHOUSE INFORMATION <<<");
            System.out.print("Enter Warehouse Name: ");
            String warehouseName = scanner.nextLine();
            System.out.print("Enter Location: ");
            String location = scanner.nextLine();
            System.out.print("Enter Contact Number (10 digits): ");
            String contactNumber = scanner.nextLine();

            // Category Data
            System.out.println("\n>>> CATEGORY INFORMATION <<<");
            System.out.print("Enter Category Name: ");
            String categoryName = scanner.nextLine();
            System.out.print("Enter Category Code (alphanumeric, min 3 chars): ");
            String categoryCode = scanner.nextLine();

            // Supplier Data
            System.out.println("\n>>> SUPPLIER INFORMATION <<<");
            System.out.print("Enter Supplier Name: ");
            String supplierName = scanner.nextLine();
            System.out.print("Enter Supplier Email: ");
            String supplierEmail = scanner.nextLine();
            System.out.print("Enter Supplier Phone (10 digits): ");
            String supplierPhone = scanner.nextLine();

            // Product Data
            System.out.println("\n>>> PRODUCT INFORMATION <<<");
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Enter Unit Price: ");
            double unitPrice = scanner.nextDouble();
            System.out.print("Enter Stock Limit: ");
            int stockLimit = scanner.nextInt();
            scanner.nextLine();

            // Stock Item Data
            System.out.println("\n>>> STOCK ITEM INFORMATION <<<");
            System.out.print("Enter Quantity Available: ");
            int quantityAvailable = scanner.nextInt();
            System.out.print("Enter Reorder Level: ");
            int reorderLevel = scanner.nextInt();
            scanner.nextLine();

            // Purchase Data
            System.out.println("\n>>> PURCHASE INFORMATION <<<");
            System.out.print("Enter Purchase Date (YYYY-MM-DD): ");
            String purchaseDateStr = scanner.nextLine();
            LocalDate purchaseDate = LocalDate.parse(purchaseDateStr);
            System.out.print("Enter Purchased Quantity: ");
            int purchasedQuantity = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Purchase Supplier Name: ");
            String purchaseSupplierName = scanner.nextLine();

            // Sale Data
            System.out.println("\n>>> SALE INFORMATION <<<");
            System.out.print("Enter Sale Date (YYYY-MM-DD): ");
            String saleDateStr = scanner.nextLine();
            LocalDate saleDate = LocalDate.parse(saleDateStr);
            System.out.print("Enter Sold Quantity: ");
            int soldQuantity = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();

            // Inventory Data
            System.out.println("\n>>> INVENTORY INFORMATION <<<");
            System.out.print("Enter Total Items: ");
            int totalItems = scanner.nextInt();
            System.out.print("Enter Stock Value: ");
            double stockValue = scanner.nextDouble();
            scanner.nextLine();

            // Report Data
            System.out.println("\n>>> REPORT INFORMATION <<<");
            System.out.print("Enter Report Date (YYYY-MM-DD): ");
            String reportDateStr = scanner.nextLine();
            LocalDate reportDate = LocalDate.parse(reportDateStr);
            System.out.print("Enter Remarks: ");
            String remarks = scanner.nextLine();

            // Create StockReport object with all data
            LocalDate createdDate = LocalDate.now();
            LocalDate updatedDate = LocalDate.now();

            StockReport report = new StockReport(
                    id, createdDate, updatedDate,
                    warehouseName, location, contactNumber,
                    categoryName, categoryCode,
                    supplierName, supplierEmail, supplierPhone,
                    productName, unitPrice, stockLimit,
                    quantityAvailable, reorderLevel,
                    purchaseDate, purchasedQuantity, purchaseSupplierName,
                    saleDate, soldQuantity, customerName,
                    totalItems, stockValue,
                    reportDate, remarks
            );

            // Generate and display report
            report.generateReport();

        } catch (Exception e) {
            System.out.println("\n27135 - ERROR: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}