//// Java program to implement
//// a Simple Registration Form
//// using Java Swing
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//class MyFrame
//	extends JFrame
//	implements ActionListener {
//
//	// Components of the Form
//	private Container c;
//	
///*
//	private JLabel name;
//	private JTextField tname;
//	private JLabel mno;
//	private JTextField tmno;
//	private JLabel gender;
//	private JRadioButton male;
//	private JRadioButton female;
//	private ButtonGroup gengp;
//	private JLabel dob;
//	private JComboBox date;
//	private JComboBox month;
//	private JComboBox year;
//	private JLabel add;
//	private JTextArea tadd;
//	private JCheckBox term;
//	private JButton sub;
//	private JButton reset;
//	private JLabel res;
//	private JTextArea resadd;
//*/
//	
//	private JLabel title;
//	private JLabel title1;
//	private JLabel title2;
//	private JTextArea tout;
//	private JTextArea tout1;
//
///*
//	private String dates[]
//		= { "1", "2", "3", "4", "5",
//			"6", "7", "8", "9", "10",
//			"11", "12", "13", "14", "15",
//			"16", "17", "18", "19", "20",
//			"21", "22", "23", "24", "25",
//			"26", "27", "28", "29", "30",
//			"31" };
//	private String months[]
//		= { "Jan", "feb", "Mar", "Apr",
//			"May", "Jun", "July", "Aug",
//			"Sup", "Oct", "Nov", "Dec" };
//	private String years[]
//		= { "1995", "1996", "1997", "1998",
//			"1999", "2000", "2001", "2002",
//			"2003", "2004", "2005", "2006",
//			"2007", "2008", "2009", "2010",
//			"2011", "2012", "2013", "2014",
//			"2015", "2016", "2017", "2018",
//			"2019" };
//*/
//
//	// constructor, to initialize the components
//	// with default values.
//	public MyFrame()
//	{
//		setTitle("View Database");
//		setBounds(300, 90, 900, 600);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setResizable(false);
//
//		c = getContentPane();
//		c.setLayout(null);
///*
//		title = new JLabel("Registration Form");
//		title.setFont(new Font("Arial", Font.PLAIN, 30));
//		title.setSize(300, 30);
//		title.setLocation(300, 30);
//		c.add(title);
//
//		name = new JLabel("Name");
//		name.setFont(new Font("Arial", Font.PLAIN, 20));
//		name.setSize(100, 20);
//		name.setLocation(100, 100);
//		c.add(name);
//
//		tname = new JTextField();
//		tname.setFont(new Font("Arial", Font.PLAIN, 15));
//		tname.setSize(190, 20);
//		tname.setLocation(200, 100);
//		c.add(tname);
//
//		mno = new JLabel("Mobile");
//		mno.setFont(new Font("Arial", Font.PLAIN, 20));
//		mno.setSize(100, 20);
//		mno.setLocation(100, 150);
//		c.add(mno);
//
//		tmno = new JTextField();
//		tmno.setFont(new Font("Arial", Font.PLAIN, 15));
//		tmno.setSize(150, 20);
//		tmno.setLocation(200, 150);
//		c.add(tmno);
//
//		gender = new JLabel("Gender");
//		gender.setFont(new Font("Arial", Font.PLAIN, 20));
//		gender.setSize(100, 20);
//		gender.setLocation(100, 200);
//		c.add(gender);
//
//		male = new JRadioButton("Male");
//		male.setFont(new Font("Arial", Font.PLAIN, 15));
//		male.setSelected(true);
//		male.setSize(75, 20);
//		male.setLocation(200, 200);
//		c.add(male);
//
//		female = new JRadioButton("Female");
//		female.setFont(new Font("Arial", Font.PLAIN, 15));
//		female.setSelected(false);
//		female.setSize(80, 20);
//		female.setLocation(275, 200);
//		c.add(female);
//
//		gengp = new ButtonGroup();
//		gengp.add(male);
//		gengp.add(female);
//
//		dob = new JLabel("DOB");
//		dob.setFont(new Font("Arial", Font.PLAIN, 20));
//		dob.setSize(100, 20);
//		dob.setLocation(100, 250);
//		c.add(dob);
//
//		date = new JComboBox(dates);
//		date.setFont(new Font("Arial", Font.PLAIN, 15));
//		date.setSize(50, 20);
//		date.setLocation(200, 250);
//		c.add(date);
//
//		month = new JComboBox(months);
//		month.setFont(new Font("Arial", Font.PLAIN, 15));
//		month.setSize(60, 20);
//		month.setLocation(250, 250);
//		c.add(month);
//
//		year = new JComboBox(years);
//		year.setFont(new Font("Arial", Font.PLAIN, 15));
//		year.setSize(60, 20);
//		year.setLocation(320, 250);
//		c.add(year);
//
//		add = new JLabel("Address");
//		add.setFont(new Font("Arial", Font.PLAIN, 20));
//		add.setSize(100, 20);
//		add.setLocation(100, 300);
//		c.add(add);
//
//		tadd = new JTextArea();
//		tadd.setFont(new Font("Arial", Font.PLAIN, 15));
//		tadd.setSize(200, 75);
//		tadd.setLocation(200, 300);
//		tadd.setLineWrap(true);
//		c.add(tadd);
//
//		term = new JCheckBox("Accept Terms And Conditions.");
//		term.setFont(new Font("Arial", Font.PLAIN, 15));
//		term.setSize(250, 20);
//		term.setLocation(150, 400);
//		c.add(term);
//
//		sub = new JButton("Submit");
//		sub.setFont(new Font("Arial", Font.PLAIN, 15));
//		sub.setSize(100, 20);
//		sub.setLocation(150, 450);
//		sub.addActionListener(this);
//		c.add(sub);
//
//		reset = new JButton("Reset");
//		reset.setFont(new Font("Arial", Font.PLAIN, 15));
//		reset.setSize(100, 20);
//		reset.setLocation(270, 450);
//		reset.addActionListener(this);
//		c.add(reset);
//		
// 		resadd = new JTextArea();
//		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
//		resadd.setSize(200, 75);
//		resadd.setLocation(580, 175);
//		resadd.setLineWrap(true);
//		c.add(resadd);
//		
//		res = new JLabel("");
//		res.setFont(new Font("Arial", Font.PLAIN, 20));
//		res.setSize(500, 25);
//		res.setLocation(100, 500);
//		c.add(res);
//*/
//
//		title = new JLabel("Database");
//		title.setForeground(Color.red);
//		title.setFont(new Font("Arial", Font.PLAIN, 30));
//		title.setSize(300, 30);
//		title.setLocation(400, 20);
//		c.add(title);
//		
//		title1 = new JLabel("Customer Information");
//		title1.setForeground(Color.red);
//		title1.setFont(new Font("Arial", Font.PLAIN, 25));
//		title1.setSize(300, 30);
//		title1.setLocation(345, 75);
//		c.add(title1);
//		
//		tout = new JTextArea();
//		tout.setFont(new Font("Arial", Font.PLAIN, 15));
//		tout.setSize(700, 150);
//		tout.setLocation(100, 125);
//		tout.setLineWrap(true);
//		tout.setEditable(false);
//		c.add(tout);
//
//		title2 = new JLabel("Product Information");
//		title2.setForeground(Color.red);
//		title2.setFont(new Font("Arial", Font.PLAIN, 25));
//		title2.setSize(300, 30);
//		title2.setLocation(345, 300);
//		c.add(title2);
//		
//		tout1 = new JTextArea();
//		tout1.setFont(new Font("Arial", Font.PLAIN, 15));
//		tout1.setSize(700, 150);
//		tout1.setLocation(100, 350);
//		tout1.setLineWrap(true);
//		tout1.setEditable(false);
//		c.add(tout1);
//		
//
//		setVisible(true);
//	}
//
//	// method actionPerformed()
//	// to get the action performed
//	// by the user and act accordingly
//	public void actionPerformed(ActionEvent e)
//	{
//		if (e.getSource() == sub) {
//			if (term.isSelected()) {
//				String data1;
//				String data
//					= "Name : "
//					+ tname.getText() + "\n"
//					+ "Mobile : "
//					+ tmno.getText() + "\n";
//				if (male.isSelected())
//					data1 = "Gender : Male"
//							+ "\n";
//				else
//					data1 = "Gender : Female"
//							+ "\n";
//				String data2
//					= "DOB : "
//					+ (String)date.getSelectedItem()
//					+ "/" + (String)month.getSelectedItem()
//					+ "/" + (String)year.getSelectedItem()
//					+ "\n";
//
//				String data3 = "Address : " + tadd.getText();
//				tout.setText(data + data1 + data2 + data3);
//				tout.setEditable(false);
//				res.setText("Registration Successfully..");
//			}
//			else {
//				tout.setText("");
//				resadd.setText("");
//				res.setText("Please accept the"
//							+ " terms & conditions..");
//			}
//		}
//
//		else if (e.getSource() == reset) {
//			String def = "";
//			tname.setText(def);
//			tadd.setText(def);
//			tmno.setText(def);
//			res.setText(def);
//			tout.setText(def);
//			term.setSelected(false);
//			date.setSelectedIndex(0);
//			month.setSelectedIndex(0);
//			year.setSelectedIndex(0);
//			resadd.setText(def);
//		}
//	}
//}
//
//// Driver Code
//class showDatabase {
//
//	public static void main(String[] args) throws Exception
//	{
//		MyFrame f = new MyFrame();
//	    f.getContentPane().setBackground(Color.BLUE);
//
//	}
//}

