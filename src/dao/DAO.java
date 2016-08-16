package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {
	
	
	private final String driverClassName = "oracle.jdbc.driver.OracleDriver";
	private final String connectionUrl = "jdbc.oracle.thin@localhost:1521:xe";
	private final String dbUser = "";
	private final String dbPassword = "";

	private static DAO dao = null;
	private Connection con = null;
	private PreparedStatement pstm = null;
	
	

	private DAO()
	{
		try 
		{
			Class.forName(driverClassName);
			con = DriverManager.getConnection(connectionUrl, dbUser, dbPassword);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

	// Singelton implementation
	
	private static DAO getInstance() 
	{
		if (dao == null)
		{
			dao = new DAO();
		}
		return dao;
	}

	public Connection getConnection()
	{
		getInstance();
		return con;
	}

	public PreparedStatement getStatement(String sql) throws SQLException
	{
		getConnection();
		pstm = con.prepareStatement(sql);
		return pstm;
	}

	// Close connection
	public void closeConnction() throws SQLException
	{
		if (con != null) 
		{
			con.close();
			con = null;
			dao = null;
		}
	}
	
}
