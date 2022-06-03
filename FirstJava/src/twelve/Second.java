package twelve;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Second extends JFrame {
	JLabel lblNewLabel;
	//안드로이드 어플: 자바, 코틀린 ...(안트로이드 스튜디오)
	//ios: object-c, swift..
	// Window, c#
	
	//JFileChooser는 system에서 chooser components 클릭-검색란에 jfil 까지만 쳐도
	//JFileChooser보임 - 그것 선택후 ok
	
	//visual basic ==> excel program (advance하게 가ㅏ면 vba, Visual Basic for Application)
	//shooting game 시 timer
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=113,399
	 */
	private final JFileChooser fileChooser = new JFileChooser();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Second frame = new Second();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Second() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("\uD30C\uC77C\uC5F4\uAE30\uACBD\uB864");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn1) {//파일 열기 버튼이 늘러졌어?
					int isOpenClose=fileChooser.showOpenDialog(btn1);
						//파일선택에 대한 반환값            //열기 윈도우 탐색기
					
					File filePath1=fileChooser.getSelectedFile();//경로+파일
					
							//정상적으로 파일 선택했어?
					if(isOpenClose==fileChooser.APPROVE_OPTION) {//0은 열기 //1은 저장
						//==이 아니면 취소를 눌렀거나 다른 에러가 발생한 경우임
						lblNewLabel.setText("파일경로이름:"+filePath1);
						System.out.println(filePath1);
					}
				}
			}
		});
		btn1.setBounds(67, 101, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("\uD30C\uC77C\uC800\uC7A5\uACBD\uB85C");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn2) {
					int isOpenClose2=fileChooser.showSaveDialog(btn2);
					File file2=fileChooser.getSelectedFile();
					
					if(isOpenClose2==JFileChooser.APPROVE_OPTION) {
						lblNewLabel.setText("파일저장경로및이름"+file2);
						System.out.println(file2);
						
					}
				}
			}
		});
		btn2.setBounds(275, 101, 97, 23);
		contentPane.add(btn2);
		
	 lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(49, 145, 270, 46);
		contentPane.add(lblNewLabel);
	}
}
