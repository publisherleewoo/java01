import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	public Login() {
		JPanel panel = new JPanel();
		JTextField txtId = new JTextField(10);
		JLabel label = new JLabel("ID : ");
		JLabel psword = new JLabel("PASSWORD : ");
		JPasswordField txtPass = new JPasswordField(10);
		JButton logBtn = new JButton("Log in");
		
		panel.add(label);
		panel.add(txtId);
		panel.add(psword);
		panel.add(txtPass);
		panel.add(logBtn);
		
		logBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 String id = "Dan";
				 String pass ="1234";
				 
				 if(id.equals(txtId.getText()) && pass.equals(txtPass.getText())) {
					 JOptionPane.showMessageDialog(null, "You have logged in successfully");
				 }else {
					 System.out.println("로그인 실패");
				 }
			}
		
		});
		
		add(panel);
		
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Login();
	}
}
