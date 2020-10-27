package dp;// ID - 22

import java.util.ArrayList;

public interface Student {

    public void setId(int id);

    public int getId();

    public void setFirstName(String firstName);

    public String getFirstName();

    public void setLastName(String lastName);

    public String getLastName();

    public void setProgram(String program);

    public String getProgram();

    public void setLevel(String level);

    public String getLevel();

    public void setAsurite(String asurite);

    public String getAsurite();

    public void StudentAttendance(String date, int min);

    public void StudentGrades(String name, int perc, int score);

    public void addAttendance(StudentAttendance22 attendanceCard);

    public void addGrades(StudentGrades22 gradesCard);

    public ArrayList<StudentAttendance22> getAttendanceList();

    public ArrayList<StudentGrades22> getGradesList();

    public void add(Student student);

}