//package com.javaguides.javaswing.reg;
package com.javaguides.javaswing.reg;

import java.awt.event.ActionListener;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

//import com.mysql.cj.xdevapi.Statement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class showDatabase {


	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		MyTable MyTable = new MyTable();
	}

}
class MyTable extends JFrame implements ActionListener
{
	JPanel contentPane;
	JTable table1,table2;
	JButton button1,button2;
	JScrollPane pane1,pane2;
	MyTable()
	{
		setTitle("Table Data");
	    setSize(1000,700);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setBackground(new Color(11,11,49));
        setContentPane(contentPane);
        contentPane.setLayout(null);
	    
//	    ImageIcon img=new ImageIcon("C:\\Users\\DELL\\Desktop\\cwjdn");
//	    JLabel background1=new JLabel("",JLabel.CENTER);
//	    background1.setBackground(new Color(11,11,49));
//	    background1.setBounds(0,0,1000,700);
//	    add(background1);
	   
	    button1=new JButton("Show customer data");
	    button1.setBounds(140,560,200,40);
	    button1.addActionListener(this);
	    contentPane.add(button1);
	    
	    button2=new JButton("Show Product data");
	    button2.setBounds(600,560,200,40);
	    button2.addActionListener(this);
	    contentPane.add(button2);
    
	    table1=new JTable();    
	    pane1=new JScrollPane(table1);
	    pane1.setBounds(50,70,900,200);
	    contentPane.add(pane1,BorderLayout.CENTER);
	    
	    table2=new JTable();
	    pane2=new JScrollPane(table2);
	    pane2.setBounds(50,320,900,200);
	    contentPane.add(pane2,BorderLayout.CENTER);
	    	    
	    setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String url ="jdbc:mysql://localhost:3306/eshop";
		String username ="root";
		String password="rootpassword";
		Connection connection1,connection2;
		if(e.getSource()==button1)
		{
		try {
			connection1 = DriverManager.getConnection(url,username,password);
			java.sql.Statement st= connection1.createStatement();
			String query="SELECT * FROM customer";
			ResultSet rs=st.executeQuery(query);
			ResultSetMetaData rsmd=rs.getMetaData();
			DefaultTableModel model=(DefaultTableModel)table1.getModel();
			
			int cols=rsmd.getColumnCount();
			String[] colName=new String[cols];
			for(int i=0;i<cols;i++)
			{
				colName[i]=rsmd.getColumnName(i+1);
			}
			model.setColumnIdentifiers(colName);
			String Name,mobno,emailId,address;
			while(rs.next())
			{
				Name=rs.getString(1);
				mobno=rs.getString(2);
				emailId=rs.getString(3);
				address=rs.getString(4);
				String[] row= {Name,mobno,emailId,address};
				model.addRow(row);
			}
			st.close();
			connection1.close();
		
			
			
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null,"OOPS ERROR");
			e1.printStackTrace();
		}
		}
		if(e.getSource()==button2)
		{
		try {
			connection2 = DriverManager.getConnection(url,username,password);
			java.sql.Statement st1= connection2.createStatement();
			String query1="SELECT * FROM productsel";
			ResultSet rs1=st1.executeQuery(query1);
			ResultSetMetaData rsmd1=rs1.getMetaData();
			DefaultTableModel model1=(DefaultTableModel)table2.getModel();
			
			int cols1=rsmd1.getColumnCount();
			String[] colName1=new String[cols1];
			for(int i=0;i<cols1;i++)
			{
				colName1[i]=rsmd1.getColumnName(i+1);
			}
			model1.setColumnIdentifiers(colName1);
			String product,qnty, pay;
			while(rs1.next())
			{
				product=rs1.getString(1);
				qnty=rs1.getString(2);
				pay=rs1.getString(3);
				String[] row= {product, qnty, pay};
				model1.addRow(row);
			}
			st1.close();
			connection2.close();
			
			
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null,"OOPS ERROR");
			e1.printStackTrace();
		}
		
	}	
     }
	}