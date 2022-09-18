/**
 * 
 */
package basicjavaprograms;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author anilkumar06
 *
 */
public class JDBCConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	 
		Connection con = null;
		try {
			con = DriverManager.getConnection("fee.com", "user", "password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ResultSet rs = st.executeQuery("select * from users");

			while (rs.next()) {
				String myName = rs.getString(1);  // first column
				String myAge = rs.getString(2);    //2nd column
				System.out.println(myName + "  " + myAge);
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
