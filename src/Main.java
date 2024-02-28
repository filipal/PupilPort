import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student\n2. Update Student\n3. View Student\n4. Exit");
            System.out.println("Choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            try {
                switch (choice) {
                    case 1:
                        StudentManagement.addStudent();
                        break;
                    case 2:
                        StudentManagement.updateStudent();
                        break;
                    case 3:
                        StudentManagement.viewStudent();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return; // Exit the application
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred. Please try again.");
                scanner.nextLine(); // Clear the scanner buffer to handle any input mismatch exceptions
            }
        }
    }
}