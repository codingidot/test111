package telinfoVO;

import java.util.Date;//�ڹ����� util

public class TelInfoVO {  //���� TelInfoVO.java
	
	//�ʵ�
	private int id; 	  //number(5)
	private String name;  //varchar2(20)
	private String tel;   //varchar2(20)
	private Date d;       //date
	
	//generating���� ���� ���ڰ� �ִ� ������  -------source>generate ..using field
	public TelInfoVO(int id, String name, String tel, Date d) {
		//super();
		this.id=id;
		this.name=name;
		this.tel=tel;
		this.d=d;
	}
	
	public TelInfoVO() {} //����Ʈ ������
	
	//getter, setter -----------source>generate getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
}