package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.SelectedBook;

public class BookDAO extends MasterDAO {

	public List<Book> searchBook() {

		//SQL文
		String sql = "select * from bookList";

		//ドライバー接続
		if (!isConnect()) {
			return null;
		}

		try(Connection con = DriverManager.getConnection(URL_NAME, USER_NAME, PASSWORD);) {

			//DBから返ってきたデータを格納用
			List<Book> bookList = new ArrayList<>();

			PreparedStatement ps = con.prepareCall(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Book book = new Book(rs.getString("isbn"),
								rs.getString("title") != null ? rs.getString("title") : "",
								rs.getString("largeGenre") != null ? rs.getNString("largeGenre") : "",
								rs.getString("smallGenre") != null ? rs.getString("smallGenre") : "",
								rs.getString("author") != null ? rs.getString("author") : "",
								rs.getString("publisher") != null ? rs.getString("publisher") : "",
								rs.getInt("price"),
								rs.getString("coverImage") != null ? rs.getString("coverImage") : "",
								rs.getString("releaseDate") != null ? rs.getString("releaseDate") : "",
								rs.getInt("stock"),
								rs.getString("contents") != null ? rs.getString("contents") : ""
					);
				bookList.add(book);
			}

			return bookList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public List<SelectedBook> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}

