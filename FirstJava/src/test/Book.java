package test;

import java.util.ArrayList;

public class Book {
	
	String book_name;
	String book_genre;
	int book_price;
	
	Book(){} //�⺻������
	Book(String book_name, String book_genre, int book_price){
		this.book_name=book_genre;
		this.book_genre=book_genre;
		this.book_price=book_price;
	}
	
	@Override
	public String toString() {

		return "[å�̸�] "+book_name+"  [�帣]"+book_genre+"  [å����]"+book_price+"��";
	}
	public String getBook_name() {
		return book_name;
	}


	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}


	public String getBook_genre() {
		return book_genre;
	}


	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}


	public int getBook_price() {
		return book_price;
	}


	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}


	public static void main(String[] args) {
		ArrayList<Book> arr=new ArrayList<>();
		arr.add(new Book("�츮�� �س��� �ִ�", "�ڱⰳ��", 12000));
		arr.add(new Book("���̺����� �㿡", "�Ҽ�", 10000));
		arr.add(new Book("������ ��", "�ڱⰳ��", 5000));
		arr.add(new Book("���ǿ����λ�", "�ڼ���", 5000));
		arr.add(new Book("���ڴ°���", "��Ÿ��", 3000));
		
		// (1) �÷��ǿ� ����ִ� å������ toString �� ����Ͽ� ��� ����Ѵ�
		System.out.println("toString���� ��� ����");
		for(Book b:arr) {
			System.out.println(b);
		}
		
		System.out.println();
		System.out.println("toString ���� ��� ����");
		//(2) ������ 7000�� �̻��� å ������ toString ������ getter�� ����Ͽ� ����Ѵ�
		for(Book b:arr) {
			if(b.getBook_price()>=7000) {
				System.out.println("[å�̸�] "+b.getBook_name()+"  [�帣]"+b.getBook_genre()+"  [å����]"+b.book_price+"��");
			}
		}
		
		System.out.println();
		System.out.println("å�Ǽ� ��� ����");
		//(3) ������ 7000�� �̻��� å�� ��������� ����Ѵ�
		int count=0;
		for(Book b:arr) {
			if(b.getBook_price()>=7000) {
				count++;
			}
		}
		System.out.println(count+"��");
		
		
	}

}
