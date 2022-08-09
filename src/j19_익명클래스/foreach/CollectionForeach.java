package j19_익명클래스.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class CollectionForeach {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		for(int i = 0; i< 26; i++) {
			strList.add(Character.toString((char)(97 + i)));    //97은 a i즉 1씩 증가하면서 문자로 바꿈
		}
	
		
//		for(String str : strList) {					foreach작성방법
//			System.out.println(str);
//		}
		
		
//		Consumer<String> consumer = str -> {
//			System.out.println(str);				밑에랑 같은 방식
//		};
		
		strList.forEach(str -> {System.out.println(str);});
		
		System.out.println("=====================================");
		
		Set<String> strSet = new HashSet<String>();
		
		for(int i = 0; i< 26; i++) {
			strSet.add(Character.toString((char)(97 + i)));    //97은 a i즉 1씩 증가하면서 문자로 바꿈
		}
		
		for(String str : strSet) {
			System.out.println(str);
		}
		
		System.out.println("=====================================");
		
		strSet.forEach(str -> {System.out.println(str);});
		
		System.out.println("=====================================");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i< 26; i++) {
			map.put(Character.toString((char)(97 + i)), 97 + i);    //97은 a i즉 1씩 증가하면서 문자로 바꿈
		}

		map.forEach((k, v) -> {
			System.out.print("key: " + k);
			System.out.print(", ");
			System.out.println("value: " + v);
		});

	}

}
