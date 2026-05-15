package coursemanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Student class stores student information,
 * enrolled courses, and grades.
 */
public class Student {

    // Private instance variables
    private String studentName;
    private String studentId;

    private List<Course> enrolledCourses;

    private Map<String, Double> grades;

    // Constructor
    public Student(String studentName, String studentId) {

        this.studentName = studentName;
        this.studentId = studentId;

        enrolledCourses = new ArrayList<>();

        grades = new HashMap<>();
    }

    // Getter methods
    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    // Setter methods
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * Enroll student into a course
     */
    public void enrollCourse(Course course) {

        if (course.addStudent()) {

            enrolledCourses.add(course);

            System.out.println(
                    studentName +
                    " enrolled in " +
                    course.getCourseName()
            );

        } else {

            System.out.println(
                    "Cannot enroll. Course is full."
            );
        }
    }

    /**
     * Assign grade to student
     */
    public void assignGrade(Course course, double grade) {

        if (enrolledCourses.contains(course)) {

            grades.put(course.getCourseCode(), grade);

            System.out.println(
                    "Grade assigned successfully."
            );

        } else {

            System.out.println(
                    "Student is not enrolled in this course."
            );
        }
    }

    /**
     * Return grades
     */
    public Map<String, Double> getGrades() {
        return grades;
    }
}