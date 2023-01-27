import java.util.Scanner;

public class ManavHesap {

	public static void main(String[] args) {
		
		double armut;
		double elma;
		double domates;
		double muz;
		double patlican;
		double tutar = 0;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Müşterinin kaç kg armut aldığını giriniz: ");
		armut = input.nextDouble();
		tutar += armut * 2.14;
		System.out.println("Müşterinin kaç kg elma aldığını giriniz: ");
		elma=input.nextDouble();
		tutar += elma * 3.67;
		System.out.println("Müşterinin kaç kg domates aldığını giriniz: ");
		domates= input.nextDouble();
		tutar += domates * 1.11;
		System.out.println("Müşterinin kaç kg patlıcan aldığını giriniz: ");
		patlican = input.nextDouble();
		tutar += patlican * 5.0;
		
		System.out.println("Ödemeniz gereken tutar: " + tutar);
		System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.");
		
		
		
		
		
		

	}

}
