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
	//�ȵ���̵� ����: �ڹ�, ��Ʋ�� ...(��Ʈ���̵� ��Ʃ���)
	//ios: object-c, swift..
	// Window, c#
	
	//JFileChooser�� system���� chooser components Ŭ��-�˻����� jfil ������ �ĵ�
	//JFileChooser���� - �װ� ������ ok
	
	//visual basic ==> excel program (advance�ϰ� ������ vba, Visual Basic for Application)
	//shooting game �� timer
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
				if(e.getSource()==btn1) {//���� ���� ��ư�� �÷�����?
					int isOpenClose=fileChooser.showOpenDialog(btn1);
						//���ϼ��ÿ� ���� ��ȯ��            //���� ������ Ž����
					
					File filePath1=fileChooser.getSelectedFile();//���+����
					
							//���������� ���� �����߾�?
					if(isOpenClose==fileChooser.APPROVE_OPTION) {//0�� ���� //1�� ����
						//==�� �ƴϸ� ��Ҹ� �����ų� �ٸ� ������ �߻��� �����
						lblNewLabel.setText("���ϰ���̸�:"+filePath1);
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
						lblNewLabel.setText("���������ι��̸�"+file2);
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
