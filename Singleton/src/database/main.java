package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.Database;

public class main {
	static Connection con = Database.getConnection();

	public void saveToDatabase() throws SQLException

	{
		String query = "insert into employee(emp_name, " + "emp_sname) VALUES (?, ?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, "matti");
		ps.setString(2, "meikalainen");
		ps.executeUpdate();

	}
	
}
