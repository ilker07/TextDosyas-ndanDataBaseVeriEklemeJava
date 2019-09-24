import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class sinemaDataBase {
	
	
	public static int i=0;
	public static String isim="";
	public static String tur="";
	public static String yapim="";
	public static String sure="";
	
	

	public static void main(String[] args) {
		
		
		databaseIslemleri db=new databaseIslemleri();//Database e eriþildi.
		try (Scanner scan=new Scanner(new BufferedReader (new FileReader("C:\\Users\\Ýlker\\Desktop\\Sinemalar.txt")))){
			
			while(scan.hasNextLine())
			{
				
				
				switch(i)
				{
				
				case 0:
					
					isim=scan.nextLine();
					i++;
					break;
				case 1:
					
					tur=scan.nextLine();
					i++;
					break;
				case 2:
					
					yapim=scan.nextLine();
					i++;
					break;
				case 3:
					sure=scan.nextLine();
					i++;
					break;
				
				default :
					i=0;
					break;
				
				}
				
				if(isim!="" && tur !="" && yapim!="" && sure !="")
				{
					
					isim = isim.replace("'","''");
					sinemaBilgileri bilgi=new sinemaBilgileri(isim, tur, yapim, sure);
					dbFonksiyon fonk=new dbFonksiyon();
					fonk.filmEkle(bilgi.getFilmismi(), bilgi.getFilmturu(), bilgi.getFilmyapimi(), bilgi.getFilmsure());
					
					isim="";
					tur="";
					yapim="";
					sure="";

					
				}
				
				
				
				
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		
		
		}
	}


