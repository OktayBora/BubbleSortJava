
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] kapiNumarasi= {31,6,7,90,12,5,61,1,2};
		
		System.out.print("Normal sıralama:-\n  ");
		
		for (int i = 0; i < kapiNumarasi.length; i++) {
			
			System.out.print(kapiNumarasi[i] + ", ");
			
		}
		System.out.println();
		
		SortKapi(kapiNumarasi);
		
	}
	
	private static void SortKapi(int[] ar) {
		int temp;
		
		for (int i = ar.length-1; i>0; i--) {
			
			for (int j = 0; j < i; j++) {
				if( ar[ j ]> ar[j + 1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					
				}
				
			}
			
		}
		
		
		System.out.print("Yeni sıralama: -\n  ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+ ", ");
			
		}
		
		
		
	}
}
