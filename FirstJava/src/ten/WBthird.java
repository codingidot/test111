package ten;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;

public class WBthird extends JFrame {

	private JPanel contentPane;
	 JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WBthird frame = new WBthird();
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
	public WBthird() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    lblNewLabel = new JLabel("");
	    lblNewLabel.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		lblNewLabel.setIcon(new ImageIcon(WBthird.class.getResource("/krim/family.jpg")));
	    		lblNewLabel.repaint();
	    	}
	    });
		lblNewLabel.addMouseMotionListener(new MouseMotionAdapter() {
						//이벤트 등록			//mouseMotion interface
			@Override
			public void mouseMoved(MouseEvent e) { //이벤트 핸들러 ,
				
				lblNewLabel.setIcon(new ImageIcon(WBthird.class.getResource("/krim/rainbow.jpg")));
				lblNewLabel.repaint();
			}
		});
		lblNewLabel.setIcon(new ImageIcon(WBthird.class.getResource("/krim/family.jpg")));
		lblNewLabel.setBounds(12, 10, 307, 179);
		contentPane.add(lblNewLabel);
	}
}
