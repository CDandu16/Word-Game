package game;

import java.util.Scanner;

public class algorithm {
	public static void main(String[] args){
		boolean game = true;
		String nextWord = null;
		String word = null;
		while(game){
		Scanner sc = new Scanner(System.in);
			if(nextWord == null){
				System.out.println("Start game");
				word = sc.next();
			}else if(word.charAt(word.length()-word.length()) != (nextWord.charAt(nextWord.length() - 1))){
				
				System.out.println("you lose 1");
				game = false;
			}
		System.out.println("The next word must start with " +  word.charAt(word.length() - 1));
		nextWord = sc.next();
			if(nextWord.charAt(nextWord.length()-nextWord.length()) != (word.charAt(word.length() - 1))){
				System.out.println("you lose 2");
				game = false;
			}else{
			System.out.println("The next word must start with " +  nextWord.charAt(nextWord.length() - 1));
			word = sc.next();
			}
		}
	}
}

