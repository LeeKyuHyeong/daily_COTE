package baekjoon.io;

import java.io.*;

public class bj_25206 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tmp = 0;
		
		double sumScore = 0.0;
		double sum = 0.0;
		while(tmp < 20) {
			String input = br.readLine();
			
			double score = Double.parseDouble(input.split(" ")[0]);
			String grade = input.split(" ")[1];
			if(!grade.equals("P"))
				sumScore += score;
			
			switch(grade) {
				case "A+": sum += score * 4.5;
					 break;
				case "A0": sum += score * 4.0;
					 break;
				case "B+": sum += score * 3.5;
					 break;
				case "B0": sum += score * 3.0;
					 break;
				case "C+": sum += score * 2.5;
					 break;
				case "C0": sum += score * 2.0;
					 break;
				case "D+": sum += score * 1.5;
					 break;
				case "D0": sum += score * 1.0;
					 break;
				case "F": sum += score * 0.0;
					 break;
				default: break;
			}
			//System.out.println(sum);
			tmp++;
		}
		
		//System.out.printf("%f", (sum / sumScore));
		bw.write(String.valueOf((sum / sumScore)));
	}
	
}
