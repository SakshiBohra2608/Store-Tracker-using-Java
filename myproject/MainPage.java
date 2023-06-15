package myproject;

import java.awt.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.UIManager.*;

import javax.swing.*;

class  MainPage extends JFrame{
	
	JLabel label1;
	
	JButton jbtM;
	JTextField jtx;
	
	public MainPage(){
		
	JFrame frame1=new JFrame();
	frame1.setLayout(new GridLayout(2,1));
	
	
	 //label1=new JLabel("Welcome");
	Font myFont = new Font("Comic Sans MS",Font.BOLD, 50); 
	 
	 jbtM=new JButton("Main Menu");
	
	 jbtM.setFont(myFont);
	
		JPanel messageContainer, buttonContainer; 
	
		
		messageContainer = new JPanel();
		buttonContainer = new JPanel(); 
		
		ImageIcon img = new ImageIcon("C:\\Users\\Sneh_Sinha\\Desktop\\New MP2 Docs\\s2.jpg");
	     JLabel pic = new JLabel(img);
	     messageContainer.add(pic);
	     messageContainer.setBackground(new Color(199,215,202));
		
	     
	     
		//messageContainer.add(label1);
		buttonContainer.add(jbtM);
	
		jbtM.setBackground(new Color(237, 236, 242));
		ImageIcon img1 = new ImageIcon("C:\\Users\\Sneh_Sinha\\Desktop\\New MP2 Docs\\111.jpg");
	     JLabel pic1 = new JLabel(img1);
	     jbtM.add(pic1);
		
		buttonContainer.setLayout(new GridLayout(1,1));
		
	     
		 frame1.add(messageContainer);
		 frame1.add(buttonContainer);
	
	 frame1.setTitle(" Co-operative Store");
	  frame1.setSize(700,600);
	  frame1.setLocationRelativeTo(null);
	  frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
	  frame1.setVisible(true);
	  
	  
	  try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
	  
	 
	 jbtMListnerClass listener1=new jbtMListnerClass();
	 jbtM.addActionListener(listener1);
	 
	 //jbtM.setPreferredSize(setSize(80,80));	 
}


public static void main(String args[]){
	new MainPage();
	 
	  
}
}

class jbtMListnerClass implements ActionListener{
	 
	 public void actionPerformed(ActionEvent e){
		 
		 
				
				JFrame myframe=new java37();
				myframe.setTitle("Main Menu ");
				myframe.setSize(700,700);
				
			
				myframe.setLocationRelativeTo(null);
				
				myframe.setVisible(true);
		  
		 
	 }
	 
}