package coursemanagement;

/**
 * Course class stores course information.
 * Demonstrates static variables and methods.
 */
public class Course {

    // Private instance variables
    private String courseCode;
    private String courseName;

    private int maximumCapacity;

    private int currentEnrollment;

    // Static variable
    private static int totalEnrolledStudents = 0;

    // Constructor
    public Course(
            String courseCode,
            String courseName,
            int maximumCapacity
    ) {

        this.courseCode = courseCode;

        this.courseName = courseName;

        this.maximumCapacity = maximumCapacity;

        this.currentEnrollment = 0;
    }

    // Getter methods
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public int getCurrentEnrollment() {
        return currentEnrollment;
    }

    /**
     * Add student to course
     */
    public boolean addStudent() {

        if (currentEnrollment < maximumCapacity) {

            currentEnrollment++;

            totalEnrolledStudents++;

            return true;
        }

        return false;
    }

    /**
     * Static method
     */
    public static int getTotalEnrolledStudents() {

        return totalEnrolledStudents;
    }
}