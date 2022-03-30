import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Stopwatch implements ActionListener{
	
	JFrame watchFrame = new JFrame();
	JButton startButton = new JButton("START");
	JButton stopButton = new JButton("STOP");
	JButton resetButton = new JButton("RESET");
	JLabel timeDisplay = new JLabel();
	
	int timeElapsed;
	// int hours;
	int mins;
	int secs;
	int milsecs;
    // String hoursString = String.format("0%2d", hours);
    String minsString = String.format("0%2d", mins);
    String secsString = String.format("0%2d", secs);
    String milsecsString = String.format("0%2d", milsecs);
	boolean running = false;
	
	
	Stopwatch(){
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}