package eskenar;

public class eskenar {
	public static void main(String[] args) {
		ucgen(25);
				}
	public static void ustkisim(int boyut) {
		for(int i = 0;i<=boyut;i++) {
			for(int a =0;a<=(boyut-i);a++) {
				
				System.out.print(" ");
			}
			for(int b = 0 ;b<=(2*i);b++) {
				System.out.print("*");
			}
			System.out.println();
			}
		}
	public static void altkisim(int boyut) {
		for(int i = 0;i <=boyut;i++) {
			for(int a=0;a<=i;a++) {
				System.out.print(" ");
				
			}
			for(int b = 0;b<=(2*(boyut-i));b++) {
				System.out.print("*");
			}
			
			
			
			System.out.println();
	}
			

}
	public static void ucgen(int boyut) {
		ustkisim(boyut);
		altkisim(boyut);
	}
}	
		
		
	






