import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); //windowPopup
		JPanel panel = new JPanel(); //안에 있는 layout
		JLabel label = new JLabel("Some text");
		JButton btn1 = new JButton("Click this");
		JButton btn2 = new JButton("Exit");
		JTextArea txtArea = new JTextArea();
		//	JTextField txtField = new JTextField(200); // arg:글자의 수
		JPanel btnPanel = new JPanel();

		panel.setLayout(new BorderLayout());  //셋팅임. 필수!!!
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		panel.add(label, BorderLayout.NORTH);   //레이블을 위쪽에
		panel.add(btnPanel, BorderLayout.WEST); //버튼은 왼쪽에
		panel.add(txtArea, BorderLayout.CENTER);
	 
		btn1.addActionListener(new ActionListener() {  //이벤트 등록, 콜백

			@Override
			public void actionPerformed(ActionEvent arg0) {
				label.setText(txtArea.getText());
			}
			
		});
		
		
		btn2.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		
		
		frame.add(panel);  //프레임 안에 패널넣음.
		
		frame.setResizable(false); // 크기 변경 불가능
		frame.setVisible(true); //Gui
		frame.setPreferredSize(new Dimension(840, 840/12*9)); //size
		frame.setSize(840,840/12*9); //size
		frame.setLocationRelativeTo(null); // 중앙출력, 지우면 좌측 위에 출력
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //껐을때 실행 종료
		
	}
}
