 package coursemanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdministratorInterface {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Store students
        List<Student> students = new ArrayList<>();

        // Create courses
        Course course1 =
                new Course(
                        "CSC101",
                        "Java Programming",
                        2
                );

        Course course2 =
                new Course(
                        "CSC102",
                        "Database Systems",
                        3
                );

        int choice;

        do {

            System.out.println(
                    "\n===== UNIVERSITY COURSE MANAGEMENT SYSTEM ====="
            );

            System.out.println("1. Register Student");
            System.out.println("2. Enroll Student");
            System.out.println("3. Assign Grade");
            System.out.println("4. Calculate Overall Grade");
            System.out.println("5. Display Courses");
            System.out.println("6. Display Total Enrollment");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");

            try {

                choice =
                        Integer.parseInt(
                                input.nextLine()
                        );

                switch (choice) {

                    case 1:

                        // Register Student
                        System.out.print(
                                "Enter Student Name: "
                        );

                        String name =
                                input.nextLine();

                        System.out.print(
                                "Enter Student ID: "
                        );

                        String id =
                                input.nextLine();

                        Student student =
                                new Student(name, id);

                        students.add(student);

                        System.out.println(
                                "Student registered successfully."
                        );

                        break;

                    case 2:

                        // Enroll Student
                        if (students.isEmpty()) {

                            System.out.println(
                                    "No students registered."
                            );

                            break;
                        }

                        // Display students
                        System.out.println(
                                "\nRegistered Students:"
                        );

                        for (Student s : students) {

                            System.out.println(
                                    s.getStudentId()
                                    + " - "
                                    + s.getStudentName()
                            );
                        }

                        System.out.print(
                                "Enter Student ID: "
                        );

                        String enrollId =
                                input.nextLine();

                        Student foundStudent = null;

                        for (Student s : students) {

                            if (s.getStudentId()
                                    .equalsIgnoreCase(enrollId)) {

                                foundStudent = s;
                                break;
                            }
                        }

                        if (foundStudent == null) {

                            System.out.println(
                                    "Student not found."
                            );

                            break;
                        }

                        // Display courses
                        System.out.println(
                                "\nAvailable Courses:"
                        );

                        System.out.println(
                                "1. CSC101 - Java Programming"
                        );

                        System.out.println(
                                "2. CSC102 - Database Systems"
                        );

                        System.out.print(
                                "Select Course Number: "
                        );

                        int courseChoice =
                                Integer.parseInt(
                                        input.nextLine()
                                );

                        if (courseChoice == 1) {

                            CourseManagement.enrollStudent(
                                    foundStudent,
                                    course1
                            );

                        } else if (courseChoice == 2) {

                            CourseManagement.enrollStudent(
                                    foundStudent,
                                    course2
                            );

                        } else {

                            System.out.println(
                                    "Invalid course selection."
                            );
                        }

                        break;

                    case 3:

                        // Assign Grade
                        if (students.isEmpty()) {

                            System.out.println(
                                    "No students registered."
                            );

                            break;
                        }

                        // Display students
                        System.out.println(
                                "\nRegistered Students:"
                        );

                        for (Student s : students) {

                            System.out.println(
                                    s.getStudentId()
                                    + " - "
                                    + s.getStudentName()
                            );
                        }

                        System.out.print(
                                "Enter Student ID: "
                        );

                        String gradeId =
                                input.nextLine();

                        Student gradeStudent = null;

                        for (Student s : students) {

                            if (s.getStudentId()
                                    .equalsIgnoreCase(gradeId)) {

                                gradeStudent = s;
                                break;
                            }
                        }

                        if (gradeStudent == null) {

                            System.out.println(
                                    "Student not found."
                            );

                            break;
                        }

                        // Choose course
                        System.out.println(
                                "\nSelect Course:"
                        );

                        System.out.println(
                                "1. CSC101 - Java Programming"
                        );

                        System.out.println(
                                "2. CSC102 - Database Systems"
                        );

                        System.out.print(
                                "Enter Course Number: "
                        );

                        int selectedCourse =
                                Integer.parseInt(
                                        input.nextLine()
                                );

                        Course chosenCourse = null;

                        if (selectedCourse == 1) {

                            chosenCourse = course1;

                        } else if (selectedCourse == 2) {

                            chosenCourse = course2;

                        } else {

                            System.out.println(
                                    "Invalid course."
                            );

                            break;
                        }

                        // Enter grade
                        System.out.print(
                                "Enter Grade: "
                        );

                        double grade =
                                Double.parseDouble(
                                        input.nextLine()
                                );

                        if (grade < 0 || grade > 100) {

                            System.out.println(
                                    "Invalid grade."
                            );

                            break;
                        }

                        CourseManagement.assignGrade(
                                gradeStudent,
                                chosenCourse,
                                grade
                        );

                        break;

                    case 4:

                        // Overall Grade
                        if (students.isEmpty()) {

                            System.out.println(
                                    "No students registered."
                            );

                            break;
                        }

                        System.out.println(
                                "\nRegistered Students:"
                        );

                        for (Student s : students) {

                            System.out.println(
                                    s.getStudentId()
                                    + " - "
                                    + s.getStudentName()
                            );
                        }

                        System.out.print(
                                "Enter Student ID: "
                        );

                        String overallId =
                                input.nextLine();

                        Student overallStudent = null;

                        for (Student s : students) {

                            if (s.getStudentId()
                                    .equalsIgnoreCase(overallId)) {

                                overallStudent = s;
                                break;
                            }
                        }

                        if (overallStudent == null) {

                            System.out.println(
                                    "Student not found."
                            );

                            break;
                        }

                        CourseManagement
                                .calculateOverallGrade(
                                        overallStudent
                                );

                        break;

                    case 5:

                        // Display courses
                        System.out.println(
                                "\nAVAILABLE COURSES"
                        );

                        System.out.println(
                                "CSC101 - Java Programming"
                        );

                        System.out.println(
                                "CSC102 - Database Systems"
                        );

                        break;

                    case 6:

                        // Total enrollment
                        System.out.println(
                                "Total Enrolled Students: "
                                + Course.getTotalEnrolledStudents()
                        );

                        break;

                    case 7:

                        System.out.println(
                                "Program exited successfully."
                        );

                        break;

                    default:

                        System.out.println(
                                "Invalid choice."
                        );
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter numbers only."
                );

                choice = 0;
            }

        } while (choice != 7);

        input.close();
    }
} 