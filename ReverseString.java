import java.util.Arrays;
import java.util.Scanner;
public class ReverseString{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter sentence:");
		String word =input.next();
		reversoSentence(word);
	}
	public static void reversoSentence(String word){
		
		String [] words = {word};
		String [] play = new String [words.length];
		String sentence = " ";
		for(int count = 0;count>words.length;count++){
			System.out.print(words[count]);
		}
		//for(int counter = 0;counter<play.length;counter++){
			//System.out.print(play[counter]);
		//}
		
	}
}