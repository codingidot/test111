package main;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.border.EmptyBorder;

// import com.ibm.icu.util.Calendar;

import data.House;
import data.Swinger;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.awt.GridLayout;
import java.awt.Label;

public class Hall extends JFrame {
	
	static private JPanel contentPane;
	static private JPanel playerField;
	static private JPanel dealerField;
	static private ArrayList<House> dealerHand;
	static private int dealerScore=0;
	static private JLabel dealerScoreBoard;
	static private boolean dealerBurst=false;
	
	static private int budget;
	static private int startBudget;
	static private int bet=0;
	static private int insuranceBet=0;
	static private int splitCnt;
	
	static private ArrayList<House> [] playerHand;
	static private Panel [] playerFieldPanel;
	static private Panel [] playerCardPanel;
	static private Panel [] playerScorePanel;
	static private Panel [] playerbuttonPanel;
	
	static private JLabel [] playMonitor;
	static private JButton [] hit;
	static private JButton [] stay;
	static private JButton [] DD;
	static private int [] playerScore;
	
	static private int sixCardCnt;
	static private boolean [] canSplit;
	static private boolean aceSplit;
	static private boolean blackJack;
	static private boolean [] sixCard;
	
	static private boolean [] doubleDown;
	static private boolean [] burst;
	static private boolean [] condition;
	static private boolean [] turn;
	static private boolean [] result;
	static private boolean fResult=false;
	static private boolean playable=false;
	static private boolean online=false; // 
	static private boolean fieldcheck1=false; // 다른 플레이어 필드정보 받아오기위한 flag
	static private boolean fieldcheck2=false; // 다른 플레이어 필드정보 받아오기위한 flag
	static private int burstCnt;
	
	static private int doubleDownCnt;
	static private FlowLayout flowForm;
	static private boolean signal = false;
	static private boolean flag = false;
	static private boolean flag2 = false;
	static private boolean hiddenOpen=false;
	
	static private JPanel leftSide;
	static private JPanel rightSide;
	static private JLabel information;
	static private JPanel choicePanel;
	static private JLabel signalOff;
	static private JLabel signalOn;
	static private JLabel timer;
	
	static private JPanel ready;
	static private JLabel readyConfirm;
	static private JLabel readyMessege;
	static private JButton readyButtonA;
	static private JButton readyButtonB;
	
	static private JPanel evenMoney;
	static private JLabel evenMoneyMessege;
	static private JButton evenMoneyButtonA;
	static private JButton evenMoneyButtonB;
	
	static private JPanel insure;
	static private JLabel insureMessege;
	static private JButton insureButtonA;
	static private JButton insureButtonB;
	
	static private String [] bettingOptions;
	static private JPanel betting;
	static private JLabel bettingMessege;
	static private JComboBox bettingChoice;
	static private JButton bettingButtonA;
	static private JButton bettingButtonB;
	
	static private JPanel split;
	static private JPanel split2;
	static private boolean splitCheck=false;
	static private JLabel splitMessege;
	static private JLabel splitMessege2;
	static private JRadioButton splitChoice1;
	static private JRadioButton splitChoice2;
	static private JRadioButton splitChoice3;
	static private JButton splitButtonA;
	static private JButton splitButtonB;
	static private ButtonGroup splitChoice;
	
	static private JPanel select;
	static private JLabel selectMessege;
	
	House tc;
	ArrayList<House> pureDeck;
	
