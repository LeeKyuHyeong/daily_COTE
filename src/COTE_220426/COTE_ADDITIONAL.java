package COTE_220426;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class COTE_ADDITIONAL {
	
	private static List<String> names = Arrays.asList("pyo", "sue", "aron", "ballack", "pyo");
	
	public static void main(String[] args) {
				
		construct();
		System.out.println();
		middle();
	}
	private static void construct() {
		//Collection으로 스트림
		names.stream();
		System.out.println(names);
		//배열로 스트림
		int[] arr = {1, 2, 3};
		Arrays.stream(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		//스트림 직접 생성
		Stream<Integer> stream = Stream.of(1,2,3);
		//System.out.println(stream);
		stream.forEach(i -> {
			System.out.println(i);
		});
		Stream<Integer> stream2 = Stream.of(1,2,3);
		List<Integer> intList = stream2.collect(Collectors.toList());
		System.out.println(intList);
		
	}
	private static void middle() {
		// Filter 특정 조건에 부합하는 데이터
		long cnt = names.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.contains("y");
			}
		}).count();
		System.out.print("result of counting after filtering : " + cnt);
		System.out.println("\n----------------------------");
		
		// Map 특정 연산 시
		
		names.stream().map(new Function<String, String>() {
			@Override
			public String apply(String t) {
				return t.concat("@gmail.com");
			}
		}).forEach(x -> System.out.print(x + " "));
		System.out.println("\n-------------------------");
		
		// Sort 정렬
		
		names.stream().sorted((x1, x2) -> x1.compareTo(x2)).forEach(x->System.out.print(x+" "));
		System.out.println("\n-------------------------");
		
		// limit 출력 수 제한
		names.stream().limit(2).forEach(x->System.out.print(x + " "));
		System.out.println("\n-------------------------");
		
		//distinct 중복 제거		
		names.stream().distinct().forEach(x->System.out.print(x+ " "));
		System.out.println("\n-------------------------");
		
		
		
		
	}
	
}
