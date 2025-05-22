package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    
    About() {
        setBounds(600, 134, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 =new JLabel("About");
        l1.setBounds(200, 10, 100, 40);
        l1.setBackground(Color.WHITE);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);
        
        String a = "Trexo\n" +
           "--------------------------\n" +
           "Looking to book your next vacation? We’ve got you covered!\n" +
           "Our Travel Management System offers hassle-free booking for\n" +
           "exclusive tour packages and hotel stays, all tailored to fit\n" +
           "your preferences and budget.\n" +
           "\n" +
           "What We Offer:\n" +
           "• Wide Range of Tour Packages – Domestic & International\n" +
           "• Comfortable Hotel Bookings with AC/Non-AC and Meal Options\n" +
           "• Affordable Pricing and Seasonal Discounts\n" +
           "• Quick and Easy Booking Process\n" +
           "• Personalized Travel Plans for Individuals, Couples & Families\n" +
           "\n" +
           "Why Choose Us?\n" +
           "• Trusted by Hundreds of Happy Travelers\n" +
           "• Transparent Pricing – No Hidden Charges\n" +
           "• 24/7 Customer Support for All Your Queries\n" +
           "\n" +
           "Plan your dream vacation today with ease and confidence.\n" +
           "Let us handle the details while you focus on making memories!";

           
        TextArea area = new TextArea(a, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);

        
        JButton back = new JButton("Back");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
