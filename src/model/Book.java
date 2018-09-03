package model;

public class Book {

	private String isbn;
	private String title;
	private String largeGenre;
	private String smallGenre;
	private String author;
	private String publisher;
	private int price;
	private String coverlmage;
	private String releaseDate;
	private int stock;
	private String contents;


	//コンストラクタ
	public Book(String isbn, String title, String largeGenre, String smallGenre, String author, String publisher,
			int price, String coverlmage, String releaseDate, int stock, String contents) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.largeGenre = largeGenre;
		this.smallGenre = smallGenre;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.coverlmage = coverlmage;
		this.releaseDate = releaseDate;
		this.stock = stock;
		this.contents = contents;
	}

	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getLargeGenre() {
		return largeGenre;
	}
	public String getSmallGenre() {
		return smallGenre;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getPrice() {
		return price;
	}
	public String getCoverlmage() {
		return coverlmage;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public int getStock() {
		return stock;
	}
	public String getContents() {
		return contents;
	}

}


