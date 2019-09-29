 import java.util.Scanner;
 import java.util.Arrays;
 public class BinarySearch{
	public static void main(String[] args){
		System.out.println("pilease input search number!");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[]{0,2,3,5,6,7,9};
		int b[] = new int[]{0,1,2,5,6,7,9};
		int c[] = new int[]{0,1,2,4,6,8,9};
		System.out.println(a.length+1);
		System.out.println(b.length+1);
		System.out.println(c.length+1);
		Arrays.sort(c);
		Arrays.sort(a);
		Arrays.sort(b);
		int index1 = Arrays.binarySearch(a,1, 4, n);
		int index2 = Arrays.binarySearch(b,0, 5, n);
		int index3 = Arrays.binarySearch(c,0, 6, n);
		System.out.println("index1 ="+ index1);
		System.out.println("index2 ="+ index2);
		System.out.println("index3 ="+ index3);
		
	}
}