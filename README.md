# Course Enrollment and Grade Management System

A robust, enterprise-standard **Java application** designed to streamline university administrative workflows, course tracking, and student performance metrics. This system showcases advanced **Object-Oriented Programming (OOP)** implementation.

---

## 🚀 Key Features

* **Dynamic Course Creation:** Add custom courses to the catalog with unique codes and caps.
* **Interactive Enrollment:** Seamless, menu-driven registration of new learners.
* **Grade Administration:** Real-time assignment and validation of academic scores.
* **Overall Performance Analytics:** Compiles and averages performance records per student.
* **Global Institutional Metrics:** Tracks university-wide statistics using shared static fields.
* **Input Error Resilience:** Filters and rejects malformed inputs to prevent runtime crashes.

---

## 🛠️ Technical Architecture

* **Language:** **Java (JDK 11+)**
* **Encapsulation:** Protects data integrity via private instance variables and public getters/setters.
* **Static Memory Management:** Implements static methods and variables for cross-instance analytics.
* **Interface Separation:** Decouples user-facing CLI presentation logic from core backend models.
* **Environment:** Developed inside **GitHub Codespaces** using Git version control.

---

## 📂 Project Structure

```text
course-enrollment-grade-management-system/
├── src/
│   └── coursemanagement/
│       ├── AdministratorInterface.java  # Main execution entry point & CLI loop
│       ├── CourseManagement.java        # Core business logic & database management
│       ├── Course.java                  # Course data model & static enrollment metrics
│       └── Student.java                 # Student data model & performance tracking
├── .gitignore                           # Prevents tracking compiled bytecode (.class)
└── README.md                            # Comprehensive system documentation
```

---

## ⚙️ Installation & Usage

### 1. Clone the repository
```bash
git clone https://github.com/C7-mia/course-enrollment-grade-management-system.git
cd course-enrollment-grade-management-system
```

### 2. Compile the source code
```bash
javac src/coursemanagement/*.java
```

### 3. Launch the application interface
```bash
java -cp src coursemanagement.AdministratorInterface
```

---

## 🧑‍💻 Academic Profile

* **Author Name:** **Akena Nicholas**
* **Degree Program:** **BSc Computer Science**
* **Institution:** **University of the People**
* **Course Assignment:** **Programming 1 (Java)**

---
*Developed strictly in accordance with University academic software development guidelines.*
