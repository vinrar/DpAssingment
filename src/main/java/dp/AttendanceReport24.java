package dp;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceReport24 {

    private StudentRepository21 studentRepo;
    private String path;
    private String[] storeColumnNames;
    private ArrayList<AttendenceStore24> attendanceStoreObjects = new ArrayList<AttendenceStore24>();

    public AttendanceReport24(StudentRepository21 studentObj, String filePath) {
        this.studentRepo = studentObj;
        this.path = filePath;
        readFile();
        populateDecorator();
    }

    private void readFile() {

        try {
            File fileObj = new File(path);
            Scanner fileReader = new Scanner(fileObj);
            while (fileReader.hasNextLine()) {
                String tempStore = fileReader.nextLine();
                storeColumnNames = tempStore.trim().split(", ");
                break;
            }

            while (fileReader.hasNextLine()) {
                String tempStore = fileReader.nextLine();
                if (!tempStore.isEmpty()) {
                	String[] attendaceRow = tempStore.split(",");
                    String[] userEmail = attendaceRow[0].split("@");
                    String temp = userEmail[0];
                    Decorator22Student studentObj = getStudentObject(temp);
                    attendanceStoreObjects.add(new AttendenceStore24(studentObj, storeColumnNames[1], attendaceRow[1]));
                    //studentObj.add(new AttendanceDecortator(attendance));
                }
            }

            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void populateDecorator() {
        for (int i = 0; i < attendanceStoreObjects.size(); i++) {
            Decorator22Student studentObject = attendanceStoreObjects.get(i).getAsuId();
            Decorator22StudentAttendance attendanceCard = null;
            if (studentObject != null && attendanceStoreObjects.get(i).getAttendendeValue() != null && !attendanceStoreObjects.get(i).getAttendendeValue().isEmpty())
            	attendanceCard = new Decorator22StudentAttendance(attendanceStoreObjects.get(i).getAttendendeData(), Integer.parseInt(attendanceStoreObjects.get(i).getAttendendeValue()));
            	studentObject.addAttendance(attendanceCard);
        }
    }

    private Decorator22Student getStudentObject(String asuId) {
        Iterator21 iterator21 = studentRepo.getIterator();
        while (iterator21.hasNext()) {

            Decorator22Student decorator22Student = (Decorator22Student) iterator21.next();
            if (decorator22Student.getAsurite().equals(asuId)) {
                return decorator22Student;
            }
        }
        return null;
    }
}
