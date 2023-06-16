package NumberPatternProgram;

public class Pattern12 {

	public static void main(String[] args) {
		for(int i=1; i<=7; i++)
		{
			int num=(i%2==0)?0:1;
			System.out.print(num);  
			
			for (int j=1; j<=7; j++)
			{
				num=num==1 ? 0:1;
				System.out.print(num);
			}System.out.println();
		}

	}
}

