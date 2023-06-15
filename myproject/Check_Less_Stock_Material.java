
package myproject;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


public class Check_Less_Stock_Material  extends JFrame{
	
	JTextField textlimit;
	JLabel labellimit;
	JButton enter;
	
    JButton back1,back;
	
	JLabel label1;
	JLabel label2;
	JLabel label3;
	
	JTextField text1;
	JTextField text2;
	JTextField text3;
	
	JPanel panel1;
	JPanel panel2;
	
	RandomAccessFile rf=null;
	
	int item_code;
	String name;
	double p_rate;
	double s_rate;
	double qty;
	
    
	JFrame fram=new JFrame();
	
	Check_Less_Stock_Material(){
		
		Font myFont = new Font("Consolas",Font.BOLD, 17); 

		
		 panel1=new JPanel();
		
		panel1.setLayout(new GridLayout(2,2));
		panel1.setBackground(new Color(255,219,230));
		
		
		
		labellimit=new JLabel("              Set Limit");
		textlimit=new JTextField(15);
		labellimit.setFont(myFont);
		textlimit.setFont(myFont);
		
		enter=new JButton("ENTER");
		enter.setBackground(new Color(133,69,83));
        enter.setBorder(BorderFactory.createLineBorder(Color.white,2,true));
		enter.setForeground(Color.white);
		enter.setFont(myFont);
		
		panel1.add(labellimit);
		panel1.add(textlimit);
		panel1.add(enter);
		
		 back1=new JButton("BACK");
		 back1.setBackground(new Color(133,69,83));
	        back1.setBorder(BorderFactory.createLineBorder(Color.white,2,true));
			back1.setForeground(Color.white);
			
			Back1Class listener2=new Back1Class();
			back1.addActionListener(listener2);
			back1.setFont(myFont);
			
			panel1.add(back1);
		
		
		add(panel1);
		
		enterClass listener1=new enterClass();
		enter.addActionListener(listener1);
		
		
	}
	
class Back1Class implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			setVisible(false);
	
		}
		
}
	
class BackClass implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			fram.setVisible(false);
	
		}
		
}
	class enterClass implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			panel2=new JPanel();
			panel2.setLayout(new GridLayout(0,3));
			
			label1=new JLabel("ITEM CODE");
			label2=new JLabel("NAME");
			label3=new JLabel("QUANTITY");
			
			panel2.add(label1);
			panel2.add(label2);
			panel2.add(label3);
			
			
			
			try{
				rf=new RandomAccessFile("data9.txt","r");
			}
			
			catch(FileNotFoundException er){
				System.out.println("file not found");
			}
			
			catch(IOException ew){
				System.out.println("error in io");
			}
			
			int limit;
			
			limit=Integer.parseInt(textlimit.getText());
			
			System.out.println("limit is "+limit);
			
			
			try{
			
		while(true){
			
			
			if(rf.length()==rf.getFilePointer())  break;
			item_code=rf.readInt();
			
				System.out.println("item code"+item_code);
				
				
				name=rf.readUTF();
				System.out.println("name"+name);
				
				p_rate=	rf.readDouble();
				System.out.println("p_rate "+p_rate);
				
				s_rate=rf.readDouble();
				
				System.out.println("s_rate "+s_rate);
				
				qty=rf.readDouble();
				System.out.println("qty"+qty);
				
				if(qty<limit){
					
					text1=new JTextField(15);
					text1.setText(String.valueOf(item_code));
					
					text2=new JTextField(15);
					text2.setText(name);
					
					text3=new JTextField(15);
					text3.setText(String.valueOf(qty));
					
					panel2.add(text1);
					panel2.add(text2);
					panel2.add(text3);
				}
				
				
				
				
			}
			
			}
			catch(IOException eq){
				System.out.println("error in io");
			}
			
             back=new JButton("BACK");
			
			BackClass listener2=new BackClass();
			back.addActionListener(listener2);
			panel2.add(back);
			
			 
			  fram.setTitle("Check Less Stock Material");
			  fram.setSize(700,400);
			  fram.setLocationRelativeTo(null);
			  fram.add(panel2);
			  fram.setVisible(true);
			
			
			try{
				rf.close();
			}
			
			catch(IOException ea){
				System.out.println("error in closing");
			}
			
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 JFrame fram=new Check_Less_Stock_Material();
		   fram.setTitle("Check Less Stock Material");
		  fram.setSize(700,300);
		  fram.setLocationRelativeTo(null);
		  fram.setVisible(true);

	}

}