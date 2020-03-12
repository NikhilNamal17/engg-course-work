//Pre-requisits jdk1.8 or higher
import java.util.*;
public class SerialParalleSort
{
	public static void main(String args[])
	{
		int intArrayA[]=new int[]{2,78,35,53,120,3,1};
		int intArrayB[]=new int[]{2,78,35,53,120,3,1};
		System.out.println("Array element Before Sort");
		for (int i=0;	i<intArrayA.length;	i++)
		{
			System.out.println(intArrayA[i]+"	");
		}
		long start=System.currentTimeMillis();
		
		// Serial Sort
		System.out.println("\n");
		System.out.println("Serial Sort Started..........");
		System.out.println("\n");
		Arrays.sort(intArrayA);
		System.out.println("Sorted elements are..");
		for (int i=0;	i<intArrayA.length;	i++)
		{
			System.out.println(intArrayA[i]+"	");
		}
		long end=System.currentTimeMillis();
		System.out.println("\n");
		System.out.println("Serial Sort Time :"+(end-start)+"ms");

		//Parallel Sort
		System.out.println("\n");
		System.out.println("Paralle Sort Started..........");
		System.out.println("\n");
		Arrays.parallelSort(intArrayB);
		start=System.currentTimeMillis();
		System.out.println("Sorted elements are..");
		for (int i=0;	i<intArrayB.length;	i++)
		{
			System.out.println(intArrayB[i]+"	");
		}
		 end=System.currentTimeMillis();

		System.out.println("\n");
		System.out.println("Serial Sort Time :"+(end-start)+"ms");
	}
}
