
public class MultiplosTres {
	public static void main(String[] args) {
		for(int multiplo=0; multiplo<100; multiplo+=3) {
			System.out.println(multiplo);
		}
		
		for (int multiplo=0; multiplo<100; multiplo++) {
			if (multiplo%3 == 0) {
				System.out.println(multiplo);
			}
		}
	}
}
