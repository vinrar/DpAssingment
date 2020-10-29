package dp;
import java.util.ArrayList;

public class Decorator22StudentCoreData implements Decorator22Student {
    int id;
    String firstName;
    String lastName;
    String program;
    String level;
    String asurite;
    String name;
    int score;
    ArrayList<Decorator22StudentGrades> gradeList = new ArrayList<Decorator22StudentGrades>();
    ArrayList<Decorator22StudentAttendance> attendanceList = new ArrayList<Decorator22StudentAttendance>();
    
    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String getProgram() {
        return program;
    }

    @Override
    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String getLevel() {
        return level;
    }

    @Override
    public void setAsurite(String asurite) {
        this.asurite = asurite;
    }

    @Override
    public String getAsurite() {
        return asurite;
    }

    @Override
    public void StudentAttendance(String date, int min) {

        // TODO Auto-generated method stub

    }

    @Override
    public void StudentGrades(String name, int perc, int score) {
        // TODO Auto-generated method stub
    }

    @Override
    public void addAttendance(Decorator22StudentAttendance attendanceCard) {
        this.attendanceList.add(attendanceCard);
        // TODO Auto-generated method stub

    }

    @Override
    public void addGrades(Decorator22StudentGrades gradesCard) {
        // TODO Auto-generated method stub
        this.gradeList.add(gradesCard);
    }

    @Override
    public void add(Decorator22Student decorator22Student) {
        // TODO Auto-generated method stub

    }

    @Override
    public ArrayList<Decorator22StudentAttendance> getAttendanceList() {
        // TODO Auto-generated method stub
        return attendanceList;
    }

    @Override
    public ArrayList<Decorator22StudentGrades> getGradesList() {
        // TODO Auto-generated method stub
        return gradeList;
    }

}
