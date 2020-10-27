package dp;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;

public class Main27 extends Observable {

    private static JFrame mainFrame;
    private static JPanel mainPanel;
    private static JPanel buttonsPanel;
    private static JPanel paintPanel;
    private static StudentRepository21 repo;
    private static Grader23 grader = null;
    private static AttendanceReport24 reporter = null;

    public static void main(String[] args) {

        String path = "/Users/vchitteti/Projects/DPAssingment/src/main/java/dp/";
        String rosterFilePath = path + "roster-x.csv";
        String graderFilePath = path + "grades.x.csv";
        String attendancePath = path + "attendance-x.csv";

        mainFrame = new JFrame("panel");
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        buttonsPanel = new JPanel();

        paintPanel = new JPanel();
        paintPanel.setLayout(new BoxLayout(paintPanel, BoxLayout.Y_AXIS));
        paintPanel.setBackground(Color.red);
        paintPanel.setLocation(10, 100);

        mainPanel.add(buttonsPanel, BorderLayout.NORTH);
        mainPanel.add(paintPanel);

        JButton b = new JButton("Save Student Details");
        JButton b1 = new JButton("Save Grades");
        JButton b2 = new JButton("Save Reporter");
        JButton b3 = new JButton("Show Results");

        b.addActionListener(e -> {
            repo = new StudentRepository21(rosterFilePath);
        });

        b1.addActionListener(e -> {

            grader = new Grader23(repo, graderFilePath);

        });

        b2.addActionListener(e -> {

            reporter = new AttendanceReport24(repo, attendancePath);

        });

        b3.addActionListener(e -> {

            ObserverTable25 obtable = new ObserverTable25();
            ObserverPlotter26 obplot = new ObserverPlotter26();
            repo.addObserver(obtable);
            repo.addObserver(obplot);
            repo.notifyObservers();
//            paintPanel.add(obtable);
            JPanel rightPanel = obplot.getPanel();
//            paintPanel.add(rightPanel);
//            mainPanel.add(paintPanel);
//            mainPanel.repaint();
//            mainFrame.add(rightPanel);
            mainFrame.repaint();
            mainFrame.setVisible(true);
            JFrame testFrame = new JFrame("test frame");
//            testFrame.add(rightPanel);
            testFrame.add(obtable);
            testFrame.setSize(1000, 1000);
            testFrame.setVisible(true);
        });

        buttonsPanel.add(b);
        buttonsPanel.add(b1);
        buttonsPanel.add(b2);
        buttonsPanel.add(b3);
        mainFrame.add(mainPanel);

        mainFrame.setSize(1000, 1000);

        mainFrame.setVisible(true);
    }

}
