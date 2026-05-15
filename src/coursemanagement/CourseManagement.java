package coursemanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CourseManagement class controls
 * enrollment and grading operations.
 */
public class CourseManagement {

    // Static variables
    private static List<Course> courses =
            new ArrayList<>();

    private static Map<String, Double> overallGrades =
            new HashMap<>();

    /**
     * Add course
     */
    public static void addCourse(
            String code,
            String name,
            int capacity
    ) {

        Course course =
                new Course(code, name, capacity);

        courses.add(course);

        System.out.println(
                "Course added successfully."
        );
    }

    /**
     * Enroll student
     */
    public static void enrollStudent(
            Student student,
            Course course
    ) {

        student.enrollCourse(course);
    }

    /**
     * Assign grades
     */
    public static void assignGrade(
            Student student,
            Course course,
            double grade
    ) {

        student.assignGrade(course, grade);
    }

    /**
     * Calculate overall grade
     */
    public static void calculateOverallGrade(
            Student student
    ) {

        Map<String, Double> grades =
                student.getGrades();

        if (grades.isEmpty()) {

            System.out.println(
                    "No grades available."
            );

            return;
        }

        double total = 0;

        for (double grade : grades.values()) {

            total += grade;
        }

        double average =
                total / grades.size();

        overallGrades.put(
                student.getStudentId(),
                average
        );

        System.out.println(
                "Overall Grade for "
                + student.getStudentName()
                + " is: "
                + average
        );
    }

    /**
     * Display courses
     */
    public static void displayCourses() {

        for (Course course : courses) {

            System.out.println(
                    course.getCourseCode()
                    + " - "
                    + course.getCourseName()
            );
        }
    }

    /**
     * Return courses
     */
    public static List<Course> getCourses() {

        return courses;
    }
}