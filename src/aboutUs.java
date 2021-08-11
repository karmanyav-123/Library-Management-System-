package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us");
            setBackground(new Color(173, 216, 230));
            setBounds(450, 200, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l3 = new JLabel("Library Management System");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(130, 40, 600, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Library management system is a project which aims in developing");
            l4.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
            l4.setBounds(70, 110, 600, 20);
            contentPane.add(l4);

            JLabel l5 = new JLabel("a computerized system to maintain all the daily work of a library. ");
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
            l5.setBounds(70, 130, 600, 20);
            contentPane.add(l5);


            JLabel l6 = new JLabel("The main feature of this system is that all the books available in the");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
            l6.setBounds(70, 150, 600, 20);
            contentPane.add(l6);

            JLabel l7 = new JLabel("library can be displayed in a list so that students need not roam");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
            l7.setBounds(70, 170, 600, 20);
            contentPane.add(l7);

            JLabel l8 = new JLabel("through the entire library to find a book.");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
            l8.setBounds(70, 190, 600, 20);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Additionally, the application effectively maintains the details of users/");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 16));
            l9.setBounds(70, 220, 600, 20);
            contentPane.add(l9);


            JLabel l10 = new JLabel("students to whom books have been issued, it also records the issued date");
            l10.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
            l10.setBounds(70, 240, 600, 20);
            contentPane.add(l10);
            
            JLabel l11 = new JLabel("and return date. The system helps both students and library manager to");
            l11.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
            l11.setBounds(70, 260, 600, 20);
            contentPane.add(l11);
                
            JLabel l12 = new JLabel("keep a constant track of all the books available in the library.");
            l12.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
            l12.setBounds(70, 280, 600, 20);
            contentPane.add(l12);
            
            JLabel l13 = new JLabel("It allows both the admin and the student to search for the desired book.");
            l13.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
            l13.setBounds(70, 300, 600, 20);
            contentPane.add(l13);
            
            JLabel l14 = new JLabel("Language Used - Core Java || Concept Used - Swing");
            l14.setForeground(new Color(47, 79, 79));
            l14.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l14.setBounds(70, 350, 600, 34);
            contentPane.add(l14);
            
            JLabel l15 = new JLabel("IDE Used - Eclipse || Database Used - MySQL");
            l15.setForeground(new Color(47, 79, 79));
            l15.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l15.setBounds(70, 370, 600, 34);
            contentPane.add(l15);
                
            
            contentPane.setBackground(Color.WHITE);
	}
        

}

