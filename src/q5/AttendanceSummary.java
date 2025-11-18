package q5;
import java.time.LocalDate;

public final class AttendanceSummary extends LeaveRequest {
    private LocalDate reportDate;
    private int totalPresent;
    private int totalAbsent;

    public AttendanceSummary(int id, LocalDate createdDate, LocalDate updatedDate,
                             String institutionName, String code, String address,
                             String departmentName, String departmentHead,
                             String courseName, String courseCode, int credits,
                             String instructorName, String email, String phone,
                             String studentName, String studentID, int age,
                             LocalDate sessionDate, String topic,
                             String recordStudentID, String sessionID, String status,
                             LocalDate requestDate, String reason, boolean approved,
                             LocalDate reportDate, int totalPresent, int totalAbsent) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead,
                courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age,
                sessionDate, topic, recordStudentID, sessionID, status, requestDate, reason, approved);
        this.reportDate = reportDate;
        this.totalPresent = totalPresent;
        this.totalAbsent = totalAbsent;
    }

    public void generateSummary() {
        int totalSessions = totalPresent + totalAbsent;
        double attendancePercentage = totalSessions > 0 ? (totalPresent * 100.0) / totalSessions : 0;

        System.out.println("\n27135 - ATTENDANCE SUMMARY");
        System.out.println("=".repeat(50));
        System.out.println("Institution: 27135-" + getInstitutionName());
        System.out.println("Department: 27135-" + getDepartmentName());
        System.out.println("Course: 27135-" + getCourseName() + " (" + getCourseCode() + ")");
        System.out.println("Instructor: 27135-" + getInstructorName());
        System.out.println("Student: 27135-" + getStudentName());
        System.out.println("Student ID: 27135-" + getStudentID());
        System.out.println("Total Sessions: 27135-" + totalSessions);
        System.out.println("Present: 27135-" + totalPresent);
        System.out.println("Absent: 27135-" + totalAbsent);
        System.out.println("Attendance %: 27135-" + String.format("%.2f", attendancePercentage) + "%");
        System.out.println("Report Date: 27135-" + reportDate);
        System.out.println("=".repeat(50));
    }
}