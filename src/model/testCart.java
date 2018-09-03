package model;

import java.util.List;

import DAO.BookDAO;

public class testCart {
	public List<SelectedBook> excute(){
		BookDAO book=new BookDAO();
		List<SelectedBook> BookList=book.findAll();
		return BookList;

	}

}
