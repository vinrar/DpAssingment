package dp;// ID - 22

import java.util.ArrayList;

public class StudentDecorator22 implements Student {

    protected Student s;

    ArrayList<StudentGrades22> gradeList = new ArrayList<StudentGrades22>();
    ArrayList<StudentAttendance22> attendanceList = new ArrayList<StudentAttendance22>();

    public void add(Student s) {
        this.s = s;
    }

    public void addAttendance(StudentAttendance22 attCard) {
        this.attendanceList.add(attCard);
    }

    public void addGrades(StudentGrades22 gradCard) {
        this.gradeList.add(gradCard);
    }

    public ArrayList<StudentAttendance22> getAttendanceList() {
        return attendanceList;
    }

    public ArrayList<StudentGrades22> getGradesList() {
        return gradeList;
    }

    @Override
    public void StudentAttendance(String date, int min) {
        this.s.StudentAttendance(date, min);
    }

    @Override
    public void StudentGrades(String name, int perc, int score) {
        this.s.StudentGrades(name, perc, score);
    }

    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub
        this.s.setId(id);
    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return this.s.getId();
    }

    @Override
    public void setFirstName(String firstName) {
        // TODO Auto-generated method stub
        this.s.setFirstName(firstName);
    }

    @Override
    public String getFirstName() {
        // TODO Auto-generated method stub
        return this.s.getFirstName();
    }

    @Override
    public void setLastName(String lastName) {
        // TODO Auto-generated method stub
        this.s.setLastName(lastName);
    }

    @Override
    public String getLastName() {
        // TODO Auto-generated method stub
        return this.s.getLastName();
    }

    @Override
    public void setProgram(String program) {
        // TODO Auto-generated method stub
        this.s.setProgram(program);
    }

    @Override
    public String getProgram() {
        // TODO Auto-generated method stub
        return this.s.getProgram();
    }

    @Override
    public void setLevel(String level) {
        // TODO Auto-generated method stub
        this.s.setLevel(level);
    }

    @Override
    public String getLevel() {
        // TODO Auto-generated method stub
        return this.s.getLevel();
    }

    @Override
    public void setAsurite(String asurite) {
        // TODO Auto-generated method stub
        this.s.setAsurite(asurite);
    }

    @Override
    public String getAsurite() {
        // TODO Auto-generated method stub
        return this.s.getAsurite();
    }

}
