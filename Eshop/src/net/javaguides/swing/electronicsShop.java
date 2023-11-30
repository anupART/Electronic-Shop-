package net.javaguides.swing;


//import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet.ColorAttribute;

import com.javaguides.javaswing.showDatabase;

//import net.javaguides.swing.electronicsShop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
* User Registration using Swing
* @author javaguides.net
*
*/
public class electronicsShop extends JFrame {
  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JLabel NewUserRegister;
  private JLabel CustomerInfo;
  private JLabel name;
  private JLabel mobno;
  private JLabel email;
  private JTextField tname;
  private JTextField tmobno;
  private JTextField temail;
  private JLabel add;
  private JTextArea tadd;
  private JLabel ProductInfo;
  private JLabel sel;
  private JComboBox select;
  private JLabel qty;
  private JTextField quantity;
  private JLabel payment;
  private JCheckBox upi;
  private JCheckBox debit;
  private JCheckBox netbank;
  private JCheckBox emi;
  private JButton btnNewButton;
  private JButton btnNewButton1;
  
  private String prd_list[]
  		= { "HP Laptop- 70000", "Dell Laptop- 65000", "Lenovo Laptop- 87000", "MSI Laptop- 90000", "Asus Laptop- 110000"};

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
          public void run() {
              try {
                  electronicsShop frame = new electronicsShop();
                  frame.setVisible(true);
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
      });
  }

  /**
   * Create the frame.
   */

  public electronicsShop() {
//      setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(300, 90, 900, 600);
      setResizable(false);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
      contentPane.setBackground(new Color(11,11,49));
      setContentPane(contentPane);
      contentPane.setLayout(null);

      NewUserRegister = new JLabel("Tony Electronics Ltd.");
      NewUserRegister.setFont(new Font("Cambria", Font.PLAIN, 30));
      NewUserRegister.setForeground (Color.magenta);
      NewUserRegister.setSize(300, 40);
      NewUserRegister.setLocation(300, 30);
      contentPane.add(NewUserRegister);
      
      CustomerInfo = new JLabel("Customer Information");
      CustomerInfo.setFont(new Font("Cambria", Font.PLAIN, 25));
      CustomerInfo.setForeground (Color.magenta);
      CustomerInfo.setSize(300, 25);
      CustomerInfo.setLocation(120, 90);
      contentPane.add(CustomerInfo);

      name = new JLabel("Name:");
      name.setFont(new Font("Cambria", Font.PLAIN, 20));
      name.setForeground (Color.magenta);
      name.setSize(100, 20);
      name.setLocation(100, 150);
      contentPane.add(name);

      mobno = new JLabel("Mobile:");
      mobno.setFont(new Font("Cambria", Font.PLAIN, 20));
      mobno.setForeground (Color.magenta);
      mobno.setSize(100, 20);
      mobno.setLocation(100, 200);
      contentPane.add(mobno);

      email = new JLabel("Email:");
      email.setFont(new Font("Cambria", Font.PLAIN, 20));
      email.setForeground (Color.magenta);
      email.setSize(100, 20);
      email.setLocation(100, 250);
      contentPane.add(email);
      
      add = new JLabel("Address:");
      add.setFont(new Font("Cambria", Font.PLAIN, 20));
      add.setForeground (Color.magenta);
      add.setSize(100, 20);
      add.setLocation(100, 300);
      contentPane.add(add);

      tname = new JTextField();
      tname.setFont(new Font("Cambria", Font.PLAIN, 15));
      tname.setSize(190, 20);
      tname.setLocation(200, 150);
		contentPane.add(tname);

      tmobno = new JTextField();
      tmobno.setFont(new Font("Cambria", Font.PLAIN, 15));
      tmobno.setSize(190, 20);
      tmobno.setLocation(200, 200);
      contentPane.add(tmobno);

      temail = new JTextField();
      temail.setFont(new Font("Cambria", Font.PLAIN, 15));
      temail.setSize(190, 20);
      temail.setLocation(200, 250);
      contentPane.add(temail);
     
      tadd = new JTextArea();
      tadd.setFont(new Font("Cambria", Font.PLAIN, 15));
      tadd.setSize(190, 100);
      tadd.setLocation(200, 300);
      tadd.setLineWrap(true);
      contentPane.add(tadd);
      


      ProductInfo = new JLabel("Product Selection");
      ProductInfo.setFont(new Font("Cambria", Font.PLAIN, 25));
      ProductInfo.setForeground (Color.magenta);
      ProductInfo.setSize(300, 25);
      ProductInfo.setLocation(535, 90);
      contentPane.add(ProductInfo);
      
      sel = new JLabel("Products:");
		sel.setFont(new Font("Cambria", Font.PLAIN, 20));
      sel.setForeground (Color.magenta);
		sel.setSize(190, 25);
		sel.setLocation(500, 150);
		contentPane.add(sel);
		
		select = new JComboBox(prd_list);
		select.setFont(new Font("Cambria", Font.PLAIN, 15));
		select.setSize(200, 25);
		select.setLocation(600, 150);
		contentPane.add(select);

      qty = new JLabel("Quantity:");
      qty.setFont(new Font("Cambria", Font.PLAIN, 20));
      qty.setForeground (Color.magenta);
      qty.setSize(190, 25);
      qty.setLocation(500, 200);
      contentPane.add(qty);
      
      quantity = new JTextField();
      quantity.setFont(new Font("Cambria", Font.PLAIN, 15));
      quantity.setSize(50, 20);
      quantity.setLocation(600, 200);
      contentPane.add(quantity);

      payment = new JLabel("Payment:");
		payment.setFont(new Font("Cambria", Font.PLAIN, 20));
      payment.setForeground (Color.magenta);
		payment.setSize(190, 25);
		payment.setLocation(500, 250);
		contentPane.add(payment);
      
      upi = new JCheckBox("UPI");
      upi.setFont(new Font("Cambria", Font.PLAIN, 18));
      upi.setSize(190, 20);
      upi.setLocation(605, 250);
      contentPane.add(upi);
      
      debit = new JCheckBox("Debit/Credit Card");
      debit.setFont(new Font("Cambria", Font.PLAIN, 18));
      debit.setSize(190, 20);
      debit.setLocation(605, 290);
      contentPane.add(debit);
      
      netbank = new JCheckBox("Net Banking");
      netbank.setFont(new Font("Cambria", Font.PLAIN, 18));
      netbank.setSize(190, 20);
      netbank.setLocation(605, 330);
      contentPane.add(netbank);
      
      emi = new JCheckBox("EMI");
      emi.setFont(new Font("Cambria", Font.PLAIN, 18));
      emi.setSize(190, 20);
      emi.setLocation(605, 370);
      contentPane.add(emi);

      btnNewButton = new JButton("Register");
      btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 25));
      btnNewButton.setSize(250, 40);
      btnNewButton.setLocation(150,450);
      contentPane.add(btnNewButton);
      
      btnNewButton1 = new JButton("Show Database");
      btnNewButton1.setFont(new Font("Cambria", Font.PLAIN, 25));
      btnNewButton1.setSize(250, 40);
      btnNewButton1.setLocation(500,450);
      contentPane.add(btnNewButton1);
      
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              String Name = tname.getText();
              String mobno = tmobno.getText();
              String emailId = temail.getText();
              String address = tadd.getText();
              String product = select.getSelectedItem().toString();
              String qnty = quantity.getText();
              String pay;

              if(upi.isSelected()){
                   pay = upi.getText();
              }
              else if(debit.isSelected()){
                   pay = debit.getText();
              }
              else if(netbank.isSelected()){
                   pay = netbank.getText();
              }
              else if(emi.isSelected()){
                   pay = emi.getText();
              }
              else{
                   pay = "No payment";
              }

              int len = mobno.length();

              String msg = "" + Name;
              msg += " \n";
              if (len != 10) {
                  JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
              }

              try {
                  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop", "root", "anup");

                  String query = "INSERT INTO customer values('" + Name + "','" + mobno + "','" + emailId + "','"+address+"')";
                  String query1 = "INSERT INTO Productsel values('" + product + "','" + qnty + "','" + pay + "')";
                  Statement sta = connection.createStatement();
                  int x = sta.executeUpdate(query);
                  int y =sta.executeUpdate(query1);
                  if (x == 0 && y==0) {
                      JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                  } else {
                      JOptionPane.showMessageDialog(btnNewButton,
                          "Welcome, " + msg + "Your account is sucessfully created");
                  }
                  connection.close();
              } catch (Exception exception) {
                  exception.printStackTrace();
              }
          }
      });
      
      btnNewButton1.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
//    	        new showDatabase().setVisible(true); // Main Form to show after the Login Form..
    	    }
      });
  }
}