	Thread t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int temp=0;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hall frame = new Hall(temp);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Hall() {
		int temp=0;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hall frame = new Hall(temp);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Hall(int temp) throws InterruptedException {
		setBounds(100, 100, 1300, 730); // 1284 686 // 642 343
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 150, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
//		flowForm = new FlowLayout(FlowLayout.CENTER, 5, 5);
//		flowForm.setAlignOnBaseline(true);
		
		dealerScoreBoard = new JLabel(""+dealerScore);
		dealerScoreBoard.setForeground(Color.WHITE);
		dealerScoreBoard.setFont(new Font("굴림", Font.PLAIN, 99));
		dealerScoreBoard.setHorizontalAlignment(SwingConstants.CENTER);
		dealerScoreBoard.setBackground(new Color(0,50,50));
		dealerScoreBoard.setBounds(0, 0, 300 , 200);
		dealerScoreBoard.setVisible(false);
		dealerScoreBoard.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(dealerScoreBoard);
		
		dealerField = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) dealerField.getLayout();
		flowLayout_1.setAlignOnBaseline(true);
		dealerField.setBounds(300, 0, 684, 200);
		dealerField.setBackground(new Color(0,100,0));
		dealerField.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(dealerField);
//		dealerField.setOpaque(false);
		
		playerField = new JPanel();
		FlowLayout flowLayout = (FlowLayout) playerField.getLayout();
		flowLayout.setAlignOnBaseline(true);
		playerField.setBackground(new Color(0,100,0));
		playerField.setBounds(0, 386, 1284, 300);
		playerField.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(playerField);
//		playerField.setOpaque(false);
		
		leftSide = new JPanel();
		leftSide.setBackground(new Color(0,50,50));
		leftSide.setBounds(0, 200, 300, 186);
		leftSide.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(leftSide);
		leftSide.setLayout(null);
		
		rightSide = new JPanel();
		rightSide.setBackground(new Color(0,50,50));
		rightSide.setBounds(984, 200, 300, 186);
		rightSide.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(rightSide);
		rightSide.setLayout(null);
		
		information = new JLabel();
		information.setForeground(Color.WHITE);
		information.setHorizontalAlignment(SwingConstants.CENTER);
		information.setBackground(new Color(0,50,50));
		information.setBounds(300, 200, 684 , 186);
		information.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(information);
		
		choicePanel = new JPanel();
		choicePanel.setBackground(new Color(10,10,10));
		choicePanel.setBounds(340, 200, 604 , 186);
		choicePanel.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(choicePanel);
		choicePanel.setOpaque(true);
		choicePanel.setLayout(null);
		choicePanel.setVisible(false);
		
		signalOff = new JLabel("플레이가 종료되어 다른 플레이어를 기다리고있습니다.");
		signalOff.setBackground(new Color(150,150,150));
		signalOff.setForeground(Color.BLACK);
		signalOff.setAlignmentX(CENTER_ALIGNMENT);
		signalOff.setFont(new Font("굴림", Font.PLAIN, 15));
		signalOff.setBounds(0, 0, 604 , 186);
		signalOff.setVisible(false);
		choicePanel.add(signalOff);
		
		signalOn = new JLabel("더이상 선택사항이 없어 결과를 기다립니다.");
		signalOn.setBackground(new Color(150,150,150));
		signalOn.setForeground(Color.BLACK);
		signalOn.setAlignmentX(CENTER_ALIGNMENT);
		signalOn.setFont(new Font("굴림", Font.PLAIN, 15));
		signalOn.setBounds(0, 0, 604 , 186);
		signalOn.setVisible(false);
		choicePanel.add(signalOn);
		
		timer = new JLabel();
		timer.setHorizontalAlignment(SwingConstants.CENTER);
		timer.setBackground(new Color(0,50,50));
		timer.setForeground(Color.WHITE);
		timer.setFont(new Font("굴림", Font.PLAIN, 99));
		timer.setBounds(0, 0, 186 , 186);
		timer.setAlignmentX(CENTER_ALIGNMENT);
		timer.setVisible(true);
		choicePanel.add(timer);
		timer.setOpaque(true);
		
		
		ready = new JPanel();
		ready.setBackground(new Color(150,150,150));
		ready.setForeground(Color.BLACK);
		ready.setLayout(null);
		ready.setFont(new Font("굴림", Font.PLAIN, 15));
		ready.setBounds(186, 0, 418 , 186);
		ready.setVisible(false);
		choicePanel.add(ready);
		
		readyConfirm = new JLabel();
		readyConfirm.setText("레디완료!!");
		readyConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		readyConfirm.setBackground(new Color(0,50,50));
		readyConfirm.setForeground(Color.WHITE);
		readyConfirm.setFont(new Font("굴림", Font.PLAIN, 15));
		readyConfirm.setBounds(0, 0, 418 , 156);
		readyConfirm.setAlignmentX(CENTER_ALIGNMENT);
		ready.add(readyConfirm);
		readyConfirm.setVisible(false);
		
		readyMessege = new JLabel();
		readyMessege.setText("레디하시겠습니까?");
		readyMessege.setHorizontalAlignment(SwingConstants.CENTER);
		readyMessege.setBackground(new Color(0,50,50));
		readyMessege.setForeground(Color.WHITE);
		readyMessege.setFont(new Font("굴림", Font.PLAIN, 15));
		readyMessege.setBounds(0, 0, 418 , 156);
		readyMessege.setAlignmentX(CENTER_ALIGNMENT);
		ready.add(readyMessege);
		
		readyButtonA = new JButton("레디");
		readyButtonA.setBounds(0, 156, 209 , 30);
		ready.add(readyButtonA);
		readyButtonA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				readyMessege.setVisible(false);
				readyConfirm.setVisible(true);
				flag=true;
			}
		});
		
		readyButtonB = new JButton("게임종료");
		readyButtonB.setBounds(209, 156, 209 , 30);
		ready.add(readyButtonB);
		readyButtonB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flag=false;
			}
		});
		
		betting = new JPanel();
		betting.setBackground(new Color(150,150,150));
		betting.setForeground(Color.BLACK);
		betting.setLayout(null);
		betting.setFont(new Font("굴림", Font.PLAIN, 15));
		betting.setBounds(186, 0, 418 , 186);
		betting.setVisible(false);
		choicePanel.add(betting);
		
		bettingMessege = new JLabel();
		bettingMessege.setText("배팅금액을 선택해주세요");
		bettingMessege.setHorizontalAlignment(SwingConstants.CENTER);
		bettingMessege.setBackground(new Color(0,50,50));
		bettingMessege.setForeground(Color.WHITE);
		bettingMessege.setFont(new Font("굴림", Font.PLAIN, 15));
		bettingMessege.setBounds(0, 0, 418 , 106);
		bettingMessege.setAlignmentX(CENTER_ALIGNMENT);
		betting.add(bettingMessege);
		
		bettingOptions = new String [] {"10","20","30","40","50","60","70","80","90","100"};
		bettingChoice = new JComboBox(bettingOptions);
		bettingChoice.setSelectedIndex(0);
		bettingChoice.setMaximumRowCount(10);
		bettingChoice.setBounds(0,106,418,50);
		betting.add(bettingChoice);
		
		bettingButtonA = new JButton("선택완료");
		bettingButtonA.setBounds(0, 156, 209 , 30);
		betting.add(bettingButtonA);
		bettingButtonA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flag=true;
			}
		});
		
		bettingButtonB = new JButton("게임종료");
		bettingButtonB.setBounds(209, 156, 209 , 30);
		betting.add(bettingButtonB);
		bettingButtonB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flag=false;
				signal=false;
				dispose();
			}
		});
		
		
		evenMoney = new JPanel();
		evenMoney.setBackground(new Color(150,150,150));
		evenMoney.setForeground(Color.BLACK);
		evenMoney.setLayout(null);
		evenMoney.setFont(new Font("굴림", Font.PLAIN, 15));
		evenMoney.setBounds(186, 0, 418 , 186);
		evenMoney.setVisible(false);
		choicePanel.add(evenMoney);
		
		evenMoneyMessege = new JLabel();
		evenMoneyMessege.setText("블랙잭이 나왔지만, 딜러도 블랙잭일 수 있습니다. 이븐머니(배팅금액 1배지급)를 선택하시겠습니까?");
		evenMoneyMessege.setHorizontalAlignment(SwingConstants.CENTER);
		evenMoneyMessege.setBackground(new Color(0,50,50));
		evenMoneyMessege.setForeground(Color.WHITE);
		evenMoneyMessege.setFont(new Font("굴림", Font.PLAIN, 15));
		evenMoneyMessege.setBounds(0, 0, 418 , 156);
		evenMoneyMessege.setAlignmentX(CENTER_ALIGNMENT);
		evenMoney.add(evenMoneyMessege);
		
		evenMoneyButtonA = new JButton("이븐머니 선택");
		evenMoneyButtonA.setBounds(0, 156, 209 , 30);
		evenMoney.add(evenMoneyButtonA);
		evenMoneyButtonA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("이븐머니 선택, 배팅금액 1배에 해당하는 승리수당 지급");
				signal = false;
				flag=true;
			}
		});
		
		evenMoneyButtonB = new JButton("이븐머니 취소");
		evenMoneyButtonB.setBounds(209, 156, 209 , 30);
		evenMoney.add(evenMoneyButtonB);
		evenMoneyButtonB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flag=true;
			}
		});
		
		
