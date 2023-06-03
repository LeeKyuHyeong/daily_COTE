package COTE_2023_03.COTE_230302;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class COTE_PRAC_pgs6 {

	public static void main(String[] args) {

		String polynomial = "10x + 0x + 0x";
		
		String answer = "";
		
		List<String> strList = Arrays.asList(polynomial.split(" ")).stream().filter(item -> !item.equals("+")).collect(Collectors.toList());
				
		List<String> xList = strList.stream().filter(item -> item.contains("x")).collect(Collectors.toList());
		
		int xSum = 0;
		if(xList.size() > 0) {
			
			for(String s : xList) {
				if(s.equals("x")) {
					xSum += 1;
				} else {
					xSum += Integer.parseInt(s.split("x")[0]);
				}
			}
			
		}
		
		List<String> numList = strList.stream().filter(item -> !item.contains("x")).collect(Collectors.toList());
		
		int sum = numList.stream().mapToInt(i -> Integer.parseInt(i)).sum();
		
		if(xSum != 0) {
            //x차수 존재시
			
            answer = xSum == 1 ? "x" : xSum + "x";
            if(sum != 0) {
                //상수 o
                answer += " + " + sum;
            } else {
                //상수 x
            }
        } else {
            //x차수 없을시
            if(sum != 0) {
                //상수 o
                answer += sum;
            } else {
                //상수 x
            }
        }
		
		System.out.println(answer);
	}

}
