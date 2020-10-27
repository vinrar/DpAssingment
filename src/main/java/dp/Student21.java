package dp;

//21 -  Dummy Student for Testing
public class Student21 {
    private String id;
    private String firstName;
    private String lastName;
    private String programPlan;
    private String academicLevel;
    private String asurite;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProgramPlan() {
        return programPlan;
    }

    public void setProgramPlan(String programPlan) {
        this.programPlan = programPlan;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getAsurite() {
        return asurite;
    }

    public void setAsurite(String asurite) {
        this.asurite = asurite;
    }

    @Override
    public String toString() {
        return "Student21 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", programPlan="
                + programPlan + ", academicLevel=" + academicLevel + ", asurite=" + asurite + "]";
    }
}
