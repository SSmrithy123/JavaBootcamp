package module10.Activity1Activity2Activity4;

public class AbstractActivity {
    public static void main(String[] args) {
        // Create and set up an Employee object
        Employee employee = new Employee("Smrithy", 31, "QA Engineer", "Accenture", 2500.0); // Initialize employee details

        // Call introduce from employee
        employee.introduce();

        // Create and set up a Students object
        Students student = new Students(); // Instantiate Students
        student.setName("Anna"); // Set inherited name
        student.setAge(28); // Set inherited age
        student.setSchoolName("University of Latvia"); // Set schoolName

        // Call introduce from student
        student.introduce();
    }
}
