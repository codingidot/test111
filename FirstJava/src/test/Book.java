package test;

import java.util.ArrayList;

public class Book {
	
	String book_name;
	String book_genre;
	int book_price;
	
	Book(){} //기본생성자
	Book(String book_name, String book_genre, int book_price){
		this.book_name=book_genre;
		this.book_genre=book_genre;
		this.book_price=book_price;
	}
	
	@Override
	public String toString() {

		return "[책이름] "+book_name+"  [장르]"+book_genre+"  [책가격]"+book_price+"원";
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
		arr.add(new Book("우리는 해낼수 있다", "자기개발", 12000));
		arr.add(new Book("별이빛나는 밤에", "소설", 10000));
		arr.add(new Book("나무와 숲", "자기개발", 5000));
		arr.add(new Book("나의연극인생", "자서전", 5000));
		arr.add(new Book("잠자는공주", "판타지", 3000));
		
		// (1) 컬렉션에 들어있는 책정보를 toString 을 사용하여 모두 출력한다
		System.out.println("toString으로 출력 예시");
		for(Book b:arr) {
			System.out.println(b);
		}
		
		System.out.println();
		System.out.println("toString 없이 출력 예시");
		//(2) 가격이 7000원 이상인 책 정보를 toString 사용없이 getter를 사용하여 출력한다
		for(Book b:arr) {
			if(b.getBook_price()>=7000) {
				System.out.println("[책이름] "+b.getBook_name()+"  [장르]"+b.getBook_genre()+"  [책가격]"+b.book_price+"원");
			}
		}
		
		System.out.println();
		System.out.println("책권수 출력 예시");
		//(3) 가격이 7000원 이상인 책이 몇권인지도 출력한다
		int count=0;
		for(Book b:arr) {
			if(b.getBook_price()>=7000) {
				count++;
			}
		}
		System.out.println(count+"권");
		
		
	}

}
