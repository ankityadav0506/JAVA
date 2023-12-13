package myPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {
	
	private JLabel heading;
	private JLabel clockLabel;
	private Font font  = new Font("",Font.BOLD, 35);
	
	MyWindow(){
		setTitle("My CLock");
		setSize(400,400);
		setLocation(300,50);
		this.createGUI();
		this.startClock();
		setVisible(true);
	}

	public void createGUI() {
		heading = new JLabel("My CLock");
		clockLabel = new JLabel("clock");
		heading.setFont(font);
		clockLabel.setFont(font);
		
		this.setLayout(new GridLayout(2,1));
		this.add(heading);
		this.add(clockLabel);
	}

	public void startClock() {

//	without thread
//		Timer timer = new Timer(1000, new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//			String dateTime = new Date().toString();
//				Date d = new Date();
//				SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
//
//				String dateTime = sdf.format(d);
//				clockLabel.setText(dateTime);
//			}
//		});
//		timer.start();
		
	
		Thread t = new Thread() {
			public void run() {
				try {
					while(true) {
						Date d = new Date();
						SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

						String dateTime = sdf.format(d);
						clockLabel.setText(dateTime);
						Thread.currentThread().sleep(1000);
					}
				} catch (InterruptedException e ) {
					e.printStackTrace();
				}
			}
		};
		
		t.start();
	}

}
