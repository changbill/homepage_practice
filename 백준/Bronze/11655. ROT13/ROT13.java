import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		String word = br.readLine();
		
		for(int i = 0; i<word.length(); i++) {
			int A = word.charAt(i);
			int ans = 0;
			
			if (A+13>122 && A+13<=135) {
				ans = A-13;
			} else if (A+13>=110 && A+13<=122) {
				ans = A+13;
			} else if (A+13>90 && A+13<=103) {
				ans = A-13;
			} else if (A+13>=78 && A+13<=90) {
				ans = A+13;
			} else {
				System.out.print(word.charAt(i));
				continue;
			}
			System.out.print((char)ans);
		}
	}
}
