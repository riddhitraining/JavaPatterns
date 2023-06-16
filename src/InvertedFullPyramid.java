
public class InvertedFullPyramid {

	public static void main(String[] args) {
		for(int j=6; j>=1; j--){
			for(int i=j; i<=5; i++){
				System.out.print(" ");}
				for(int k=1; k<=j; k++)
				{
					System.out.print(" *");
				}System.out.println();
			}

	}

}
