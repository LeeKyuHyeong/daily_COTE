package COTE_220511;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class COTE_PRAC4 {
	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("Apple", 2000));
		list.add(new Fruit("Orange", 3000));
		list.add(new Fruit("Banana", 1000));
		System.out.println("원본 : " + list);
		
		//Collections.sort(list);
		list.sort(Comparator.naturalOrder());
		System.out.println("오름차순 : " + list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("내림차순 : " + list);
		
		list.forEach(System.out::println);
		
	}
}
class Fruit implements Comparable<Fruit>{
	private String name;
	private int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Fruit fruit) {
		// TODO Auto-generated method stub
		if(fruit.price < price) {
			return 1;
		} else if(fruit.price > price) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ " + this.name + ": " + this.price + " ]";
	}
	
}