package Demo;

import java.util.Scanner;

public class ReverseString {

	// without using inbuild Java method
	public static String reverse(String str) {
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		return rev;
	}
	
	 public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter String:");
		 String text = sc.nextLine();
		 System.out.println("Original string - " + text);
		 System.out.println("Reversed string  - " + reverse(text));
		 System.out.println();
		 
		 
		 //with using inbuild Java method
		 StringBuffer sb=new StringBuffer(text);
		 sb.reverse();
		 System.out.println("Reversed string -" + sb);
	 }
}
        
		
		
		
		
		
		
		
		
		
//		
//		char[] characters = input.toCharArray();
//        int n = characters.length;
//
//        for (int i = 0; i < n / 2; i++) {
//            char c = characters[i];
//            characters[i] = characters[n - i - 1];
//            characters[n - i - 1] = c;
//        }
//
//        return new String(characters);
//    }
//
//    public static void main(String[] args){
//        String text = "educative";
//        System.out.println("Original string - " + text);
//        System.out.println("Reversed string - " + reverse(text));
//    }}


