package dp;
import java.awt.BorderLayout;
import javax.swing.*;

public class View extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton saveDetails;
    JButton saveGrades;
    JButton saveAttendance;
    JButton showResults;
    JButton dummy;
    Controller controller;
    JFrame frame;
    
	public View() {
		frame = new JFrame();
    	saveDetails = new JButton("Save in Repo");
        saveGrades = new JButton("Save Grades");
        saveAttendance = new JButton("Save Attendance");
        showResults = new JButton("Show Results");
        controller = new Controller(frame);
	}
	
	public void createView() 
	{        
        JPanel topPanel = new JPanel();        
        topPanel.add(saveDetails);
        topPanel.add(saveGrades);
        topPanel.add(saveAttendance);
        topPanel.add(showResults);
        System.out.println(topPanel);
        frame.add(topPanel, BorderLayout.NORTH);        
        
        saveDetails.addActionListener(e -> {controller.details();});
        saveGrades.addActionListener(e -> {controller.grades();});
        saveAttendance.addActionListener(e -> {controller.attendance();});
        showResults.addActionListener(e -> {controller.showResults();});
        
        frame.setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
        frame.setVisible(true);    	
    }

}
