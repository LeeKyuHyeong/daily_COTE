package COTE_220501;

import java.util.HashMap;

public class COTE_ADDITONAL {
	//switch case
	
	
	//Map
	//(key : value) 로 저장
	//키는 중복 불가능 , value 는 중복 가능
	
	//선언 HashMap<(키)타입, (값)타입> = new HashMap<>();
	
	public static void main(String[] args) {
		//초기값 설정
		HashMap<String, String> strmap = new HashMap<String, String>() {
			{put("a","b");}
		};
		String answer = strmap.get("a");
		System.out.println(answer);
		
		//초기값 지정
		HashMap<Integer,String> map = new HashMap<Integer,String>(){{
		    put(1,"사과");
		    put(2,"바나나");
		    put(3,"포도");
		}};
		System.out.println(map);
		System.out.println(map.get(1));
	}
	
}
