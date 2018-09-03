package BO;

import DAO.OrderDAO;
import model.SelectedBook;

public class OrderBO {

	public boolean confirmOrder(SelectedBook bk){
		OrderDAO od = new OrderDAO();
		boolean result = od.orderConfirm(bk);
		return result;
	}


}
