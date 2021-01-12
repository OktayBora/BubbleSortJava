import java.util.Scanner;

public class Operatorlar {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen adınızı giriniz: ");
		String isim = scanner.next();
		System.out.print("Lütfen soyadınızı giriniz: ");
		String soyadı = scanner.next();
		System.out.print("Lütfen boyunuzu giriniz ");
		double boy = scanner.nextDouble();		
		System.out.print("Lütfen kilonuzu giriniz ");
		int kilo = scanner.nextInt();		
		System.out.println();		
		System.out.println("Sonuçlar ***********");			
		System.out.println("Sayın: "+isim+ " "+ soyadı);
		System.out.println("Boyunuz: "+ boy);
		System.out.println("Kilonuz "+ kilo);		
		double bki = ((double)kilo/(boy*boy));
		System.out.println("Beden kitle endeksiniz "+ bki);
		
		if (bki <18.5) {
			System.out.println("KİLONUZ NORMALİN ALTINDA");
		}
		else if (bki>=18.5 && bki<24.9) {
			System.out.println( "KİLONUZ NORMAL");
			
		}
		else if (bki>=30 && bki<=39.9) {
			System.out.println("FAZLA KİLOLUSUNUZ");
		}
		 else {
			 System.out.println("İLERİ DERECE OBEZSİNİZ");
		}
	}

	

}
