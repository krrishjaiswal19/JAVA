import java.util.ArrayList;

class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("✅ Student Added!");
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠️ No students found.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    // Search student by ID
    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("🔍 Student Found:");
                s.display();
                return;
            }
        }
        System.out.println("❌ Student not found.");
    }

    // Delete student
    public void deleteStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("🗑️ Student Deleted!");
                return;
            }
        }
        System.out.println("❌ Student not found.");
    }
}