package baslangiç;
import java.util.Scanner;

public class VucudKitleEndeksi {
  
	
	public static void main(String[] args) {
	  
	Scanner input = new Scanner(System.in) ;
		
double boy , kilo , vki  ;


System.out.println("Boyunuzu giriniz :");

 boy = input.nextDouble();
  
 
 System.out.println("Kilonuzu giriniz :");
 
 
 kilo = input.nextDouble();
 
 
 vki = kilo / (boy * boy ) ;
 
 
 
 
  
 if (vki >= 25)
 { String sonuc1 = (vki >= 30) ?  "Obez" : "Aşırı Kilolu" ;
 
 
 System.out.println(sonuc1);
 
 }
 
 else 
 {String sonuc2 = (vki >= 18.5) ? "Normal" : "Aşırı Zayıf" ;
 
 
 
 System.out.println(sonuc2);
 
 }

 
	}

}
