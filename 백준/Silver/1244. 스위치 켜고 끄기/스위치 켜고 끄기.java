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
		
		int nSwitchSize = Integer.parseInt(bReader.readLine());
		
		boolean[] barrSwitch = new boolean[nSwitchSize];
		StringTokenizer st = new StringTokenizer(bReader.readLine());
		for(int i = 0 ; i < barrSwitch.length; i++)
			barrSwitch[i] = Integer.parseInt(st.nextToken()) == 1;
		
		int nStudent = Integer.parseInt(bReader.readLine());

		for(int i = 0 ; i < nStudent; i++) {
			st = new StringTokenizer(bReader.readLine());
			int nGender = Integer.parseInt(st.nextToken());
			int nSwitchNum = Integer.parseInt(st.nextToken());
			
			int nMan = 1;
			int nWoman = 2;
			
			if(nGender == nMan) {
				for(int j = 0; j < barrSwitch.length; j++) {
					if((j+1) % nSwitchNum == 0)
						barrSwitch[j] = !barrSwitch[j];
				}
			} else if(nGender == nWoman) {
				nSwitchNum--;
				barrSwitch[nSwitchNum] = !barrSwitch[nSwitchNum]; 
				int nLeftPoint = nSwitchNum-1;
				int nRightPoint = nSwitchNum+1;
				while(nLeftPoint >= 0 && nRightPoint < nSwitchSize) {
					if(barrSwitch[nLeftPoint] != barrSwitch[nRightPoint])
						break;
					
					barrSwitch[nLeftPoint] = !barrSwitch[nLeftPoint]; 
					barrSwitch[nRightPoint] = !barrSwitch[nRightPoint];
					nLeftPoint--;
					nRightPoint++;
				}
			}
		}
		
		for(int i = 0 ; i < nSwitchSize; i++) {
			if(barrSwitch[i])
				bWriter.write("1 ");
			else
				bWriter.write("0 ");
			
			if(i != 0 && (i+1) % 20 == 0)
				bWriter.write("\n");
		}
		
		bWriter.flush();
		bWriter.close();
	}
}