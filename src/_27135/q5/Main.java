package q5;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("=== 27135 - ATTENDANCE SUMMARY INPUT SYSTEM ===\n");

            System.out.print("Enter ID (>0): ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Institution Name: ");
            String institutionName = sc.nextLine();

            System.out.print("Institution Code (>=3 chars): ");
            String code = sc.nextLine();

            System.out.print("Institution Address: ");
            String address = sc.nextLine();

            System.out.print("Department Name: ");
            String departmentName = sc.nextLine();

            System.out.print("Department Head: ");
            String departmentHead = sc.nextLine();

            System.out.print("Course Name: ");
            String courseName = sc.nextLine();

            System.out.print("Course Code: ");
            String courseCode = sc.nextLine();

            System.out.print("Course Credits (>0): ");
            int credits = sc.nextInt();
            sc.nextLine();

            System.out.print("Instructor Name: ");
            String instructorName = sc.nextLine();

            System.out.print("Instructor Email: ");
            String email = sc.nextLine();

            System.out.print("Instructor Phone (10 digits): ");
            String phone = sc.nextLine();

            System.out.print("Student Name: ");
            String studentName = sc.nextLine();

            System.out.print("Student ID: ");
            String studentID = sc.nextLine();

            System.out.print("Student Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Session Topic: ");
            String topic = sc.nextLine();

            System.out.print("Session Date (YYYY-MM-DD): ");
            LocalDate sessionDate = LocalDate.parse(sc.nextLine());

            System.out.print("Attendance Student ID: ");
            String recordStudentID = sc.nextLine();

            System.out.print("Session ID: ");
            String sessionID = sc.nextLine();

            System.out.print("Attendance Status (Present/Absent): ");
            String status = sc.nextLine();

            System.out.print("Leave Request Reason: ");
            String reason = sc.nextLine();

            System.out.print("Leave Request Date (YYYY-MM-DD): ");
            LocalDate requestDate = LocalDate.parse(sc.nextLine());

            System.out.print("Approved? (true/false): ");
            boolean approved = sc.nextBoolean();

            System.out.print("Total Present: ");
            int totalPresent = sc.nextInt();

            System.out.print("Total Absent: ");
            int totalAbsent = sc.nextInt();
            sc.nextLine();


            AttendanceSummary summary = new AttendanceSummary(
                    id,
                    LocalDate.now(),
                    LocalDate.now(),
                    institutionName,
                    code,
                    address,
                    departmentName,
                    departmentHead,
                    courseName,
                    courseCode,
                    credits,
                    instructorName,
                    email,
                    phone,
                    studentName,
                    studentID,
                    age,
                    sessionDate,
                    topic,
                    recordStudentID,
                    sessionID,
                    status,
                    requestDate,
                    reason,
                    approved,
                    LocalDate.now(),
                    totalPresent,
                    totalAbsent
            );

            System.out.println("\n=== GENERATING SUMMARY ===");
            summary.generateSummary();

        } catch (Exception e) {
            System.out.println("\nError 27135: " + e.getMessage());
        }

        sc.close();
    }
}
