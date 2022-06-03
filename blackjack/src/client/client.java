// [u0000] 로그인 UI 추가

// https://github.com/Hx2DEV/BLACKJACK/issues/17
// 작업자 전호형

// [t0000] 로그인 기능 추가
// https://github.com/Hx2DEV/BLACKJACK/issues/16
// 작업자 전호형

package client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import data.DAO_Login;
import data.toss;
import font.setfont;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class client extends JFrame {
	
	//static String dbIP, dbPORT, dbSID, dbSNAME, dbID, dbPW; 	// DB설정값 저장용

	
	//static String id="";														// 클라이언트 유저 아이디
	static Socket socket;														// 소켓
	static ObjectInputStream ois;											// 객체 수신
	static ObjectOutputStream oos;										// 객체 발신
	
	static String code;
	


	// JFrame set.
	static JPanel contentPane, cp_login, cp_lobby,
						cp_room1, cp_room2, cp_room3, cp_room4, cp_room5, cp_room6, cp_room7, cp_room8, cp_room9, cp_room10;
			
	
	static JPasswordField pf_login_pw;
	static JTextField tf_login_id;
	static JLabel lbl_room1_UI_userimg1, lbl_room1_UI_userimg2, lbl_room1_UI_userimg3, lbl_room2_UI_userimg1, lbl_room2_UI_userimg2, lbl_room2_UI_userimg3, 
						lbl_room3_UI_userimg1, lbl_room3_UI_userimg2, lbl_room3_UI_userimg3, lbl_room4_UI_userimg1, lbl_room4_UI_userimg2, lbl_room4_UI_userimg3, 
						lbl_room5_UI_userimg1, lbl_room5_UI_userimg2, lbl_room5_UI_userimg3, lbl_room6_UI_userimg1, lbl_room6_UI_userimg2, lbl_room6_UI_userimg3,
						lbl_room7_UI_userimg1, lbl_room7_UI_userimg2, lbl_room7_UI_userimg3, lbl_room8_UI_userimg1, lbl_room8_UI_userimg2, lbl_room8_UI_userimg3,
						lbl_room9_UI_userimg1, lbl_room9_UI_userimg2, lbl_room9_UI_userimg3, lbl_room10_UI_userimg1, lbl_room10_UI_userimg2, lbl_room10_UI_userimg3,
						
						lbl_room1_UI_stats_btn, lbl_room2_UI_stats_btn, lbl_room3_UI_stats_btn, lbl_room4_UI_stats_btn, lbl_room5_UI_stats_btn, 
						lbl_room6_UI_stats_btn, lbl_room7_UI_stats_btn, lbl_room8_UI_stats_btn, lbl_room9_UI_stats_btn, lbl_room10_UI_stats_btn,
	
						lbl_room1_title, lbl_room2_title, lbl_room3_title, lbl_room4_title, lbl_room5_title,
						lbl_room6_title, lbl_room7_title, lbl_room8_title, lbl_room9_title, lbl_room10_title
						;

	// task set.
	static toss toss = new toss();
	static setfont setfont = new setfont();						// font.setfont				// TTF 폰트 사용 가능
	static c_t0000 t0000 = new c_t0000();		
	static c_t0001 t0001 = new c_t0001();		
	static c_t0002 t0002 = new c_t0002();
	static c_t0003 t0003 = new c_t0003();
	static c_t0004 t0004 = new c_t0004();
	static c_t0005 t0005 = new c_t0005();
	static c_t0006 t0006 = new c_t0006();
	
	// Content Pane
	static JPanel cp_playroom;
	static JPanel cp_chat;
	static JLabel lbl_playroom;
	private JPanel cp_toolbar;
	private JLabel lbl_chat;
	private JButton btn_login_setting;
	
	// cp_connectsetting
	static JPanel cp_signup, cp_connsetting, cp_connsetting_f1, cp_connsetting_f2, cp_connsetting_f3, cp_connsetting_f4, cp_connsetting_f5, cp_connsetting_f7, cp_connsetting_f8;
	static JTextField tf_connsetting_svip, tf_connsetting_svpt, tf_connsetting_dbip, tf_connsetting_dbpt, tf_connsetting_dbsname, tf_connsetting_dbid, pf_connsetting_dbpw;
	static JLabel lbl_connsetting_title, lbl_connsetting_svpt, lbl_connsetting_dbip, lbl_connsetting_dbpt, lbl_connsetting_dbsnsid, lbl_connsetting_dbid, lbl_connsetting_dbpw;
	static JButton btn_connsetting_default, btn_connsetting_save, btn_connsetting_cancel;
	private JPanel cp_connsetting_f6;
	private JTextField tf_connsetting_dbsid;
	private JLabel lbl_connsetting_dbsid;
	private JPanel cp_signup_f1;
	private JTextField tf_signup_id;
	private JLabel lbl_signup_id;
	private JPanel cp_signup_f2;
	private JLabel lbl_signup_pw;
	private JPanel cp_signup_f3;
	private JLabel lbl_signup_pwre;
	private JButton btn_signup_signup;
	private JButton btn_signup_cancel;
	private JLabel lbl_signup_title;
	private JPasswordField pf_signup_pwre;
	private JPasswordField pf_signup_pw;
	//
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					client frame = new client();
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
	public client() {
		setResizable(false);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addWindowListener(new WindowAdapter()				//닫기 버튼 액션 수행
	      {
	         public void windowClosing(WindowEvent e)
	         {
	        	 
	        	 // 이하 메모용***
	        	 //방에 참가중인지 체크
	        	 // case1: 참가자가 본인 뿐인경우. 방폭파
	        	 // case2: 내가 방장인데 참가자가 2명 이상인 경우 두번째 유저에게 방장인계
	        	 // case3: 방장이 아닌 경우 방에서 아웃처리
	        	 
	        	 // case a : 게임이 진행중이다면 배팅액 차감 (다른 참가자 게임 진행에는 영향이 없도록함
	           dispose();
	           System.exit(0);
	         }
	      });
		setBounds(100, 100, 1300, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cp_connsetting = new JPanel();
		cp_connsetting.setVisible(false);
		
		cp_toolbar = new JPanel();
		cp_toolbar.setVisible(false);
		
		cp_signup = new JPanel();
		cp_signup.setBackground(Color.WHITE);
		cp_signup.setVisible(false);
		
		cp_lobby = new JPanel();
		cp_lobby.setVisible(false);
		
		cp_lobby.setBackground(Color.WHITE);
		cp_lobby.setBounds(0, 0, 1294, 685);
		contentPane.add(cp_lobby);
		cp_lobby.setLayout(null);
		
		JPanel cp_roomlist = new JPanel();
		cp_roomlist.setBounds(20, 60, 1003, 506);
		cp_roomlist.setBackground(new Color(211, 211, 211));
		cp_lobby.add(cp_roomlist);
		cp_roomlist.setLayout(null);
		
		cp_room1 = new JPanel();
		cp_room1.setVisible(false);
		cp_room1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource()==cp_room1) {
					toss.setIntnote(1);
					
					//t0006] 방 참가 기능 추가
					// https://github.com/Hx2DEV/BLACKJACK/issues/21
					// 작업자 전호형
					t0006.c_t0006_send(toss, oos);				
				}
			}
		});
		cp_room1.setBackground(new Color(245, 245, 245));
		cp_room1.setBounds(1, 1, 500, 100);
		cp_roomlist.add(cp_room1);
		cp_room1.setLayout(null);
		
		JLabel lbl_room1_UI_midline = new JLabel("");
		lbl_room1_UI_midline.setBackground(new Color(70, 73, 100));
		lbl_room1_UI_midline.setOpaque(true);
		lbl_room1_UI_midline.setBounds(130, 49, 320, 1);
		cp_room1.add(lbl_room1_UI_midline);
		
		JLabel lbl_room1_num = new JLabel("1");
		lbl_room1_num.setForeground(new Color(70, 73, 100));
		lbl_room1_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room1_num.setFont(setfont.fontSetting(40, "ebold"));
		lbl_room1_num.setBounds(10, 10, 110, 80);
		cp_room1.add(lbl_room1_num);
		
		lbl_room1_title = new JLabel("대기중인 방 예제");
		lbl_room1_title.setFont(setfont.fontSetting(16, "regular"));
		lbl_room1_title.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_room1_title.setBounds(130, 10, 315, 29);
		cp_room1.add(lbl_room1_title);
		
		lbl_room1_UI_userimg3 = new JLabel("");
		lbl_room1_UI_userimg3.setBounds(418, 58, 32, 32);
		lbl_room1_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
		cp_room1.add(lbl_room1_UI_userimg3);
		
		
		lbl_room1_UI_userimg2 = new JLabel("");
		lbl_room1_UI_userimg2.setBounds(376, 58, 32, 32);
		lbl_room1_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
		cp_room1.add(lbl_room1_UI_userimg2);
		
		lbl_room1_UI_userimg1 = new JLabel("");
		lbl_room1_UI_userimg1.setBounds(334, 58, 32, 32);
		lbl_room1_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room1.add(lbl_room1_UI_userimg1);
		
		lbl_room1_UI_stats_btn = new JLabel("");
		lbl_room1_UI_stats_btn.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		lbl_room1_UI_stats_btn.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room1_UI_stats_btn.setBorder(null);
		lbl_room1_UI_stats_btn.setBounds(130, 60, 133, 30);
		lbl_room1_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
		cp_room1.add(lbl_room1_UI_stats_btn);
		
		cp_room2 = new JPanel();
		cp_room2.setVisible(false);
		cp_room2.setLayout(null);
		cp_room2.setBackground(new Color(245, 245, 245));
		cp_room2.setBounds(502, 1, 500, 100);
		cp_roomlist.add(cp_room2);
		
		JLabel lbl_room2_UI_midline = new JLabel("");
		lbl_room2_UI_midline.setOpaque(true);
		lbl_room2_UI_midline.setBackground(new Color(70, 73, 100));
		lbl_room2_UI_midline.setBounds(130, 49, 320, 1);
		cp_room2.add(lbl_room2_UI_midline);
		
		JLabel lbl_room2_num = new JLabel("2");
		lbl_room2_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room2_num.setForeground(new Color(70, 73, 100));
		lbl_room2_num.setFont(setfont.fontSetting(40, "ebold"));
		lbl_room2_num.setBounds(10, 10, 110, 80);
		cp_room2.add(lbl_room2_num);
		
		lbl_room2_title = new JLabel("진행중인 방 예제");
		lbl_room2_title.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_room2_title.setFont(setfont.fontSetting(16, "regular"));
		lbl_room2_title.setBounds(130, 10, 315, 29);
		cp_room2.add(lbl_room2_title);
		
		lbl_room2_UI_userimg3 = new JLabel("");
		lbl_room2_UI_userimg3.setBounds(418, 58, 32, 32);
		lbl_room2_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room2.add(lbl_room2_UI_userimg3);
		
		lbl_room2_UI_userimg2 = new JLabel("");
		lbl_room2_UI_userimg2.setBounds(376, 58, 32, 32);
		lbl_room2_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room2.add(lbl_room2_UI_userimg2);
		
		lbl_room2_UI_userimg1 = new JLabel("");
		lbl_room2_UI_userimg1.setBounds(334, 58, 32, 32);
		lbl_room2_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room2.add(lbl_room2_UI_userimg1);
		
		lbl_room2_UI_stats_btn = new JLabel("");
		lbl_room2_UI_stats_btn.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room2_UI_stats_btn.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		lbl_room2_UI_stats_btn.setBorder(null);
		lbl_room2_UI_stats_btn.setBounds(130, 60, 133, 30);
		lbl_room2_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
		cp_room2.add(lbl_room2_UI_stats_btn);
		
		cp_room3 = new JPanel();
		cp_room3.setVisible(false);
		cp_room3.setLayout(null);
		cp_room3.setBackground(new Color(245, 245, 245));
		cp_room3.setBounds(1, 102, 500, 100);
		cp_roomlist.add(cp_room3);
		
		JLabel lbl_room3_UI_midline = new JLabel("");
		lbl_room3_UI_midline.setOpaque(true);
		lbl_room3_UI_midline.setBackground(new Color(70, 73, 100));
		lbl_room3_UI_midline.setBounds(130, 49, 320, 1);
		cp_room3.add(lbl_room3_UI_midline);
		
		JLabel lbl_room3_num = new JLabel("3");
		lbl_room3_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room3_num.setForeground(new Color(70, 73, 100));
		lbl_room3_num.setFont(setfont.fontSetting(40, "ebold"));
		lbl_room3_num.setBounds(10, 10, 110, 80);
		cp_room3.add(lbl_room3_num);
		
		lbl_room3_title = new JLabel("대기중인 방 예제");
		lbl_room3_title.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_room3_title.setFont(setfont.fontSetting(16, "regular"));
		lbl_room3_title.setBounds(130, 10, 315, 29);
		cp_room3.add(lbl_room3_title);
		
		lbl_room3_UI_userimg3 = new JLabel("");
		lbl_room3_UI_userimg3.setBounds(418, 58, 32, 32);
		lbl_room3_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
		cp_room3.add(lbl_room3_UI_userimg3);
		
		lbl_room3_UI_userimg2 = new JLabel("");
		lbl_room3_UI_userimg2.setBounds(376, 58, 32, 32);
		lbl_room3_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
		cp_room3.add(lbl_room3_UI_userimg2);
		
		lbl_room3_UI_userimg1 = new JLabel("");
		lbl_room3_UI_userimg1.setBounds(334, 58, 32, 32);
		lbl_room3_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room3.add(lbl_room3_UI_userimg1);
		
		lbl_room3_UI_stats_btn = new JLabel("");
		lbl_room3_UI_stats_btn.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room3_UI_stats_btn.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		lbl_room3_UI_stats_btn.setBorder(null);
		lbl_room3_UI_stats_btn.setBounds(130, 60, 133, 30);
		lbl_room3_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
		cp_room3.add(lbl_room3_UI_stats_btn);
		
		cp_room4 = new JPanel();
		cp_room4.setVisible(false);
		cp_room4.setLayout(null);
		cp_room4.setBackground(new Color(245, 245, 245));
		cp_room4.setBounds(502, 102, 500, 100);
		cp_roomlist.add(cp_room4);
		
		JLabel lbl_room4_UI_midline = new JLabel("");
		lbl_room4_UI_midline.setOpaque(true);
		lbl_room4_UI_midline.setBackground(new Color(70, 73, 100));
		lbl_room4_UI_midline.setBounds(130, 49, 320, 1);
		cp_room4.add(lbl_room4_UI_midline);
		
		JLabel lbl_room4_num = new JLabel("4");
		lbl_room4_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room4_num.setForeground(new Color(70, 73, 100));
		lbl_room4_num.setFont(setfont.fontSetting(40, "ebold"));
		lbl_room4_num.setBounds(10, 10, 110, 80);
		cp_room4.add(lbl_room4_num);
		
		lbl_room4_title = new JLabel("진행중인 방 예제");
		lbl_room4_title.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_room4_title.setFont(setfont.fontSetting(16, "regular"));
		lbl_room4_title.setBounds(130, 10, 315, 29);
		cp_room4.add(lbl_room4_title);
		
		lbl_room4_UI_userimg3 = new JLabel("");
		lbl_room4_UI_userimg3.setBounds(418, 58, 32, 32);
		lbl_room4_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room4.add(lbl_room4_UI_userimg3);
		
		lbl_room4_UI_userimg2 = new JLabel("");
		lbl_room4_UI_userimg2.setBounds(376, 58, 32, 32);
		lbl_room4_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room4.add(lbl_room4_UI_userimg2);
		
		lbl_room4_UI_userimg1 = new JLabel("");
		lbl_room4_UI_userimg1.setBounds(334, 58, 32, 32);
		lbl_room4_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room4.add(lbl_room4_UI_userimg1);
		
		lbl_room4_UI_stats_btn = new JLabel("");
		lbl_room4_UI_stats_btn.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room4_UI_stats_btn.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		lbl_room4_UI_stats_btn.setBorder(null);
		lbl_room4_UI_stats_btn.setBounds(130, 60, 133, 30);
		lbl_room4_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
		cp_room4.add(lbl_room4_UI_stats_btn);
		
		cp_room5 = new JPanel();
		cp_room5.setVisible(false);
		cp_room5.setLayout(null);
		cp_room5.setBackground(new Color(245, 245, 245));
		cp_room5.setBounds(1, 203, 500, 100);
		cp_roomlist.add(cp_room5);
		
		JLabel lbl_room5_UI_midline = new JLabel("");
		lbl_room5_UI_midline.setOpaque(true);
		lbl_room5_UI_midline.setBackground(new Color(70, 73, 100));
		lbl_room5_UI_midline.setBounds(130, 49, 320, 1);
		cp_room5.add(lbl_room5_UI_midline);
		
		JLabel lbl_room5_num = new JLabel("5");
		lbl_room5_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room5_num.setForeground(new Color(70, 73, 100));
		lbl_room5_num.setFont(setfont.fontSetting(40, "ebold"));
		lbl_room5_num.setBounds(10, 10, 110, 80);
		cp_room5.add(lbl_room5_num);
		
		lbl_room5_title = new JLabel("대기중인 방 예제");
		lbl_room5_title.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_room5_title.setFont(setfont.fontSetting(16, "regular"));
		lbl_room5_title.setBounds(130, 10, 315, 29);
		cp_room5.add(lbl_room5_title);
		
		lbl_room5_UI_userimg3 = new JLabel("");
		lbl_room5_UI_userimg3.setBounds(418, 58, 32, 32);
		lbl_room5_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
		cp_room5.add(lbl_room5_UI_userimg3);
		
		lbl_room5_UI_userimg2 = new JLabel("");
		lbl_room5_UI_userimg2.setBounds(376, 58, 32, 32);
		lbl_room5_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
		cp_room5.add(lbl_room5_UI_userimg2);
		
		lbl_room5_UI_userimg1 = new JLabel("");
		lbl_room5_UI_userimg1.setBounds(334, 58, 32, 32);
		lbl_room5_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room5.add(lbl_room5_UI_userimg1);
		
		lbl_room5_UI_stats_btn = new JLabel("");
		lbl_room5_UI_stats_btn.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room5_UI_stats_btn.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		lbl_room5_UI_stats_btn.setBorder(null);
		lbl_room5_UI_stats_btn.setBounds(130, 60, 133, 30);
		lbl_room5_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
		cp_room5.add(lbl_room5_UI_stats_btn);
		
		cp_room6 = new JPanel();
		cp_room6.setVisible(false);
		cp_room6.setLayout(null);
		cp_room6.setBackground(new Color(245, 245, 245));
		cp_room6.setBounds(502, 203, 500, 100);
		cp_roomlist.add(cp_room6);
		
		JLabel lbl_room6_UI_midline = new JLabel("");
		lbl_room6_UI_midline.setOpaque(true);
		lbl_room6_UI_midline.setBackground(new Color(70, 73, 100));
		lbl_room6_UI_midline.setBounds(130, 49, 320, 1);
		cp_room6.add(lbl_room6_UI_midline);
		
		JLabel lbl_room6_num = new JLabel("6");
		lbl_room6_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room6_num.setForeground(new Color(70, 73, 100));
		lbl_room6_num.setFont(setfont.fontSetting(40, "ebold"));
		lbl_room6_num.setBounds(10, 10, 110, 80);
		cp_room6.add(lbl_room6_num);
		
		lbl_room6_title = new JLabel("진행중인 방 예제");
		lbl_room6_title.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_room6_title.setFont(setfont.fontSetting(16, "regular"));
		lbl_room6_title.setBounds(130, 10, 315, 29);
		cp_room6.add(lbl_room6_title);
		
		lbl_room6_UI_userimg3 = new JLabel("");
		lbl_room6_UI_userimg3.setBounds(418, 58, 32, 32);
		lbl_room6_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room6.add(lbl_room6_UI_userimg3);
		
		lbl_room6_UI_userimg2 = new JLabel("");
		lbl_room6_UI_userimg2.setBounds(376, 58, 32, 32);
		lbl_room6_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room6.add(lbl_room6_UI_userimg2);
		
		lbl_room6_UI_userimg1 = new JLabel("");
		lbl_room6_UI_userimg1.setBounds(334, 58, 32, 32);
		lbl_room6_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room6.add(lbl_room6_UI_userimg1);
		
		lbl_room6_UI_stats_btn = new JLabel("");
		lbl_room6_UI_stats_btn.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room6_UI_stats_btn.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		lbl_room6_UI_stats_btn.setBorder(null);
		lbl_room6_UI_stats_btn.setBounds(130, 60, 133, 30);
		lbl_room6_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
		cp_room6.add(lbl_room6_UI_stats_btn);
		
		cp_room7 = new JPanel();
		cp_room7.setVisible(false);
		cp_room7.setLayout(null);
		cp_room7.setBackground(new Color(245, 245, 245));
		cp_room7.setBounds(1, 304, 500, 100);
		cp_roomlist.add(cp_room7);
		
		JLabel lbl_room7_UI_midline = new JLabel("");
		lbl_room7_UI_midline.setOpaque(true);
		lbl_room7_UI_midline.setBackground(new Color(70, 73, 100));
		lbl_room7_UI_midline.setBounds(130, 49, 320, 1);
		cp_room7.add(lbl_room7_UI_midline);
		
		JLabel lbl_room7_num = new JLabel("7");
		lbl_room7_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room7_num.setForeground(new Color(70, 73, 100));
		lbl_room7_num.setFont(setfont.fontSetting(40, "ebold"));
		lbl_room7_num.setBounds(10, 10, 110, 80);
		cp_room7.add(lbl_room7_num);
		
		lbl_room7_title = new JLabel("대기중인 방 예제");
		lbl_room7_title.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_room7_title.setFont(setfont.fontSetting(16, "regular"));
		lbl_room7_title.setBounds(130, 10, 315, 29);
		cp_room7.add(lbl_room7_title);
		
		lbl_room7_UI_userimg3 = new JLabel("");
		lbl_room7_UI_userimg3.setBounds(418, 58, 32, 32);
		lbl_room7_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
		cp_room7.add(lbl_room7_UI_userimg3);
		
		lbl_room7_UI_userimg2 = new JLabel("");
		lbl_room7_UI_userimg2.setBounds(376, 58, 32, 32);
		lbl_room7_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
		cp_room7.add(lbl_room7_UI_userimg2);
		
		lbl_room7_UI_userimg1 = new JLabel("");
		lbl_room7_UI_userimg1.setBounds(334, 58, 32, 32);
		lbl_room7_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room7.add(lbl_room7_UI_userimg1);
		
		lbl_room7_UI_stats_btn = new JLabel("");
		lbl_room7_UI_stats_btn.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room7_UI_stats_btn.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		lbl_room7_UI_stats_btn.setBorder(null);
		lbl_room7_UI_stats_btn.setBounds(130, 60, 133, 30);
		lbl_room7_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
		cp_room7.add(lbl_room7_UI_stats_btn);
		
		cp_room8 = new JPanel();
		cp_room8.setVisible(false);
		cp_room8.setLayout(null);
		cp_room8.setBackground(new Color(245, 245, 245));
		cp_room8.setBounds(502, 304, 500, 100);
		cp_roomlist.add(cp_room8);
		
		JLabel lbl_room8_UI_midline = new JLabel("");
		lbl_room8_UI_midline.setOpaque(true);
		lbl_room8_UI_midline.setBackground(new Color(70, 73, 100));
		lbl_room8_UI_midline.setBounds(130, 49, 320, 1);
		cp_room8.add(lbl_room8_UI_midline);
		
		JLabel lbl_room8_num = new JLabel("8");
		lbl_room8_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room8_num.setForeground(new Color(70, 73, 100));
		lbl_room8_num.setFont(setfont.fontSetting(40, "ebold"));
		lbl_room8_num.setBounds(10, 10, 110, 80);
		cp_room8.add(lbl_room8_num);
		
		lbl_room8_title = new JLabel("진행중인 방 예제");
		lbl_room8_title.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_room8_title.setFont(setfont.fontSetting(16, "regular"));
		lbl_room8_title.setBounds(130, 10, 315, 29);
		cp_room8.add(lbl_room8_title);
		
		lbl_room8_UI_userimg3 = new JLabel("");
		lbl_room8_UI_userimg3.setBounds(418, 58, 32, 32);
		lbl_room8_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room8.add(lbl_room8_UI_userimg3);
		
		lbl_room8_UI_userimg2 = new JLabel("");
		lbl_room8_UI_userimg2.setBounds(376, 58, 32, 32);
		lbl_room8_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room8.add(lbl_room8_UI_userimg2);
		
		lbl_room8_UI_userimg1 = new JLabel("");
		lbl_room8_UI_userimg1.setBounds(334, 58, 32, 32);
		lbl_room8_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room8.add(lbl_room8_UI_userimg1);
		
		lbl_room8_UI_stats_btn = new JLabel("");
		lbl_room8_UI_stats_btn.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room8_UI_stats_btn.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		lbl_room8_UI_stats_btn.setBorder(null);
		lbl_room8_UI_stats_btn.setBounds(130, 60, 133, 30);
		lbl_room8_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
		cp_room8.add(lbl_room8_UI_stats_btn);
		
		cp_room9 = new JPanel();
		cp_room9.setVisible(false);
		cp_room9.setLayout(null);
		cp_room9.setBackground(new Color(245, 245, 245));
		cp_room9.setBounds(1, 405, 500, 100);
		cp_roomlist.add(cp_room9);
		
		JLabel lbl_room9_UI_midline = new JLabel("");
		lbl_room9_UI_midline.setOpaque(true);
		lbl_room9_UI_midline.setBackground(new Color(70, 73, 100));
		lbl_room9_UI_midline.setBounds(130, 49, 320, 1);
		cp_room9.add(lbl_room9_UI_midline);
		
		JLabel lbl_room9_num = new JLabel("9");
		lbl_room9_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room9_num.setForeground(new Color(70, 73, 100));
		lbl_room9_num.setFont(setfont.fontSetting(40, "ebold"));
		lbl_room9_num.setBounds(10, 10, 110, 80);
		cp_room9.add(lbl_room9_num);
		
		lbl_room9_title = new JLabel("대기중인 방 예제");
		lbl_room9_title.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_room9_title.setFont(setfont.fontSetting(16, "regular"));
		lbl_room9_title.setBounds(130, 10, 315, 29);
		cp_room9.add(lbl_room9_title);
		
		lbl_room9_UI_userimg3 = new JLabel("");
		lbl_room9_UI_userimg3.setBounds(418, 58, 32, 32);
		lbl_room9_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
		cp_room9.add(lbl_room9_UI_userimg3);
		
		lbl_room9_UI_userimg2 = new JLabel("");
		lbl_room9_UI_userimg2.setBounds(376, 58, 32, 32);
		lbl_room9_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user0.png")));
		cp_room9.add(lbl_room9_UI_userimg2);
		
		lbl_room9_UI_userimg1 = new JLabel("");
		lbl_room9_UI_userimg1.setBounds(334, 58, 32, 32);
		lbl_room9_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room9.add(lbl_room9_UI_userimg1);
		
		lbl_room9_UI_stats_btn = new JLabel("");
		lbl_room9_UI_stats_btn.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room9_UI_stats_btn.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		lbl_room9_UI_stats_btn.setBorder(null);
		lbl_room9_UI_stats_btn.setBounds(130, 60, 133, 30);
		lbl_room9_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn0.png")));
		cp_room9.add(lbl_room9_UI_stats_btn);
		
		cp_room10 = new JPanel();
		cp_room10.setVisible(false);
		cp_room10.setLayout(null);
		cp_room10.setBackground(new Color(245, 245, 245));
		cp_room10.setBounds(502, 405, 500, 100);
		cp_roomlist.add(cp_room10);
		
		JLabel lbl_room10_UI_midline = new JLabel("");
		lbl_room10_UI_midline.setOpaque(true);
		lbl_room10_UI_midline.setBackground(new Color(70, 73, 100));
		lbl_room10_UI_midline.setBounds(130, 49, 320, 1);
		cp_room10.add(lbl_room10_UI_midline);
		
		JLabel lbl_room10_num = new JLabel("10");
		lbl_room10_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room10_num.setForeground(new Color(70, 73, 100));
		lbl_room10_num.setFont(setfont.fontSetting(40, "ebold"));
		lbl_room10_num.setBounds(10, 10, 110, 80);
		cp_room10.add(lbl_room10_num);
		
		lbl_room10_title = new JLabel("진행중인 방 예제");
		lbl_room10_title.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_room10_title.setFont(setfont.fontSetting(16, "regular"));
		lbl_room10_title.setBounds(130, 10, 315, 29);
		cp_room10.add(lbl_room10_title);
		
		lbl_room10_UI_userimg3 = new JLabel("");
		lbl_room10_UI_userimg3.setBounds(418, 58, 32, 32);
		lbl_room10_UI_userimg3.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room10.add(lbl_room10_UI_userimg3);
		
		lbl_room10_UI_userimg2 = new JLabel("");
		lbl_room10_UI_userimg2.setBounds(376, 58, 32, 32);
		lbl_room10_UI_userimg2.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room10.add(lbl_room10_UI_userimg2);
		
		lbl_room10_UI_userimg1 = new JLabel("");
		lbl_room10_UI_userimg1.setBounds(334, 58, 32, 32);
		lbl_room10_UI_userimg1.setIcon(new ImageIcon(client.class.getResource("/img/user1.png")));
		cp_room10.add(lbl_room10_UI_userimg1);
		
		lbl_room10_UI_stats_btn = new JLabel("");
		lbl_room10_UI_stats_btn.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_room10_UI_stats_btn.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		lbl_room10_UI_stats_btn.setBorder(null);
		lbl_room10_UI_stats_btn.setBounds(130, 60, 133, 30);
		lbl_room10_UI_stats_btn.setIcon(new ImageIcon(client.class.getResource("/img/stats_btn1.png")));
		cp_room10.add(lbl_room10_UI_stats_btn);
		
		JPanel cp_backup = new JPanel();
		cp_backup.setBounds(20, 586, 1003, 80);
		cp_backup.setLayout(null);
		cp_lobby.add(cp_backup);
		
		JButton btn_t0001_roomListLoad = new JButton("방 목록 새로고침");
		btn_t0001_roomListLoad.setBackground(Color.WHITE);
		btn_t0001_roomListLoad.setFont(setfont.fontSetting(14, "regular"));
		btn_t0001_roomListLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn_t0001_roomListLoad) {
					t0001.c_t0001_send(toss, oos);					// 방정보 불러오기
				}
			}
		});
		btn_t0001_roomListLoad.setBounds(104, 19, 168, 41);
		cp_backup.add(btn_t0001_roomListLoad);
		
		JButton btn_t0002_roomMake = new JButton("방 생성");
		btn_t0002_roomMake.setBackground(Color.WHITE);
		btn_t0002_roomMake.setFont(setfont.fontSetting(14, "regular"));
		btn_t0002_roomMake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn_t0002_roomMake) {
					t0002.c_t0002_send(toss, oos, contentPane);					// 방 생성
					//t0001.c_t0001_send(toss, oos);					// 방 정보 불러오기 (새로고침)
				}
			}
		});
		btn_t0002_roomMake.setBounds(10, 19, 84, 41);
		cp_backup.add(btn_t0002_roomMake);
		
		cp_chat = new JPanel();
		cp_chat.setBounds(1043, 60, 230, 606);
		cp_chat.setBackground(new Color(211, 211, 211));
		cp_lobby.add(cp_chat);
		
		lbl_chat = new JLabel("채팅창 자리입니다");
		lbl_chat.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 14));
		cp_chat.add(lbl_chat);
		
				
		cp_login = new JPanel();
		cp_login.setBackground(SystemColor.window);
		cp_login.setBounds(0, 0, 1294, 685);
		contentPane.add(cp_login);
		cp_login.setLayout(null);
		
		tf_login_id = new JTextField();
		tf_login_id.setFont(setfont.fontSetting(16, "light"));
		tf_login_id.setBorder(null);
		tf_login_id.setOpaque(false);
		tf_login_id.setBounds(567, 295, 195, 30);
		cp_login.add(tf_login_id);
		tf_login_id.setColumns(10);
		
		pf_login_pw = new JPasswordField();
		pf_login_pw.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 26));
		pf_login_pw.setBorder(null);
		pf_login_pw.setOpaque(false);
		pf_login_pw.setBounds(567, 353, 195, 30);
		cp_login.add(pf_login_pw);
		
		JLabel lbl_login_title = new JLabel("BLACKJACK");
		lbl_login_title.setFont(setfont.fontSetting(42, "ebold"));
		lbl_login_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_login_title.setBounds(492, 161, 309, 134);
		cp_login.add(lbl_login_title);
		
		JLabel lbl_login_UI_id = new JLabel("ID");
		lbl_login_UI_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_login_UI_id.setFont(setfont.fontSetting(16, "regular"));
		lbl_login_UI_id.setBounds(529, 303, 33, 15);
		cp_login.add(lbl_login_UI_id);
		
		JLabel lbl_login_UI_pw = new JLabel("PW");
		lbl_login_UI_pw.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_login_UI_pw.setFont(setfont.fontSetting(16, "regular"));
		lbl_login_UI_pw.setBounds(529, 362, 33, 15);
		cp_login.add(lbl_login_UI_pw);
		
		JLabel lbl_login_UI_id_line = new JLabel("");
		lbl_login_UI_id_line.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lbl_login_UI_id_line.setBounds(525, 288, 242, 44);
		cp_login.add(lbl_login_UI_id_line);
		
		JLabel lbl_login_UI_pw_line = new JLabel("");
		lbl_login_UI_pw_line.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lbl_login_UI_pw_line.setBounds(525, 347, 242, 44);
		cp_login.add(lbl_login_UI_pw_line);
		
		JButton btn_login_login = new JButton("로그인");
		btn_login_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				if(e1.getSource()==btn_login_login) {			// 테스트용  더미
					if(tf_login_id.getText().equals("")) {		
						JOptionPane.showMessageDialog(null, "아이디 입력하세요.");
					}else {
						conn_receive();
						toss.setId(tf_login_id.getText());
						toss.setPw(pf_login_pw.getText());
						t0000.c_t0000_send(toss, oos);
					}
				}
			}
		});
		btn_login_login.setForeground(new Color(230, 230, 250));
		btn_login_login.setBackground(new Color(128, 128, 128));
		btn_login_login.setFont(setfont.fontSetting(16, "regular"));
		btn_login_login.setBorder(new LineBorder(Color.BLACK));
		btn_login_login.setBounds(525, 405, 242, 44);
		cp_login.add(btn_login_login);
		
		JButton btn_login_signup = new JButton("회원가입");
		btn_login_signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn_login_signup) {
					conn_receive();
					cp_allHidden();
					cp_signup.setVisible(true);
					tf_login_id.setText("");
					pf_login_pw.setText("");
				}
			}
		});
		btn_login_signup.setOpaque(false);
		btn_login_signup.setForeground(new Color(169, 169, 169));
		btn_login_signup.setFont(setfont.fontSetting(16, "regular"));
		btn_login_signup.setBorder(null);
		btn_login_signup.setBackground(SystemColor.window);
		btn_login_signup.setBounds(525, 459, 242, 44);
		cp_login.add(btn_login_signup);
		
		btn_login_setting = new JButton("접속설정");
		btn_login_setting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn_login_setting) {
					cp_allHidden();
					cp_connsetting.setVisible(true);
					tf_login_id.setText("");
					pf_login_pw.setText("");
				}
			}
		});
		btn_login_setting.setOpaque(false);
		btn_login_setting.setForeground(new Color(169, 169, 169));
		btn_login_setting.setFont(setfont.fontSetting(10, "regular"));
		btn_login_setting.setBorder(null);
		btn_login_setting.setBackground(Color.WHITE);
		btn_login_setting.setBounds(1216, 641, 68, 44);
		cp_login.add(btn_login_setting);
		cp_signup.setBounds(0, 0, 1288, 685);
		contentPane.add(cp_signup);
		cp_signup.setLayout(null);
		
		cp_signup_f1 = new JPanel();
		cp_signup_f1.setLayout(null);
		cp_signup_f1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		cp_signup_f1.setBackground(Color.WHITE);
		cp_signup_f1.setBounds(523, 267, 242, 44);
		cp_signup.add(cp_signup_f1);
		
		tf_signup_id = new JTextField();
		tf_signup_id.setOpaque(false);
		tf_signup_id.setFont(new Font("나눔스퀘어 Light", Font.PLAIN, 12));
		tf_signup_id.setColumns(10);
		tf_signup_id.setBorder(null);
		tf_signup_id.setBounds(62, 7, 175, 30);
		cp_signup_f1.add(tf_signup_id);
		
		lbl_signup_id = new JLabel("ID");
		lbl_signup_id.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_signup_id.setFont(setfont.fontSetting(12, "regular"));
		lbl_signup_id.setBounds(10, 14, 63, 15);
		cp_signup_f1.add(lbl_signup_id);
		
		cp_signup_f2 = new JPanel();
		cp_signup_f2.setLayout(null);
		cp_signup_f2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		cp_signup_f2.setBackground(Color.WHITE);
		cp_signup_f2.setBounds(523, 321, 242, 44);
		cp_signup.add(cp_signup_f2);
		
		lbl_signup_pw = new JLabel("PW");
		lbl_signup_pw.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_signup_pw.setFont(setfont.fontSetting(12, "regular"));
		lbl_signup_pw.setBounds(10, 14, 63, 15);
		cp_signup_f2.add(lbl_signup_pw);
		
		pf_signup_pw = new JPasswordField();
		pf_signup_pw.setOpaque(false);
		pf_signup_pw.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 16));
		pf_signup_pw.setColumns(10);
		pf_signup_pw.setBorder(null);
		pf_signup_pw.setBounds(62, 7, 175, 30);
		cp_signup_f2.add(pf_signup_pw);
		
		cp_signup_f3 = new JPanel();
		cp_signup_f3.setLayout(null);
		cp_signup_f3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		cp_signup_f3.setBackground(Color.WHITE);
		cp_signup_f3.setBounds(523, 375, 242, 44);
		cp_signup.add(cp_signup_f3);
		
		lbl_signup_pwre = new JLabel("PW(RE)");
		lbl_signup_pwre.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_signup_pwre.setFont(setfont.fontSetting(12, "regular"));
		lbl_signup_pwre.setBounds(10, 14, 63, 15);
		cp_signup_f3.add(lbl_signup_pwre);
		
		pf_signup_pwre = new JPasswordField();
		pf_signup_pwre.setOpaque(false);
		pf_signup_pwre.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 16));
		pf_signup_pwre.setColumns(10);
		pf_signup_pwre.setBorder(null);
		pf_signup_pwre.setBounds(62, 7, 175, 30);
		cp_signup_f3.add(pf_signup_pwre);
		
		btn_signup_signup = new JButton("가입");
		btn_signup_signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn_signup_signup) {
					toss.setId(tf_signup_id.getText());
					toss.setPw(pf_signup_pw.getText());
					toss.setNote(pf_signup_pwre.getText());
					t0005.c_t0005_send(toss, oos);

				}
			}
		});
		btn_signup_signup.setForeground(Color.DARK_GRAY);
		btn_signup_signup.setFont(setfont.fontSetting(14, "light"));
		btn_signup_signup.setBorder(new LineBorder(Color.BLACK));
		btn_signup_signup.setBackground(Color.ORANGE);
		btn_signup_signup.setBounds(650, 428, 115, 44);
		cp_signup.add(btn_signup_signup);
		
		btn_signup_cancel = new JButton("취소");
		btn_signup_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn_signup_cancel) {
					tf_signup_id.setText("");
					pf_signup_pw.setText("");
					pf_signup_pwre.setText("");
					cp_allHidden();
					cp_login.setVisible(true);
				}
			}
		});
		btn_signup_cancel.setForeground(new Color(230, 230, 250));
		btn_signup_cancel.setFont(setfont.fontSetting(14, "light"));
		btn_signup_cancel.setBorder(new LineBorder(Color.BLACK));
		btn_signup_cancel.setBackground(Color.GRAY);
		btn_signup_cancel.setBounds(523, 428, 115, 44);
		cp_signup.add(btn_signup_cancel);
		
		lbl_signup_title = new JLabel("회원가입");
		lbl_signup_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_signup_title.setFont(setfont.fontSetting(42, "ebold"));
		lbl_signup_title.setBounds(489, 135, 309, 134);
		cp_signup.add(lbl_signup_title);
		cp_toolbar.setBackground(Color.ORANGE);
		cp_toolbar.setName("툴바");
		cp_toolbar.setBounds(0, 0, 1294, 40);
		contentPane.add(cp_toolbar);
		cp_toolbar.setLayout(null);
		
		JLabel lbl_toolbar = new JLabel("toolbar 자리 입니다");
		lbl_toolbar.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 14));
		lbl_toolbar.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_toolbar.setBounds(573, 12, 148, 15);
		lbl_toolbar.setHorizontalTextPosition(SwingConstants.CENTER);
		cp_toolbar.add(lbl_toolbar);
		cp_connsetting.setLayout(null);
		cp_connsetting.setBackground(Color.WHITE);
		cp_connsetting.setBounds(0, 0, 1294, 685);
		contentPane.add(cp_connsetting);
		
		lbl_connsetting_title = new JLabel("접속 설정");
		lbl_connsetting_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_connsetting_title.setFont(setfont.fontSetting(40, "ebold"));
		lbl_connsetting_title.setBounds(495, 28, 309, 134);
		cp_connsetting.add(lbl_connsetting_title);
		
		cp_connsetting_f1 = new JPanel();
		cp_connsetting_f1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		cp_connsetting_f1.setBackground(Color.WHITE);
		cp_connsetting_f1.setBounds(526, 157, 242, 44);
		cp_connsetting.add(cp_connsetting_f1);
		cp_connsetting_f1.setLayout(null);
		
		tf_connsetting_svip = new JTextField();
		tf_connsetting_svip.setOpaque(false);
		tf_connsetting_svip.setFont(setfont.fontSetting(12, "light"));
		tf_connsetting_svip.setColumns(10);
		tf_connsetting_svip.setBorder(null);
		tf_connsetting_svip.setBounds(83, 7, 154, 30);
		cp_connsetting_f1.add(tf_connsetting_svip);
		
		JLabel lbl_connsetting_svip = new JLabel("서버 IP");
		lbl_connsetting_svip.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_connsetting_svip.setFont(setfont.fontSetting(12, "regular"));
		lbl_connsetting_svip.setBounds(10, 14, 63, 15);
		cp_connsetting_f1.add(lbl_connsetting_svip);
		
		cp_connsetting_f2 = new JPanel();
		cp_connsetting_f2.setLayout(null);
		cp_connsetting_f2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		cp_connsetting_f2.setBackground(Color.WHITE);
		cp_connsetting_f2.setBounds(526, 211, 242, 44);
		cp_connsetting.add(cp_connsetting_f2);
		
		tf_connsetting_svpt = new JTextField();
		tf_connsetting_svpt.setOpaque(false);
		tf_connsetting_svpt.setFont(setfont.fontSetting(12, "light"));
		tf_connsetting_svpt.setColumns(10);
		tf_connsetting_svpt.setBorder(null);
		tf_connsetting_svpt.setBounds(83, 7, 154, 30);
		cp_connsetting_f2.add(tf_connsetting_svpt);
		
		lbl_connsetting_svpt = new JLabel("서버 PORT");
		lbl_connsetting_svpt.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_connsetting_svpt.setFont(setfont.fontSetting(12, "regular"));
		lbl_connsetting_svpt.setBounds(10, 14, 63, 15);
		cp_connsetting_f2.add(lbl_connsetting_svpt);
		
		cp_connsetting_f3 = new JPanel();
		cp_connsetting_f3.setLayout(null);
		cp_connsetting_f3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		cp_connsetting_f3.setBackground(Color.WHITE);
		cp_connsetting_f3.setBounds(526, 265, 242, 44);
		cp_connsetting.add(cp_connsetting_f3);
		
		tf_connsetting_dbip = new JTextField();
		tf_connsetting_dbip.setOpaque(false);
		tf_connsetting_dbip.setFont(setfont.fontSetting(12, "light"));
		tf_connsetting_dbip.setColumns(10);
		tf_connsetting_dbip.setBorder(null);
		tf_connsetting_dbip.setBounds(83, 7, 154, 30);
		cp_connsetting_f3.add(tf_connsetting_dbip);
		
		lbl_connsetting_dbip = new JLabel("DB IP");
		lbl_connsetting_dbip.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_connsetting_dbip.setFont(setfont.fontSetting(12, "regular"));
		lbl_connsetting_dbip.setBounds(10, 14, 63, 15);
		cp_connsetting_f3.add(lbl_connsetting_dbip);
		
		cp_connsetting_f4 = new JPanel();
		cp_connsetting_f4.setLayout(null);
		cp_connsetting_f4.setBorder(new LineBorder(Color.LIGHT_GRAY));
		cp_connsetting_f4.setBackground(Color.WHITE);
		cp_connsetting_f4.setBounds(526, 319, 242, 44);
		cp_connsetting.add(cp_connsetting_f4);
		
		tf_connsetting_dbpt = new JTextField();
		tf_connsetting_dbpt.setOpaque(false);
		tf_connsetting_dbpt.setFont(setfont.fontSetting(12, "light"));
		tf_connsetting_dbpt.setColumns(10);
		tf_connsetting_dbpt.setBorder(null);
		tf_connsetting_dbpt.setBounds(83, 7, 154, 30);
		cp_connsetting_f4.add(tf_connsetting_dbpt);
		
		lbl_connsetting_dbpt = new JLabel("DB PORT");
		lbl_connsetting_dbpt.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_connsetting_dbpt.setFont(setfont.fontSetting(12, "regular"));
		lbl_connsetting_dbpt.setBounds(10, 14, 63, 15);
		cp_connsetting_f4.add(lbl_connsetting_dbpt);
		
		cp_connsetting_f5 = new JPanel();
		cp_connsetting_f5.setLayout(null);
		cp_connsetting_f5.setBorder(new LineBorder(Color.LIGHT_GRAY));
		cp_connsetting_f5.setBackground(Color.WHITE);
		cp_connsetting_f5.setBounds(526, 373, 242, 44);
		cp_connsetting.add(cp_connsetting_f5);
		
		tf_connsetting_dbsname = new JTextField();
		tf_connsetting_dbsname.setOpaque(false);
		tf_connsetting_dbsname.setFont(setfont.fontSetting(12, "light"));
		tf_connsetting_dbsname.setColumns(10);
		tf_connsetting_dbsname.setBorder(null);
		tf_connsetting_dbsname.setBounds(83, 7, 154, 30);
		cp_connsetting_f5.add(tf_connsetting_dbsname);
		
		lbl_connsetting_dbsnsid = new JLabel("DB SNAME");
		lbl_connsetting_dbsnsid.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_connsetting_dbsnsid.setFont(setfont.fontSetting(12, "regular"));
		lbl_connsetting_dbsnsid.setBounds(10, 14, 63, 15);
		cp_connsetting_f5.add(lbl_connsetting_dbsnsid);
		
		cp_connsetting_f7 = new JPanel();
		cp_connsetting_f7.setLayout(null);
		cp_connsetting_f7.setBorder(new LineBorder(Color.LIGHT_GRAY));
		cp_connsetting_f7.setBackground(Color.WHITE);
		cp_connsetting_f7.setBounds(526, 481, 242, 44);
		cp_connsetting.add(cp_connsetting_f7);
		
		tf_connsetting_dbid = new JTextField();
		tf_connsetting_dbid.setOpaque(false);
		tf_connsetting_dbid.setFont(setfont.fontSetting(12, "light"));
		tf_connsetting_dbid.setColumns(10);
		tf_connsetting_dbid.setBorder(null);
		tf_connsetting_dbid.setBounds(83, 7, 154, 30);
		cp_connsetting_f7.add(tf_connsetting_dbid);
		
		lbl_connsetting_dbid = new JLabel("DB ID");
		lbl_connsetting_dbid.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_connsetting_dbid.setFont(setfont.fontSetting(12, "regular"));
		lbl_connsetting_dbid.setBounds(10, 14, 63, 15);
		cp_connsetting_f7.add(lbl_connsetting_dbid);
		
		cp_connsetting_f8 = new JPanel();
		cp_connsetting_f8.setLayout(null);
		cp_connsetting_f8.setBorder(new LineBorder(Color.LIGHT_GRAY));
		cp_connsetting_f8.setBackground(Color.WHITE);
		cp_connsetting_f8.setBounds(526, 535, 242, 44);
		cp_connsetting.add(cp_connsetting_f8);
		
		pf_connsetting_dbpw = new JPasswordField();
		pf_connsetting_dbpw.setOpaque(false);
		pf_connsetting_dbpw.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 16));
		pf_connsetting_dbpw.setColumns(10);
		pf_connsetting_dbpw.setBorder(null);
		pf_connsetting_dbpw.setBounds(83, 7, 154, 30);
		cp_connsetting_f8.add(pf_connsetting_dbpw);
		
		lbl_connsetting_dbpw = new JLabel("DB PW");
		lbl_connsetting_dbpw.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_connsetting_dbpw.setFont(setfont.fontSetting(12, "regular"));
		lbl_connsetting_dbpw.setBounds(10, 14, 63, 15);
		cp_connsetting_f8.add(lbl_connsetting_dbpw);
		
		btn_connsetting_default = new JButton("기본값");
		btn_connsetting_default.setForeground(new Color(230, 230, 250));
		btn_connsetting_default.setFont(setfont.fontSetting(14, "light"));
		btn_connsetting_default.setBorder(new LineBorder(Color.BLACK));
		btn_connsetting_default.setBackground(Color.GRAY);
		btn_connsetting_default.setBounds(526, 589, 75, 44);
		cp_connsetting.add(btn_connsetting_default);
		
		btn_connsetting_save = new JButton("저장");
		btn_connsetting_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn_connsetting_save) {

					// [t0004] 접속 설정 기능 추가
					// https://github.com/Hx2DEV/BLACKJACK/issues/18
					// 작업자 전호형			
					toss = t0004.c_t0004_send(toss, contentPane, tf_connsetting_svip, tf_connsetting_svpt, tf_connsetting_dbpt, tf_connsetting_dbip, tf_connsetting_dbpt, tf_connsetting_dbsid, tf_connsetting_dbsname, tf_connsetting_dbid, pf_connsetting_dbpw);
					cp_allHidden();
					cp_login.setVisible(true);
				}
			}
		});
		btn_connsetting_save.setForeground(Color.DARK_GRAY);
		btn_connsetting_save.setFont(setfont.fontSetting(14, "light"));
		btn_connsetting_save.setBorder(new LineBorder(Color.BLACK));
		btn_connsetting_save.setBackground(Color.ORANGE);
		btn_connsetting_save.setBounds(693, 589, 75, 44);
		cp_connsetting.add(btn_connsetting_save);
		
		btn_connsetting_cancel = new JButton("취소");
		btn_connsetting_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cp_allHidden();
				cp_login.setVisible(true);
				tf_connsetting_svip.setText("");
				tf_connsetting_dbpt.setText("");
				tf_connsetting_dbip.setText("");
				tf_connsetting_dbpt.setText("");
				tf_connsetting_dbsid.setText("");
				tf_connsetting_dbsname.setText("");
				tf_connsetting_dbid.setText("");
				pf_connsetting_dbpw.setText("");
			}
		});
		btn_connsetting_cancel.setForeground(new Color(230, 230, 250));
		btn_connsetting_cancel.setFont(setfont.fontSetting(14, "light"));
		btn_connsetting_cancel.setBorder(new LineBorder(Color.BLACK));
		btn_connsetting_cancel.setBackground(Color.GRAY);
		btn_connsetting_cancel.setBounds(608, 589, 75, 44);
		cp_connsetting.add(btn_connsetting_cancel);
		
		cp_connsetting_f6 = new JPanel();
		cp_connsetting_f6.setLayout(null);
		cp_connsetting_f6.setBorder(new LineBorder(Color.LIGHT_GRAY));
		cp_connsetting_f6.setBackground(Color.WHITE);
		cp_connsetting_f6.setBounds(526, 427, 242, 44);
		cp_connsetting.add(cp_connsetting_f6);
		
		tf_connsetting_dbsid = new JTextField();
		tf_connsetting_dbsid.setOpaque(false);
		tf_connsetting_dbsid.setFont(setfont.fontSetting(12, "light"));
		tf_connsetting_dbsid.setColumns(10);
		tf_connsetting_dbsid.setBorder(null);
		tf_connsetting_dbsid.setBounds(83, 7, 154, 30);
		cp_connsetting_f6.add(tf_connsetting_dbsid);
		
		lbl_connsetting_dbsid = new JLabel("DB SID");
		lbl_connsetting_dbsid.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_connsetting_dbsid.setFont(setfont.fontSetting(12, "regular"));
		lbl_connsetting_dbsid.setBounds(10, 14, 63, 15);
		cp_connsetting_f6.add(lbl_connsetting_dbsid);
		
		cp_playroom = new JPanel();
		cp_playroom.setVisible(false);
		cp_playroom.setBounds(0, 40, 1288, 645);
		contentPane.add(cp_playroom);
		
		lbl_playroom = new JLabel("게임방");
		lbl_playroom.setFont(new Font("굴림", Font.PLAIN, 27));
		cp_playroom.add(lbl_playroom);
	}
	
	

	
	private static void cp_allHidden() {		// contentPane all hideen
		cp_login.setVisible(false);
		cp_lobby.setVisible(false);
		cp_playroom.setVisible(false);
		cp_connsetting.setVisible(false);
		cp_signup.setVisible(false);
		
	}
	
	
	
	private void conn_receive() {		// 서버 접속 및 데이터 수신
		// 서버로 부터 데이터 수신 시작 ============================================================================
		try {
			socket = new Socket(toss.getSvIP(), Integer.parseInt(toss.getSvPT()));								// 소켓 접속 정보 저장
			oos = new ObjectOutputStream(socket.getOutputStream());											//	객체 발신체에 소켓 정보 저장
			ois = new ObjectInputStream(socket.getInputStream());												//	객체 수신체에 소켓 정보 저장			
			
			System.out.println("[서버 연결]" + socket.getRemoteSocketAddress().toString()); 				// 서버 접속 정보 출력
			ExecutorService receiver = Executors.newSingleThreadExecutor(); 									// 메시지 수신 스레드 풀
			receiver.execute(() -> {		 																					// 메세지 수신 스레드 시작=============
				try {
					while (true) {
						toss = (toss)ois.readObject();																		// 메세지 수신 블로킹 (수신 오는 즉시 아래 코드 진행)
						code = toss.getCode();																				// 수신된 코드 확인
						switch(code) {																							// 수신된 코드에 따른 동작 시작==========
						
						case "t0000" :
							// [t0000] 로그인 기능 추가
							// https://github.com/Hx2DEV/BLACKJACK/issues/16
							// 작업자 전호형						
							switch(toss.getIntnote()) {
								case 1:
									toss.setId(tf_login_id.getText());
									t0001.c_t0001_send(toss, oos);					// 방정보 불러오기
									cp_allHidden();
									cp_toolbar.setVisible(true);
									cp_lobby.setVisible(true);	
									break;
								case 2:	JOptionPane.showMessageDialog(contentPane, "아이디, 패스워드를 입력해주세요.");			break;
								case 3:	JOptionPane.showMessageDialog(contentPane, "로그인 에러 발생 다시 시도해 주세요.");	break;
								case 4:	JOptionPane.showMessageDialog(contentPane, "아이디, 패스워드를 확인해 주세요.");		break;
							}							
							break;			
							
						case "t0001" :
							// [t0001] 방 목록 갱신 기능 추가
							// https://github.com/Hx2DEV/BLACKJACK/issues/10
							// 작업자 전호형								
							System.out.println("[클라] [t0001] 클라 작업 시작");
							t0001.c_t0001_recv(
									toss,
									lbl_room1_UI_userimg1, lbl_room1_UI_userimg2, lbl_room1_UI_userimg3, lbl_room2_UI_userimg1, lbl_room2_UI_userimg2, lbl_room2_UI_userimg3, 
									lbl_room3_UI_userimg1, lbl_room3_UI_userimg2, lbl_room3_UI_userimg3, lbl_room4_UI_userimg1, lbl_room4_UI_userimg2, lbl_room4_UI_userimg3, 
									lbl_room5_UI_userimg1, lbl_room5_UI_userimg2, lbl_room5_UI_userimg3, lbl_room6_UI_userimg1, lbl_room6_UI_userimg2, lbl_room6_UI_userimg3,
									lbl_room7_UI_userimg1, lbl_room7_UI_userimg2, lbl_room7_UI_userimg3, lbl_room8_UI_userimg1, lbl_room8_UI_userimg2, lbl_room8_UI_userimg3,
									lbl_room9_UI_userimg1, lbl_room9_UI_userimg2, lbl_room9_UI_userimg3, lbl_room10_UI_userimg1, lbl_room10_UI_userimg2, lbl_room10_UI_userimg3,
									lbl_room1_UI_stats_btn, lbl_room2_UI_stats_btn, lbl_room3_UI_stats_btn, lbl_room4_UI_stats_btn, lbl_room5_UI_stats_btn, 
									lbl_room6_UI_stats_btn, lbl_room7_UI_stats_btn, lbl_room8_UI_stats_btn, lbl_room9_UI_stats_btn, lbl_room10_UI_stats_btn,
									cp_room1, cp_room2, cp_room3, cp_room4, cp_room5, cp_room6, cp_room7, cp_room8, cp_room9, cp_room10,
									
									lbl_room1_title, lbl_room2_title, lbl_room3_title, lbl_room4_title, lbl_room5_title, 
									lbl_room6_title, lbl_room7_title, lbl_room8_title, lbl_room9_title, lbl_room10_title
									);
							System.out.println("[클라] [t0001] 클라 작업 완료");
							break; 	// t0001 종료
	
						case "t0002" :
							//[t0002] 방 생성 기능 추가
							// https://github.com/Hx2DEV/BLACKJACK/issues/13
							// 작업자 전호형
							System.out.println("[클라] [t0002] 생성된 방 번호 " +toss.getIntnote());
							cp_allHidden();
							t0002.c_t0002_recv(
									toss, cp_playroom, lbl_playroom
									);
							break;
							
						case "t0003" :
							// [t0003] 참가한 방 정보 갱신 기능 추가
							// https://github.com/Hx2DEV/BLACKJACK/issues/14
							// 작업자 전호형
							t0003.c_t0003_recv(toss, lbl_playroom);
							break;
							
						case "t0005" :
							// [t0005] 회원가입 기능 추가
							// https://github.com/Hx2DEV/BLACKJACK/issues/20
							// 작업자 전호형
							t0005.c_t0005_recv(toss, oos, cp_login, cp_signup);
							cp_login.setVisible(true);
							cp_signup.setVisible(false);
							break;
							
						case "t0006" :
							// [t0006] 방 참가 기능 추가
							// https://github.com/Hx2DEV/BLACKJACK/issues/21
							// 작업자 전호형
							cp_allHidden();
							cp_playroom.setVisible(true);															// 방으로 입장
							t0003.c_t0003_send(toss, oos);
							break;
						}																											// 수신된 코드에 따른 동작 종료=========
					}
				}catch (Throwable e) {
					e.printStackTrace();
				}
			});																															// 메세지 수신 스레드 종료=============
			//while(true) {	}																										// Main 종료에 따른 소켓 닫힘 방지용 무한반복
		}catch (Exception e) {		// 접속 실패 시 접속 종료
			JOptionPane.showMessageDialog(contentPane, "접속에 실패하였습니다. 다시 실행해주세요.", "BLACKJACK", JOptionPane.ERROR_MESSAGE, null);
			e.printStackTrace();
			dispose();
			System.exit(0);
		}
		// 서버로 부터 데이터 수신 종료 =================================================
	}
}


