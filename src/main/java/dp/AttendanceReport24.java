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
                String[] attendaceRow = tempStore.split(", ");
                Student studentObj = getStudentObject(attendaceRow[0]);
                attendanceStoreObjects.add(new AttendenceStore24(studentObj, storeColumnNames[1], attendaceRow[0]));
                //studentObj.add(new AttendanceDecortator(attendance));
            }

            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void populateDecorator() {
        for (int i = 0; i < attendanceStoreObjects.size(); i++) {
            Student studentObject = attendanceStoreObjects.get(i).getAsuId();
            if (studentObject != null && attendanceStoreObjects.get(i).getAttendendeValue() != null && !attendanceStoreObjects.get(i).getAttendendeValue().isEmpty())
                studentObject.add(new StudentAttendance22(attendanceStoreObjects.get(i).getAttendendeData(), Integer.parseInt(attendanceStoreObjects.get(i).getAttendendeValue())));
        }
    }

    private Student getStudentObject(String asuId) {
        Iterator21 iterator21 = studentRepo.getIterator();
        while (iterator21.hasNext()) {

            Student student = (Student) iterator21.next();
            if (student.getAsurite().equals(asuId)) {
                return student;
            }
        }
        return null;
    }
}
