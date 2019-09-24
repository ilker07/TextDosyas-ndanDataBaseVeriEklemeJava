import java.sql.Connection;
import java.sql.SQLException;

public class dbFonksiyon {

	private java.sql.Statement state;
	
	public void filmEkle(String filmismi,String filmTuru,String filmYapimi,String filmSuresi)
	{
		try {
			state=databaseIslemleri.con.createStatement();
			String sorgu="Insert into bilgileryeni (isim,tur,yapim,sure) Values("+"'"+filmismi+"'"+","+"'"+filmTuru+"'"+","+"'"+filmYapimi+"'"+","+"'"+filmSuresi+"'"+")";
			state.executeUpdate(sorgu);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
