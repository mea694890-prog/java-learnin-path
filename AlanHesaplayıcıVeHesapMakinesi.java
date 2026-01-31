package baslangiç;
import java.util.Scanner;
public class AlanHesaplayıcıVeHesapMakinesi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		String k_adi , parola;
		
		int islemsecim , islemalan, islemhesap ; 
		
		double pi = 3, ucgenkose, ucgenyukseklik , karekenar , dikdortgenkenar1 , dikdortgenkenar2 , daireyarıcap , kupkenar , dikdortgenprizmakenar1 , dikdortgenprizmakenar2 , dikdortgenprizmakenar3 , kureyarıcap , sayi1 , sayi2 ; 
		
		
		System.out.println("Kullanıcı adınızı giriniz :");
		
		k_adi = scan.nextLine();
		
		
		System.out.println("Parolanızı giriniz :");
		
		parola = scan.nextLine();		
		if (k_adi.equals("enes atmaca") && parola.equals("mea.1337") )  {
			
		System.out.println("Başarılı bir şekilde giriş yaptınız");	
		
		System.out.println("Yapmak istediğiniz işlemi seçiniz");
		
		System.out.println("1-Alan hesaplama \n2-hesap makinesi");
		
		System.out.println("İşlem:");
		islemsecim = scan.nextInt();
		
		switch (islemsecim) {
		
		case 1 :
		
		System.out.println("Alan seçim menüsüne girdiniz");
		System.out.println("lütfen işleminizi seçiniz.");
		
		System.out.println("1-Üçgen alanı hesaplama \n2-Kare alanı hesaplama \n3-Dikdörtgen alan hesaplama\n4-Daire alan hesaplama\n5-Küp yüzey alanı ve hacim hesaplama\n6-Dikdörtgen prizma yüzey alanı ve hacim hesaplama\n7-Küre yüzey alanı ve hacim hesaplama");
		
		System.out.println("İşlem:");
		islemalan = scan.nextInt();
		
		switch (islemalan) {
		
		case 1 :
		
		System.out.println("Üçgenin kenar uzunluğunu giriniz:");
		ucgenkose = scan.nextDouble();
		
		System.out.println("Üçgenin yüksekliğini giriniz:");
		
		ucgenyukseklik = scan.nextDouble();		
		
		System.out.println("Üçgenin alanı :" + ((ucgenkose * ucgenyukseklik) / 2));
		System.out.println("Üçgenin çevresi:" + (ucgenkose * 3));
		
		break;
		
		case 2 : 
		
		System.out.println("Karenin kenar uzunluğunu giriniz:");
		
		karekenar = scan.nextDouble();		
		
		System.out.println("Karenin alanı:" + (karekenar * karekenar));
	System.out.println("Karenin çevresi:" + (karekenar * 4));
	break;
		case 3 :
		
		System.out.println("Dikdörtgenin kenar uzunluğunu giriniz:");
		
		dikdortgenkenar1 = scan.nextDouble();
		
		System.out.println("Dikdörtgenin diğer kenar uzunluğunu giriniz: ");
		dikdortgenkenar2 = scan.nextDouble();
		
		System.out.println("Dikdörtgenin alanı:" + (dikdortgenkenar1 * dikdortgenkenar2));
		System.out.println("Dİkdörtgenin çevresi:" + (dikdortgenkenar1 + dikdortgenkenar2) * 2);
		break;
		case 4 :
		
		System.out.println("Dairenin yarıçapın uzunluğunu  giriniz:");
		
		daireyarıcap = scan.nextDouble();
		
		System.out.println("Dairenin alanı:" + (pi * daireyarıcap * daireyarıcap));
		System.out.println("Dairenin çeveri:" + 2*(pi * daireyarıcap));
		break;
		case 5 :
		
		System.out.println("Küpün köşe uzunluğunu giriniz:");
		
		kupkenar = scan.nextDouble();
		
		System.out.println("Küpün hacmi:" + (kupkenar * kupkenar * kupkenar ));
		
		System.out.println("Küpün yüzey alanı:" + 6 * (kupkenar * kupkenar));
		
		break;
		case 6 :
		System.out.println("Dikdödrtgen prizmanın köşesini giriniz.");
		
		dikdortgenprizmakenar1 = scan.nextDouble();
		
		System.out.println("Dikdörtgen prizmanın diğer kenar uzunluğunu giriniz:");
		
		dikdortgenprizmakenar2 = scan.nextDouble();
		
		System.out.println("Dikdörtgen prizmanın yüksekliğini giriniz:");
		
		dikdortgenprizmakenar3 = scan.nextDouble();
		
		System.out.println("Dikdörtgen prizmanın hacmi:" + (dikdortgenprizmakenar1 * dikdortgenprizmakenar2 * dikdortgenprizmakenar3  ));
		
		System.out.println("Dikdörtgen prizmanın yüzey alanı:" + 2 * ((dikdortgenprizmakenar1 * dikdortgenprizmakenar2) + (dikdortgenprizmakenar1 * dikdortgenprizmakenar3) + (dikdortgenprizmakenar2 * dikdortgenprizmakenar3)));
		
		break ;
		case 7 :
		
		System.out.println("Kürenin yarı çap uzunluğunu giriniz :");
		
		kureyarıcap = scan.nextDouble();
		
		System.out.println("Kürenin hacmi:" + (4 / 3 * pi * kureyarıcap * kureyarıcap * kureyarıcap));
		System.out.println("Kürenin yüzey alanı:" + (4 * pi * kureyarıcap * kureyarıcap));
		break;
		
		default :
		
			System.out.println("Lütfen geçerli bir işlem seçiniz!");
			
		}
		 break;
		case 2 : 
		
			System.out.println("lütfen yapmak istediğiniz işlemi seçiniz");
		System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme \n5-Karesini alma");
		System.out.println("işlem:");
		islemhesap = scan.nextInt();
		
		switch(islemhesap) {
		
		case 1 :
		
		System.out.println("Lütfen ilk sayıyı giriniz:");
		sayi1=scan.nextDouble();
		
		System.out.println("Lütfen ikinci sayıyı giriniz:");
		sayi2 = scan.nextDouble();
		
		System.out.println("Girilen sayıların toplamı:" + (sayi1 + sayi2));
		
		break;
		
		case 2 :
			System.out.println("Birinci sayıyı giriniz:");
		sayi1 = scan.nextDouble();
		
		System.out.println("İkinci sayıyı giriniz:");
		 
		sayi2 = scan.nextDouble();
		
		System.out.println("girilen sayıların farkı:" + (sayi1 - sayi2));
		
		break;
		
		case 3 :
			
			System.out.println("Birinci sayıyı giriniz:");
			sayi1 = scan.nextDouble();
			
			System.out.println("İkinci sayıyı giriniz:");
			sayi2 = scan.nextDouble();
			
			System.out.println("Girilen sayıların çarpımı:" + (sayi1 * sayi2));
		break;
			
		case 4 :			
			System.out.println("Birinci sayıyı giriniz:");
			sayi1 = scan.nextDouble();
			
			System.out.println("İkinci sayıyı giriniz:");
			sayi2 = scan.nextDouble();
			
			if (sayi2 != 0 ) {
				
		System.out.println("Girilen sayıların bölümü:" + (sayi1 / sayi2 ));			}
			
			
			else {
				
				System.out.println("Belirsiz sayı lütfen tekrar deneyiniz!");
				
			}
			
			
			break;
			
		case 5 :
			System.out.println("Lütfen karesini alınmasını istediğiniz sayıyı giriniz:");
			sayi1 = scan.nextDouble();
			
			System.out.println("Girilen sayının karesi:" + (sayi1 * sayi1));
			
			break;
			
			default :
				System.out.println("Lütfen geçerli bir işlem giriniz!");
			
		}
		
		}}
		
		
		else {
			
			System.out.println("KUllanıcı adı veya parola yanlış!");
		}	
	}

}
