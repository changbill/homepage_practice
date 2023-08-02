import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String abcd = "abcdefghijklmnopqrstuvwxyz";
		int[] nums = new int[abcd.length()];
		String word = br.readLine();
		
		for (int i=0; i<abcd.length(); i++) {
			for (int j =0; j<word.length(); j++) {
				if (abcd.charAt(i) == word.charAt(j)) {
					nums[i]++;
				}
			}
		}
		for(int i = 0; i<abcd.length(); i++) {
			System.out.print(nums[i]+ " ");
		}
				
	}
}
