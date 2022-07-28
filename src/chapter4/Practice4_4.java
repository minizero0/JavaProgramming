package chapter4;


class Book{
	String author;
	String title;
	public Book() {
		author = "저자 미상";
		title = "무제";
	}
	public Book(String a, String t) {
		author =a;
		title = t;
	}
	public int add(int a, int b) {
		return a+b;
	}
	
	
}

public class Practice4_4 {

	public static void main(String[] args) {
		
		Book hell = new Book("satan", "hell");
		System.out.println(hell.author + "의 "+hell.title);
		Book what = new Book();
		System.out.println(what.author + "의 " + what.title);
		System.out.println(what.add(1,2));
	}
	


}                                                                                                        
