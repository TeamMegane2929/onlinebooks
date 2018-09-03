package model;

import java.io.Serializable;

public class SelectedBook implements Serializable {

	private String isbn;
	private String title;
	private String author;
	private int price;
	private String coverlmage;
	private int number;

	//コンストラクタ
	public SelectedBook(){}
	public SelectedBook(String isbn, String title, String author, int price, String coverlmage, int number) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.coverlmage = coverlmage;
		this.number = number;
	}

	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getCoverlmage() {
		return coverlmage;
	}
	public int getNumber() {
		return number;
	}
}
