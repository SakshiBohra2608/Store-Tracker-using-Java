package myproject;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.UIManager.*;

import javax.swing.*;

 class  java37 extends JFrame{
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JLabel label6;
	JLabel label7;
	JLabel label8;
	JLabel label9;
	JLabel label10;
	JLabel label11;
	
	
	JButton jbt1;
	JButton jbt2;
	JButton jbt3;
	JButton jbt4;
	JButton jbt5;
	JButton jbt6;
	JButton jbt7;
	JButton jbt8;
	JButton jbt9;
	JButton jbt10;
	JButton jbt11;
	
	
	RandomAccessFile rf;
	Calendar calendar;
	int day,month,year;
	double dcash=0,mcash=0,ycash=0;
	int temp;
 public java37(){
	 
	 calendar=new GregorianCalendar();
	 
	 day=calendar.get(Calendar.DAY_OF_MONTH);
	 month=calendar.get(Calendar.MONTH);
	 
	 month=month+1;
	 System.out.println("month:"+month);
	 
	 year=calendar.get(Calendar.YEAR);
	 
	 try{
		 rf=new RandomAccessFile("cash.txt","rw");
	 }
	 
	 catch(FileNotFoundException e){System.out.println("error in opening  cash file");}
	 
	try{
		 rf.writeInt(1);
		  rf.writeDouble(100.10);
		 rf.writeInt(1);
		  rf.writeDouble(100.10);
		 rf.writeInt(1);
		 rf.writeDouble(100.10);
	 }  
	 catch(IOException e){System.out.println("error");} 
	 
	 
	 
	try{
		 System.out.println(rf.length());
		if( rf.readInt() != day)
		{
			rf.seek(0);
			rf.writeInt(day);
			
		    rf.writeDouble(0);
		}
		
	rf.seek(12);
		
	
		if(rf.readInt()!= month)
		{
			
		
		 rf.seek(12);
		 rf.writeInt(month);
		 rf.writeDouble(0);
		}
		
	rf.seek(24);
		
		if( rf.readInt()!= year )
		{
		 rf.seek(24);
		 rf.writeInt(year);
		 rf.writeDouble(0);
		 
		}
		 System.out.println("writing successful ");
	 }
	 catch(IOException e){
		 System.out.println("error in io 1");
	 }
	 
	 try{
		 rf.close();
	 }
	 
	 catch(IOException e){
		 System.out.println("error in io 1");
	 }
	 
   Font myFont = new Font("Consolas",Font.BOLD, 16);
	
   label1=new JLabel("  Store Item Record ");
   label1.setForeground(Color.white);
   label1.setFont(myFont);
   label2=new JLabel("  Show Item Record ");
   label2.setForeground(Color.white);
   label2.setFont(myFont);
   label3=new JLabel("  Make A Bill ");
   label3.setForeground(Color.white);
   label3.setFont(myFont);
   label4=new JLabel("  Delete Item Record ");
   label4.setForeground(Color.white);
   label4.setFont(myFont);
   label5=new JLabel("  Change Rate Of Item ");
   label5.setForeground(Color.white);
   label5.setFont(myFont);
   label6=new JLabel("  Show customer record ");
   label6.setForeground(Color.white);
   label6.setFont(myFont);
   label7=new JLabel("  Check Less Stock Material ");
   label7.setForeground(Color.white);
   label7.setFont(myFont);
   label8=new JLabel("  Receive Maaterial Update ");
   label8.setForeground(Color.white);
   label8.setFont(myFont);
   label9=new JLabel("  Show Purchase Record ");
   label9.setForeground(Color.white);
   label9.setFont(myFont);
   label10=new JLabel("  Show profit Of Every Item ");
   label10.setForeground(Color.white);
   label10.setFont(myFont);
   label11=new JLabel("  Cash collected ");
   label11.setForeground(Color.white);
   label11.setFont(myFont);
   
   
   jbt1=new JButton("ENTER 01");
   jbt1.setBackground(new Color(170,201,206));
   jbt2=new JButton("ENTER 02");
   jbt2.setBackground(new Color(182,180,194));
   jbt3=new JButton("ENTER 03");
   jbt3.setBackground(new Color(201,187,200));
   jbt4=new JButton("ENTER 04");
   jbt4.setBackground(new Color(229,193,205));
   jbt5=new JButton("ENTER 05");
   jbt5.setBackground(new Color(243,219,207));
   jbt6=new JButton("ENTER 06");
   jbt6.setBackground(new Color(195,238,193));
   jbt7=new JButton("ENTER 07");
   jbt7.setBackground(new Color(162,212,171));
   jbt8=new JButton("ENTER 08");
   jbt8.setBackground(new Color(133,212,190));
   jbt9=new JButton("ENTER 09");
   jbt9.setBackground(new Color(174,230,203));
   jbt10=new JButton("ENTER 10");
   jbt10.setBackground(new Color(214,233,170));
   jbt11=new JButton("ENTER 11");
   jbt11.setBackground(new Color(214,233,170));
   
   jbt1.setFont(myFont);
   jbt2.setFont(myFont);
   jbt3.setFont(myFont);
   jbt4.setFont(myFont);
   jbt5.setFont(myFont);
   jbt6.setFont(myFont);
   jbt7.setFont(myFont);
   jbt8.setFont(myFont);
   jbt9.setFont(myFont);
   jbt10.setFont(myFont);
   jbt11.setFont(myFont);
   
   
 JPanel panel1=new JPanel();
  panel1.setBackground(new Color(93, 42, 66));
  panel1.setLayout(new GridLayout(0,2));
  panel1.add(label1);
  panel1.add(jbt1);
  panel1.add(label2);
  panel1.add(jbt2);
  panel1.add(label3);
  panel1.add(jbt3);
  panel1.add(label4);
  panel1.add(jbt4);
  panel1.add(label5);
  panel1.add(jbt5);
  panel1.add(label6);
  panel1.add(jbt6);
  panel1.add(label7);
  panel1.add(jbt7);
  panel1.add(label8);
  panel1.add(jbt8);
  panel1.add(label9);
  panel1.add(jbt9);
  panel1.add(label10);
  panel1.add(jbt10);
  panel1.add(label11);
  panel1.add(jbt11);
 

	
 add(panel1);
 
 jbt1ListnerClass listener1=new jbt1ListnerClass();
 jbt1.addActionListener(listener1);
 
 jbt2ListenerClass listener2=new jbt2ListenerClass();
 jbt2.addActionListener(listener2);
 
 jbt3listenerClass listener3=new jbt3listenerClass();
 jbt3.addActionListener(listener3);
 
 jbt4listenerClass listener4=new jbt4listenerClass();
 jbt4.addActionListener(listener4);
 
 jbt5listenerClass listener5=new jbt5listenerClass();
 jbt5.addActionListener(listener5);
 
 jbt6listenerClass listener6=new jbt6listenerClass();
 jbt6.addActionListener(listener6);
 
 jbt7listenerClass listener7=new jbt7listenerClass();
 jbt7.addActionListener(listener7);
 
 jbt8listenerClass listener8=new jbt8listenerClass();
 jbt8.addActionListener(listener8);
 
 jbt9listenerClass listener9=new jbt9listenerClass();
 jbt9.addActionListener(listener9);
 
 
 jbt10listenerClass listener10=new jbt10listenerClass();
 jbt10.addActionListener(listener10);
 
 jbt11listenerClass listener11=new jbt11listenerClass();
 jbt11.addActionListener(listener11);
 
}



public static void main(String args[]){
  JFrame frame1=new java37();
  frame1.setTitle(" Co-operative Stores ");
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
  
 

}

}
 
 class jbt1ListnerClass implements ActionListener{
	 
	 public void actionPerformed(ActionEvent e){
		 
		 
				
				JFrame myframe=new Store_Item();
				myframe.setTitle("Store Item ");
				myframe.setSize(700,400);
				
			
				myframe.setLocationRelativeTo(null);
				
				myframe.setVisible(true);	 
	 }
 }
 
 class jbt2ListenerClass implements ActionListener{
	 
	 public void actionPerformed(ActionEvent e){
		 JFrame myframe=new Show_Item_Record();
			myframe.setTitle("SHOW  RECORD");
			myframe.setSize(700,400);
			
			
			myframe.setLocationRelativeTo(null);
			
			myframe.setVisible(true);
			
	 }
 }
 

 class jbt3listenerClass implements ActionListener{
	 
	 public void actionPerformed(ActionEvent e){
		 
		 JFrame myframe = new Bill();
			myframe.setTitle("MAKE BILL");
			myframe.setSize(700,400);
			
			
			myframe.setLocationRelativeTo(null);
			
			myframe.setVisible(true);
			
		 
	 }
	 
 }
 
 
