package telinfoVO;

import java.util.Date; //자바쪽은 util, sql족은 java.sql.date
/*create table TelTable5 (
id  number(5),
name  varchar2(20),
tel   varchar2(20),
d   date
);*/

//src-마오-class - 페키지명은 telinfoVO, class명은 TelInfoVO
										//main x
public class TelInfoVO { //TelInfoVO.java
private int sc_id; 		
private Date sc_date;	
private int start_time ;
private int finish_time;

//generating으로 만든 인자가 있는 생성자---------------------
// 마오-Source - generate constructor using field
public TelInfoVO(int sc_id, Date sc_date, int start_time, int finish_time) {
//super();
this.sc_id = sc_id;
this.sc_date = sc_date;
this.start_time = start_time;
this.finish_time = finish_time;
}

public TelInfoVO() {} //디폴트 생성자

public int getSc_id() {
	return sc_id;
}

public void setSc_id(int sc_id) {
	this.sc_id = sc_id;
}

public Date getSc_date() {
	return sc_date;
}

public void setSc_date(Date sc_date) {
	this.sc_date = sc_date;
}

public int getStart_time() {
	return start_time;
}

public void setStart_time(int start_time) {
	this.start_time = start_time;
}

public int getFinish_time() {
	return finish_time;
}

public void setFinish_time(int finish_time) {
	this.finish_time = finish_time;
}


//getter,setter

}
