package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotel extends JFrame implements ActionListener{
    
    Choice chotel, cac, cfood;
    JTextField tfpersons, tfdays;
    JLabel labelusername, labelid, labelnumber, labelphone, labelprice;
    JButton checkprice, bookhotel, back;
    
    BookHotel(String username) {
            
        setBounds(133, 109, 1100, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("BOOK HOTEL");
        text.setBounds(100, 10, 200, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        text.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblusername.setBounds(40, 70, 100, 20);
        add(lblusername);
        
        labelusername = new JLabel();
        text.setFont(new Font("Tahoma", Font.PLAIN, 16));
        labelusername.setBounds(250, 70, 100, 20);
        add(labelusername);
        
        JLabel lbpackage = new JLabel("Select Hotel");
        text.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbpackage.setBounds(40, 110, 100, 20);
        add(lbpackage);
        
        chotel = new Choice();
        chotel.add("The Grand Palace");
        chotel.add("Oceanview Resort");
        chotel.add("Mountain Peak Inn");
        chotel.add("Sunset Boulevard Hotel");
        chotel.add("Royal Orchid Sultes");
        chotel.add("The Heritage Haven");
        chotel.add("Palm Grove Retreat");
        chotel.add("Cityscape Residency"); 
        chotel.add("Lakeside Villa Hotel");
        chotel.add("Skyline Executive Hotel");
        chotel.setBounds(250, 110, 200, 20);
        add(chotel);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel");
            while(rs.next()) {
                chotel.add(rs.getString("name"));
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        JLabel lblpersons = new JLabel("Total Persons");
        text.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblpersons.setBounds(40, 150, 150, 25);
        add(lblpersons);
        
        tfpersons = new JTextField("1");
        tfpersons.setBounds(250, 150, 200, 25);
        add(tfpersons);
        
        JLabel lbldays = new JLabel("No.of Days");
        text.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbldays.setBounds(40, 190, 150, 25);
        add(lbldays);
        
        tfdays = new JTextField("1");
        tfdays.setBounds(250, 190, 200, 25);
        add(tfdays);
        
        JLabel lblac = new JLabel("AC/ Non-AC");
        text.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblac.setBounds(40, 230, 150, 25);
        add(lblac);
        
        cac = new Choice();
        cac.add("AC");
        cac.add("Non AC");
        cac.setBounds(250, 230, 200, 20);
        add(cac);
        
        JLabel lblfood = new JLabel("Food Included");
        text.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblfood.setBounds(40, 270, 150, 25);
        add(lblfood);
        
        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250, 270, 200, 20);
        add(cfood);
        
        JLabel lblphone = new JLabel("Phone");
        text.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblphone.setBounds(40, 310 ,150, 20);
        add(lblphone);
        
        labelphone = new JLabel();
        labelphone.setBounds(250, 310, 200, 25);
        add(labelphone);
        
        JLabel lblid = new JLabel("Id");
        text.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblid.setBounds(40, 350 ,150, 20);
        add(lblid);
        
        labelid = new JLabel();
        labelid.setBounds(250, 350, 200, 25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        text.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblnumber.setBounds(40, 390, 150, 25);
        add(lblnumber);
        
        labelnumber = new JLabel();
        labelnumber.setBounds(250, 390, 150, 25);
        add(labelnumber);
        
        JLabel lbltotal = new JLabel("Total Price");
        text.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbltotal.setBounds(40, 430, 150, 25);
        add(lbltotal);
        
        labelprice = new JLabel();
        labelprice.setBounds(250, 430, 150, 25);
        add(labelprice);
        
        try {
            Conn conn = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        checkprice = new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(60, 470, 120, 25);
        checkprice.addActionListener(this);
        add(checkprice);
        
        
        bookhotel = new JButton("Book Hotel");
        bookhotel.setBackground(Color.BLACK);
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setBounds(200, 470, 120, 25);
        bookhotel.addActionListener(this);
        add(bookhotel);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340, 470, 120, 25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12= new JLabel(i3);
        l12.setBounds(500, 50, 600, 300);
        add(l12);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == checkprice) {          
    try {
        Conn c = new Conn();
        ResultSet rs = c.s.executeQuery("SELECT * FROM hotel WHERE name = '" + chotel.getSelectedItem() + "'");
        while(rs.next()) {
            int cost = Integer.parseInt(rs.getString("costperson"));
            int food = Integer.parseInt(rs.getString("foodincluded"));
            int ac = Integer.parseInt(rs.getString("acroom"));
            
            int persons = Integer.parseInt(tfpersons.getText().trim());
            int days = Integer.parseInt(tfdays.getText().trim());
            
            String acSelected = cac.getSelectedItem();
            String foodSelected = cfood.getSelectedItem();
            
            if(persons > 0 && days > 0) {
                int total = cost;
                if(acSelected.equals("AC")) {
                total += ac;
                }
                if(foodSelected.equals("Yes")) {
                total += food;
                }
                
                total = total * persons * days;
                labelprice.setText("Rs " + total);
            } else {
                JOptionPane.showMessageDialog(null, "Please enter valid number of persons and days");
            }
        }
    } catch(Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error fetching price. Check console.");
    }
}
        else if(ae.getSource() == bookhotel) {
            try {
                Conn c = new Conn();
                c.s.executeUpdate("INSERT INTO bookhotel VALUES('" 
                + labelusername.getText() + "', '" 
                + tfpersons.getText() + "', '" 
                + tfdays.getText() + "', '" 
                + cac.getSelectedItem() + "', '" 
                + cfood.getSelectedItem() + "', '"
                + labelid.getText() + "', '" 
                + chotel.getSelectedItem() + "', '"
                + labelnumber.getText() + "', '"
                + labelphone.getText() + "', '"         
                + labelprice.getText() + "')");
                
                
                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                setVisible(true);
            }
            
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        else {
            setVisible(false);
        }
}
    public static void main(String[] args) {
        new BookHotel("username");
    }    
}
