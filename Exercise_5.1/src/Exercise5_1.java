import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise5_1 {

	private JFrame frame;
	private JTextField textField_Num1;
	private JTextField textField_Num2;
	private JTextField textField_Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise5_1 window = new Exercise5_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercise5_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 102, 102));
		frame.setBackground(new Color(204, 0, 51));
		frame.setForeground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("HP Simplified", Font.BOLD, 18));
		frame.setBounds(100, 100, 781, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_Num1 = new JTextField();
		textField_Num1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_Num1.setBounds(82, 50, 296, 59);
		frame.getContentPane().add(textField_Num1);
		textField_Num1.setColumns(10);
		
		textField_Num2 = new JTextField();
		textField_Num2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_Num2.setBounds(388, 50, 296, 59);
		frame.getContentPane().add(textField_Num2);
		textField_Num2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD (+)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textField_Num1.getText());
					num2 = Integer.parseInt(textField_Num2.getText());
					
					ans = num1 + num2;
					textField_Answer.setText(Integer.toString(ans));
					
				} catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Invalid number. You need to enter real number!");
				}
			}
		});
		btnNewButton.setForeground(new Color(51, 0, 0));
		btnNewButton.setBackground(new Color(204, 255, 153));
		btnNewButton.setFont(new Font("Rockwell", Font.PLAIN, 18));
		btnNewButton.setBounds(123, 154, 189, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS (-)");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textField_Num1.getText());
					num2 = Integer.parseInt(textField_Num2.getText());
					
					ans = num1 - num2;
					textField_Answer.setText(Integer.toString(ans));
				} catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Invalid number. You need to enter real number!");
				}
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 51));
		btnNewButton_1.setBackground(new Color(255, 255, 153));
		btnNewButton_1.setFont(new Font("Rockwell", Font.PLAIN, 18));
		btnNewButton_1.setBounds(441, 154, 189, 51);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_Answer = new JTextField();
		textField_Answer.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_Answer.setBounds(305, 272, 330, 74);
		frame.getContentPane().add(textField_Answer);
		textField_Answer.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Answer:");
		lblNewLabel.setForeground(new Color(255, 204, 153));
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(158, 272, 109, 74);
		frame.getContentPane().add(lblNewLabel);
	}
}
