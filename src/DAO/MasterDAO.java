package DAO;

public class MasterDAO {
	protected final String DRIVER_NAME = "com.mysql.jdbc.Driver",
			   URL_NAME = "jdbc:mysql://192.168.10.22/onlinebooks?"
				+ "characterEncoding=UTF-8&serverTimezone=JST&useSSL=false",
			   USER_NAME = "bookadmin",
			   PASSWORD = "PASSWORD";


//ドライバー接続
protected boolean isConnect() {
try {
Class.forName(DRIVER_NAME);
return true;
} catch (ClassNotFoundException e) {
e.printStackTrace();
return false;
  }
 }
}
