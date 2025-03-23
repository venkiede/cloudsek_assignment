package cloudsek;
import java.util.*;

public class anargam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first word");
		String s1=sc.nextLine();
		System.out.println(s1);
		
		System.out.println("Enter the second word");
		String s2=sc.nextLine();
		System.out.println(s2);
		
		sc.close();
		
		checkanargam(s1,s2);
	}
	
	public static boolean checkanargam(String s1,String s2) {
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("The two words are anaragam");
			return true;
		}
		else {
			System.out.println("The give words are not anargam");
			return false;
		}
	}

}
