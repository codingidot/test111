package fourteen;

public class First {

	//#### db ����
	//- ���� db(hierarchical) (hdbms) : tree ����(���ϰ� ���� ������), ���� �˻�, ��ȭ�� �ִ� ��� ������ ����
	//                                ���谡 ������ ��� x, ū �Ը�db x
	
	//- network db(ndbms): �����, nodes�� set ������ ����, ���� �˻�, ���������� ��ƴ�.
						// ū �Ը� db x
	
	//-��ü���� db(object oriented db)(odbms): ��ü(class)���� +��������, ������������ db ����
											//���ȭ�� �Ǿ����� Ȯ���� x, ���� ������
	//-������ db(retational db)(rdbms): ������ ����, �ڷᰡ ��Ը��� ��� o, 1980��� ���ȭ�������� ���� ������ ��ġ�� ������
	
	
	//�����ͺ��̽�- not raw data (Ư���ڷḦ ��Ƴ������� �Ǿ���)
	//����) �߱��������(�̸�, ����, ���ȣ, Ÿ��)
	// ���̺긪�� ����Ͽ� ����(db�� ���̺��� ����ü)
	//dbms: db�� �� Ȱ���Ҽ� �ֵ��� �ϴ� �����ý���(sw)
	
	//�ڷ�� ������ ������
	//�ڷ�� ����, ������ �����Ȱ�
	
	//�����ͺ��̽��� �Ƿ���?(�����ͺ��̽� ���� 4����)
					//(stand alone vs  multi user system
	//1) ���� ������(shared data): ���� sw(���) ���� �������� ���
	//2) ���� ������(intergrated data): �ߺ��� �ּ�ȭ
	//3) ���� ������(stored data): ��ũ, M.T ����Ǿ� �־��( not �޸���, ��ƼĿ)
	//4) � ������(operation�� data): ��� ����, ȸ���� ������ ���, ��Ͽ� ������ �߻���Ű��(�������, ������)

	//������ column, attribute ������ row, record, tuple
	//column�� row�� ������ �ڸ��� �ʵ�
	//primary key(�⺻Ű)-- ��� ã���� �߿��� ������ �Ǵ°�(�ߺ�x, null�� ��� x) PK
	//delete insert update select
	//foreign key(�ܷ�Ű)- �ٸ����̺� �ִ� �⺻Ű�� �����Ѵ�(reference) FK (�ߺ��̳� null ���)
	
	
	//modeling : modeler
	//db ���ߴ�- sql���(Structured Query Language): ����ȭ�� ��ȸ���
	// select * from ...
	//tunning- sql Ʃ��, network Ʃ��, �޸�Ʃ�� ....(db ������)
	
	//ERD(entity relationship diagram)
	
	//sql(structured query language) ��� !="sql*plus"dms tool
	//1) query��: select (crud�� R), ����, �˻�, ����, ����
	//2) dml(data manipulation language) ������ ����(�۵�) ���
	//3) ddl(data definition language) create, ....
	
	// �ּ��� ������ �Ұ� (COMMENT)
	/* �ּ��� ������ �Ұ� */
	// -- SQL �ּ��� �������������̴�
	
	//KEYWORD�� �빮��  SELECT ... FROM regions
	//�ҹ��ڷ� �ص� ������ �ȳ����� �빮�ڰ� ��Ģ
	//==> compile, parsing�Ҷ� �Ȱ��� ��ɹ��̿��� �빮�� �ҹ��� ���� �Ľ���
	
	//�������� ���� �ٲ�
	//SELECT ...
	//FROM regions;
	
	//������ ������ ;
	
	

	
	
	
	
}
