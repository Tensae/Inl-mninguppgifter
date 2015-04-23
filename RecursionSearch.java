package searchSort;

import java.util.Scanner;

public class RecursionSearch {

	public static void main(String[] args) {
		System.out.println("write text");
		Scanner input = new Scanner (System.in);
		String text = input.nextLine();
		System.out.println("write the character");
		char cha =  input.next().charAt(0);
		System.out.println("the occurance of "+ cha + " is: "+ count(text, cha));

	}


public static int count(String str, char a) {
   if (str.length() == 0) {
            return 0;
        } else if (str.charAt(0) == a) {

            return 1 + count(str.substring(1, str.length()), a);
        } else
            return count(str.substring(1, str.length()), a);
    }
}