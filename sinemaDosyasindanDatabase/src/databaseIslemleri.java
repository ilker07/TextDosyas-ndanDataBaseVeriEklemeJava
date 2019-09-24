import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class databaseIslemleri {
	
	
	
	private String kullanici_adi="root";
	private String parola="";
	
	
	private String db_ismi="sinema";
	
	
	private String host="localhost";
	
	
	private int port=3306;
	
	
	
	public static Connection con=null;
	
	
	public databaseIslemleri()
	{
		String url="jdbc:mysql://"+host+":"+port+"/"+db_ismi+"?useUnicode=true&characterEncoding=utf8";
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("Bulunamadý....");
		}
		
		try {
			con= DriverManager.getConnection(url, kullanici_adi, parola);
			System.out.println("Baðlandý...");
		} catch (SQLException e) {

			System.out.println("Baðlantý olmadý...");
		
		}
		
		
	} 
	
	

}
