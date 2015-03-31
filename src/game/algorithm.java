package game;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class algorithm {

	public static void main(String[] args){
		List list = new ArrayList();
		boolean game = true;
		String nextWord = null;
		String word = null;
		while(game){
			Scanner sc = new Scanner(System.in);
			if(word == null){
				System.out.println("Start game");
				word = sc.next();//starts the game with first word
				list.add(word);//adds Player ones word to list so that duplicates are avoided
			}else if((word.charAt(0) != (nextWord.charAt(nextWord.length() - 1))) || list.contains(word)){
				System.out.println("you lose player 1");
				game = false;
			}
			list.add(word);
			System.out.println("Player 2: The next word must start with " +  word.charAt(word.length() - 1));
			nextWord = sc.next();//takes player 2's input word
			if((nextWord.charAt(0) != (word.charAt(word.length() - 1))) || list.contains(nextWord)){
				System.out.println("you lose player 2");
				game = false;
			}else{
				list.add(nextWord);//adds player's 2 word to the list if its successful.
				System.out.println("Player 1: The next word must start with " +  nextWord.charAt(nextWord.length() - 1));
				word = sc.next();
			}
		}
	}
}

