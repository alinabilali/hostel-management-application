/********************************************************
 * 				UTHM Hostel Application System			*
 * 														*
 * 							By:							*
 * 					Group	: 11						*	
 * 					Section	: 5 & 6						*
 * 														*
 ********************************************************/

package group11_oopproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HostelApplicationSystem extends JFrame implements ActionListener {
	   
		/* Container */
		Container container = getContentPane();
	    
	    /* JLabels */
	    private JLabel header = new JLabel("UTHM HOSTEL APPLICATION SYSTEM");
	    private JLabel instruction = new JLabel ("INSTRUCTION: Please fill in all fields");
	    
	    private JLabel nameLabel = new JLabel("Full Name");
	    private JLabel hostelLabel = new JLabel("Hostel");
	    
	    private JLabel regNoLabel = new JLabel("Register No");
	    private JLabel matricLabel = new JLabel("Matric No");
	    private JLabel roomLabel = new JLabel("Room No");
	    private JLabel bedNoLabel = new JLabel ("Bed No");
	    private JLabel mumLabel = new JLabel ("Mother's Name");
	    private JLabel dadLabel = new JLabel("Father's Name");
	    private JLabel addressLabel = new JLabel("Address");
	    private JLabel poscodeLabel = new JLabel ("Poscode");
	    private JLabel stateLabel = new JLabel("State");
	    private JLabel contactNoLabel = new JLabel ("Contact No");
	   
	    /* Array of colleges */
	    private String hostelList[]= {"Bestari","Tun Fatimah", "Perwira", "Tun Dr Ismail", "Melewar"};
	    
	  
	    
	    /* JTextFields */
	    private JTextField nameField = new JTextField();
	    private JTextField matricField = new JTextField();
	    private JTextField roomField = new JTextField();
	    private JTextField regNoField = new JTextField ();
	    private JTextField bedNoField= new JTextField();
	    private JTextField mumField= new JTextField();
	    private JTextField dadField = new JTextField();
	    private JTextField addressField= new JTextField();
	    private JTextField poscodeField = new JTextField();
	    private JTextField stateField = new JTextField();
	    private JTextField contactNoField = new JTextField();

	    /* JButtons */ 
	    private JButton updateButton = new JButton("UPDATE");
	    private JButton resetButton = new JButton("RESET");
	    private JButton exitButton = new JButton("EXIT");
	 

	    /* JComboBox for options */
	    private JComboBox hostel = new JComboBox(hostelList);
	    
	    /*Data fields*/
	    private int height;
	    private int width;
	    private int x;
	    private int y;
	    
	    /*List of Accessors*/
	    
	    /*Accessor for width*/
	    public int getWidth() {
	    	return width;
	    }
	    
	    /*Accessor for height*/
	    public int getHeight() {
	    	return height;
	    }
	    
	    /*Accessor for x*/
	    public int getX() {
	    	return x;
	    }
	    
	    /*Accessor for y*/
	    public int getY() {
	    	return y;
	    }
	    
	    /* List of Mutators*/
	    
	    /*Mutator for width*/
	    public void setWidth(int width) {
	    	this.width=width;
	    }
	    
	    /*Mutator for height*/
	    public void setHeight(int height) {
	    	this.height=height;
	    }
	    
	    /*Mutator for x*/
	    public void setX(int x) {
	    	this.x=x;
	    }
	    
	    /*Mutator for y*/
	    public void setY (int y) {
	    	this.y=y;
	    }
	    
	    /* Constructor */
	    HostelApplicationSystem() {
	    	/* Calling all methods to constructor */
	    	settingLayout();
	        setLocationAndSize();
	        addComponents();
	        actionEvent();
	        setButtonColor();
	        textSizeAndFont();
	 
	    }
	 
	    /* Method to set container setLayout to NULL */
	    public void settingLayout() {
	        container.setLayout(null); 
	    }
	 
	    /* Method to set buttons using setBackground() */
	    public void setButtonColor() {
	    	updateButton.setBackground(new Color(102, 255, 102));
	    	exitButton.setBackground(new Color (199, 50, 50));
	    }
	    
	    /* Method to set labels' font and font size using .setFont() */
	    public void textSizeAndFont() {
	    	header.setFont(new Font ("Serif", Font.PLAIN, 35));
	    	instruction.setFont(new Font ("Sans", Font.PLAIN, 15));
	    }
	    
	    /* Method to set every component's location and size using setBounds(x ,y, width, height) */
	    public void setLocationAndSize() {
	    	/*Labels*/
	    	header.setBounds(50, 20, 650, 30);
	    	instruction.setBounds(50, 80, 1000, 30);
	    	hostelLabel.setBounds(50, 150, 100, 30);
	        regNoLabel.setBounds(350, 150, 100, 30);
	    	nameLabel.setBounds(50, 200, 100, 30);
	        matricLabel.setBounds(350, 200, 100, 30);
	        roomLabel.setBounds(50, 250, 100, 30);
	        bedNoLabel.setBounds(350, 250, 100, 30);
	        mumLabel.setBounds(50, 300, 100, 30);
	        dadLabel.setBounds(350, 300, 100, 30);
	        addressLabel.setBounds(50, 350, 100, 30);
	        poscodeLabel.setBounds(350, 350, 100, 30);
	        stateLabel.setBounds(50, 400, 100, 30);
	        contactNoLabel.setBounds(350, 400, 100, 30);
	        
	        
	        /* Fields */
	        hostel.setBounds(150, 150, 150, 30);
	        regNoField.setBounds(450, 150, 150,30);
	        nameField.setBounds(150, 200, 150, 30);
	        matricField.setBounds(450, 200, 150, 30);
	        roomField.setBounds(150, 250, 150, 30);
	        bedNoField.setBounds(450, 250,150, 30);
	        mumField.setBounds(150, 300, 150, 30);
	        dadField.setBounds(450, 300, 150, 30);
	        addressField.setBounds(150, 350, 150, 30);
	        poscodeField.setBounds(450, 350, 150, 30);
	        stateField.setBounds(150, 400, 150, 30);
	        contactNoField.setBounds(450, 400, 150,30);
	        
	        
	        /* Buttons */
	        updateButton.setBounds(50, 500, 150,30);
	        resetButton.setBounds(250, 500, 150,30);
	        exitButton.setBounds(450, 500, 150, 30);
	    }
	 
	    /*Method to add components to container */
	    public void addComponents() {

	    	container.add(header);
	    	container.add(instruction);
	    	
	    	container.add(hostelLabel);
	    	container.add(hostel);
	    	
	    	container.add(regNoLabel);
	    	container.add(regNoField);
	    	
	    	container.add(nameLabel);
	        container.add(nameField);
	        
	        container.add(matricLabel);
	        container.add(matricField);
	        
	        container.add(roomLabel);
	        container.add(roomField);
	        
	        container.add(bedNoLabel);
	        container.add(bedNoField);
	        
	        container.add(mumLabel);
	        container.add(mumField);
	        
	        container.add(dadLabel);
	        container.add(dadField);
	        
	        container.add(addressLabel);
	        container.add(addressField);
	        
	        container.add(poscodeLabel);
	        container.add(poscodeField);
	        
	        container.add(stateLabel);
	        container.add(stateField);
	        
	        container.add(contactNoLabel);
	        container.add(contactNoField);
	        
	        container.add(updateButton);
	        container.add(resetButton);
	        container.add(exitButton);
	    }
	 
	    /* Method to add Action listener to components */
	    public void actionEvent() {
	    	updateButton.addActionListener(this);
	        resetButton.addActionListener(this);
	        exitButton.addActionListener(this);
	    }
	 
	 
	    /* To override actionPerformed() method */
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        /*
	         * Check whether any of the fields empty or not.
	         * If empty then dialog "Please fill in all fields!" shows up.
	         * else dialog "Update is successful!" shows up.
	         */
	        if (e.getSource() == updateButton) {
	            if (regNoField.getText().equals("") || nameField.getText().equals("") || matricField.getText().equals("") || roomField.getText().equals("") || bedNoField.getText().equals("") || mumField.getText().equals("") || 
	            		dadField.getText().equals("") || addressField.getText().equals("") ||
	            		poscodeField.getText().equals("") || stateField.getText().equals("") || contactNoField.getText().equals("")) {
	            	
	            	/* A pop-up displayed "Please fill in all fields" */
	            	JOptionPane.showMessageDialog(this, "Please fill in all fields!");
	                
	            } else {
	            	/* A pop-up displayed "Update is successful!" */
	                JOptionPane.showMessageDialog(this, "Update is successful!");
	            }
	 
	        }
	        
	        /* When user clicks on reset button, all fields become blank */
	        if (e.getSource() == resetButton) {
	        	regNoField.setText("");				
	            nameField.setText("");
	            matricField.setText("");
	            roomField.setText("");
	            bedNoField.setText("");
	            mumField.setText("");
	            dadField.setText("");
	            addressField.setText("");
	            poscodeField.setText("");
	            stateField.setText("");
	            contactNoField.setText("");
	        }
	       
	        /* When EXIT button clicked, Frame closed */
	        if (e.getSource()== exitButton) {
	        	dispose();
	        }
	    
	    }
	 
	}

