import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		
		System.out.println("Enter a String");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String reverse = "";
		in.close();
		StringBuffer sb = new StringBuffer(input);
		StringBuilder sbu = new StringBuilder();
		for(int i=input.length()-1; i>=0;i--) {
			reverse = reverse + input.charAt(i);
			sbu.append(input.charAt(i));
		}
		System.out.println("Ur String is reversed                   : " + reverse);
		System.out.println("Ur String is reversed by String builder : " + sbu);
		System.out.println("Ur String is reversed by String buffer  : " + sb.reverse());

	}

}
