package dp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grader23 {
    private String path;
    private List<List<String>> grades;
    private static StudentRepository21 studentRepository;

    public Grader23(StudentRepository21 studentRepository, String path) {
        this.studentRepository = studentRepository;
        this.path = path;
        readFile();
        iterateRepository();
    }

    public void iterateRepository() {
        Iterator21 studentIterator = studentRepository.getIterator();
        while (studentIterator.hasNext()) {
            Student student = (Student) studentIterator.next();
            String id = student.getAsurite();
            for (int i = 1; i < grades.size(); i++) {
                if (grades.get(i).size() > 0 && grades.get(i).get(0).equals(id)) {
                    for (int j = 1; j < grades.size(); j++) {
                        StudentGrades22 gradesCard;
                        gradesCard = new StudentGrades22(grades.get(0).get(j), Integer.parseInt(grades.get(i).get(j)));
                        student.addGrades(gradesCard);
                    }
                }
            }
        }
    }

    private void readFile() {
        grades = new ArrayList<>();
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                grades.add(getGradesFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File not exist");
            e.printStackTrace();
        }
    }

    private List<String> getGradesFromLine(String line) {
        String COMMA_DELIMITER = ",";
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(COMMA_DELIMITER);
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}