class  jbt4listenerClass implements ActionListener{
	 
	 public void actionPerformed(ActionEvent e){
		 
		 JFrame myframe=new Delete_Record();
			myframe.setTitle("DELETE  RECORD");
			myframe.setSize(700,400);
			
			
			myframe.setLocationRelativeTo(null);
			
			myframe.setVisible(true);
			
	 }
}
 

class  jbt5listenerClass implements ActionListener{
	 
	 public void actionPerformed(ActionEvent e){
		 
		 JFrame myframe=new Change_Rate();
			myframe.setTitle("CHANGE RATE ");
			myframe.setSize(700,400);
			
			
			myframe.setLocationRelativeTo(null);
			
			myframe.setVisible(true);
			
	 }
}
 

class  jbt6listenerClass implements ActionListener{
	 
	 public void actionPerformed(ActionEvent e){
		 
		 JFrame myframe=new Show_Customer_Record();
			myframe.setTitle("Show Customer Record ");
			myframe.setSize(700,400);
			
			
			myframe.setLocationRelativeTo(null);
			
			myframe.setVisible(true);
			
	 }
}

class  jbt7listenerClass implements ActionListener{
	 
	 public void actionPerformed(ActionEvent e){
		 
		 JFrame myframe=new Check_Less_Stock_Material();
			myframe.setTitle("Check Less Stock Material ");
			myframe.setSize(700,400);
	
			myframe.setLocationRelativeTo(null);
			
			myframe.setVisible(true);
			
	 }
}

