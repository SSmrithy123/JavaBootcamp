package module10.Activity1;

public class Students extends Person {

    // Attribute for school name
    private String schoolName; // Store university/school name

    // Getter for schoolName
    public String getSchoolName() {
        return schoolName; // Return school name
    }

    // Setter for schoolName
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName; // Update school name
    }

    // Override introduce method from Person
    @Override
    public void introduce() { // Print student introduction
        System.out.println("I am studying in university " + schoolName); // Required output format
    }
}
