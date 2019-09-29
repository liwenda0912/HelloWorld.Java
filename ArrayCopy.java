import java.util.*;

public class ArrayCopy{
	public static void main(String[] agrs){
		System.out.print("please input you order!");
		String b[] = new String[10];
		String c[] = new String[10];
		for(int t=0;t<10;t++){
		Scanner in = new Scanner(System.in);
		
		String a = in.nextLine();
		for(int i=0;i<b.length;i++){
		b[i] = a;
		 }
		}
		System.arraycopy(b,0,c,0,10);
		System.out.println("c:");
        for(String str :c)
		System.out.println(str);			}
}
//解决b数组中a赋值给b数组只赋值一个值的问题//