//		insure
		
		insure = new JPanel();
		insure.setBackground(new Color(150,150,150));
		insure.setForeground(Color.BLACK);
		insure.setLayout(null);
		insure.setFont(new Font("굴림", Font.PLAIN, 15));
		insure.setBounds(186, 0, 418 , 186);
		insure.setVisible(false);
		choicePanel.add(insure);
		
		insureMessege = new JLabel();
		insureMessege.setText("딜러의패가 블랙잭인것에 배팅금액의 반을 보험금으로 거시겠습니까?\\n(블랙잭인경우 보험금의 2배 지급)");
		insureMessege.setHorizontalAlignment(SwingConstants.CENTER);
		insureMessege.setBackground(new Color(0,50,50));
		insureMessege.setForeground(Color.WHITE);
		insureMessege.setFont(new Font("굴림", Font.PLAIN, 15));
		insureMessege.setBounds(0, 0, 418 , 156);
		insureMessege.setAlignmentX(CENTER_ALIGNMENT);
		insure.add(insureMessege);
		
		insureButtonA = new JButton("보험금 배팅하기");
		insureButtonA.setBounds(0, 156, 209 , 30);
		insure.add(insureButtonA);
		insureButtonA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insuranceBet += bet/2;
				budget -= insuranceBet;
				flag=true;
			}
		});
		
		insureButtonB = new JButton("보험금 배팅하지않기");
		insureButtonB.setBounds(209, 156, 209 , 30);
		insure.add(insureButtonB);
		insureButtonB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flag=true;
			}
		});
		
		split = new JPanel();
		split.setBackground(new Color(150,150,150));
		split.setForeground(Color.BLACK);
		split.setLayout(null);
		split.setFont(new Font("굴림", Font.PLAIN, 15));
		split.setBounds(186, 0, 418 , 186);
		split.setVisible(false);
		choicePanel.add(split);
		
		splitMessege = new JLabel();
		splitMessege.setText("스플릿을 진행할 핸드를 선택해주세요");
		splitMessege.setHorizontalAlignment(SwingConstants.CENTER);
		splitMessege.setBackground(new Color(0,50,50));
		splitMessege.setForeground(Color.WHITE);
		splitMessege.setFont(new Font("굴림", Font.PLAIN, 15));
		splitMessege.setBounds(0, 0, 418 , 106);
		splitMessege.setAlignmentX(CENTER_ALIGNMENT);
		split.add(splitMessege);
		
		
		split2 = new JPanel();
		split2.setBackground(new Color(150,150,150));
		split2.setForeground(Color.BLACK);
		split2.setLayout(null);
		split2.setFont(new Font("굴림", Font.PLAIN, 15));
		split2.setBounds(186, 0, 418 , 186);
		split2.setVisible(false);
		choicePanel.add(split2);
		
		splitMessege2 = new JLabel();
		splitMessege2.setText("다른분들의 선택을 기다리고있습니다.");
		splitMessege2.setHorizontalAlignment(SwingConstants.CENTER);
		splitMessege2.setBackground(new Color(0,50,50));
		splitMessege2.setForeground(Color.WHITE);
		splitMessege2.setFont(new Font("굴림", Font.PLAIN, 15));
		splitMessege2.setBounds(0, 0, 418 , 186);
		splitMessege2.setAlignmentX(CENTER_ALIGNMENT);
		split2.add(splitMessege2);
		
		
		splitChoice = new ButtonGroup();
		
		splitChoice1 = new JRadioButton("1번 핸드");
		splitChoice1.setBounds(39, 116, 80, 30);
		if(canSplit[0]) {
			splitChoice1.setEnabled(true);
		}else {
			splitChoice1.setEnabled(false);
		}
		split.add(splitChoice1);
		
		splitChoice2 = new JRadioButton("2번 핸드");
		splitChoice2.setBounds(169, 116, 80, 30);
		if(canSplit[1]) {
			splitChoice2.setEnabled(true);
		}else {
			splitChoice2.setEnabled(false);
		}
		split.add(splitChoice2);
		
		splitChoice3 = new JRadioButton("3번 핸드");
		splitChoice3.setBounds(299, 116, 80, 30);
		if(canSplit[2]) {
			splitChoice3.setEnabled(true);
		}else {
			splitChoice3.setEnabled(false);
		}
		split.add(splitChoice3);
		
		splitChoice.add(splitChoice1);
		splitChoice.add(splitChoice2);
		splitChoice.add(splitChoice3);
		
		
		splitButtonA = new JButton("선택완료");
		splitButtonA.setBounds(0, 156, 209 , 30);
		split.add(splitButtonA);
		splitButtonA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int k=-1;
				if(splitChoice1.isSelected())
					k=0;
				if(splitChoice2.isSelected())
					k=1;
				if(splitChoice3.isSelected())
					k=2;
				if(k>=0)				
				splitCheck(k);
				monitorUpdate(budget,bet);
			}
		});
		
		splitButtonB = new JButton("스플릿 취소");
		splitButtonB.setBounds(209, 156, 209 , 30);
		split.add(splitButtonB);
		splitButtonB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				split.setVisible(false);
				split2.setVisible(true);
				flag=true;
				
			}
		});
		
		
		select = new JPanel();
		select.setBackground(new Color(150,150,150));
		select.setForeground(Color.BLACK);
		select.setLayout(null);
		select.setFont(new Font("굴림", Font.PLAIN, 15));
		select.setBounds(186, 0, 418 , 186);
		select.setVisible(false);
		choicePanel.add(select);
		
		selectMessege = new JLabel();
		selectMessege.setText("각 핸드의 행동을 선택해주세요");
		selectMessege.setHorizontalAlignment(SwingConstants.CENTER);
		selectMessege.setBackground(new Color(0,50,50));
		selectMessege.setForeground(Color.WHITE);
		selectMessege.setFont(new Font("굴림", Font.PLAIN, 15));
		selectMessege.setBounds(0, 0, 418 , 186);
		selectMessege.setAlignmentX(CENTER_ALIGNMENT);
		select.add(selectMessege);
		
		
		t1 = new Thread();
		
		tc = new House();
//		pureDeck = tc.cardSetter(); // 정상카드 덱
		pureDeck = tc.cardSetterToTest(); // 기능 테스트용 커스텀 카드 덱
		Scanner sc = new Scanner(System.in);
		
		budget = 500; // 게임 시작 예산
		
		readyCheck(5);
		readyServerCheck();
		
		
		
