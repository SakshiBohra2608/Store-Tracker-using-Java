package myproject;


import java.awt.*;

import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.*;


//making bill of items

class Show_Customer_Record extends JFrame{
	
	JPanel jp=new JPanel();
	
    JButton back;
  

	Show_Customer_Record(){
		
		Font myFont = new Font("Consolas",Font.BOLD, 15); 

		
		JLabel l1;
		JLabel l2;
		JLabel l3;
		JLabel l4;
		
		l1=new JLabel(" ITEM ");
		 
		 l2=new JLabel("RATE");
		
		 l3=new JLabel("QUANTITY");
		 
		 l4=new JLabel("AMOUNT");
		 
		 l1.setFont(myFont);
		 l2.setFont(myFont);
		 l3.setFont(myFont);
		 l4.setFont(myFont);
		 
		

	   jp.add(l1);
	  
	  jp.add(l2);
	  
	  jp.add(l3);
	  jp.add(l4);
		
		 RandomAccessFile rf=null;
			int no_bill;
			try{ 
	  	         
		  	       rf=new RandomAccessFile("customer.txt","r");
		  	       }
		  	       catch (FileNotFoundException ex){
		  	    	  System.out.println("error in opening file");
		  	    	  
		  	       }
			
		
			jp.setLayout(new GridLayout(0,4));
			
		
			
			JTextField txname;
			 JTextField txrate;
			 JTextField txqty;
			 JTextField txamount;
			 JTextField txtamount;
			 
			
			
			JLabel l5;
			JLabel l6;
			
			
	try{		
			
		while(true)	
			
		{	
			if(rf.length()==rf.getFilePointer())  break;
			
			no_bill=rf.readInt();
			
			 l5=new JLabel(" Customer Name "); 
		l6=new JLabel(" Mobile Number ");
		
		l5.setOpaque(true);
		l6.setOpaque(true);
		l5.setBackground(new Color(243, 219, 207));
		l6.setBackground(new Color(243, 219, 207));
		
		JTextField jtx1=new JTextField(15);
		JTextField jtx2=new JTextField(15);
		
		jtx1.setBackground(new Color(229, 193, 205));
		jtx2.setBackground(new Color(229, 193, 205));
		
		jtx1.setText(rf.readUTF());
		jtx2.setText(rf.readUTF());
		
		 l5.setFont(myFont);
		 l6.setFont(myFont);
		 jtx1.setFont(myFont);
		 jtx2.setFont(myFont);

		jp.add(l5);
		jp.add(jtx1);
		jp.add(l6);
		jp.add(jtx2);
		jp.setBackground(new Color(252, 241, 240));
			
		
	  
	   
		    	   System.out.println("no fo item " +no_bill);
		    	   
		    	   
		    	  
		    	  for(int j=0;j<no_bill;j++){
		    		   
		    	  txname=new JTextField(15);
		    	  txname.setText(rf.readUTF());
		    	  
		    	
		    	  
		    	
		    	  
		    	  txrate=new JTextField(15);
		    	 
		    	 
		    	   txrate.setText(String.valueOf(rf.readDouble()));
		    	   
		    	   
		    	   
		          
		    	 txqty=new JTextField(15);
		    	 
		            txqty.setText(String.valueOf(rf.readDouble()));
		            
		        
		          
		       
		          txamount=new JTextField(15);
		          txamount.setText(String.valueOf(rf.readDouble()));
		          
		          txname.setBackground(new Color(229, 193, 205));
					 txrate.setBackground(new Color(229, 193, 205));
					 txqty.setBackground(new Color(229, 193, 205));
					 txamount.setBackground(new Color(229, 193, 205));
					 
					 txname.setFont(myFont);
					 txrate.setFont(myFont);
					 txqty.setFont(myFont);
					 txamount.setFont(myFont);
		          
		            jp.add(txname);
		           jp.add(txrate);
		            jp.add(txqty);
		           jp.add(txamount);
		           
		       
		           
		    		 
		    	  }  //for loop end
		    	  
		    	  
		    	
		   
		    	
		       
		       
		      JLabel amou=new JLabel("Total");
		      amou.setFont(myFont);
		       txtamount=new JTextField(15);
		       txtamount.setBackground(new Color(229, 193, 205));
		       txtamount.setFont(myFont);
		     
		   txtamount.setText(String.valueOf(rf.readDouble()));
		   jp.add(amou);
		   
		JLabel   label3=new JLabel("");
		JLabel   label4=new JLabel("");
		   jp.add(label3);
		   jp.add(label4);
		   
		   jp.add(txtamount);
		}
		
		
		}
	
	 catch (IOException e){
		 System.out.println("error in readin customer File");
	 }
	
	back=new JButton("Back");
	
	back.setBackground(new Color(105, 59, 105));
	back.setForeground(Color.white);
    back.setBorder(BorderFactory.createLineBorder(Color.white,2,true));
    
    back.setFont(myFont);
	jp.add(back);
	
	Backclass listener=new Backclass();
	back.addActionListener(listener);
	
	 int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
     int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
JScrollPane jsp=new JScrollPane(jp,v,h);
 
 add(jsp);
     
		
	} // constructor end
	
	class 	Backclass implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		

		 JFrame fram=new Show_Customer_Record();
		   fram.setTitle("Show customer Record");
		  fram.setSize(700,400);
		  fram.setLocationRelativeTo(null);
		  fram.setVisible(true);
		
	}
	
}
	