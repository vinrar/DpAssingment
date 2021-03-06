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

    public void addAttendance(Decorator22StudentAttendance attendanceCard);

    public void addGrades(Decorator22StudentGrades gradesCard);

    public ArrayList<Decorator22StudentAttendance> getAttendanceList();

    public ArrayList<Decorator22StudentGrades> getGradesList();

    public void add(Student student);

}
