package main;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

//import com.ibm.icu.util.Calendar;

import data.House;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.awt.GridLayout;
import java.awt.Label;

public class Hall2backup extends JFrame implements Runnable{
	
	private JPanel contentPane;
	JPanel dealerField;
	JPanel playerField;
	private ArrayList<House> dealerHand;
	private int dealerScore;
	
	private int budget;
	private int startBudget;
	private int bet=0;
	private int insuranceBet=0;
	private int splitCnt;
	
	private ArrayList<House> [] playerHand;
	private Panel [] playerFieldPanel;
	private Panel [] playerCardPanel;
	private Panel [] playerScorePanel;
	private Panel [] playerbuttonPanel;
	
	private JLabel timer;
	private JLabel [] playMonitor;
	private JButton [] hit;
	private JButton [] stay;
	private JButton [] DD;
	private int [] playerScore;
	
	private int sixCardCnt;
	private boolean [] canSplit;
	private boolean aceSplit;
	private boolean blackJack;
	private boolean [] sixCard;
	
	private boolean [] doubleDown;
	private boolean [] burst;
	private boolean [] condition;
	private boolean [] turn;
	private int burstCnt;
	
	private int doubleDownCnt;
	FlowLayout flowForm;
	private boolean hiddenOpen;
	
	
	boolean flag=true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}
	
	public Hall2backup() {
		int temp=0;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hall2backup frame = new Hall2backup(temp);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Hall2backup(int temp) throws InterruptedException {
		setBounds(100, 100, 1300, 730); // 1284 686
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 150, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		flowForm = new FlowLayout(FlowLayout.CENTER, 5, 5);
		flowForm.setAlignOnBaseline(true);
		
		
		House tc = new House();
//		ArrayList<House> pureDeck = tc.cardSetter(); // 정상카드 덱
		ArrayList<House> pureDeck = tc.cardSetterToTest(); // 기능 테스트용 커스텀 카드 덱
		Scanner sc = new Scanner(System.in);
		
		String time = getCurrentTime();
		
		Thread t1 = new Thread();
		JLabel timer = new JLabel(time);
		timer.setFont(new Font("굴림", Font.BOLD, 20));
		timer.setHorizontalAlignment(SwingConstants.LEFT);
		timer.setBounds(617, 336, 50, 50);
		contentPane.add(timer);
		
		t1.start();
		
		
		budget = 500; // 게임 시작 예산
		
		
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
		
		Thread.sleep(500);
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
	}
	
////======================================이하 메소드	부분 ==========================================================
private String getCurrentTime() {
		Calendar c = Calendar.getInstance();
		int sec = c.get(Calendar.SECOND);
	return ""+sec;
	}


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
		//필드상태 출력///////////////////////////////////////////////
		tc.dispField(playerHand,dealerHand,playerScore,
				budget,startBudget,insuranceBet,false);
		////////////////////////////////////////////////////////////
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

	private void splitCheck(House tc) {
		for(int i=0;i<playerHand.length;i++) {
			if(canSplit[i] && budget>bet && splitCnt<3 && !aceSplit) {
				
				//필드상태 출력///////////////////////////////////////////////
				tc.dispIndexField(i,playerHand[i],dealerHand,playerScore[i],
						budget,bet,startBudget,insuranceBet,false);
				////////////////////////////////////////////////////////////
				
				int answer = JOptionPane.showConfirmDialog(null , 
					(i+1)+"번째 핸드를 스플릿 하시겠습니까?","스플릿찬스",JOptionPane.YES_NO_OPTION);
				if(answer==0) {
					if(playerHand[i].get(0).getCardNum()==1) {
						aceSplit=true;
					}
					splitCnt++;
					budget-= bet;
					playerHand[splitCnt] = new ArrayList<House>(); 
					setPlayerPanels(splitCnt);
					condition[splitCnt] = true;
					playerHand[splitCnt].add(playerHand[i].get(1));
					playerHand[i].remove(1);
				}
			}
		}
		
	}

	private boolean playerBlackJackCheck(House tc) {
		boolean continueCheck=false;
		if(splitCnt==0 && playerScore[0]==21) { // 플레이어 블랙잭 체크, 이후 단계에 필요
			//필드상태 출력///////////////////////////////////////////////
			for(int i=0;i<playerHand.length;i++) 
				if(condition[i] == true && playerHand[i]!=null) 
					tc.dispIndexField(i,playerHand[i],dealerHand,playerScore[i],
						budget,bet,startBudget,insuranceBet,false);
			////////////////////////////////////////////////////////////
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
			//필드상태 출력================================================
			for(int i=0;i<playerHand.length;i++) 
				if(condition[i] == true && playerHand[i]!=null) 
					tc.dispIndexField(i,playerHand[i],dealerHand,playerScore[i],
							budget,bet,startBudget,insuranceBet,false);
			//==========================================================
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
		if(dealerField!=null) {
		dealerField.revalidate();
		dealerField.repaint();
		playerField.revalidate();
		playerField.repaint();
		}
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
		dealerHand = new ArrayList<House>(); // 새 딜러 핸드 생성
		hiddenOpen = false;
	}

	private void setPlayerPanels(int splitCnt) {
		dealerField = new JPanel();
		dealerField.setBounds(0, 0, 1284, 230);
		dealerField.setLayout(flowForm);
		dealerField.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(dealerField);
		
		playerField = new JPanel();
		playerField.setBounds(0, 386, 1284, 300);
		playerField.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(playerField);
		playerField.setLayout(flowForm);
		
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
		if(turn[splitCnt]) {
			hit[splitCnt].setEnabled(true);
		}else {
			hit[splitCnt].setEnabled(true);
		}
		playerbuttonPanel[splitCnt].add(hit[splitCnt]);
		 
		stay[splitCnt] = new JButton("Stay");
		stay[splitCnt].setFont(new Font("굴림", Font.PLAIN, 15));
		stay[splitCnt].setBackground(Color.LIGHT_GRAY);
		stay[splitCnt].setHorizontalAlignment(SwingConstants.CENTER);
		stay[splitCnt].setBounds(5,35,90,25);
		if(turn[splitCnt]) {
			stay[splitCnt].setEnabled(true);
		}else {
			stay[splitCnt].setEnabled(true);
		}
		playerbuttonPanel[splitCnt].add(stay[splitCnt]);
		
		DD[splitCnt] = new JButton("Double Down");
		DD[splitCnt].setFont(new Font("굴림", Font.PLAIN, 15));
		DD[splitCnt].setBackground(Color.LIGHT_GRAY);
		DD[splitCnt].setHorizontalAlignment(SwingConstants.CENTER);
		DD[splitCnt].setBounds(5,65,90,25);
		if(turn[splitCnt]) {
			DD[splitCnt].setEnabled(true);
		}else {
			DD[splitCnt].setEnabled(true);
		}
		playerbuttonPanel[splitCnt].add(DD[splitCnt]);
		
		playMonitor[splitCnt] = new JLabel();
		playMonitor[splitCnt].setFont(new Font("굴림", Font.BOLD, 20));
		playMonitor[splitCnt].setHorizontalAlignment(SwingConstants.LEFT);
		playMonitor[splitCnt].setBounds(100, 40, 200, 55);
		playerbuttonPanel[splitCnt].add(playMonitor[splitCnt]);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			String time = getCurrentTime();
			timer.setText(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
