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
		
		long fibo1 = 0;
		long fibo2 = 1;
		long save = 0;
		int N = Integer.parseInt(br.readLine());
		
		
		if (N>1) {
			for (int i=0; i<N; i++) {
				save = fibo2;
				fibo2 += fibo1;
				fibo1 = save;
			}
		} else if (N==1) {
			fibo1 = 1;
		}
		
		System.out.println(fibo1);
	}
}