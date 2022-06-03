package data;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashMap;
public class toss implements Serializable{
	private String code="";
	LocalDateTime now;
    private String note="";
    private int intnote=0;
    private String id="";
    private String pw="";
	private String[][] roomInfo = new String[5][10];
	private HashMap<Integer, Integer> roomMap = new HashMap<Integer, Integer>();

	
	// connsetting set.
	private String svIP = "127.0.0.1";
	private String svPT = "9999";
	private String dbIP = "shared00.iptime.org";
	private String dbPT = "32779";
	private String dbSID ="";
	private String dbSNAME = "XEPDB1";
	private String dbID = "blackjack";
	private String dbPW = "test1234";
	 
	
	
	


	//생성자, return type이 없습니다.
	 public toss(
			 String code, LocalDateTime now, String note, int intnote, String id, String pw, String[][] roomInfo, HashMap<Integer, Integer> roomMap,
			 String svIP, String svPT, String dbIP, String dbPT, String dbSID, String dbSNAME, String dbID, String dbPW
    		){
    	this.code = code;
    	this.now = now;
        this.note = note;
        this.intnote= intnote;
        this.id = id;
        this.pw = pw;
        this.roomInfo = roomInfo;
        this.roomMap = roomMap;
        
        this.svIP = svIP;        
        this.svPT = svPT;
        this.dbIP = dbIP;
        this.dbPT = dbPT;
        this.dbSID = dbSID;
        this.dbSNAME = dbSNAME;
       this.dbID = dbID;
        this.dbPW = dbPW;
        
    }
   
	public toss() {
	}


	// 가지고 있는 인스턴스 변수의 값을 출력
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(code);
        sb.append("/");
        sb.append(now);
        sb.append("/");
        sb.append(note);
        sb.append("/");
       
        return sb.toString();
    }

    

    
	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getSvIP() {
		return svIP;
	}

	public void setSvIP(String svIP) {
		this.svIP = svIP;
	}

	public String getSvPT() {
		return svPT;
	}

	public void setSvPT(String svPT) {
		this.svPT = svPT;
	}

	public String getDbIP() {
		return dbIP;
	}

	public void setDbIP(String dbIP) {
		this.dbIP = dbIP;
	}

	public String getDbPT() {
		return dbPT;
	}

	public void setDbPT(String dbPT) {
		this.dbPT = dbPT;
	}

	public String getDbSID() {
		return dbSID;
	}

	public void setDbSID(String dbSID) {
		this.dbSID = dbSID;
	}

	public String getDbSNAME() {
		return dbSNAME;
	}
	public void setDbSNAME(String dbSNAME) {
		this.dbSNAME = dbSNAME;
	}

	public String getDbID() {
		return dbID;
	}

	public void setDbID(String dbID) {
	this.dbID = dbID;
	}

	public String getDbPW() {
		return dbPW;
	}

	public void setDbPW(String dbPW) {
		this.dbPW = dbPW;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	public int getIntnote() {
		return intnote;
	}

	public void setIntnote(int intnote) {
		this.intnote = intnote;
	}
	
	public HashMap<Integer, Integer> getRoomMap_all() {
		return roomMap;
	}

	public void setRoomMap_all(HashMap<Integer, Integer> RoomMap) {
		this.roomMap = RoomMap;
	}

	public String[][] getRoomInfo_all() {
		return roomInfo;
	}

	public void setRoomInfo_all(String[][] roomInfo) {
		this.roomInfo = roomInfo;
	}

	public String getRoomInfo(int i, int j) {
		return roomInfo[i][j];
	}


	public void setRoomInfo(int i, int j, String s) {
		this.roomInfo[i][j] = s;
	}


	public int getRoomMap(int i) {
		return roomMap.get(i);
	}


	public void setRoomMap(int i, int j) {
		this.roomMap.put(i, j);
	}
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
    
    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
    
	public LocalDateTime getNow() {
		return now;
	}

	public void setNow(LocalDateTime now) {
		this.now = now;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}