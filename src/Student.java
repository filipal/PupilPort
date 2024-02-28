public class Student {
    // Private fields to encapsulate student's data
    private String name;
    private int id;
    private int age;
    private int year;

    // Constructor to initialize a new student object
    public Student(String name, int id, int age, int year) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.year = year;
    }

    // Getter and setter methods for each field
    // Allows external access to private fields in a controlled manner
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // Update the name of the student
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id; // Update the ID of the student
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age; // Update the age of the student
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year; // Update the year of the student
    }

    @Override
    public String toString() {
        // Provides a string representation of a student object
        // Useful for printing student details
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", year=" + year +
                '}';
    }
}