/*		
		loop1:while(flag) { // 게임 시작부터 종료까지 전체에 대한 루프 / loop1
		resetIndex();// 새 게임 시작전 인덱스 리셋 작업
		
		while(flag) { // 배팅금액 결정단계 루프 1-1
			playerField.invalidate();
			bet = tc.choiceBetting(budget);
			if(bet>0) { //배팅금액 선택 시 배팅금액결정루프에서 탈출
				budget -= bet; // 배팅금액 지불
			break;	
			}else if(bet==0) {
				new Lobby(temp);
				dispose();
				break loop1;
			}else {
				continue;
			}
		}
		
		monitorUpdate(budget,bet);
		
		
		System.out.println("예산 " + budget);
		System.out.println("배팅금액 " + bet);
		System.out.println("카드를 섞습니다.");
		tc.cardSuffle(pureDeck);
		
		loop2:while(flag) { // 카드 드로우 및 스플릿 확인 단계. 루프2
			boolean breakCheck=false;
			System.out.println("카드 첫 드로우단계");
			drawCardDrill(tc);
			
			breakCheck = dealerOpenCheck(tc); // 딜러 오픈카드 체크
			if(breakCheck) {
				continue loop1;
			}
			
			breakCheck = playerBlackJackCheck(tc); // 플레이어 블랙잭 체크
			if(breakCheck) {
				continue loop1;
			}
			
			splitCheck(tc); //스플릿 여부 확인
			
			
			boolean loop2Check = tc.loop2Check(playerHand); //스플릿받은 핸드들까지 카드배분완료되었는지 확인  
			if(loop2Check) {
				break loop2;
			}
		}//loop2
		
			loop3:while(flag){ // 식스 카드 찰리 확인 및 hit, stay, double down 결정단계. 루프3
			
				if(blackJack) { // 플레이어 블랙잭인경우 loop3 불필요
				break loop3;
			}
			
			burstAndSixCardCheck(tc); // 버스트 및 식스카드 찰리 확인
			
			playerHand = gameOverCheck(playerHand); // 게임종료조건 중간확인
			
			
			boolean confirm = false;
			for(boolean i : condition) {
				confirm = confirm || i; // 모든 핸드의 행동이 끝났는지 확인
			}
			if(confirm) { // 행동이 끝나지않은 핸드가 있다면 해당핸드의 행동 선택
				actionCheck(tc,sc);
			}else if(splitCnt+1==burstCnt){
				System.out.println("플레이어 패배");
				continue loop1;
			}else {
				break loop3;
			}
			}//loop3
			
				
			loop4:while(flag) { // 딜러카드 오픈 및 결과확인과 배팅금액 정산
				if(playerHand==null) {
					break loop4;
				}else {
					System.out.println();
					System.out.println("******딜러카드 오픈******");
					System.out.println();
					hiddenOpen = true;
					
				}
				
				boolean breakCheck=false;
				breakCheck = blackAndSixFinalCheck(tc); // 딜러 블랙잭 / 플레이어 블랙잭, 식스카드 체크 //////////////////
				if(breakCheck) {
					break loop4;
				}
				
				playerHand = finalCheck(playerHand, tc); // 딜러카드 추가 및 결과확인, 배팅금액 배분
				
			}//loop4
		}//loop1
		*/
}

	private void readyServerCheck() {
		SwingWorker<Void,Void> worker = new SwingWorker<Void, Void>(){

			@Override
			protected Void doInBackground() throws Exception {
				while(!flag || !flag2) {
					System.out.println("신호대기중");
					Thread.sleep(500);
				}
				System.out.println("수신완료, 배팅창 출력");
				flag=false;
				flag2=false;
				bettingCheck(30);
				return null;
			}
			
			protected void done() {
				bettingServerCheck();
			}
		};worker.execute();
		
	}

	protected void bettingServerCheck() {
		SwingWorker<Void,Void> worker = new SwingWorker<Void, Void>(){

			@Override
			protected Void doInBackground() throws Exception {
				while(!flag || !flag2) {
					System.out.println("신호대기중");
					Thread.sleep(500);
				}
				System.out.println("배팅금액 선택완료, 카드 배분");
				flag=false;
				flag2=false;
				return null;
			}
			
			protected void done() {
				tc.cardSuffle(pureDeck);
				drawCardDrill(tc);
				
				blackJackCheck();
				
				playableCheck();
				if(playable && splitCnt==0 && dealerHand.get(1).getCardNum()==1) { 
					if(playerScore[0]==21) {
						evenMoneyCheck(30);
						evenMoneyServerCheck();
					}else if(budget>bet/2){
						insureCheck(30);
						insureServerCheck();
					}
				}else if(playable){
					for(boolean i : canSplit)
						splitCheck = splitCheck || i;
					if(splitCheck && budget>bet) {
						split.setVisible(true);
					}else {
						split2.setVisible(true);
						flag = true;
					}
				splitCheckOut(30);
				splitServerCheck();
				}
			}
		};worker.execute();
	}

	protected void playableCheck() {
		playable = false;
		for(boolean i : condition) 
			playable = playable || i;
	}

	protected void blackJackCheck() {
		if(splitCnt==0 && playerScore[0]==21) { // 플레이어 블랙잭 체크, 이후 단계에 필요
			blackJack = true; // 블랙잭상태 활성화
			condition[0] = false; //블랙잭인경우 이후 행동선택 불필요. 행동 종료처리
		}
		if(blackJack && dealerHand.get(1).getCardNum()<10 && dealerHand.get(1).getCardNum() != 1) {
			/* 플레이어가 블랙잭인데 딜러 오픈카드가 10 미만이면서 ace가 아닌경우 
			 	딜러는 블랙잭일 확률이 없으므로 플레이어 즉시 승리처리 */
			System.out.println("플레이어 블랙잭!! 배팅금액의 1.5배를 지급합니다.");
			budget += (int)(bet*2.5);
			result[0] = false;
			condition[0] = false;
			signal = false;
			timer.setVisible(false);
			choicePanel.setVisible(true);
			signalOff.setVisible(true);
		}
	}

	protected void insureCheck(int i) {
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		Runnable runnable = new Runnable() {
		int j=i;
			@Override
			public void run() {
				choicePanel.setVisible(true);
				insure.setVisible(true);
				timer.setText(""+j);
				j--;
				if(j <0 || flag) {
					flag2 = true;
					choicePanel.setVisible(false);
					insure.setVisible(false);
					scheduler.shutdown();
					}
				}
			};
			scheduler.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
	}
		

	protected void evenMoneyServerCheck() {
		SwingWorker<Void,Void> worker = new SwingWorker<Void, Void>(){
			@Override
			protected Void doInBackground() throws Exception {
				while(!flag || !flag2) {
					System.out.println("신호대기중");
					Thread.sleep(500);
				}
				flag=false;
				flag2=false;
				evenMoney.setVisible(false);
				return null;
			}
			
			protected void done() {
				if(signal) {
					System.out.println("이븐머니 미선택");
					condition[0] = false;
					timer.setVisible(false);
					choicePanel.setVisible(true);
					signalOn.setVisible(true);
				}else {
					budget += bet*2;
					result[0] = false;
					timer.setVisible(false);
					choicePanel.setVisible(true);
					signalOff.setVisible(true);
					condition[0] = false;
				}
			}
		};worker.execute();
		
	}

	protected void insureServerCheck() {
		SwingWorker<Void,Void> worker = new SwingWorker<Void, Void>(){

			@Override
			protected Void doInBackground() throws Exception {
				while(!flag || !flag2) {
					System.out.println("신호대기중");
					Thread.sleep(500);
				}
				System.out.println("보험확인 완료");
				flag=false;
				flag2=false;
				return null;
			}
			
			protected void done() {
				if(playable){
					for(boolean i : canSplit)
						splitCheck = splitCheck || i;
					if(splitCheck && budget>bet) {
						split.setVisible(true);
					}else {
						split2.setVisible(true);
						flag = true;
					}
				splitCheckOut(30);
				splitServerCheck();
				}
			}
		};worker.execute();
	}


	protected void evenMoneyCheck(int i) {
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		Runnable runnable = new Runnable() {
		int j=i;
			@Override
			public void run() {
				choicePanel.setVisible(true);
				evenMoney.setVisible(true);
				timer.setText(""+j);
				j--;
				if(j <0 || flag) {
					flag2 = true;
					flag = true;
					choicePanel.setVisible(false);
					evenMoney.setVisible(false);
					scheduler.shutdown();
					}
				}
			};
			scheduler.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
	}

	protected void splitServerCheck() {
		SwingWorker<Void,Void> worker = new SwingWorker<Void, Void>(){

			@Override
			protected Void doInBackground() throws Exception {
				while(!flag || !flag2) {
					System.out.println("신호대기중");
					Thread.sleep(500);
				}
				System.out.println("스플릿확인 완료, 플레이어 행동 선택");
				flag=false;
				flag2=false;
				return null;
			}
			
			protected void done() {
				playableCheck();
				if(playable) {
				hit[splitCnt].setEnabled(true);
				stay[splitCnt].setEnabled(true);
				DD[splitCnt].setEnabled(true);
				selectCheck(60);
				selectServerCheck();
				}
				
			}
		};worker.execute();
	}

	protected void selectServerCheck() {
		SwingWorker<Void,Void> worker = new SwingWorker<Void, Void>(){

			@Override
			protected Void doInBackground() throws Exception {
				while(!flag || !flag2) {
					System.out.println("신호대기중");
					Thread.sleep(500);
				}
				System.out.println("스플릿확인 완료, 플레이어 행동 선택");
				flag=false;
				flag2=false;
				return null;
			}
			
			protected void done() {
				fResultCheck();
				if(fResult) {
					hiddenOpen=true;
					dealerField.revalidate();
					dealerField.repaint();
					dealerScoreBoard.setVisible(true);
					if(dealerScore == 21) {
						dealerBlackJackCheck();
					}else {
						dealerCardCheck(10);
					}
				}
				
			}
		};worker.execute();
	}

	protected void fResultCheck() {
		fResult = false;
		for(boolean i : result) 
			fResult = fResult || i;
	}

	protected void dealerCardCheck(int i) {
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
			Runnable runnable = new Runnable() {
			int j=i;
				@Override
				public void run() {
					if(dealerScore==21 && dealerHand.size()==2) {
						if(blackJack) {
							System.out.println("딜러와 플레이어 모두 블랙잭입니다!! Push(무승부)로 배팅금액이 반환됩니다.");
							budget += bet;
							result[0] = false;
						}else{
							if(insuranceBet>0) {
								System.out.println("딜러 블랙잭으로 인슈어런스 배팅금액의 2배가 지급됩니다.");
								budget += insuranceBet*2;
							}
							for(int i=0;i<playerHand.length;i++) {
								System.out.println("딜러 블랙잭! 플레이어 패배로 배팅금액을 잃습니다.");
								if(sixCard[i]) {
									sixCardCnt --;
									sixCard[i] = false;
								}
								if(doubleDown[i]) {
									doubleDown[i] = false;
									doubleDownCnt--;
								}
								result[i]=false;
							}
						}
					}else if(dealerScore<=16 && dealerHand.size()<6) {
						dealerHand = tc.cardDrawD(dealerHand);
					}else if(dealerScore>21 || dealerHand.size()==6){
						dealerBurst = true;
						flag = true;
					}else {
						for(int i=0 ; i<playerHand.length;i++) {
							if(dealerScore>playerScore[i]) {
								System.out.println("플레이어 패배, 배팅금액을 잃습니다.");
							}
						}
					}
					j--;
					if(j <0 || flag) {
						flag2 = true;
						flag = true;
						}
					}
				};
			scheduler.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
	}

	protected void burstCheck() {
		int a=0, b=0;
		for(int i=0 ; i<playerHand.length ;i++) {
			if(playerHand[i]!=null)
				a++;
			if(burst[i]==true) 
				b++;
			if(a==b) {
				signal = false;
				timer.setVisible(false);
				choicePanel.setVisible(true);
				signalOff.setVisible(true);
			}
		}
		
	}

	protected void selectCheck(int i) {
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		Runnable runnable = new Runnable() {
		int j=i;
			@Override
			public void run() {
				choicePanel.setVisible(true);
				select.setVisible(true);
				timer.setText(""+j);
				j--;
				if(j <0 || flag) {
					flag2 = true;
					flag = true;
					choicePanel.setVisible(false);
					select.setVisible(false);
					scheduler.shutdown();
					}
				}
			};
			scheduler.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
	}

	protected void splitCheckOut(int i) {
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		Runnable runnable = new Runnable() {
		int j=i;
			@Override
			public void run() {
				choicePanel.setVisible(true);
				timer.setText(""+j);
				j--;
				if(j <0 || flag) {
					flag2 = true;
					choicePanel.setVisible(false);
					split.setVisible(false);
					split2.setVisible(false);
					scheduler.shutdown();
					}
				}
			};
			scheduler.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
	}

	protected void bettingCheck(int i) {
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		Runnable runnable = new Runnable() {
		int j=i;
			@Override
			public void run() {
				choicePanel.setVisible(true);
				betting.setVisible(true);
				timer.setText(""+j);
				j--;
				if(j <0 || flag) {
					choicePanel.setVisible(false);
					betting.setVisible(false);
					flag2 = true;
						if(flag) {
							bet = Integer.parseInt(bettingChoice.getSelectedItem().toString());
							budget -= bet;
							monitorUpdate(budget,bet);
							System.out.println("배팅금액 선택이 완료되었습니다.");
						}else {
							flag=true;
							bet = 10;
							budget -= bet;
							monitorUpdate(budget,bet);
							System.out.println("배팅금액을 선택하지않으셔서 최소배팅금액으로 선택되었습니다.");
						}
						scheduler.shutdown();
					}
				}
			};
			scheduler.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
		
	}

	private void keepGo() {
		SwingWorker<Void, String> worker = new SwingWorker<Void, String>(){
			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("메소드 진입");
				while(!flag || !flag2) {
					System.out.println("응답 대기중");
					Thread.sleep(500);
				}
				System.out.println("응답 성공!!!");
				return null;
			}
			
		};
		worker.execute();
	}
	

