# PupilPort
Student Record Management System in Java - console version

# PupilPort Application Documentation

# Overview
PupilPort is a console-based Java application designed to manage student records efficiently. It enables administrators to add, update, and view student information seamlessly. This documentation provides comprehensive guidance on installation, execution, and navigation of the system.

# System Requirements
Java Development Kit (JDK) version 17 or higher.
An IDE like IntelliJ IDEA, Eclipse, or NetBeans is recommended for easier management of the project.

# Installation
1. Download the Source Code: Ensure you have the `.java` files for `Student`, `StudentManagement`, and `Main` classes.
2. Compilation:
Open your terminal or command prompt.
Navigate to the directory containing the downloaded `.java` files.
Compile the source code using the Java compiler:
javac Student.java StudentManagement.java Main.java
This command compiles the `.java` files and generates `.class` files for each class.

# Running the Program
Execute the Program:
In the same directory, run the following command to start the application:
java Main
This command executes the `Main` class, which initiates the program and displays the administrator interface.

# Interacting with the Administrator Interface
The program offers a text-based menu with options to add, update, view students, and exit.

# Add Student
Enter 1 to add a new student.
Input the student's name, ID, age, and grade as prompted.

# Update Student
Enter 2 to update a student.
Provide the student ID and then the new information.

# View Student
Enter 3 to view a student's details.
Input the student's ID.

# Exit
Enter 4 to exit the application.

# Error Handling
The system incorporates fundamental error management features to direct users towards appropriate input formats and alert them to any mistakes related to input. Should there be any discrepancies in input (for instance, inputting a letter when a numeral is anticipated), the system will present an error notification and encourage the user to attempt once more.

Best Practices
Always enter numeric values where numbers are expected (e.g., ID, age, grade) to prevent input mismatch errors.
Use unique IDs for each student to avoid conflicts when updating or viewing records.
Follow the prompts carefully and enter the requested information accurately.
Conclusion
PupilPort offers a direct and effective method for overseeing student records. Adhering to the aforementioned guidelines enables administrators to effortlessly register, modify, and inspect student data, thereby simplifying the administration of educational documentation.
