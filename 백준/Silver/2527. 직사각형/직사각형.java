import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x1 = 0, y1 = 0, p1 = 0, q1 = 0;
		int x2 = 0, y2 = 0, p2 = 0, q2 = 0;
		// 입력 받구~
		for(int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(bReader.readLine());
			x1 = Integer.parseInt(st.nextToken()); 
			y1 = Integer.parseInt(st.nextToken()); 
			p1 = Integer.parseInt(st.nextToken()); 
			q1 = Integer.parseInt(st.nextToken()); 
			
			x2 = Integer.parseInt(st.nextToken()); 
			y2 = Integer.parseInt(st.nextToken()); 
			p2 = Integer.parseInt(st.nextToken()); 
			q2 = Integer.parseInt(st.nextToken()); 

			int nMaxLeftX = x1 > x2 ? x1 : x2;
			int nMinRightX = p1 < p2 ? p1 : p2;
			int nMaxBottomY = y1 > y2 ? y1 : y2;
			int nMinTopY = q1 < q2 ? q1 : q2;
			
			int nXGap = nMaxLeftX - nMinRightX;
			int nYGap = nMaxBottomY - nMinTopY;
			
			if(nXGap > 0 || nYGap > 0)
				bWriter.write("d");
			else if(nXGap == 0 && nYGap == 0)
				bWriter.write("c");
			else if(nXGap < 0 && nYGap < 0)
				bWriter.write("a");
			else
				bWriter.write("b");
			
			bWriter.write("\n");
		}
		
		bWriter.flush();
		bWriter.close();
	}
}