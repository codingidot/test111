package telinfoVO;

import java.util.Date; //�ڹ����� util, sql���� java.sql.date
/*create table TelTable5 (
id  number(5),
name  varchar2(20),
tel   varchar2(20),
d   date
);*/

//src-����-class - ��Ű������ telinfoVO, class���� TelInfoVO
										//main x
public class TelInfoVO { //TelInfoVO.java
private int sc_id; 		
private Date sc_date;	
private int start_time ;
private int finish_time;

//generating���� ���� ���ڰ� �ִ� ������---------------------
// ����-Source - generate constructor using field
public TelInfoVO(int sc_id, Date sc_date, int start_time, int finish_time) {
//super();
this.sc_id = sc_id;
this.sc_date = sc_date;
this.start_time = start_time;
this.finish_time = finish_time;
}

public TelInfoVO() {} //����Ʈ ������

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