class  jbt8listenerClass implements ActionListener{
	 
	 public void actionPerformed(ActionEvent e){
		 
		 JFrame myframe=new Receive_Material_Update();
			myframe.setTitle("Receive Material Update ");
			myframe.setSize(700,400);
	
			myframe.setLocationRelativeTo(null);
			
			myframe.setVisible(true);
			
	 }
}


class  jbt9listenerClass implements ActionListener{
	 
	 public void actionPerformed(ActionEvent e){
		 
		 JFrame myframe=new Receive_Material_Show();
			myframe.setTitle("Receive Material show ");
			myframe.setSize(700,400);
	
			myframe.setLocationRelativeTo(null);
			
			myframe.setVisible(true);
			
	 }
}

class  jbt10listenerClass implements ActionListener{
	 
	 public void actionPerformed(ActionEvent e){
		 
		 JFrame myframe=new Item_Profit_Show();
			myframe.setTitle("Item Profit show ");
			myframe.setSize(700,400);
	
			myframe.setLocationRelativeTo(null);
			
			myframe.setVisible(true);
			
	 }
}

class  jbt11listenerClass implements ActionListener{
	 
	 public void actionPerformed(ActionEvent e){
		 
		 JFrame myframe=new Cash_collected();
			myframe.setTitle("Cash collected ");
			myframe.setSize(700,400);
	
			myframe.setLocationRelativeTo(null);
			
			myframe.setVisible(true);
			
	 }
}

