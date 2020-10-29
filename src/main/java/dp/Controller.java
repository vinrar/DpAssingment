package dp;
import javax.swing.*;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.filechooser.FileFilter;

public class Controller
{	
	JFrame frame;
	StudentRepository21 repo;
	Grader23 grader;
	AttendanceReport24 reporter;
	ObserverTable25 obtable;
	ObserverPlotter26 obplot;
	
	public Controller(JFrame frame) {
		System.out.println(frame);
		this.frame = frame;	
	}

	public void details() {
		// TODO Auto-generated method stub
		File rosterFilePath = openFile();
		repo = new StudentRepository21(rosterFilePath.getAbsolutePath());
		obtable = new ObserverTable25();
	    obplot = new ObserverPlotter26();
	    repo.addObserver(obtable);
	    repo.addObserver(obplot);
	    repo.notifyObservers();
//	    System.out.println(obplot);
	    frame.add(obtable, BorderLayout.CENTER);
	    frame.add(obplot, BorderLayout.SOUTH);
	    frame.setVisible(true);
		System.out.println("done details");		
	}

	public void grades() {
		// TODO Auto-generated method stub
		File graderPath = openFile();
		grader = new Grader23(repo, graderPath.getAbsolutePath());
		System.out.println("done grades");
	}

	public void attendance() {
		// TODO Auto-generated method stub
		File attendancePath = openFile();
        reporter = new AttendanceReport24(repo, attendancePath.getAbsolutePath());
        System.out.println("done attendance");
		
	}

	public void showResults() {
		// TODO Auto-generated method stub
		    repo.notifyObservers();
	}
	
	public File openFile()
	{
		JFileChooser fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter(new FileFilter() {
            public String getDescription() {
                return "CSV files (*.csv)";
            }
         
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                else {
                    return f.getName().toLowerCase().endsWith(".csv");
                }
            }
        });
        fileChooser.setAcceptAllFileFilterUsed(false);
        int option = fileChooser.showOpenDialog(frame);
        if(option == JFileChooser.APPROVE_OPTION){
           File file = fileChooser.getSelectedFile();
           return file;
        }
		return null;
	}

}
