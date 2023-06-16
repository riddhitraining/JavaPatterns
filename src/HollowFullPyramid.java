
public class HollowFullPyramid {

	public static void main(String[] args) {
		for(int j=1; j<=6; j++){
			for(int i=5; i>=j; i--){
				System.out.print(" ");}
					for(int k=1; k<=j; k++)
					{
						if(k==1 || j==6 || k==j)
						{
						System.out.print("* ");
						}
						else
						{ 
						System.out.print("  ");	
						}
					}System.out.println();
				}
			}
		}

	


