package baslangiç;
import java.util.Scanner;
public class Atmsimulation {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int bakiye =1000  , input , tutar ;

	System.out.println("Merhabalar Çiftlik Banka  Hoşgeldiniz !!");
	
	System.out.println("Güncel bakiyeniz :" + bakiye + "TL" );
	
	while (bakiye > 0 )
	{
		System.out.println();
		System.out.println("1-) Para yatır ");
		System.out.println("2-) para çek");
		System.out.println("3-) bakiye sorgula");
		System.out.println("4-) çıkış yap");
	    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
	    input = scan.nextInt();
	
	
	if(input == 1 )
	{
		System.out.println("lütfen yatırmak istediğiniz tutarı giriniz :");
		tutar = scan.nextInt();
		System.out.println("İşleminiz başarıyla gerçekleşmiştir!");
		System.out.println("Hesabınıza " + tutar + "TL yatırılmıştır");
		bakiye += tutar ;
		System.out.println("Güncel bakiyeniz " + bakiye + "TL dir");
		
		System.out.println("Yapmak istediğiniz sonraki işlemi seçiniz");
	}
	  
	else if (input == 2 )
	{
		
		System.out.println("Lütfen çekmek istediğiniz tutarı giriniz: ");
		tutar = scan.nextInt();
	
	if(tutar > bakiye) {
		
		System.out.println("Yetersiz bakiye lütfen farklı bir tutar giriniz");}
	else {
		
		System.out.println("İşleminiz başarıyla gerçekleştirilmiştir!");
        System.out.println("Hesabınızdan " + tutar + "TL çekilmiştir");
	    bakiye -= tutar ;
        System.out.println("Güncel bakiyeniz " + bakiye + "TL dir");} }
	
	else if (input == 3) {
		System.out.println("güncel bakiyeniz " + bakiye  + " TL dir");  }
		
	else if(input == 4) {
			System.out.println("çıkış işleminiz yapılıyor");
			break ; }
			
		}
		
		
	System.out.println("tekrar bekleriz");	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}


