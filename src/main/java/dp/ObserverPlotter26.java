package dp;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import javax.swing.*;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


public class ObserverPlotter26 implements Observer {


    private StudentRepository21 studentRepository;
    private ApplicationFrame applicationFrame;
    ChartPanel chartPanel;

    public ObserverPlotter26() {

        this.applicationFrame = new ApplicationFrame("Group 26");
    }

    public JPanel getPanel() {
        return this.chartPanel;
    }

    private CategoryDataset createDataset() {

        final DefaultCategoryDataset dataset =
                new DefaultCategoryDataset();

        if (studentRepository != null) {

            for (Iterator21 it = studentRepository.getIterator(); it.hasNext(); ) {

                Student student = (Student) it.next();
                List<StudentGrades22> gradesList = student.getGradesList();
                for (StudentGrades22 studentGrades22 : gradesList) {
                    dataset.addValue(studentGrades22.score, Integer.toString(student.getId()), studentGrades22.name);
                }
            }
        }

        return dataset;
    }

    @Override
    public void update(Observable o, Object args) {

        this.studentRepository = (StudentRepository21) o;
        // update the UI, whenever repository changes
        JFreeChart barChart = ChartFactory.createBarChart(
                "Student bar chart",
                "Category",
                "Score",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);


        chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        applicationFrame.setContentPane(chartPanel);
    }
}
