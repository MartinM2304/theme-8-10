package Theme8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class MatchingBraces {

	public static void main(String[] args) {
		Stack <Character> braces = new Stack<>();
		File file = new File ("filename.txt");
		FileReader fr;
		try {
			fr = new FileReader (file);
			BufferedReader br = new BufferedReader (fr);
			int c=0;
			boolean conflict = false;
			while ((c=br.read()) != -1)
			{
				char chrctr = (char) c;
				if (chrctr == '{'|| chrctr == '['|| chrctr == '(') {
				braces.add(chrctr);
				}else if (chrctr == '}') {
				conflict = braces.pop() != '{';
				}else if (chrctr == ']') {
				conflict = braces.pop() != '[';
				}else if (chrctr == ')') {
				conflict = braces.pop() != '(';
				}
			
				if (conflict) {
					break;
				}	
			}
			
			if (conflict || ! braces.isEmpty()) {
				System.out.println("Miss");
			}else {
				System.out.println("Bravo");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
