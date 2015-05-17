package competieveGene;
import java.util.*;

class MakeRandom
{
	private Random ra=new Random();
	private int dice(int a, int b)
	{
		return 1+ra.nextInt(b-a);
	}
	public int[] dicePack(int a, int b, int m)
	{
		int i;
		int[] diceArr=new int[m];
		for(i=0;i<m;i++)
		{
			diceArr[i]=dice(a,b);
		}
		
		return diceArr;
	}
}

class Gene
{
	private int[] mygene=new int[1000];
	private int geneNum;
	
	public Gene(int geneNumTemp)
	{
		int[] arr=new int[geneNumTemp];
		System.arraycopy(mygene, 0, arr, 0, geneNumTemp);
		geneNum=geneNumTemp;
	}
	public int returnGeneNum()
	{
		return geneNum;
	}
}

public class CompetiveGene {

	public static void main(String[] args) {
		
		
	}

}
