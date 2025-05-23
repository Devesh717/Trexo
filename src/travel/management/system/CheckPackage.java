package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckPackage extends JFrame{
    
    CheckPackage() {
       setBounds(233, 84, 900, 600);
       
       String[] package1 = {
    "GOLDEN ESCAPE PACKAGE",
    "6 Days & 7 Nights of Luxury Stay",
    "Personalized Airport Assistance",
    "Daily Gourmet Meals Included",
    "Unlimited Soft Beverages",
    "Exciting Adventure Activities",
    "Full-Day 3 Island Luxury Cruise",
    "Professional English-Speaking Guide",
    "Book Your Dream Vacation Now",
    "Exclusive Summer Special Offer",
    "All-Inclusive: Rs. 30,000/- Only",
    "package1.jpg"
};

String[] package2 = {
    "Silver Package",
    "Enjoy 5 Days & 6 Nights of Adventure",
    "24/7 Toll-Free Support",
    "Complimentary Entrance Tickets",
    "Exclusive Airport Meet & Greet",
    "Welcome Drinks Upon Arrival",
    "Exciting Night Safari Experience",
    "Romantic Dinner Cruise",
    "Reserve Your Package Now",
    "Winter Special Offer",
    "Only Rs. 20,000/-",
    "package2.jpg"
};

String[] package3 = {
    "Bronze Package",
    "Enjoy 6 Days & 5 Nights of Fun",
    "Inclusive Return Airfare",
    "Complimentary Clubbing Access",
    "Horse Riding & Exciting Games",
    "Thrilling River Rafting Adventure",
    "Delicious Meals Included",
    "Special BBQ Dinner Experience",
    "Reserve Your Package Today",
    "Winter Special Offer",
    "Only Rs. 10,000/-",
    "package3.jpg"
};

             
       JTabbedPane tab = new JTabbedPane();
       JPanel p1 = createPackage(package1);
       tab.addTab("Package 1", null, p1);
       
       JPanel p2 = createPackage(package2);
       tab.addTab("Package 2", null, p2);
       
       JPanel p3 = createPackage(package3);
       tab.addTab("Package 3", null, p3);
       
       add(tab);
       
       setVisible(true);
    }
    public JPanel createPackage(String[] pack) {
       JPanel p1 = new JPanel();
       p1.setLayout(null);
       p1.setBackground(Color.WHITE);
       
       JLabel l1 = new JLabel(pack[0]);
       l1.setBounds(50, 5, 300, 30);
       l1.setForeground(new Color(255, 140, 0));
       l1.setFont(new Font("Tahoma", Font.BOLD, 30));
       p1.add(l1);
       
       JLabel l2= new JLabel(pack[1]);
       l2.setBounds(30, 60, 300, 30);
       l2.setForeground(new Color(220, 20, 60));   
       l2.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(l2);
       
       JLabel l3= new JLabel(pack[2]);
       l3.setBounds(30, 110, 300, 30);
       l3.setForeground(new Color(178, 34, 34)); 
       l3.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(l3);
       
       JLabel l4= new JLabel(pack[3]);
       l4.setBounds(30, 160, 300, 30);
       l4.setForeground(new Color(218, 165, 32));
       l4.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(l4);
       
       JLabel l5= new JLabel(pack[4]);
       l5.setBounds(30, 210, 300, 30);
       l5.setForeground(new Color(138, 43, 226));  
       l5.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(l5);
       
       JLabel l6= new JLabel(pack[5]);
       l6.setBounds(30, 260, 300, 30);
       l6.setForeground(new Color(70, 130, 180)); 
       l6.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(l6);
       
       JLabel l7= new JLabel(pack[6]);
       l7.setBounds(30, 310, 300, 30);
       l7.setForeground(new Color(199, 21, 133)); 
       l7.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(l7);
       
       JLabel l8= new JLabel(pack[7]);
       l8.setBounds(30, 360, 300, 30);
       l8.setForeground(new Color(255, 215, 0));
       l8.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(l8);

       JLabel l9= new JLabel(pack[8]);
       l9.setBounds(60, 430, 300, 30);
       l9.setForeground(new Color(105, 105, 105)); 
       l9.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(l9);
       
       JLabel l10= new JLabel(pack[9]);
       l10.setBounds(80, 480, 300, 30);
       l10.setForeground(new Color(186, 85, 211));
       l10.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(l10);
       
       JLabel l11= new JLabel(pack[10]);
       l11.setBounds(500, 480, 300, 30);
       l11.setForeground(new Color(186, 85, 211));
       l11.setFont(new Font("Tahoma", Font.BOLD, 20));
       p1.add(l11);
       
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/" + pack[11]));
       Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l12 = new JLabel(i3);
       l12.setBounds(350, 20, 500, 300);
       p1.add(l12);
       
       return p1;
    }
     public static  void main(String[] args) {
         new CheckPackage();
     }    
}
