package SsangYong220817;

class Movie{
	private String title;
	private String director;
	private String company;
	
	public Movie(String title, String director, String company) {
		this.title = title;
		this.director = director;
		this.company = company;
	}
	public Movie() {
		
	}
	
	public void printInfo() {
		System.out.println("제목 : " + title + "\n감독 : " + director + "\n제작사 : " + company);
	}
}

public class Homework02 {

	public static void main(String[] args) {
		Movie matrix = new Movie("matirx", "scott", "Lion");
		Movie unknown = new Movie();
		matrix.printInfo();
		unknown.printInfo();
	}

}
