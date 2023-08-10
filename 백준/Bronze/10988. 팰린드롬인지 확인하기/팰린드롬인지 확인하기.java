import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		Stack<Character> stack = new Stack<>();
		for(int i =0; i<str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		for(int i =0; i<str.length(); i++) {
			if(stack.pop() != str.charAt(i)) {
				System.out.println(0);
				break;
			}
			if (i == str.length()-1) {
				System.out.println(1);
			}
		}
	}
}