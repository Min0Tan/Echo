package Echo;

import java.util.Scanner;

public class Echo {
		public static void main(String[] args) {
				System.out.println("Type a sentence: ");
				Scanner input = new Scanner(System.in);
				String foo = input.nextLine();
				System.out.println(foo);
				
				input.close();
				
		}
		
}