private void readyCheck(int i) throws InterruptedException {
	ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		Runnable runnable = new Runnable() {
		int j=i;
			@Override
			public void run() {
				choicePanel.setVisible(true);
				ready.setVisible(true);
				timer.setText(""+j);
				j--;
				if(j <0) {
					choicePanel.setVisible(false);
					ready.setVisible(false);
					flag2 = true;
						if(flag) {
							signal = true;
							System.out.println("게임 시작");
							resetIndex();// 새 게임 시작전 인덱스 리셋 작업
						}else {
							System.out.println("레디 안해서 강퇴!");
							dispose();
						}
						scheduler.shutdown();
					}
				}
			};
			scheduler.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
	}



////======================================이하 메소드	부분 ==========================================================


private void monitorUpdate(int budget, int bet) {
		for(int i=0 ; i<playMonitor.length;i++) {
			if(playMonitor[i]!=null) {
				playMonitor[i].setText("<html>"+
				"현재예산 : " + budget + "만원<br>"+
				"배팅금액 : " + (bet+(doubleDown[i] ? bet/2 : 0)) + "만원<br>" +
				"</html>");
				System.out.println("명령실행 확인");
				playMonitor[i].revalidate();
				playMonitor[i].repaint();
			}
		}
	}

	
	private ArrayList<House>[] finalCheck(ArrayList<House>[] playerHand, House tc) {
		int betCnt=0;
		boolean confirm=false;
		boolean nullCheck=false;
		for(ArrayList<House> i : playerHand) {
			if(i!=null) {
			confirm = confirm || true; // 
			}
		}
		if(confirm) {
			if(dealerScore <= 16 && dealerHand.size()<=5) {
				System.out.println();
				System.out.println("딜러 카드 추가");
				System.out.println();
				dealerHand = tc.cardDrawD(dealerHand);
				dealerScore = tc.scoreCnt(dealerHand);
				tc.dealerAddCard(dealerHand);
			}else if(dealerScore > 21 || dealerHand.size() > 5) {
				//필드상태 출력///////////////////////////////////////////////
				System.out.println();
				System.out.println("***** 최종결과 확인 *****");
				System.out.println();
				tc.dispField(playerHand,dealerHand,playerScore,
						budget,startBudget,insuranceBet,true);
				////////////////////////////////////////////////////////////
				if(dealerScore >21) {
					System.out.println("딜러 버스트로 버스트된 핸드를 제외한 나머지 핸드의 배팅금액만큼의 수당을 지급합니다.");
				}else if(dealerHand.size()>5) {
					System.out.println("딜러카드 5장 초과로 버스트된 핸드를 제외한 나머지 핸드의 배팅금액만큼의 수당을 지급합니다.");
				}
				betCnt = (splitCnt+1)+(doubleDownCnt)-burstCnt;
				budget += (bet*(betCnt*2));
				System.out.println("최종 획득 금액 : "+bet*betCnt);
				nullCheck=true;
			}else if(dealerScore>=17 && dealerHand.size()<=5) {
				//필드상태 출력///////////////////////////////////////////////
				System.out.println();
				System.out.println("***** 최종결과 확인 *****");
				System.out.println();
				tc.dispField(playerHand,dealerHand,playerScore,
						budget,startBudget,insuranceBet,true);
				////////////////////////////////////////////////////////////
				// 최종 결과비교
				betCnt = tc.scoreComparing(playerHand,playerScore,dealerScore,doubleDown);
				budget += bet*(betCnt);
				System.out.println("최종 획득 금액 : "+(bet*betCnt-bet*(splitCnt+1+doubleDownCnt)));
				nullCheck=true;
			}
		}else {
			nullCheck=true;
		}
		if(nullCheck) {
			return null;
		}else {
			return playerHand;
		}
	}

	private boolean blackAndSixFinalCheck(House tc) {
		boolean breakCheck=false;
		if(dealerScore == 21 && dealerHand.size()==2) {
			//필드상태 출력///////////////////////////////////////////////
			tc.dispField(playerHand,dealerHand,playerScore,
					budget,startBudget,insuranceBet,true);
			////////////////////////////////////////////////////////////
			for(int i=0;i<sixCard.length;i++) {
				if(sixCard[i]==true) {
					System.out.println("딜러 블랙잭! 플레이어 패배로 배팅금액을 잃습니다.");
					if(doubleDown[i]) {
						doubleDown[i] = false;
						doubleDownCnt--;
					}
					sixCardCnt --;
					sixCard[i] = false;
					playerHand[i]=null;
				}
			}
			if(blackJack) {
				System.out.println("딜러와 플레이어 모두 블랙잭입니다!! Push(무승부)로 배팅금액이 반환됩니다.");
				budget += bet;
			}else{
				System.out.println("딜러 블랙잭! 플레이어 패배로 배팅금액을 잃습니다.");
			}
			breakCheck=true;
		}else if(blackJack || sixCardCnt>0) {
			//필드상태 출력///////////////////////////////////////////////
			tc.dispField(playerHand,dealerHand,playerScore,
					budget,startBudget,insuranceBet,true);
			////////////////////////////////////////////////////////////

			if(blackJack) {
				System.out.println("플레이어 블랙잭!! 배팅금액의 1.5배를 지급합니다.");
				budget += (int)(bet*2.5);
				breakCheck=true;
			}
			for(int i=0;i<sixCard.length;i++) {
				if(sixCard[i]==true) {
					System.out.println("플레이어의 "+(i+1)+"번 핸드 식스카드찰리로 승리!! 배팅금액만큼의 수당을 지급합니다.");
					if(doubleDown[i]) {
						budget += bet*4;
						doubleDown[i] = false;
						doubleDownCnt--;
						System.out.println("최종 획득 금액 : "+(bet*2));
					}else {
					budget += bet*2;
					System.out.println("최종 획득 금액 : "+bet);
					}
					sixCardCnt --;
					sixCard[i] = false;
					playerHand[i]=null;
				}
			}
		}//////////////////////////////////////////////
		return breakCheck;
	}

	private void actionCheck(House tc, Scanner sc) {
		for(int i=0;i<playerHand.length;i++) {
			if(condition[i] == true && playerHand[i]!=null) {
				turn[i]=true;
				System.out.println(i+1+"번 핸드의 행동을 선택해주세요\n1.Hit\n2.Stay\n3.Double down");
				int check2 = sc.nextInt();
				
				switch(check2) {
				case 1:
					playerHand[i] = tc.cardDrawP(playerHand[i]);
					playerScore[i] = tc.scoreCnt(playerHand[i]);
					turn[i]=false;
					break;
				case 2:
					condition[i] = false;
					turn[i]=false;
					break;
				case 3:
					playerHand[i] = tc.cardDrawP(playerHand[i]);
					playerScore[i] = tc.scoreCnt(playerHand[i]);
					doubleDown[i] = true;
					doubleDownCnt ++;
					budget -= bet;
					turn[i]=false;
					break;
				}
			}
			}
	}

	private ArrayList<House>[] gameOverCheck(ArrayList<House>[] playerHand) {
		boolean confirm2=false;
		for(ArrayList<House> i : playerHand) {
			if(i!=null) {
			confirm2 = confirm2 || true; // 
			}
		}
		if(!confirm2) {
			return null;
		}else {
		return playerHand;
		}
	}

	private void burstAndSixCardCheck(House tc) {
		for(int i=0;i<playerHand.length;i++) {
			if(condition[i] == true && playerHand[i]!=null) {
				sixCard[i] = playerHand[i].size()==6 ? true : false;
				burst[i] = playerScore[i]>=22 ? true : false;
			if(burst[i]) {
				burstCnt++;
				playerHand[i]=null; 
				System.out.println(i+1+"번 핸드가 Burst로 배팅금액을 잃었습니다. ");
			}
			if(sixCard[i]) {
				sixCardCnt ++;
				if(dealerHand.get(1).getCardNum()<10 && dealerHand.get(1).getCardNum()!=1) {
					System.out.println("플레이어의 "+(i+1)+"번 핸드 식스카드찰리로 승리!! 배팅금액만큼의 수당을 지급합니다.");
					if(doubleDown[i]) {
						budget += bet*4;
						doubleDownCnt--;
						System.out.println("최종 획득 금액 : "+(bet*2));
					}else {
					budget += bet*2;
					System.out.println("최종 획득 금액 : "+bet);
					}
					sixCardCnt --;
					sixCard[i] = false;
					condition[i] = false;
					playerHand[i]=null;
				}
			}
			}
			if(burst[i] || sixCard[i] || playerScore[i]==21 || doubleDown[i]) {
				// 핸드의 행동종료 체크
				condition[i] = false;
			}
		}
		
	}

	private void splitCheck(int k) {
				
				if(playerHand[k].get(0).getCardNum()==1) {
					aceSplit=true;
				}
				splitCnt++;
				budget-= bet;
				playerHand[splitCnt] = new ArrayList<House>(); 
				setPlayerPanels(splitCnt);
				condition[splitCnt] = true;
				result[splitCnt] = true;
				playerHand[splitCnt].add(playerHand[k].get(1));
				playerHand[k].remove(1);
				playerHand[k] = tc.cardDrawP(playerHand[k]);
				playerHand[splitCnt] = tc.cardDrawP(playerHand[splitCnt]);
				canSplit[k] = tc.splitLogic(playerHand[k]); 
				playerScore[k] = tc.scoreCnt(playerHand[k]); 
				canSplit[splitCnt] = tc.splitLogic(playerHand[splitCnt]); 
				playerScore[splitCnt] = tc.scoreCnt(playerHand[splitCnt]); 
				
				for(boolean i : canSplit)
					splitCheck = splitCheck || i;
				if(splitCheck && budget>bet && splitCnt<3 && !aceSplit) {
					split.revalidate();
					split.repaint();
				}else {
					split.setVisible(false);
					split2.setVisible(true);
					flag = true;
				}
		
	}

	private boolean playerBlackJackCheck(House tc) {
		boolean continueCheck=false;
		if(splitCnt==0 && playerScore[0]==21) { // 플레이어 블랙잭 체크, 이후 단계에 필요
			blackJack = true; // 블랙잭상태 활성화
			condition[0] = false; //블랙잭인경우 이후 행동선택 불필요. 행동 종료처리
		}
		if(blackJack && dealerHand.get(1).getCardNum()<10 && dealerHand.get(1).getCardNum() != 1) {
			/* 플레이어가 블랙잭인데 딜러 오픈카드가 10 미만이면서 ace가 아닌경우 
			 	딜러는 블랙잭일 확률이 없으므로 플레이어 즉시 승리처리 */
			System.out.println("플레이어 블랙잭!! 배팅금액의 1.5배를 지급합니다.");
			budget += (int)(bet*2.5);
			continueCheck=true;
		}
		return continueCheck;
	}

	private boolean dealerOpenCheck(House tc) {
		boolean continueCheck=false;
		// 딜러 오픈카드 Ace인경우 플레이어 블랙잭 여부에따라 이븐머니, 인슈어런스 체크 
		if(splitCnt==0 && dealerHand.get(1).getCardNum()==1) { 
				if(playerScore[0]==21) {
					int res = tc.evenMoneyCheck(bet,dealerScore);
					budget += res;
					playerHand[0] = null;
					condition[0] = false;
					continueCheck=true;
				}else if(budget>bet/2){
					int res = tc.insuranceCheck(bet,dealerScore);
					if(res==0) {
						playerHand[0] = null;
						condition[0] = false;
						continueCheck=true;
					}else {
						insuranceBet = (res>0) ? bet/2 : 0;
						budget -= (res>0) ? res : 0; 
					}
				}
		}///////////////////////////////////////////////////////////////
		return continueCheck;
	}

	private void addCard(House tc) {
		for(int i=0;i<playerHand.length;i++) { // 플레이어 카드 배분, 스플릿핸드가 있을경우 스플릿핸드포함
			if(playerHand[i]!=null && playerHand[i].size()<2) {
			playerHand[i] = tc.cardDrawP(playerHand[i]);
			playerScore[i] = tc.scoreCnt(playerHand[i]); // 플레이어 핸드별 스코어 계산
			canSplit[i] = tc.splitLogic(playerHand[i]); // 스플릿 가능여부 체크
			}
		}
		if(dealerHand.size()<2) { // 딜러카드 배분
		dealerHand = tc.cardDrawD(dealerHand);
		dealerScore = tc.scoreCnt(dealerHand); 
		// 딜러 스코어 계산 (카드 1장은 비공개이기때문에 점수공개 X)
		}
	}
	
	private void drawCardDrill(House tc) {
			if(playerHand[0]!=null) {
			playerHand[0] = tc.cardDrawP(playerHand[0]);
			dealerHand = tc.cardDrawD(dealerHand);
			playerHand[0] = tc.cardDrawP(playerHand[0]);
			dealerHand = tc.cardDrawD(dealerHand);
			}
			canSplit[0] = tc.splitLogic(playerHand[0]); // 스플릿 가능여부 체크
			playerScore[0] = tc.scoreCnt(playerHand[0]); // 플레이어 핸드별 스코어 계산
			dealerScore = tc.scoreCnt(dealerHand); 
			// 딜러 스코어 계산 (카드 1장은 비공개이기때문에 점수공개 X)
	}

	private void resetIndex() {
		dealerField.revalidate();
		dealerField.repaint();
		playerField.revalidate();
		playerField.repaint();
		playerHand = new ArrayList [4]; // 플레이어핸드 배열 리셋
		for(int i=0;i<playerHand.length;i++) { // 플레이어 핸드 리셋
			playerHand[i]=null;
		}
		playerFieldPanel = new Panel [4]; 	// 플레이어 필드 패널 리셋
		for(int i=0;i<playerFieldPanel.length;i++)  {
			if(playerFieldPanel[i]!=null) {
				playerFieldPanel[i] = null;
				playerFieldPanel[i].revalidate();
				playerFieldPanel[i].repaint();
			}
		}
		playerCardPanel = new Panel [4];	// 플레이어 카드 패널 리셋
		for(int i=0;i<playerCardPanel.length;i++)  {
			if(playerCardPanel[i]!=null) {
				playerCardPanel[i]=null;
				playerCardPanel[i].revalidate();
				playerCardPanel[i].repaint();
			}
		}
		playerScorePanel = new Panel [4];	// 플레이어 점수 패널 리셋
		for(int i=0;i<playerScorePanel.length;i++) {  
			if(playerScorePanel[i]!=null) {
				playerScorePanel[i]=null;
				playerScorePanel[i].revalidate();
				playerScorePanel[i].repaint();
			}
		}
		playMonitor = new JLabel [4];
		for(int i=0;i<playMonitor.length;i++)  {
			if(playMonitor[i]!=null) {
				playMonitor[i]=null;
				playMonitor[i].revalidate();
				playMonitor[i].repaint();
			}
		}
		playerbuttonPanel = new Panel [4];	// 플레이어 버튼 패널 리셋
		hit = new JButton [4]; 	// 플레이어 버튼 리셋
		stay = new JButton [4]; // 플레이어 버튼 리셋
		DD = new JButton [4]; 	// 플레이어 버튼 리셋
		dealerHand = null; // 딜러 핸드 리셋
		result = new boolean [4]; // 결과확인 리셋
		turn = new boolean [4]; // 턴 카운터 리셋
		canSplit = new boolean [4]; // 핸드별 스플릿 가능여부 체크 리셋
		playerScore = new int [4]; // 플레이어 핸드별 점수 리셋
		burst = new boolean [4]; // 핸드별 버스트 체크 리셋
		sixCard = new boolean [4]; // 식스카드찰리 체크 리셋
		doubleDown = new boolean [4]; // 더블다운 체크 리셋
		condition = new boolean [4]; // 행동가능여부 체크 리셋
		aceSplit = false; // 에이스 스플릿 체크 리셋
		blackJack = false; // 블랙잭 체크 리셋
		doubleDownCnt = 0; // 총 더블다운 카운트 리셋
		sixCardCnt = 0; // 총 식스카드찰리 카운트 리셋
		splitCnt = 0; // 총 스플릿핸드 카운트 리셋
		burstCnt = 0; // 총 버스트핸드 카운트 리셋
		bet=0; // 게임시작 시 배팅금액 리셋
		insuranceBet=0; // 총 보험금 배팅금액 리셋
		startBudget = budget; // 게임시작 전 예산 금액 리셋
		playerHand[splitCnt] = new ArrayList<House>(); // 새 플레이어 핸드 생성
		setPlayerPanels(splitCnt);
		condition[splitCnt] = true; // 새 플레이어핸드의 행동가능여부 활성화
		result[splitCnt] = true; // 새 플레이어핸드의 결과확인여부 활성화
		dealerHand = new ArrayList<House>(); // 새 딜러 핸드 생성
		hiddenOpen = false;
	}

	private void setPlayerPanels(int splitCnt) {

		
		playerFieldPanel[splitCnt] = new Panel();
		playerFieldPanel[splitCnt].setSize(300,300);
		playerFieldPanel[splitCnt].setLayout(null);
		playerField.add(playerFieldPanel[splitCnt]);
		
		playerCardPanel[splitCnt] = new Panel();
		playerCardPanel[splitCnt].setBounds(0,0,300,200);
		playerCardPanel[splitCnt].setLayout(null);
		playerFieldPanel[splitCnt].add(playerCardPanel[splitCnt]);
		
		playerbuttonPanel[splitCnt] = new Panel();
		playerbuttonPanel[splitCnt].setBounds(0,200,300,100);
		playerbuttonPanel[splitCnt].setLayout(null);
		playerFieldPanel[splitCnt].add(playerbuttonPanel[splitCnt]);
		
		playerScorePanel[splitCnt] = new Panel();
		playerScorePanel[splitCnt].setBounds(100,5,200,30);
		playerScorePanel[splitCnt].setLayout(null);
		playerbuttonPanel[splitCnt].add(playerScorePanel[splitCnt]);
		
		
		hit[splitCnt] = new JButton("Hit");
		hit[splitCnt].setFont(new Font("굴림", Font.PLAIN, 15));
		hit[splitCnt].setBackground(Color.LIGHT_GRAY);
		hit[splitCnt].setHorizontalAlignment(SwingConstants.CENTER);
		hit[splitCnt].setBounds(5,5,90,25);
		hit[splitCnt].setEnabled(false);
		playerbuttonPanel[splitCnt].add(hit[splitCnt]);
		hit[splitCnt].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				playerHand[splitCnt] = tc.cardDrawP(playerHand[splitCnt]);
				playerScore[splitCnt] = tc.scoreCnt(playerHand[splitCnt]);
				if(playerScore[splitCnt]>21) {
					System.out.println("플레이어 버스트로 패배, 배팅금액을 잃습니다.");
					burst[splitCnt] = true;
					result[splitCnt] = false;
				}else if(playerHand[splitCnt].size()==6) {
					System.out.println("식스카드 찰리!");
					sixCard[splitCnt] = true;
					sixCardCnt++;
				}
				if(burst[splitCnt] || sixCard[splitCnt] || playerScore[splitCnt]==21 || doubleDown[splitCnt]) {
					if(sixCard[splitCnt] && dealerHand.get(1).getCardNum()<10 && dealerHand.get(1).getCardNum()!=1) {
						System.out.println("식스카드 찰리로 "+(splitCnt+1)+"번 핸드 승리, 배팅금액만큼의 수당이 지급됩니다.");
						budget += bet*2;
						sixCard[splitCnt] = false;
						sixCardCnt--;
						turn[splitCnt] = false;
					}
				System.out.println("더이상 할 수 있는 행동이 없어 결과를 기다립니다.");
				condition[splitCnt] = false;
				hit[splitCnt].setEnabled(false);
				stay[splitCnt].setEnabled(false);
				DD[splitCnt].setEnabled(false);
					playableCheck();
					if(playable) {
						flag=true;
					}
				}
				playerFieldPanel[splitCnt].revalidate();
				playerFieldPanel[splitCnt].repaint();
			}
		});
		 
		stay[splitCnt] = new JButton("Stay");
		stay[splitCnt].setFont(new Font("굴림", Font.PLAIN, 15));
		stay[splitCnt].setBackground(Color.LIGHT_GRAY);
		stay[splitCnt].setHorizontalAlignment(SwingConstants.CENTER);
		stay[splitCnt].setBounds(5,35,90,25);
		stay[splitCnt].setEnabled(false);
		playerbuttonPanel[splitCnt].add(stay[splitCnt]);
		stay[splitCnt].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				condition[splitCnt] = false;
				hit[splitCnt].setEnabled(false);
				stay[splitCnt].setEnabled(false);
				DD[splitCnt].setEnabled(false);
				playableCheck();
				if(playable) {
					flag=true;
				}
				playerFieldPanel[splitCnt].revalidate();
				playerFieldPanel[splitCnt].repaint();
			}
		});
		
		DD[splitCnt] = new JButton("Double Down");
		DD[splitCnt].setFont(new Font("굴림", Font.PLAIN, 15));
		DD[splitCnt].setBackground(Color.LIGHT_GRAY);
		DD[splitCnt].setHorizontalAlignment(SwingConstants.CENTER);
		DD[splitCnt].setBounds(5,65,90,25);
		DD[splitCnt].setEnabled(false);
		playerbuttonPanel[splitCnt].add(DD[splitCnt]);
		DD[splitCnt].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				doubleDown[splitCnt] = true;
				doubleDownCnt++;
				budget -= bet;
				playerHand[splitCnt] = tc.cardDrawP(playerHand[splitCnt]);
				playerScore[splitCnt] = tc.scoreCnt(playerHand[splitCnt]);
				if(playerScore[splitCnt]>21) {
					System.out.println("플레이어 버스트로 패배, 배팅금액을 잃습니다.");
					burst[splitCnt] = true;
					result[splitCnt] = false;
				}else if(playerHand[splitCnt].size()==6) {
					System.out.println("식스카드 찰리!");
					sixCard[splitCnt] = true;
					sixCardCnt++;
				}
				if(burst[splitCnt] || sixCard[splitCnt] || playerScore[splitCnt]==21 || doubleDown[splitCnt]) {
					if(sixCard[splitCnt] && dealerHand.get(1).getCardNum()<10 && dealerHand.get(1).getCardNum()!=1) {
						System.out.println("식스카드 찰리로 "+(splitCnt+1)+"번 핸드 승리, 배팅금액만큼의 수당이 지급됩니다.");
						budget += bet*4;
						doubleDown[splitCnt] = false;
						doubleDownCnt--;
						sixCard[splitCnt] = false;
						sixCardCnt--;
						turn[splitCnt] = false;
					}
				System.out.println("더이상 할 수 있는 행동이 없어 결과를 기다립니다.");
				condition[splitCnt] = false;
				hit[splitCnt].setEnabled(false);
				stay[splitCnt].setEnabled(false);
				DD[splitCnt].setEnabled(false);
					playableCheck();
					if(playable) {
						flag=true;
					}
				}
				playerFieldPanel[splitCnt].revalidate();
				playerFieldPanel[splitCnt].repaint();
			}
		});
		
		playMonitor[splitCnt] = new JLabel();
		playMonitor[splitCnt].setFont(new Font("굴림", Font.BOLD, 20));
		playMonitor[splitCnt].setHorizontalAlignment(SwingConstants.LEFT);
		playMonitor[splitCnt].setBounds(100, 40, 200, 55);
		playerbuttonPanel[splitCnt].add(playMonitor[splitCnt]);
	}


}
