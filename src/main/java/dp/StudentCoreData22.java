package dp;

import java.util.ArrayList;

// ID - 22

public class StudentCoreData22 implements Student {
    int id;
    String firstName;
    String lastName;
    String program;
    String level;
    String asurite;

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
    public void addAttendance(StudentAttendance22 attendanceCard) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addGrades(StudentGrades22 gradesCard) {
        // TODO Auto-generated method stub

    }

    @Override
    public void add(Student student) {
        // TODO Auto-generated method stub

    }

    @Override
    public ArrayList<StudentAttendance22> getAttendanceList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<StudentGrades22> getGradesList() {
        // TODO Auto-generated method stub
        return null;
    }

}
