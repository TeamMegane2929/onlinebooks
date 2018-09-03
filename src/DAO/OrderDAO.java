package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Book;
import model.SelectedBook;

public class OrderDAO extends MasterDAO {

	/*
	 public boolean searchBook(){
	  }
	 * bookDAOのserachBook()を実行して、本があるかどうかDBに問い合わせる
	 *
	 *
	 */

	public boolean orderConfirm(SelectedBook bk,Book b) {

		boolean result = false;

		if (!isConnect()) {
			return false;
		}
		try(Connection con = DriverManager.getConnection(URL_NAME, USER_NAME, PASSWORD);){

			con.setAutoCommit(false);

			// bookOrderテーブルにデータを挿入
			String sql1 = "INSERT INTO bookOrder(day, revenue, postageID) VALUES(?,?,?,?,?)";
			PreparedStatement pStmt1 = con.prepareStatement(sql1);

			
			pStmt1.setString(3, bk.getDay());
			pStmt1.setInt(4, bk.getRevenue());
			pStmt1.setInt(5, bk.getPostageID());

			int firstSQLResult = pStmt1.executeUpdate();

			// detailsOrderテーブルにデータを挿入
			String sql2 = "INSERT INTO detailsOrder(id, orderID, branchNumber, isbn, count, buy) VALUES(?,?,?,?,?,?)";
			PreparedStatement pStmt2 = con.prepareStatement(sql2);
			pStmt2.setInt(1, bk.getDetailsOrderNum());
			pStmt2.setInt(2, bk.getOrderNum());
			pStmt2.setInt(3, bk.getBranchNum());
			pStmt2.setString(4, bk.getIsbn());
			pStmt2.setInt(5, bk.getCount());
			pStmt2.setInt(6, bk.getBuy());

			pStmt2.addBatch();

			int secondSQLResult = pStmt2.executeUpdate();
			con.commit();

			if (firstSQLResult > 0) {
				if (secondSQLResult > 0)
					result = true;
			} else {
				result = false;
			}
			return result;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
