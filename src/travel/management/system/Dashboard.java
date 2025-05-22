package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, deletePersonalDetails, checkpackage, bookpackage, viewpackage, viewhotels, destination, bookhotels, viewbookedhotels, payments, calculator, notepad,about;
    String username;
    Dashboard(String username) {
        
        this.username = username;
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255, 140, 0));
        p1.setBounds(0, 0, 1600, 50);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(255, 140, 0));
        p2.setBounds(0, 50, 300, 700);
        add(p2);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 15, 300, 45);
        addPersonalDetails.setBackground(new Color(255, 140, 0));
        addPersonalDetails.setForeground(Color.BLACK);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0, 20, 0, 0));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 55, 300, 45);
        updatePersonalDetails.setBackground(new Color(255, 140, 0));
        updatePersonalDetails.setForeground(Color.BLACK);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0, 20, 0, 0));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0, 95, 300, 45); 
        viewPersonalDetails.setBackground(new Color(255, 140, 0));
        viewPersonalDetails.setForeground(Color.BLACK);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 20, 0, 0));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 135, 300, 45);
        deletePersonalDetails.setBackground(new Color(255, 140, 0));
        deletePersonalDetails.setForeground(Color.BLACK);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0, 20, 0, 0));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        checkpackage = new JButton("Check Packages");
        checkpackage.setBounds(0, 175, 300, 45); 
        checkpackage.setBackground(new Color(255, 140, 0));
        checkpackage.setForeground(Color.BLACK);
        checkpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackage.setMargin(new Insets(0, 20, 0, 0));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);
        
        bookpackage = new JButton("Book Packages");
        bookpackage.setBounds(0, 215, 300, 45);
        bookpackage.setBackground(new Color(255, 140, 0));
        bookpackage.setForeground(Color.BLACK);
        bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackage.setMargin(new Insets(0, 20, 0, 0));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackage = new JButton("View Packages");
        viewpackage.setBounds(0, 255, 300, 45);
        viewpackage.setBackground(new Color(255, 140, 0));
        viewpackage.setForeground(Color.BLACK);
        viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackage.setMargin(new Insets(0, 20, 0, 0));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 295, 300, 45); 
        viewhotels.setBackground(new Color(255, 140, 0));
        viewhotels.setForeground(Color.BLACK);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 20, 0, 0));
        viewhotels.addActionListener(this);
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotels = new JButton("Book Hotels");
        bookhotels.setBounds(0, 335, 300, 45);
        bookhotels.setBackground(new Color(255, 140, 0));
        bookhotels.setForeground(Color.BLACK);
        bookhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotels.setMargin(new Insets(0, 20, 0, 0));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        
        viewbookedhotels = new JButton("View Booked Hotels");
        viewbookedhotels.setBounds(0, 375, 300, 45);
        viewbookedhotels.setBackground(new Color(255, 140, 0));
        viewbookedhotels.setForeground(Color.BLACK);
        viewbookedhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewbookedhotels.setMargin(new Insets(0, 20, 0, 0));
        viewbookedhotels.addActionListener(this);
        p2.add(viewbookedhotels);
        
        destination = new JButton("Destination");
        destination.setBounds(0, 415, 300, 45);
        destination.setBackground(new Color(255, 140, 0));
        destination.setForeground(Color.BLACK);
        destination.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destination.setMargin(new Insets(0, 20, 0, 0));
        destination.addActionListener(this);
        p2.add(destination);
        
        payments = new JButton("Payments");
        payments.setBounds(0, 455, 300, 45);  
        payments.setBackground(new Color(255, 140, 0));
        payments.setForeground(Color.BLACK);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0, 20, 0, 0));
        payments.addActionListener(this);
        p2.add(payments);
        
        
        calculator = new JButton("Calculator");
        calculator.setBounds(0, 495, 300, 45);    
        calculator.setBackground(new Color(255, 140, 0));
        calculator.setForeground(Color.BLACK);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.setMargin(new Insets(0, 20, 0, 0));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0, 535, 300, 45);    
        notepad.setBackground(new Color(255, 140, 0));
        notepad.setForeground(Color.BLACK);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 20, 0, 0));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About");
        about.setBounds(0, 575, 300, 45);
        about.setBackground(new Color(255, 140, 0));
        about.setForeground(Color.BLACK);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 20, 0, 0));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4 =  new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1100, 900, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 703);
        add(image);
        
        JLabel text = new JLabel("Trexo");
        text.setBounds(750, 70, 1000, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 55));
        image.add(text);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == addPersonalDetails) {
            new AddCustomer(username);
        }
        else if(ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        }
        else if(ae.getSource() == updatePersonalDetails) {
            new UpdateCustomer(username);
        }
        else if(ae.getSource() == deletePersonalDetails) {
            new DeleteDetails(username);
        }
        else if(ae.getSource() == checkpackage) {
            new CheckPackage();
        }
        else if(ae.getSource() == bookpackage)
        {
            new BookPackage(username);
        }
        else if(ae.getSource() == viewpackage) {
            new ViewPackage(username);
        }
        else if(ae.getSource() == viewhotels) {
            new CheckHotels();
        }
        else if(ae.getSource() == destination) {
            new Destinations();
        }
        else if(ae.getSource() == bookhotels) {
            new BookHotel(username);
        }
        else if(ae.getSource() == viewbookedhotels) {
            new ViewBookedHotel(username);
        }
        else if(ae.getSource() == payments) {
            new Payment();
        }
        else if(ae.getSource() == calculator) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == notepad) {
            try {
                Runtime.getRuntime().exec("\"C:\\Program Files\\Notepad++\\notepad++.exe\"");            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == about) {
             new About();
        }
    } 
     public static void main(String[] args) {
         new Dashboard("username");
     }    
}
