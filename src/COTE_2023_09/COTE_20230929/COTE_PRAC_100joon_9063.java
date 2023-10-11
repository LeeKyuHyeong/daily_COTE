package COTE_2023_09.COTE_20230929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.TreeSet;

public class COTE_PRAC_100joon_9063 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String firstLine = br.readLine();
		
		int cycle = Integer.parseInt(firstLine);
		
		Set<Integer> setX = new TreeSet<>();
		Set<Integer> setY = new TreeSet<>();
		
		for(int i = 0; i < cycle; i++) {
			String forStr = br.readLine();
			
			int x = Integer.parseInt(forStr.split(" ")[0]);
			int y = Integer.parseInt(forStr.split(" ")[1]);
			
			setX.add(x);
			setY.add(y);
		}
		Integer xMax = setX.stream().max(Integer::compareTo).get();
		Integer xMin = setX.stream().min(Integer::compareTo).get();

		Integer yMax = setY.stream().max(Integer::compareTo).get();
		Integer yMin = setY.stream().min(Integer::compareTo).get();
		
		int answer = (xMax - xMin) * (yMax - yMin);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		br.close();
		
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
		
		
	}
	
}
