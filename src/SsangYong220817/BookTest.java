package SsangYong220817;

class Book{
	private String title;
	private String author;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
}

public class BookTest {

	public static void main(String[] args) {
		Book prince = new Book();
		prince.setTitle("Young Prince");
		prince.setAuthor("unKnown");
		System.out.println("제목 :" + prince.getTitle()+ "\n작가 :" + prince.getAuthor());
	}
}