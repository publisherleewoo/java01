
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Hi");
		
		JButton btn1 = new JButton("Click");
		JPanel btnPanel = new JPanel();
		btnPanel.add(btn1);
		
		
		JTextArea txtArea = new JTextArea();
		panel.setLayout(new BorderLayout());  //셋팅
		
		
		panel.add(label,BorderLayout.NORTH);
		panel.add(btnPanel,BorderLayout.WEST);
		panel.add(txtArea,BorderLayout.CENTER);
		
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
			}});
		
		
		
		
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setSize(600,600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //껐을때 실행 종료
	}

}
