package Theme8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Glasni {

		public static void main(String[] args) throws Exception {
			File file = new File("src/demo/PerformanceTest.java");
			if (file.exists()) {
				countGlasni(file);
			} else {
				System.out.println("File does not exist");
			}

		}

		public static int countGlasni(File file) throws Exception {
			Character[] GlasniCharecter = {'a','e','o','u','i','A', 'E', 'O', 'U', 'I'};
			Set<Character> Glasni = new HashSet<Character>(Arrays.asList(GlasniCharecter));
			int countGlasni = 0;
			int countSuglasni = 0;

			FileReader fr = new FileReader (file);
			BufferedReader br = new BufferedReader (fr);
			int c=0;
			
			while ((c=br.read()) != -1)
			{
				char chrctr = (char) c;
				if (chrctr > 'a' && chrctr <'z'|| chrctr > 'A' && chrctr <'Z' ){
					 if (Glasni.contains(chrctr)) {
						 countGlasni ++;
					 }else {
						 countSuglasni++; 
					 }
				}
			
			}
			System.out.println("Glasni:" + countGlasni + "Suglasni:" +countSuglasni);
		}
}
