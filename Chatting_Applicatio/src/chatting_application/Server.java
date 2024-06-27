package chatting_application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class Server extends JFrame implements ActionListener {

	public Server() {
	setLayout(null);
	
	    // Main Panel
	
		JPanel upperPanel = new JPanel();
		upperPanel.setBackground(new Color(250,0,0));
		upperPanel.setBounds(0,0,450,70);
		upperPanel.setLayout(null);
		add(upperPanel);
		
		// Images
		
		ImageIcon backImage = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
		Image backImage2 = backImage.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);	
		ImageIcon backImage3 = new ImageIcon(backImage2);
		JLabel backLabel = new JLabel(backImage3);
		backLabel.setBounds(5,20,25,25);
		upperPanel.add(backLabel);
		backLabel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		ImageIcon profileImage = new ImageIcon(ClassLoader.getSystemResource("icons/001.jpg"));
		Image profileImage2 = profileImage.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);	
		ImageIcon profileImage3 = new ImageIcon(profileImage2);
		JLabel profileLabel = new JLabel(profileImage3);
		profileLabel.setBounds(40,10,50,50);
		upperPanel.add(profileLabel);
		
		ImageIcon videoImage = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
		Image videoImage2 = videoImage.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);	
		ImageIcon videoImage3 = new ImageIcon(videoImage2);
		JLabel videoLabel = new JLabel(videoImage3);
		videoLabel.setBounds(310,20,30,30);
		upperPanel.add(videoLabel);
		
		ImageIcon phoneImage = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
		Image phoneImage2 = phoneImage.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);	
		ImageIcon phoneImage3 = new ImageIcon(phoneImage2);
		JLabel phoneLabel = new JLabel(phoneImage3);
		phoneLabel.setBounds(360,20,30,30);
		upperPanel.add(phoneLabel);
		
		ImageIcon moreImage = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
		Image moreImage2 = moreImage.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);	
		ImageIcon moreImage3 = new ImageIcon(moreImage2);
		JLabel moreLabel = new JLabel(moreImage3);
		moreLabel.setBounds(400,20,30,30);
		upperPanel.add(moreLabel);
		
		//names
		
		JLabel nameLabel = new JLabel("Hasan Kenger");
		nameLabel.setBounds(110,15,150,25);
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setFont(new Font("SAN_SERIF",Font.BOLD,18));
		upperPanel.add(nameLabel);
		
		JLabel statusLabel = new JLabel("Active");
		statusLabel.setBounds(110,35,100,18);
		statusLabel.setForeground(Color.WHITE);
		statusLabel.setFont(new Font("SAN_SERIF",Font.BOLD,14));
		upperPanel.add(statusLabel);
		
		//Text Area
		
		JPanel textPanel = new JPanel();
		textPanel.setBounds(5,75,500,505);
		add(textPanel);
		
		JTextField textArea = new JTextField();
		textArea.setBounds(5,585,310,40);
		textArea.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
		add(textArea);
		
		//Buttons
		
		JButton sendButton = new JButton("Send");
		sendButton.setBounds(320,585,110,40);
		sendButton.setBackground(new Color(250,0,0));
		sendButton.setForeground(Color.WHITE);
		sendButton.setFont(new Font("SAN_SERIF",Font.BOLD,14));
		add(sendButton);
		
		// Properties
		
		setSize(450,670);
		setLocation(400,200);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		Server a = new Server();
	}
}
