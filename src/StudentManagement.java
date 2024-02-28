import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // This method prompts the user for student details, then checks if the student ID already exists.
    // If the ID is unique, it creates a new Student object and adds it to the list.
    // If the ID already exists, it displays an error message and does not add the student.
    public static void addStudent() {
        // Prompt for student details
        System.out.println("Enter student name, ID, age, and year:");
        String name = scanner.nextLine();

        // Check for ID uniqueness
        int id = scanner.nextInt();
        if (isIdExists(id)) {
            // Error message for duplicate ID
            System.out.println("Error: A student with this ID already exists.");
            scanner.nextLine(); // Clear the scanner buffer
            return; // Exit without adding a new student
        }

        // Continue with adding the student if ID is unique
        int age = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Creation and addition of the new student
        Student newStudent = new Student(name, id, age, year);
        students.add(newStudent);
        System.out.println("Student added successfully.");
    }

    // Checks if a student with the given ID already exists in the list.
    // Returns true if the ID exists, false otherwise.
    private static boolean isIdExists(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return true; // ID found
            }
        }
        return false; // No matching ID found
    }

    // Method to update a student's information
    public static void updateStudent() {
        try {
            System.out.println("Enter student ID:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.println("Enter new name, age, and year:");
                    String newName = scanner.nextLine();
                    int newAge = scanner.nextInt();
                    int newYear = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    student.setName(newName);
                    student.setAge(newAge);
                    student.setYear(newYear);
                    System.out.println("Student updated successfully.");
                    return;
                }
            }
            System.out.println("Student ID not found.");
        } catch (Exception e) {
            System.out.println("Error updating student. Please check the input format.");
            scanner.nextLine(); // Clear the scanner buffer in case of an input mismatch
        }
    }

    // Method to display a student's details
    public static void viewStudent() {
        try {
            System.out.println("Enter student ID:");
            int id = scanner.nextInt();

            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.println(student);
                    return;
                }
            }
            System.out.println("Student ID not found.");
        } catch (Exception e) {
            System.out.println("Error viewing student. Please check the input format.");
            scanner.nextLine(); // Clear the scanner buffer in case of an input mismatch
        }
    }
}
